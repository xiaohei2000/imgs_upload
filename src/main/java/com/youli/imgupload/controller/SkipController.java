package com.youli.imgupload.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("skip")
public class SkipController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
