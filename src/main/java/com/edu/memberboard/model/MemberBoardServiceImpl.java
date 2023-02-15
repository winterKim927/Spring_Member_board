package com.edu.memberboard.model;

import com.edu.memberboard.domain.MemberBoard;
import com.edu.memberboard.mybatis.MemberBoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberBoardServiceImpl implements MemberBoardService{
    @Autowired
    MemberBoardMapper mapper;
    @Override
    public List<MemberBoard> selectAll() {
        List<MemberBoard> memberList = mapper.selectAll();
        return memberList;
    }
}
