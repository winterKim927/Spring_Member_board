create table NOTICEMEMBER
(
    NOTICEMEMBER_IDX NUMBER       not null
        primary key,
    ID               VARCHAR2(20) not null
        unique,
    PASS             VARCHAR2(20) not null,
    NAME             VARCHAR2(20) not null,
    REGDATE          DATE default sysdate
)
/

