package com.urchin.bg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thymeleafController {
    @RequestMapping("/test")
    public  String test(Model model){
        model.addAttribute("msg","测试");
        return  "hello";
    }
}
