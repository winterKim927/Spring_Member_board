package com.edu.memberboard.model;

import com.edu.memberboard.domain.MemberBoard;

import java.util.List;

public interface MemberBoardService {
    public List<MemberBoard> selectAll();
    public MemberBoard select(int memberboard_idx);
    public void insert(MemberBoard memberBoard);
    public void update(MemberBoard memberBoard);
    public void delete(int memberboard_idx);
}
