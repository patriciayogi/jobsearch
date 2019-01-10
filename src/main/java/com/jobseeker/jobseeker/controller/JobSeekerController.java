package com.jobseeker.jobseeker.controller;

import com.jobseeker.jobseeker.models.response.Indeed;
import com.jobseeker.jobseeker.service.IndeedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@EnableCircuitBreaker
@RestController
public class JobSeekerController {

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    private IndeedClient indeedClient;

    @RequestMapping("/jobs")
    public Indeed index() {

        return indeedClient.readingList();
    }

}
