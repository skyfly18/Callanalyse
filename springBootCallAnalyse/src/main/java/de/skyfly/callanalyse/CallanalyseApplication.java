package de.skyfly.callanalyse;

import de.skyfly.callanalyse.Service.Index.IndexService;
import de.skyfly.callanalyse.config.AppConfig;
import de.skyfly.callanalyse.config.taskConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EntityScan("de.skyfly.callanalyse.Entities")
@EnableJpaRepositories("de.skyfly.callanalyse.Repositories")
@ConfigurationPropertiesScan("de.skyfly.callanalyse.config")
@SpringBootApplication
@EnableAsync
public class CallanalyseApplication {

	@Autowired
	private AppConfig appConfig;

	Logger logger = LoggerFactory.getLogger(CallanalyseApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(CallanalyseApplication.class, args);
	}

	@Bean("taskExecutorForHeavyTasks")
	public ThreadPoolTaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(appConfig.getCorePoolSize());
		executor.setMaxPoolSize(appConfig.getCorePoolSizeMax());
		executor.setQueueCapacity(appConfig.getQueueCapacitySize());
		executor.setThreadNamePrefix("MyAsyncThread-");
		executor.setRejectedExecutionHandler((r, executor1) -> logger.warn("Task rejected, thread pool is full and queue is also full"));
		executor.initialize();
		return executor;
	}



}
