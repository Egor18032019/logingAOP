package com.t1.loging;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class LogingApplication {

    private static final Logger logger = LogManager.getLogger(LogingApplication.class);
    public static void main(String[] args) {
        logger.info("Запуск приложения с аргументами {}", Arrays.toString(args));
        logger.debug("Запуск приложения с аргументами {}", Arrays.toString(args));
        logger.warn("Запуск приложения с аргументами {}", Arrays.toString(args));
        SpringApplication.run(LogingApplication.class, args);
    }

}
