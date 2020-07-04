package com.serezha.web.controller;

import com.serezha.core.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/check")
    public String hello() {
        return taskService.getHelloMessage();
    }
}
