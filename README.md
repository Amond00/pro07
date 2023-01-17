# 환경부 웹 애플리케이션

## 1. 프로젝트 개요
"환경부"를 모티브로 하여 가상의 기업의 홈페이지를 주제로 정한 후 사전에 먼저 페이퍼 프로토 타입을 이용해 프론트 엔드 부분의 전체적인 틀을 설계하였습니다. 프로토 타입을 바탕으로 부트스트랩을 이용해 프론트
부분의 전체적인 부분을 완성하였고 이것을 바탕으로 STS3 를 사용하여 로그인, 회원가입, 아이디 중복 확인,주소 입력, 공지사항 게시판(목록 및 상세보기, 글 등록, 글 수정, 글 삭제), 자유게시판(목록 및 상세보기, 글 등록, 글 수정, 글 삭제), QnA게시판(목록 및 상세보기, 질문글 등록, 답변 글 등록, 질문 글 수정, 답변 글 수정, 글 삭제), 관리자 페이지(Ajax를 이용한 공지, 자유, QnA 게시판 글 조회 및 일괄 삭제) 기능들을 MVC2 패턴을 기반으로 하여 약결합을 통해 구현했습니다.

## 2. 개발환경
* IDE : STS3
* GIT : Git Bash

## 3. FRONTEND
* JSTL, EL, Bootstrap CSS framework, JQuery, Ajax
* FRONTEND 화면 URL : https://amond00.github.io/web07/

## 4. BACKEND
* JAVA-VERSION : JAVA8
* Build : Maven
* DB : MySQL
* DB-Connection: JDBC MyBatis
* SERVER : TOMCAT9
* CRYPT STYLE : SHA256

## 5. 프로젝트 설계 및 화면 구현 PPT
### 설계 및 설정
![구조](./img/MVC2P.PNG "구조 소개")
![ERD](./img/erd/database.PNG "데이터 베이스 ERD")
#### ServiceImpl, DAOImpl 을 생성해 약결합으로 구현
![ERD](./img/erd/board.PNG "컨트롤러 서비스 다오 약결합")
#### 1. 공지사항　　　　　2. 자유게시판　　　3.QnA게시판
![ERD](./img/erd/boardDTO.PNG "DTO")
![ERD](./img/erd/member.PNG "")
![ERD](./img/erd/memberDTO.PNG "DTO")
#### Ajax를 이용해 구현
![ERD](./img/erd/admin.PNG "admin")

### 구현 화면
![MAIN](./img/imp/main1.PNG "메인 페이지1")
![MAIN](./img/imp/main2.PNG "메인 페이지2")
![MAIN](./img/imp/main3.PNG "메인 페이지3")
![MAIN](./img/imp/main4.PNG "메인 페이지4")
![MAIN](./img/imp/main5.PNG "메인 페이지5")
![USER](./img/imp/join1.PNG "회원가입 약관")
![USER](./img/imp/join2.PNG "회원가입")
![USER](./img/imp/login.PNG "로그인")
![notice](./img/imp/boardList.PNG "공지사항 목록")
![notice](./img/imp/boardDetail.PNG "공지사항 상세보기")
![notice](./img/imp/boardInsert.PNG "공지사항 등록")
![notice](./img/imp/boardmodi.PNG "공지사항 수정")
![QnA](./img/imp/qnaList.PNG "QnA 목록")
![QnA](./img/imp/qnaDetail.PNG "QnA 상세보기")
![QnA](./img/imp/qnaInsertQ.PNG "QnA 질문 글 등록")
![QnA](./img/imp/qnaModiQ.PNG "QnA 질문 글 수정")
![QnA](./img/imp/qnaInsertA.PNG "QnA 답변 글 등록")
![QnA](./img/imp/qnaModiA.PNG "QnA 답변 글 수정")
![Admin](./img/imp/admin1.PNG "관리자 페이지")
![Admin](./img/imp/admin2.PNG "관리자 페이지")
![Admin](./img/imp/admin3.PNG "관리자 페이지")
![Admin](./img/imp/admin4.PNG "관리자 페이지")
### 세팅
![Setting](./img/code/setting.PNG "root-context")
![Setting](./img/code/setting2.PNG "servlet-context")