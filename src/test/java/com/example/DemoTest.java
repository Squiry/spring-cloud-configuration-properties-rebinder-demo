package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void factoryBeanRebinding() {
        applicationContext.publishEvent(new EnvironmentChangeEvent(applicationContext, Collections.emptySet()));
    }
}