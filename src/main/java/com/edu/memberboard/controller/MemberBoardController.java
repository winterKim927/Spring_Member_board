package com.edu.memberboard.controller;

import com.edu.memberboard.domain.MemberBoard;
import com.edu.memberboard.model.MemberBoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class MemberBoardController {
    @Autowired
    MemberBoardService memberBoardService;
    Logger log = LoggerFactory.getLogger(getClass().getName());
    @GetMapping("/")
    public String getMain(){
        return "index";
    }

    @GetMapping("/list")
    public String goList(){
        return "list";
    }

    @GetMapping("/write")
    public String goWrite(){
        return "writeform";
    }
}
