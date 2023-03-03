package com.edu.memberboard.model.Member;

import com.edu.memberboard.domain.Member;
import com.edu.memberboard.mybatis.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public List<Member> selectAll() {
        return memberMapper.selectAll();
    }

    @Override

    public Member select(Member member) {
        return memberMapper.select(member);
    }

    @Override
    @Transactional
    public void regist(Member member) {

        member.setPass(passwordEncoder.encode(member.getPass()));
        memberMapper.insert(member);
    }

    @Override
    @Transactional
    public void updatePass(Member member) {
        memberMapper.updatePass(member);
    }

    @Override
    @Transactional
    public void delete(int member_idx) {
        memberMapper.delete(member_idx);
    }
}
