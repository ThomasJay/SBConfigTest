package com.thomasjayconsulting.sbconfigtext;

import com.thomasjayconsulting.sbconfigtext.controller.config.APIServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(APIServices.class)
public class SbConfigTextApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbConfigTextApplication.class, args);
    }

}
