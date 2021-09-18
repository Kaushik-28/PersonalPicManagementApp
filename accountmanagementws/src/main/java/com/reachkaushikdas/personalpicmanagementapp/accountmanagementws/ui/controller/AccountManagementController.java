package com.reachkaushikdas.personalpicmanagementapp.accountmanagementws.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountManagementController {

    @GetMapping("status/check")
    public String statusCheck(){
        return "account ms is working";
    }
}
