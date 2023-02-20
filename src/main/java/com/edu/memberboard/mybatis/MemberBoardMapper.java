package com.edu.memberboard.mybatis;

import com.edu.memberboard.domain.MemberBoard;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberBoardMapper {
    @Select("select * from memberboard order by memberboard_idx desc")
    public List<MemberBoard> selectAll();

    @Select("select * from memberboard where memberboard_idx = #{memberboard_idx}")
    public MemberBoard select(int memberboard_idx);

    @Insert("insert into memberboard(title, writer, content) values(#{title}, #{writer}, #{content})")
    public void insert(MemberBoard memberBoard);

    @Update("update memberboard set title = #{title}, writer= #{writer}, content = #{content} where memberboard_idx = #{memberboard_idx}")
    public void update(MemberBoard memberBoard);

    @Delete("delete memberboard where memberboard_idx = #{memberboard_idx}")
    public void delete(int memberboard_idx);
}
