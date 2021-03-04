package com.itguigu.webtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@ResponseBody
//@RestController
public class IndexController {

    @RequestMapping("/index")
    public String firstTest(Model model){
        model.addAttribute("msg","helloWorld!");
        return "test";
    }
}
