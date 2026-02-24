package com.imt.api_combat.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app.vars")
public class Properties {
    private String baseurl;
    private Integer monsters_port;
}
