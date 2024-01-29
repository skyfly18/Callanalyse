package de.skyfly.callanalyse.Service.Index;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.jdk.javaapi.OptionConverters;
import de.skyfly.callanalyse.Repositories.PackageNameRepository;
import de.skyfly.callanalyse.Repositories.PackageVersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  de.tud.sse.mvn.index.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class IndexService {

    @Autowired
    PackageNameRepository packageNameRepository;

    @Autowired
    PackageVersionRepository packageVersionRepository;

    @Autowired
    IndexServiceAynsc indexServiceAynsc;


    Logger logger = LoggerFactory.getLogger(IndexService.class);


    public void downloadService(String jarUrl, String path) throws IOException
    {


            downloadJar(new URL(jarUrl), path + "/" +jarname(jarUrl));


    }



    public void downloadJar(URL url, String fileName) throws IOException {
        FileUtils.copyURLToFile(url, new File(fileName));
    }

    private String jarname( String jarUrl)
    {
        String[] splitjarUrl = jarUrl.split("/");
        return splitjarUrl[splitjarUrl.length-1];
    }


    public void indexReader(URL url) throws InterruptedException {
        MavenIndexReader indexReader = new MavenIndexReader(url);
        int count = 0;
        ConcurrentLinkedQueue<tup> mavenObject = new ConcurrentLinkedQueue<tup>();
        Optional<MavenIdentifier> result = OptionConverters.toJava(indexReader.read());
        indexServiceAynsc.saveIndex(mavenObject);
        while(result.isPresent())
        {
            MavenIdentifier identifier = result.get();

            mavenObject.add(new tup(identifier.toGA(),identifier.toJarLocation().toString()));
            if(count % 10000 == 0)
                logger.info("Got " + count +" artifacts so far.");
            if(count % 100000 == 0) {
                Thread.sleep(10000L);
                logger.info("Aktuelle Anzahl an Elemente im Que: " + mavenObject.size());
            }

            count++;

            result = OptionConverters.toJava(indexReader.read());
        }

        logger.info(String.valueOf(mavenObject.size()));
        while(!mavenObject.isEmpty())
        {
            logger.info(String.valueOf(mavenObject.size()));
            Thread.sleep(100000L);
        }
        logger.info("Finish");

    }










}
