package com.imt.api_combat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ApiCombatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiCombatApplication.class, args);
    }

}

