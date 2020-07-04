package com.serezha.core.service;

import org.springframework.stereotype.Component;

@Component
public class DefaultTaskService implements TaskService {
    @Override
    public String getHelloMessage() {
        return "Hello from %s".formatted(getClass());
    }
}
