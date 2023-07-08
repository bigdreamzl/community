package com.nowcoder.community.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;




@Controller
@RequestMapping("/alpha")
public class AlphaController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "hello spring boot";
    }


}
