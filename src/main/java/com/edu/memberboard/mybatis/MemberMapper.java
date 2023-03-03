package com.edu.memberboard.mybatis;

import com.edu.memberboard.domain.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberMapper {
    //관리자용 모든 회원 보기
    @Select("select * from member order by member_idx desc")
    public List<Member> selectAll();

    //id와 비밀번호로 회원 하나 조회
    @Select("select * from member where id = #{id} and pass=#{pass}")
    public Member select(Member member);

    @Insert("insert into member(id, pass, name) values(#{id}, #{pass}, #{name} )")
    public void insert(Member member);

    @Update("update member set pass= #{pass} where member_idx = #{member_idx}")
    public void updatePass(Member member);

    @Delete("delete from member where member_idx = #{member_idx}")
    public void delete(int member_idx);

}
