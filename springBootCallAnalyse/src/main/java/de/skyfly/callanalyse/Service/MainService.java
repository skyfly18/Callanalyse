package de.skyfly.callanalyse.Service;


import de.skyfly.callanalyse.Entities.AppStatus;
import de.skyfly.callanalyse.Entities.PackageName;
import de.skyfly.callanalyse.Repositories.AppStatusRepository;
import de.skyfly.callanalyse.Repositories.PackageNameRepository;
import de.skyfly.callanalyse.Service.Analyse.AnalyseService;
import de.skyfly.callanalyse.Service.Index.IndexService;
import de.skyfly.callanalyse.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

@Service
public class MainService {

    @Autowired
    private IndexService indexService;

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private AnalyseService analyseService;

    @Autowired
    private PackageNameRepository packageNameRepository;

    @Autowired
    private AppStatusRepository appStatusRepository;

    Logger logger = LoggerFactory.getLogger(MainService.class);

    @Qualifier("taskExecutorForHeavyTasks")
    @Autowired
    private ThreadPoolTaskExecutor executor;

    @EventListener
    public void  workMain(ContextRefreshedEvent event)  {
        if(!appStatusRepository.existsByStatus("status"))
        {
            appStatusRepository.save(new AppStatus());
        }
        AppStatus appstatus = appStatusRepository.findByStatus("status");
        if(appConfig.getBuildIndex() && !appstatus.getBuildIndexFinish() )
        {
            try{
                URL url = new URL(appConfig.getIndexurl());
                indexService.indexReader(url);


            } catch (MalformedURLException | InterruptedException e) {
                logger.error(String.valueOf(e));

            }
        }

        Iterator<PackageName> iteratorPackageName = packageNameRepository.findAll().iterator();
        synchronized (this) {
            while (iteratorPackageName.hasNext()) {
                while (executor.getPoolSize() >= appConfig.getMaxAnzahlThread()) {
                    try {
                        //logger.info(String.valueOf(executor.getPoolSize()));
                        this.wait(100L);
                    } catch (InterruptedException e) {
                        logger.error(String.valueOf(e));
                    }
                }
                PackageName packageName = iteratorPackageName.next();
                if(!packageName.getProcessed()) {
                    analyseService.analyseEntryPoint(packageName.getGaString());
                }
                iteratorPackageName.remove();


            }
        }
        logger.info("Ending the Analyse");


    }




}
