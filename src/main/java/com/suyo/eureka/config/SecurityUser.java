package com.suyo.eureka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "spring.security.user")
@Configuration("user")
@Data
public class SecurityUser {
    private String name;
    private String password;
}
