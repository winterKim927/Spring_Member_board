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

    @Override
    public MemberBoard select(int memberboard_idx) {
        return mapper.select(memberboard_idx);
    }

    @Override
    public void insert(MemberBoard memberBoard) {
        mapper.insert(memberBoard);
    }

    @Override
    public void update(MemberBoard memberBoard) {
        mapper.update(memberBoard);
    }

    @Override
    public void delete(int memberboard_idx) {
        mapper.delete(memberboard_idx);
    }
}
