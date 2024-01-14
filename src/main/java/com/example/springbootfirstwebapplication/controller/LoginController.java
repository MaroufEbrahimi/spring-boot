package com.example.springbootfirstwebapplication.controller;

import com.example.springbootfirstwebapplication.sercive.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcome(ModelMap model, @RequestParam String name, @RequestParam String password) {
        boolean isValid = service.validateUser(name, password);
        if (!isValid) {
            return "login";
        }
        model.put("name", name);
        model.put("password", password);
        model.put("password", password);
        return "welcome";
    }
}


