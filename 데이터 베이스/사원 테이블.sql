CREATE DATABASE 과제2
	default character set utf8mb4;
    
    
use 과제2;

# 사원 테이블 생성
create table 사원 (
	사원번호 char (5),
    사원이름 varchar (10),
    나이 int ,
    주소 char(30),
    직급 char(10) ,
    PRIMARY KEY(사원번호)
);

# 사원 데이터 입력 
INSERT INTO 사원 VALUES ('E001' , '홍준화' , 30 , '서울시 마포구' , '대리');

insert into 사원  (사원번호,사원이름,나이,주소,직급)  values ('E001' , '홍준화' , 30 , '서울시 마포구' , '대리');

INSERT INTO 사원 VALUES ('E002' , '김연주' , 28 , '서울시 영등포구' , '사원');
INSERT INTO 사원 VALUES ('E003' , '이명기' , 32 , '서울시 강남구' , '사원');
INSERT INTO 사원 VALUES ('E004' , '김기혁' , 25 , '서울시 금천구' , '이사');




SELECT * FROM 사원;