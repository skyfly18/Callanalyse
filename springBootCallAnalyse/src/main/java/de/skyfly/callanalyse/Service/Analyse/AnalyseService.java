package de.skyfly.callanalyse.Service.Analyse;

import de.skyfly.analysetool.application.JarReader;
import de.skyfly.analysetool.result.ResultPackage;
import de.skyfly.callanalyse.Entities.CalculatedResult;
import de.skyfly.callanalyse.Entities.PackageName;
import de.skyfly.callanalyse.Repositories.CalculatedResultRepository;
import de.skyfly.callanalyse.Repositories.PackageNameRepository;
import de.skyfly.callanalyse.Service.Index.IndexService;
import de.skyfly.callanalyse.Service.Mapper.MapperService;
import de.skyfly.callanalyse.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 */
@Service

public class AnalyseService {

    @Autowired
    private IndexService indexService;

    @Autowired
    private PackageNameRepository packageNameRepository;

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private MapperService mapperService;

    @Autowired
    private CalculatedResultRepository calculatedResultRepository;

    Logger logger = LoggerFactory.getLogger(AnalyseService.class);

    /**
     *
     * @param packageNameGaString
     */
    @Async("taskExecutorForHeavyTasks")
    public void analyseEntryPoint(String packageNameGaString) {
        PackageName packageName = packageNameRepository.getByGaString(packageNameGaString);
        String path = appConfig.getDownloadOrdnerPath() + packageName.getGaString();
        if (packageName.versionsList.size() > 1) {
            File filedir = new File(path);
            if (!filedir.isDirectory()) {
                if (filedir.mkdir()) {

                    logger.info("Der Ordner :" + filedir +" wurde angelegt");

                } else {

                    logger.error("Fehler beim anlegen des Ordners");
                    if (FileSystemUtils.deleteRecursively(filedir)) {
                        logger.warn("Der Fehlerhafte Ordner wurde gelöscht");
                        filedir.mkdir();

                    }
                }
            }
            AtomicInteger count = new AtomicInteger(0);
            packageName.versionsList.forEach(file ->
            {
                try {
                    indexService.downloadService(file.getUrlJar(), path);
                }catch (IOException ex)
                {
                    count.getAndIncrement();
                    logger.warn("Fehler beim Download: " + file.getUrlJar());

                }
            });
            if(count.get() < (packageName.versionsList.size()/2)) {


                try {
                    JarReader jarReader = new JarReader(path);
                    ResultPackage resultPackage = jarReader.calculateCallGraphMetric();
                    CalculatedResult calculatedResult = mapperService.resultPackageToCalculatedResult(resultPackage);
                    calculatedResult.packageName = packageName;
                    calculatedResult.setSuccessfullTrue();
                    calculatedResultRepository.save(calculatedResult);


                } catch (IllegalArgumentException ex) {

                    logger.error("Keine SemVer Jars: " + ex);
                    CalculatedResult calculatedResult = new CalculatedResult();
                    calculatedResult.setNotSemverTrue();
                    calculatedResult.packageName = packageName;
                    calculatedResultRepository.save(calculatedResult);


                }
            }
            else
            {
                CalculatedResult calculatedResult = new CalculatedResult();
                calculatedResult.setDownloadExceptionTrue();
                calculatedResult.packageName = packageName;
                calculatedResultRepository.save(calculatedResult);
            }

            if (FileSystemUtils.deleteRecursively(filedir)) {
                logger.info("Der Ordner: " + filedir + " wurde gelöscht");
            } else {
                logger.error("Der Ordner: " + filedir + " wurde nicht gelöscht.");
            }

        }
        else
        {
            CalculatedResult calculatedResult = new CalculatedResult();
            calculatedResult.setOnlyOneJarTrue();
            calculatedResult.packageName = packageName;
            calculatedResultRepository.save(calculatedResult);
        }

        packageName.setProcessed(true);
        packageNameRepository.save(packageName);
    }

}
