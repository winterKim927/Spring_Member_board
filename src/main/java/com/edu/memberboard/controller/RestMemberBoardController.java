package com.edu.memberboard.controller;

import com.edu.memberboard.domain.MemberBoard;
import com.edu.memberboard.model.MemberBoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest")
public class RestMemberBoardController {
    @Autowired
    MemberBoardService memberBoardService;
    Logger log = LoggerFactory.getLogger(getClass().getName());
    @GetMapping("/board")
    public List getList() {
        log.info("겟리스트 작동함");
        return memberBoardService.selectAll();
    }

    @GetMapping("/board/{memberboard_idx}")
    public MemberBoard select(int memberboard_idx){
        return memberBoardService.select(memberboard_idx);
    }

    @PostMapping("/board")
    public String regist(MemberBoard memberBoard){
        log.info("regist 호출, 넘어온건 " + memberBoard);
        memberBoardService.insert(memberBoard);
        return "ok";
    }
    @PutMapping("/board")
    public String edit(MemberBoard memberBoard){
        //memberBoardService.update(memberBoard);
        log.info("넘어온 멤버는 "+memberBoard);
        return "ok";
    }
}
