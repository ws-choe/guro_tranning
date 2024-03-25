#데이터베이스 목록 확인
SHOW DATABASES;

#데이터베이스 접근
USE mysql;

#테이블 목록 확인
SHOW TABLES;

CREATE DATABASE guro_5class;

#새로운 DVB 접근
USE guro_5class;

#student 테이블 생성
#속성명/데이터타입/
CREATE TABLE student (
	phone VARCHAR(100) NOT NULL PRIMARY KEY,
	NAME VARCHAR(20) NOT NULL,
	age INT NOT NULL,
	address VARCHAR(50) NOT NULL,
	favorite VARCHAR(50) NOT NULL #작성 후 먼저 쿼리 실행해야 show tables해서 출력할 수 있음. create 안 하면 아무것도 보이지 않음.
);
#테이블 목록 확인
SHOW TABLES;

#테이블 구조 확인 describe = desc 줄임말
DESC student;
DESCRIBE student;

#데이터 입력
INSERT INTO student VALUES ('010-6438-9300', '신동진', 36, '서울시 구로구 오류동', '피아노');

#데이터 확인
SELECT * FROM student; # * = 'all'의미
SELECT NAME, age FROM student; #select와 from 중간에 특전 column 이름을 입력하면 해당 column만 조회됨.

#우리의 데이터 입력
INSERT INTO student VALUES ('010-8475-2297', '최예슬',33,'경기도 파주시 목동동','뜨개질');
INSERT INTO student VALUES ('010-9068-4786', '이정원',28,'서울 관악구 봉천동','캠핑');
INSERT INTO student VALUES ('010-6792-2536','박찬홍',34,'서울 도봉구 창동','영화');
INSERT INTO student VALUES ('010-7189-3415','김가영',25,'경기도 남양주시','클라이밍');
INSERT INTO student VALUES ('010-8697-7985','최원석',33,'서울 서대문구 홍제동','앤듀로');
INSERT INTO student VALUES ('010-8004-3046','심보민',25,'경기도 오산시 갈곶동','헬스');
INSERT INTO student VALUES ('010-7769-8748','선혁',24,'경기도 하남시 선동','축구');
INSERT INTO student VALUES ('010-9370-2164','신준용',39,'서울 금천구 가산동','놀고먹기');
INSERT INTO student VALUES ('010-4172-6775','이지연',29,'서울 은평구 진관동','미술');

# test DB에 접근
USE test;

SHOW TABLES;

DESC test;

INSERT INTO test VALUE ("사과");



INSERT INTO test VALUE ("바나나");

USE guro_5class;

#AS 옵션 테스트
SELECT phone AS 전화번호, NAME AS 이름, age AS 나이 FROM student;

SELECT phone, NAME, age FROM student;

SELECT phone AS 폰번호, NAME AS 네임, age AS 연세 FROM student;

SELECT
	phone AS 연락처,
	NAME AS 이름,
	age AS 나이
FROM student;

SELECT NAME AS 이름, age AS 나이 FROM student ORDER BY age ASC; 

#다차 컬럼 정렬
SELECT * FROM student ORDER BY NAME ASC, age DESC;

INSERT INTO student VALUES ('010-4440-7985','신동진',40,'서울시 구로구 오류동','검도');

#중복 제거
SELECT DISTINCT NAME FROM student ORDER BY NAME ASC, age DESC; #order by asc, desc에 칼럼 두 개이상 사용 가능.

#행 개수 제한 출력 -> limit
SELECT * FROM student LIMIT 5;

SELECT * FROM student;

#스튜턴트 테이블에서 작년 기준 나이를 포함한 전체 column를 출력.
SELECT phone, NAME, age AS 현재나이, age -1 AS 작년나이,address, favorite FROM student;
#출력 결과에서 name과 age를 결합하고, 전체 컬럼을 출력하시오.
SELECT phone, CONCAT(NAME,age)AS 이름과나이, address, favorite FROM student;

#select - where절 연습
#나이가 33인 학생들을 조회하시오.
SELECT * FROM student WHERE age = 33;

