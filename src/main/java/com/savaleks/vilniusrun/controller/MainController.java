package com.savaleks.vilniusrun.controller;

import com.savaleks.vilniusrun.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model){
        // creating new user
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }
}


