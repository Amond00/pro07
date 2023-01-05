create database goverment;
use goverment;
commit;

create table sample(id varchar(20), pw varchar(20));
insert into sample values('kkt', '1234');
insert into sample values('kim', '1004');
insert into sample values('lee', '1111');
insert into sample values('cho', '2222');
insert into sample values('jeong', '3333');

create table member(
id varchar(100) primary key, 
pw varchar(500) not null, 
name varchar(100) not null,
address varchar(200),
tel varchar(100),
regdate datetime default now(),
visited int default 0
); 
select * from member where id='hth' and pw='1234';
insert into member values ('hth','1234','한태헌','지구','010-1111-1111',default,default);
insert into member values ('admin','1234','관리자','지구','010-1111-1111',default,default);

create table board(
no int auto_increment primary key,
title varchar(200) not null,
content varchar(1000) not null,
author varchar(100) not null,
resdate datetime default now(),
visited int default 0
);
create table board2(
no int auto_increment primary key,
title varchar(200) not null,
content varchar(1000) not null,
author varchar(100) not null,
resdate datetime default now(),
visited int default 0
);
select * from board;
select * from board2;
insert into board values(default, '공지사항 제목1','공지사항 내용1','admin',default,default);
insert into board values(default, '공지사항 제목2','공지사항 내용2','admin',default,default);
update board set visited=visited+1 where no=1;
insert into board2 values(default, '자유게시판 제목1','자유게시판 내용1','hth',default,default);
insert into board2 values(default, '자유게시판 제목2','자유게시판 내용2','hth',default,default);



