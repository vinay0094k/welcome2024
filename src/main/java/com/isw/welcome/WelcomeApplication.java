package com.isw.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class WelcomeApplication {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeApplication.class);

    public static void main(String[] args) {
        logger.info("Starting WelcomeApplication");
        SpringApplication.run(WelcomeApplication.class, args);
    }
}