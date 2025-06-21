package com.bugtracker.projectservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @GetMapping("/test")
    public String test() {
        return "This is a test - project-service" + "\n\n";
    }
}
