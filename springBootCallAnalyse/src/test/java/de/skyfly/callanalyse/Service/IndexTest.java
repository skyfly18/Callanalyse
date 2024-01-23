package de.skyfly.callanalyse.Service;

import de.skyfly.callanalyse.Entities.PackageName;
import de.skyfly.callanalyse.Repositories.PackageNameRepository;
import de.skyfly.callanalyse.Repositories.PackageVersionRepository;
import de.skyfly.callanalyse.Service.Analyse.AnalyseService;
import de.skyfly.callanalyse.Service.Index.IndexService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("integration-test")
public class IndexTest {

    @Autowired
    PackageNameRepository packageNameRepository;

    @Autowired
    PackageVersionRepository packageVersionRepository;

    @Autowired
    IndexService indexService;

    @Autowired
    AnalyseService analyseService;

    @Test
    public void indexTest()
    {
        PackageName packageName=packageNameRepository.getByGaString("yom:yom");
        System.out.println(packageName.versionsList.size());
    }

    @Test
    public void downloadTest()
    {
        analyseService.analyseEntryPoint("yom:yom");

    }
}
