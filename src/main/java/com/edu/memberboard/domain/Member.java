package com.edu.memberboard.domain;

import lombok.Data;

@Data
public class Member {
    private int boardmember_idx;
    private String id;
    private String pass;
    private String name;
    private String regdate;
}
