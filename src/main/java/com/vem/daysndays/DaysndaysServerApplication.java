package com.vem.daysndays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories(basePackages="com.vem") //notice this line
public class DaysndaysServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DaysndaysServerApplication.class, args);
    }
}
