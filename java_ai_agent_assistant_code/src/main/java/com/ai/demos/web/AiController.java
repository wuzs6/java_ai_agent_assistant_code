package com.ai.demos.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {

    @GetMapping("/aichat")
    public String aiChat(){

        return "AI Agent Running";
    }
}
