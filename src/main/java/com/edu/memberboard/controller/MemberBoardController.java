package com.edu.memberboard.controller;

import com.edu.memberboard.domain.MemberBoard;
import com.edu.memberboard.model.MemberBoard.MemberBoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


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

    @GetMapping("/detail/{memberboard_idx}")
    public ModelAndView goDetail(@PathVariable int memberboard_idx){
        log.info(memberboard_idx+"라는 숫자가 넘어옴");
        MemberBoard memberBoard = memberBoardService.select(memberboard_idx);
        ModelAndView mv = new ModelAndView("detail");
        mv.addObject("memberboard", memberBoard);
        return mv;
    }
}
