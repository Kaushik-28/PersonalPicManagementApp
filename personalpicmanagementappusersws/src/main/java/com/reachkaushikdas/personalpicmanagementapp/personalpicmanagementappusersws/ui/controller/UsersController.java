package com.reachkaushikdas.personalpicmanagementapp.personalpicmanagementappusersws.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

   @GetMapping(path="/status/check")
    public String statusCheck(){
        return "it's working";
    }
}
