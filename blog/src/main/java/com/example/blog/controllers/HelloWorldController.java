package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring!";
    }

    @GetMapping("/logout")
    @ResponseBody
    public String logout() {
        return "You have logged out.";
    }

    @RequestMapping (path = "/lights", method = RequestMethod.GET)
    @ResponseBody
    public String lights() {
        return "lights on";
    }
}
