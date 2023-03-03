package com.edu.memberboard.controller;

import com.edu.memberboard.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    @GetMapping("/member/login")
    public String login(Member member){
        return null;
    }
}
