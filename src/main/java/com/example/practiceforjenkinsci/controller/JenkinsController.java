package com.example.practiceforjenkinsci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
    @GetMapping("/build")
    public String buildTestDeploy(){
        return "Application has been successfully build tested and deployed";
    }
}
