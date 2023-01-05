<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>공지사항 글 보기</title>
    <jsp:include page="../include/head.jsp" />
	<script>
	    $(document).ready( function () {
	        $('.tb').DataTable();
	    } );
    </script>
	<style>
		.row.column.text-center {margin-left: 350px; width: 1200px; }
    	th { background-color:#fef100; color:white; text-align:center; }
    </style>
</head>
<body>
	<jsp:include page="../include/header.jsp" />
    <div class="row column text-center">
      <h2>공지사항 상세 보기</h2>
      <hr>
      <table class="tb">
      	<tbody>
      		<tr>
      			<th>글 번호</th>
      			<td>${dto.no }</td>
      		</tr>	
      		<tr>
      			<th>글 제목</th>
      			<td>${dto.title }</td>
      		</tr>
      		<tr>
      			<th>글 내용</th>
      			<td>${dto.content }</td>
      		</tr>
      		<tr>
      			<th>작성자</th>
      			<td>${dto.author }</td>
      		</tr>
      		<tr>
      			<th>작성일시</th>
      			<td>${dto.regdate }</td>
      		</tr>
      	</tbody>
      </table>
      		<div class="button-group">
				  <a class="button" href="${path1 }/board/list.do">글 목록</a>
				  <a class="button" href="${path1 }/board/delete.do?no=${dto.no}">글 삭제</a>
				  <a class="button" href="${path1 }/board/edit.do?no=${dto.no}">글 수정</a>
			</div>
      
    </div>
	
	<jsp:include page="../include/footer.jsp" />
</body>
</html>