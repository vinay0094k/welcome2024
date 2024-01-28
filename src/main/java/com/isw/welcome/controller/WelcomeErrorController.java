package com.isw.welcome.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Controller
public class WelcomeErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        return "404";    //execute (404.html)
    }
    // @Override
    // public String getErrorPath() {
    //     return "null";
    // }
    @ExceptionHandler(Exception.class)
    public String handleGenericException(Exception e) {
        return "404";    //execute (404.html)
    }
}
