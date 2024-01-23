package de.skyfly.callanalyse.config;

import de.skyfly.callanalyse.Service.Index.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class taskConfig {
    @Autowired
    private AppConfig appConfig;

    Logger logger = LoggerFactory.getLogger(taskConfig.class);


}
