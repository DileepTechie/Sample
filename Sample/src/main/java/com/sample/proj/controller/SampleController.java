package com.sample.proj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/one")
    public String methodOne() {
        return "Welcome to you";
    }
	
	@PostMapping("/two")
    public String methodTwo() {
        return "Hello Word";
    }
}
