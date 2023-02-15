package com.edu.memberboard.domain;

import lombok.Data;

@Data
public class MemberBoard {
    private int memberboard_idx;
    private String title;
    private String writer;
    private String content;
    private String regdate;
    private int hit;
}
