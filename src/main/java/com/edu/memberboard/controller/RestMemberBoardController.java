package com.edu.memberboard.controller;

import com.edu.memberboard.domain.Member;
import com.edu.memberboard.domain.MemberBoard;
import com.edu.memberboard.model.Member.MemberService;
import com.edu.memberboard.model.MemberBoard.MemberBoardService;
import com.edu.memberboard.util.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest")
public class RestMemberBoardController {
    @Autowired
    MemberBoardService memberBoardService;
    @Autowired
    private MemberService memberService;
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
        memberBoardService.update(memberBoard);
        log.info("넘어온 수정글 "+memberBoard);
        return "ok";
    }
    @DeleteMapping("/board/{memberboard_idx}")
    public String delete(@PathVariable int memberboard_idx){
        memberBoardService.delete(memberboard_idx);
        return "삭제완료";
    }
}
