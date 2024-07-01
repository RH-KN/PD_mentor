package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController {

    @RequestMapping("/custom-error")
    public String handleError() {
        return "error/error"; // error.htmlを返す
    }
}