create schema booksrdb
	default character set utf8mb4;
    
    
use booksrdb;


# 학교  테이블 생성
create table 학교 (
	학교명 char (5) ,
    분류 int , 
    학생수 int , 
    주소 varchar(50) ,
    primary key(학교명)
);



# 학원생 테이블 
CREATE TABLE 학원생 (
    학원생이름 CHAR(5),
    폰번호 VARCHAR(30),
    나이 INT,
    학교이름 CHAR(5),          -- 학교명과 동일한 CHAR(5)
    학년 INT,
    반 INT,
    반_번호 INT,
    PRIMARY KEY(학원생이름),
    FOREIGN KEY(학교이름) REFERENCES 학교(학교명)   -- 학교 테이블의 학교명 참조
);



# 학교 정보 입력
insert into 학교 values ("송원고" , 3 , 435 , "경기 성남 분당구 황새울로 123");
insert into 학교 values ("한빛고" , 2 , 377 , "경기 성남 분당구 판교역로 67");
insert into 학교 values ("이슬고" , 1 , 507 , "경기 성남 분당구 미금로 567");


#학원생 
insert into 학원생 values ("홍나동" , "010-1237-6521" , 19 , "송원고" , 3 , 1 , 10);
insert into 학원생 values ("김하나" ,"010-3218-8765" , 18 , "한빛고" , 2 , 2 , 7);
insert into 학원생 values ("홍길동" ,"010-4587-9834" , 19 , "송원고" , 3 , 1 ,31);
insert into 학원생 values ("박순희" , "010-7789-6754" , 17 , "이슬고" , 1 , 3 , 16);


select * from 학교;
select * from 학원생;


CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    grade VARCHAR(10)
);

INSERT INTO students (name, age, grade) VALUES('Alice', 20, 'A'),('Bob', 21, 'B'),('Charlie', 19, 'C');

CREATE VIEW student_view AS
SELECT name, grade FROM students;

  SELECT * FROM student_view;
     
