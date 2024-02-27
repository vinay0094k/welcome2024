package com.isw.welcome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";    // execute(home.html)
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";    // execute(welcome.html)
    }    
}
