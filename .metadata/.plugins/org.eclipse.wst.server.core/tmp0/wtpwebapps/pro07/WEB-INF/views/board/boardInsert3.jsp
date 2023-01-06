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
	<title>QnA게시판</title>
    <jsp:include page="../common/head.jsp" />
</head>
<body>
	<jsp:include page="../common/header.jsp" />
	<section class="content">
		<div class="container">
		      <h2 style="text-align: center;">QnA게시판 질문 글쓰기</h2>
		      <hr>
		      <form action="/board/insert3.do" method="post">
			      <table class="tb">
			      	<tbody>	
			      		<tr>
			      			<th>생성 글 고유번호</th>
			      			<td><input id="parno" name="parno" value="${dto.parno }" readonly></td>
			      		</tr>
			      		<tr>
			      			<th>글 제목</th>
			      			<td><textarea id="title" name="title" maxlength=""></textarea></td>
			      		</tr>
			      		<tr>
			      			<th>글 내용</th>
			      			<td><textarea id="content" name="content"></textarea></td>
			      		</tr>
			      		<tr>
			      			<th>작성자</th>
			      			<td><input id="author" name="author" value="${sid }" readonly></td>
			      		</tr>
			      	</tbody>
			      </table>
			      <button class="btn btn-primary" type="submit">글쓰기</button>
		      </form>
		      <hr>
		      <div class="button-group" style="margin-top:5px; ">
				  <a class="btn btn-primary" href="${path1 }/board/list3.do">목록으로 돌아가기</a>
		      </div>	
		</div>
	</section>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>