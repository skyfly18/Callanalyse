package de.skyfly.callanalyse.Service.Index;

import de.skyfly.callanalyse.Entities.PackageName;
import de.skyfly.callanalyse.Entities.PackageVersion;
import de.skyfly.callanalyse.Repositories.PackageNameRepository;
import de.skyfly.callanalyse.Repositories.PackageVersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class IndexServiceAynsc {

    @Autowired
    PackageNameRepository packageNameRepository;

    @Autowired
    PackageVersionRepository packageVersionRepository;



    @Async("taskExecutorForHeavyTasks")
    protected void saveIndex(ConcurrentLinkedQueue<tup> mavenObject) throws InterruptedException {
        Thread.sleep(10000L);
        tup next = mavenObject.poll();
        while(next != null) {
            PackageName packageByGa = packageNameRepository.findByGaString(next.ga);
            if (packageByGa != null) {
                saveVersion(next, packageByGa);

            } else {
                try {
                    PackageName packageName = new PackageName();
                    packageName.setGaString(next.ga);
                    PackageName savePack = packageNameRepository.save(packageName);

                    PackageVersion packageVersion = new PackageVersion(savePack, next.ga, next.jarURL);
                    packageVersionRepository.save(packageVersion);
                } catch (DataIntegrityViolationException ex) {
                    System.out.println(ex);
                    System.out.println(next.jarURL);
                    System.out.println(next.ga);

                }
            }
            next = mavenObject.poll();
        }
    }

    @Async("taskExecutorForHeavyTasks")
    protected void saveVersion(tup next, PackageName savePack)
    {
        try {
            if (!packageVersionRepository.existsByUrlJar(next.jarURL)) {
                PackageVersion packageVersion = new PackageVersion(savePack, next.ga, next.jarURL);
                packageVersionRepository.save(packageVersion);
            }
        }
        catch (DataIntegrityViolationException ex)
        {
            System.out.println(ex);
        }
    }
}
