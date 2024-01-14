package com.example.springbootfirstwebapplication.controller;

import com.example.springbootfirstwebapplication.sercive.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @Autowired
    TodoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodos() {
        return "list-todos";
    }
}
