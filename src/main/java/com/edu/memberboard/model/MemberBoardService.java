package com.edu.memberboard.model;

import com.edu.memberboard.domain.MemberBoard;

import java.util.List;

public interface MemberBoardService {
    public List<MemberBoard> selectAll();
}
