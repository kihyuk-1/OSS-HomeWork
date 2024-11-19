create database testdb
	default character set utf8mb4;
    
    
use testdb;

drop table if exists 사원;
drop table if exists 부서;


create table 부서 (
	부서번호 int   NOT NULL , 
    부서이름 varchar(10)  ,
    primary key (부서번호)
);


create table 사원 (
	사원번호 int not null, 
    사원이름 varchar(10) ,
    소속부서 int ,
    primary key (사원번호) ,
    foreign key (소속부서)
		references 부서(부서번호)
        on delete cascade
);

insert into 부서 (부서번호, `부서이름`) 
values(1,'인사부') , (2, '연구부') , (3,'홍보부');


insert into 사원 (사원번호 , `사원이름` , 소속부서) 
values (1001 , '홍길동'  , 3) , 
	   (1002 , '임꺽정'  , 1) , 
	   (1003 , '차명석'  , 1); 

insert into 부서 values (2, '연구부');

select * from 부서;
select * from 사원;


-- 부서번호 2인 연구부를 삭제해라
DELETE 
FROM 부서
WHERE 부서번호 = 2;


select * from 부서;


-- 임꺽정 소속부서를 2로 수정
SET SQL_SAFE_UPDATES = 0;

update 사원
set  소속부서 = 2
where 사원이름 = '임꺽정';



select * from 사원;


-- 차명석 소속부서를 null 값으로 수정해라
update 사원
set 소속부서 = 1
where 사원이름 = '차명석';

 select * from 사원;