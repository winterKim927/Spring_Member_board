package com.edu.memberboard.model;

import com.edu.memberboard.domain.Notice;
import com.edu.memberboard.mybatis.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoticeServiceImpl implements NoticeService{
    @Autowired
    NoticeMapper noticeMapper;
    @Override
    public List<Notice> selectAll() {
        return noticeMapper.selectAll();
    }

    @Override
    public Notice select(int notice_idx) {
        return noticeMapper.select(notice_idx);
    }

    @Override
    public void regist(Notice notice) {
        noticeMapper.insert(notice);
    }

    @Override
    public void update(Notice notice) {
        noticeMapper.update(notice);
    }

    @Override
    public void delete(int notice_idx) {
        noticeMapper.delete(notice_idx);
    }
}
