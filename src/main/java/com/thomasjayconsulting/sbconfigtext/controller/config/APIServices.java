package com.thomasjayconsulting.sbconfigtext.controller.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "apiservices")
public record APIServices(String employeeServiceUrl, String employeeServiceApiKey, String paymentServiceUrl, String paymentServiceApiKey) {
}
