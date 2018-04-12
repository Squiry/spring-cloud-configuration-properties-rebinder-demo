package com.example;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo {
    @Bean
    @ConfigurationProperties("example")
    FactoryBean<Object> demoBean() {
        return new AbstractFactoryBean<Object>() {
            @Override
            public Class<?> getObjectType() {
                return Object.class;
            }

            @Override
            protected Object createInstance() throws Exception {
                return new Object();
            }
        };
    }


    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }
}