#나이가 30이하 이고, 결과를 오름차순 정렬 하시오.
SELECT * FROM student WHERE age <= 30 ORDER BY age ASC;

SELECT * FROM student WHERE name LIKE '신%';
#
SELECT * FROM student WHERE address IN('서대문구','구로구');


#나이가 25살이상이고 30살이하인 학생들을 나이를 기준으로 내림차순 출력하시오.
SELECT * FROM student WHERE age BETWEEN 25 AND 30 ORDER BY age DESC;

SELECT * FROM student WHERE age IN('25','33','29') ORDER BY age ASC;

#2024.03.15 쿼리문 연습.
#문제1) 서울에 거주하는 인원 중 나이가 29미만인 학생들을 조회하시오. + 나이 오름차순.
SELECT NAME AS 이름, age AS 나이, address AS 주소 from student WHERE age < 29 and address LIKE '서울%' ORDER BY age ASC;

#경기도 거주하는 인원 중 나이 30이상인 학생 조회.
SELECT NAME AS 이름, age AS 나이, address AS 주소 FROM student WHERE age > 30 and address LIKE '서울%' ORDER BY age ASC;

SELECT * FROM student WHERE age IN('28','33');

SELECT CONCAT(age, NAME,address)AS 열합 FROM student WHERE address LIKE '서울%' ORDER BY age ASC;

SELECT name FROM student order BY name LIMIT 3 OFFSET 2;

#데이터베이스 접근
USE guro_5class;


#insert 테스트 위한 테이블 생성
CREATE TABLE student_hobby (
	NAME VARCHAR(20) NOT NULL,
	height float NOT NULL,
	birthday DATE NOT NULL,
	hobby char(2)
);


#table 목록 확인
SHOW TABLES; 
#구조 확인 (생성 후 항상 구조 확인을 하는 습관을 길러야 함)
DESC student_hobby;

INSERT INTO student_hobby VALUES ('신동진',169.3,'1989-08-17','등산');

SELECT * FROM student_hobby;

INSERT INTO student_hobby VALUES ('이정원',173.2, '1995-08-21',NULL);
INSERT INTO student_hobby VALUES ('위르겐 클롭',193.5,'1967-06-16','축구');
INSERT INTO student_hobby VALUES ('알렉스 퍼거슨',182.5,'1941-04-21',NULL);

#auto_increment 숫자 자동 증가 테스트
CREATE TABLE board_test (
	id INT NOT NULL AUTO_INCREMENT PRIMARY key,
	SUBJECT VARCHAR(50) NOT NULL,
	content TEXT NOT null
);

DESC board_test;

#id값은 null로 지정해야 함.
INSERT INTO board_test VALUES (NULL, '문의 드립니다.', '안녕하세요?? 컴퓨터가 먹통인데요. 연락 좀 주세요.');
INSERT INTO board_test VALUES (NULL, '저도 문의 드립니다.', '안녕하세요?? 저도 마찬가지로 컴퓨터가 먹통인데요. 제발 연락 좀 주세요.');
INSERT INTO board_test VALUES (NULL, '문의요. 답변 안주면 별1개 리뷰 남길거임', '안녕하세요?? 컴터 좀 고쳐주세요? 연락없음 별점 테러 갑니다.');
INSERT INTO board_test VALUES (NULL, '문의', '냉무/');

SELECT * FROM board_test;


#update test
SELECT * FROM student;
UPDATE student SET favorite = '축구' WHERE NAME = '선혁';

UPDATE student SET favorite = 'ㅋㅋ';
UPDATE student SET favorite = '하드 앤듀로' WHERE age = 33 and NAME = '최원석';

#delete test
SELECT * FROM student;
DELETE FROM student WHERE NAME = '신동진';
DELETE FROM student WHERE phone = '010-6792-2536' AND age = 34;
UPDATE student SET favorite = 'ㅋㅋ' WHERE NAME = '최예슬';


#Truncate 
TRUNCATE TABLE student;
SELECT * FROM student;


