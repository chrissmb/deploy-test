package com.example.deploytest.controller;

import com.example.deploytest.schema.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Value("${application.environment}")
    private String environment;

    @GetMapping("info")
    public Info info() {
        return Info.builder()
                .environment(environment)
                .build();
    }
}
