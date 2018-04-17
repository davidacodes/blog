package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/home/users")
    public String welcomeUsers(Model model) {

        List<String> users = new ArrayList<>();

        users.add("John");
        users.add("Cindy");
        users.add("Fred");

        model.addAttribute("users", users);
        return "hello";
    }
}
