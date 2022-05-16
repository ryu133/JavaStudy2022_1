
create table freeboard(
    id number constraint PK_freeboard_id primary key, --자동 증가 컬럼
    name varchar2(100) not null,
    password varchar2(100) null,
    email varchar2(100) null,
    subject varchar2(100) not null, --글제목
    content varchar2(2000) not null,--글내용
    inputdate varchar2(100) not null, --작성일
    masterid number default 0, ---질답형 게시판에서 답변의 글을 그룹화
    readcount number default 0, --글 조회수
    replynum number default 0,
    step number default 0
    );
    
select * from freeboard;

--id 컬럼: 새로운 글이 등록될 때 기존의 id컬럼의 최대값을 가져와서 +1 <= 새 글 번호의 넘버링
--답변글을 처리하는 컬럼이 3개 필요함(masterid,replynum,step)
	--masterid: 글의 답변에 대한 그룹화, id컬럼의 값이 그대로 들어간 경우, 답변글이 아니다. 처음글
	--replaynum: 답변글에 대한 넘버링
	--step: 답변글의 깊이
		--0: 처음글(자신의 글)
		--1: 답변글
		--2: 답변의 답변글
		

insert into freeboard(id,name,password,email,subject,content,inputdate,masterid,readcount,replynum,step)
values (1,'홍길동','1234','ccc@ccc.com','첫번째 글입니다.','첫번째 내용','22-05-11 11:52 오전',1,0,0,0);

--답변글이 존재하는 테이블을 출력할 때 정렬을 잘 해서 가져와야 한다
select * from freeboard
order by masterid desc,replaynum,step,id;
--masterid컬럼에 중복된 값이 있을 경우, replynum컬럼을 asc
--replynum이 중복된 값이 존재할 때 step을 asc
--step이 중복된 값이 존재할 때 id asc

select * from freeboard where name like '%a%' 
or subject like '%a%' or content like '%a%' order by id desc;


