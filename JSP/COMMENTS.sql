create table COMMENTS
(
    COMMENTS_IDX NUMBER       not null
        primary key,
    NEWS_IDX     NUMBER
        constraint FK_NEWS_COMMENTS
            references NEWS,
    MSG          CLOB         not null,
    AUTHOR       VARCHAR2(20) not null,
    WRITEDATE    DATE default sysdate
)
/

