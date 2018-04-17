package com.example.blog.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

@Controller
public class DiceRoll {

    @GetMapping("/dice")
    public String rollPrompt() {
            return"dice";
    }

    @PostMapping("/dice/roll")
    public String rollInput(Model model) {
        Random rand = new Random();
        int  nums = rand.nextInt(6) + 1;

        model.addAttribute("nums", nums);
        return "diceroll";

    }
}
