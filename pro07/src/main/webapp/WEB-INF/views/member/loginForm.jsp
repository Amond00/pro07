<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml"
 xmlns:th="http://www.thymeleaf.org"
 xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">	
<head>
	<title>로그인</title>
	<jsp:include page="../common/head.jsp" />
</head>
<body>
	<jsp:include page="../common/header.jsp" />
<form action="/member/login.do" method="post" >
	<table>
		<tr>
			<th>아이디</th>
			<td><input type="text" id="id" name="id" placeholder="아이디 입력"></td>
			<th>비밀번호</th>
			<td><input type="password" id="pw" name="pw" placeholder="아이디 입력"></td>
		</tr>
	</table>
<button type="submit">로그인</button>
</form>
<jsp:include page="../common/footer.jsp" />
</body>
</html>
