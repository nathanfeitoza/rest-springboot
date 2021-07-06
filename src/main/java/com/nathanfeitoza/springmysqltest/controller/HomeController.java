package com.nathanfeitoza.springmysqltest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/"})
public class HomeController {
    
    @GetMapping
    public Map<String, String> initial() {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello. The application is run");

        return map;
    }
}
