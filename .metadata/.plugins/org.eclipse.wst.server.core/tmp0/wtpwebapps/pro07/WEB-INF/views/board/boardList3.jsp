<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:if test="${not empty sid}">
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>QnA게시판</title>
	<jsp:include page="../common/head.jsp" />
	<style>
    	th{background-color:#17455e; color:white; }
    </style>
</head>
<body>
	<jsp:include page="../common/header.jsp" />
	<section class="content">
		<div class="container">
		      <h2 style="text-align: center;">QnA게시판 목록</h2>
		      <hr>
		      <table class="tb">
		      	<thead>
		      		<tr>
		      			<th width="40">번호</th>
		      			<th width="200">제목</th>
		      			<th width="40">작성자</th>	
		      			<th width="80">작성일</th>
		      		</tr>
		      	</thead>
		      	<tbody>
		      	<c:forEach items="${boardList }" var="board" varStatus="status">
		      		<tr>
		      			<td>${status.count }</td>
		      			<td><a href="/board/detail3.do?no=${board.parno }">${board.title }</a></td>
		      			<td>${board.author }</td>
		      			<td>${board.resdate }</td>
		      		</tr>
		      	</c:forEach>	
		      	</tbody>
		      </table>
		      <c:if test="${not empty sid}">
			      <div class="button-group" style="margin-top:5px; ">
						<a class="btn btn-primary" href="${path1 }/board/insertForm3.do">질문 글쓰기</a>
				  </div>
			  </c:if>
		</div>
	</section>
<jsp:include page="../common/footer.jsp" />
</body>
</html>
</c:if>
<c:if test="${empty sid}">
	<script>
        window.setTimeout(function(){
            alert("로그인시 열람할 수 있습니다");
            location.href="/";
        });
    </script>
</c:if>
