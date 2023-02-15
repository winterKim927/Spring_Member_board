create table REBOARD
(
    REBOARD_IDX NUMBER not null
        primary key,
    TITLE       VARCHAR2(50),
    WRITER      VARCHAR2(30),
    CONTENT     CLOB,
    REGDATE     DATE   default sysdate,
    TEAM        NUMBER default 0,
    STEP        NUMBER default 0,
    DEPTH       NUMBER default 0
)
/

