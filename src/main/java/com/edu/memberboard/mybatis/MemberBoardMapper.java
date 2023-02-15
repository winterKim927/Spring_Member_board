package com.edu.memberboard.mybatis;

import com.edu.memberboard.domain.MemberBoard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberBoardMapper {
    @Select("select * from memberboard order by memberboard_idx desc")
    public List<MemberBoard> selectAll();
}
