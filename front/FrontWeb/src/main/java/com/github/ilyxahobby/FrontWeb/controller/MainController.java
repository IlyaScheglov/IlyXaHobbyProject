package com.github.ilyxahobby.FrontWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String firstPage(Model model) {
        return "first_page";
    }
}
