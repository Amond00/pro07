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
		      <h2 style="text-align: center;">공지사항 목록</h2>
		      <hr>
		      <table class="tb">
		      	<thead>
		      		<tr>
		      			<th width="80">번호</th>
		      			<th width="100">제목</th>
		      			<th width="100">작성자</th>	
		      			<th width="100">작성일</th>
		      		</tr>
		      	</thead>
		      	<tbody>
		      	<c:forEach items="${boardList }" var="board" varStatus="status">
		      		<tr>
		      			<td>${status.count }</td>
		      			<td><a href="/board/detail.do?no=${board.no }">${board.title }</a></td>
		      			<td>${board.author }</td>
		      			<td>${board.resdate }</td>
		      		</tr>
		      	</c:forEach>	
		      	</tbody>
		      </table>
		      <div class="button-group">
					<a class="button" href="${path1 }/board/insertForm.do">글쓰기</a>
			  </div>
		</div>
	</section>
<jsp:include page="../common/footer.jsp" />
</body>
</html>
