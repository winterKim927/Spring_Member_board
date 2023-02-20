package com.edu.memberboard.mybatis;

import com.edu.memberboard.domain.MemberBoard;
import com.edu.memberboard.domain.Notice;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NoticeMapper {
    @Select("select * from notice order by notice_idx desc")
    public List<Notice> selectAll();

    @Select("select * from notice where notice_idx=#{notice_idx}")
    public Notice select(int notice_idx);

    @Insert("insert into notice(title, writer, content) values(#{title}, #{writer}, #{content})")
    public void insert(Notice notice);

    @Update("update notice set title=#{title}, writer=#{writer}, content=#{content} where notice_idx=#{notice_idx}")
    public void update(Notice notice);

    @Delete("delete from notice where notice_idx = #{notice_idx}")
    public void delete(int notice_idx);
}
