package com.mrusanov.spring.cb.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
public class SpringCbTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCbTurbineApplication.class, args);
    }

}
