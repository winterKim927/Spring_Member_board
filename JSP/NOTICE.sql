create table NOTICE
(
    NOTICE_IDX NUMBER not null
        primary key,
    TITLE      VARCHAR2(30),
    WRITER     VARCHAR2(20),
    CONTENT    CLOB,
    REGDATE    DATE   default sysdate,
    HIT        NUMBER default 0
)
/

