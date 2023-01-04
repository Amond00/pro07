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

