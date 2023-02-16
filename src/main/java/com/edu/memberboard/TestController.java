package com.edu.memberboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String test(){
        System.out.println("진입함");
        return "index";
    }
}
