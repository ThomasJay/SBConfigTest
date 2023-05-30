package com.thomasjayconsulting.sbconfigtext.controller;

import com.thomasjayconsulting.sbconfigtext.controller.config.APIServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestRestController {

//    @Value("${password}")
//    private String password;

    @Autowired
    APIServices apiServices;

    @Autowired
    private Environment env;

    @GetMapping("/hello")
    public String hello() {

        String password = env.getProperty("password");
        log.info("password = " + password);
        log.info("employee Service URL: " + apiServices.employeeServiceUrl() + " key: " + apiServices.employeeServiceApiKey());
        log.info("payment Service URL: " + apiServices.paymentServiceUrl() + " key: " + apiServices.paymentServiceApiKey());
        return "Hi";
    }
}
