package com.reachkaushikdas.personalpicmanagementapp.personalpicmanagementappusersws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PersonalpicmanagementappuserswsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalpicmanagementappuserswsApplication.class, args);
    }

}
