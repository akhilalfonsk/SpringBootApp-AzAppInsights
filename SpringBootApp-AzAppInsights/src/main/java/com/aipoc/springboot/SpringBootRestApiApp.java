package com.aipoc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microsoft.applicationinsights.TelemetryClient;


@SpringBootApplication(scanBasePackages={"com.aipoc.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class SpringBootRestApiApp {

	public static void main(String[] args) {
        TelemetryClient tc = new TelemetryClient();
        tc.trackEvent("SpringBootStarted");
		SpringApplication.run(SpringBootRestApiApp.class, args);
		tc.trackEvent("SpringBootShutdown");
	}
}
