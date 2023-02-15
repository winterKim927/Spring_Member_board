create table NEWS
(
    NEWS_IDX NUMBER       not null
        primary key,
    TITLE    VARCHAR2(30) not null,
    WRITER   VARCHAR2(20) not null,
    CONTENT  CLOB,
    REGDATE  DATE   default sysdate,
    HIT      NUMBER default 0
)
/

