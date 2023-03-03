package com.edu.memberboard.model.Member;

import com.edu.memberboard.domain.Member;

import java.util.List;

public interface MemberService {
    public List<Member> selectAll();
    public Member select(Member member);
    public void regist(Member member);
    public void updatePass(Member member);
    public void delete(int member_idx);
}
