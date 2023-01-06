<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>공지사항</title>
    <jsp:include page="../common/head.jsp" />
</head>
<body>
	<jsp:include page="../common/header.jsp" />
	<section class="content">
		<div class="container">
		      <h2 style="text-align: center;">공지사항 수정</h2>
		      <hr>
		      <form action="/board/update.do" method="post">
			      <table class="tb">
			      	<tbody>
			      		<tr>
			      			<th>글 번호</th>
			      			<td><input readonly id="no" name="no" value="${dto.no }"></td>
			      		</tr>	
			      		<tr>
			      			<th>글 제목</th>
			      			<td><textarea id="title" name="title">${dto.title }</textarea></td>
			      		</tr>
			      		<tr>
			      			<th>글 내용</th>
			      			<td><textarea id="content" name="content">${dto.content }</textarea></td>
			      		</tr>
			      		<tr>
			      			<th>작성자</th>
			      			<td><input readonly value="${dto.author }"></td>
			      		</tr>
			      	</tbody>
			      </table>
		      <button class="btn btn-primary" type="submit">수정</button>
		      </form>
		      <hr>
		      <div class="button-group" style="margin-top:5px; ">
				  <a class="btn btn-primary" href="${path1 }/board/list.do">목록으로 돌아가기</a>
		      </div>	
		</div>
	</section>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>