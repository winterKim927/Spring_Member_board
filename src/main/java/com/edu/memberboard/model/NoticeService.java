package com.edu.memberboard.model;

import com.edu.memberboard.domain.Notice;

import java.util.List;

public interface NoticeService {
    public List<Notice> selectAll();
    public Notice select(int notice_idx);
    public void regist(Notice notice);
    public void update(Notice notice);
    public void delete(int notice_idx);
}
