package com.example.advancedconfigurations;

import com.example.advancedconfigurations.configurations.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfig.class)
public class DopplerConfigurationsApplication implements CommandLineRunner {

	@Autowired
	private AppConfig appConfig;

	public static void main(String[] args) {
		SpringApplication.run(DopplerConfigurationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(appConfig);
	}
}
