package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Index_controller
{
    @GetMapping("/index")
    public String helloWorld()
    {
        return "index";
    }

}
