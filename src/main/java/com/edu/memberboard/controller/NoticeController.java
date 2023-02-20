package com.edu.memberboard.controller;

import com.edu.memberboard.domain.Notice;
import com.edu.memberboard.model.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeController {
    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private NoticeService noticeService;

    @GetMapping("/rest/notice/list")
    public String getList(){
        //return noticeService.selectAll();
        return "테스트중";
    }

    @GetMapping("/rest/notice/detail")
    public Notice getDetail(int notice_idx){
        return noticeService.select(notice_idx);
    }
    @PostMapping("/rest/notice/regist")
    public String regist(Notice notice){
        log.info("title" + notice.getTitle());
        //noticeService.regist(notice);
        return "test";
    }

    @DeleteMapping("/rest/notice/delete")
    public void delete(int notice_idx){
        noticeService.delete(notice_idx);
    }

}
