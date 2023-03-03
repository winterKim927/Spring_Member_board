package com.edu.memberboard.controller;

import com.edu.memberboard.domain.Member;
import com.edu.memberboard.model.Member.MemberService;
import com.edu.memberboard.util.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/member")
public class RestMemberController {
    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private MemberService memberService;

    @PostMapping
    public ResponseEntity<Msg> regist(Member member){
        log.info("regist 진입함");
        memberService.regist(member);
        Msg msg = new Msg();
        msg.setMsg("회원 가입 성공");
        ResponseEntity<Msg> entity = new ResponseEntity(msg, HttpStatus.OK);
        return entity;
    }

    @GetMapping
    public List<Member> getAllMember(){
        log.info("getList 진입함");
        return memberService.selectAll();
    }
}
