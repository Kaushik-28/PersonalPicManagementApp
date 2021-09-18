package com.reachkaushikdas.personalpicmanagementapp.accountmanagementws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountmanagementwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountmanagementwsApplication.class, args);
    }

}