INSERT INTO student VALUES ('010-6438-9300', '신동진', 36, '서울시 구로구', 'LOL');
SELECT * FROM student;
UPDATE student SET favorite = 'LeagueOfLegend' WHERE NAME = '신동진';

#lower = 소문자 변환, upper -> 대문자 변환
SELECT phone, NAME, age, address, upper(favorite) AS '소문자 변환' FROM student;

#select 바로 테스트
SELECT LOWER('leagueoflegend') AS '소문자 변환'; #이와 같이 잘 사용하지 않음.

#trim 테스트
INSERT INTO student VALUES ('010-9999-9999','테스트',33,'서울시 금천구',' piano ');
SELECT * FROM student;
SELECT phone, NAME, age, address, LTRIM(favorite) AS '좌측 공백 제거' FROM student;
SELECT phone, NAME, age, address, RTRIM(favorite) AS '좌측 공백 제거' FROM student;

#문자열 합치기
SELECT CONCAT(NAME, '은 ', age, '세 입니다.') AS '문자열 합친 결과' FROM student;

#날짜 뺄셈 datediff
SELECT * FROM student_hobby;
SELECT DATEDIFF('2024-03-22', birthday) AS '내가 태어나고 몇일이나 살았을까?' FROM student_hobby;


#테이블 이름 변경 
ALTER TABLE `board_test` RENAME `test_board`;
SHOW TABLES;

#테이블 열 이름 변경
ALTER TABLE `student` CHANGE COLUMN favorite hobby VARCHAR(75);
SELECT * FROM student;
ALTER TABLE `student` CHANGE COLUMN phone phone_number VARCHAR(20);
DESC student;

#테이블 열 삭제 
ALTER TABLE `student` DROP COLUMN if EXISTS `hobby`;
SELECT * FROM student;

ALTER TABLE `student`ADD COLUMN hobby VARCHAR(20) NULL;
SELECT * FROM student;


#설계 단계에서 정규화를 끝냈고, 두 개의 테이블 생성(기본키, 외래키)
CREATE TABLE personal (
	jumin_number CHAR(14) NOT NULL PRIMARY KEY,
	NAME VARCHAR(10) NOT NULL,
	address VARCHAR(40) NOT NULL
);
DESC personal;

#두 번째 테이블 생성 (외래키)

CREATE TABLE personal_addtion (
	jumin_number_fk CHAR(14) NOT NULL,
	age INT NOT NULL,
	height FLOAT NOT NULL,
	weight FLOAT NOT NULL,
	hobby VARCHAR(10),
	FOREIGN KEY (jumin_number_fk) REFERENCES personal(jumin_number) ON DELETE cascade
);

DESC personal_addtion;

#두 번째 테이블에 기본 키 부여
ALTER TABLE `personal_addition` ADD CONSTRAINT PRIMARY KEY (jumin_number_fk);
DESC personal_addtion;



#데이터 입력 테스트
insert INTO personal VALUES ('890817-1******', '신동진', '서울시 구로구 오류동');
INSERT INTO personal_addtion VALUES ('890817-1******', 36, 168.7, 71, '등산');
INSERT INTO personal VALUES ('950821-1******', '이정원', '서울 관악구');
INSERT INTO personal_addtion VALUES ('950821-1******', 28, 171.3, 75, '코딩');


SELECT * FROM personal;
SELECT * FROM personal_addtion;

#personal 테이블에서만 데이터 삭제 후 select로 두 테이블 확인.
DELETE FROM personal WHERE NAME = '이정원'; #삭제 후 두 번째 테이블에서 연쇄 삭제되는지 확인.

SELECT * FROM personal;
SELECT * FROM personal_addtion;

INSERT INTO personal VALUES ('860201-1******', '펭거', '서울 동작구');
INSERT INTO personal_addtion VALUES ('860201-1******', 18, 185.1, 80, '영화');

SELECT * FROM personal;
SELECT * FROM personal_addtion;

DELETE FROM personal WHERE jumin_number = '860201-1******';
SELECT * FROM personal;
SELECT * FROM personal_addtion;



