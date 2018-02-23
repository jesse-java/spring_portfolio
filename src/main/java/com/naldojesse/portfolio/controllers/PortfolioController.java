package com.naldojesse.portfolio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@Controller
public class PortfolioController {
    @RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }
    @RequestMapping("/about_me")
    public String about() {
        return "forward:/about.html";
    }
    @RequestMapping("/projects")
    public String projects() {
        return "forward:/my_projects.html";
    }
}
