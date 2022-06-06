package com.kariseio.project.springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class helloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
