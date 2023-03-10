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
    <style>
    	th{background-color:#17455e; color:white; }
    </style>
</head>
<body>
	<jsp:include page="../common/header.jsp" />
	<section class="content">
		<div class="container">
		      <h2 style="text-align: center;">QnA게시판 상세 보기</h2>
		      <hr>
		      <table class="tb">
		      	<tbody>
		      		<tr>
		      			<th style="width:150px;">고유 번호</th>
		      			<td>${dto1.parno }</td>
		      		</tr>		      		
		      		<tr>
		      			<th style="width:150px;">질문글 제목</th>
		      			<td>${dto1.title }</td>
		      		</tr>
		      		<tr>
		      			<th style="width:150px;">질문글 내용</th>
		      			<td>${dto1.content }</td>
		      		</tr>
		      		<tr>
		      			<th style="width:150px;">질문 작성자</th>
		      			<td>${dto1.author }</td>
		      		</tr>
		      		<tr>
		      			<th style="width:150px;">작성일시</th>
		      			<td>${dto1.resdate }</td>
		      		</tr>
		      		
		      		<tr>
		      			<th style="width:150px;">조회수</th>
		      			<td>${dto1.visited }</td>
		      		</tr>
		      	</tbody>
		      	<c:if test="${not empty dto2}">
		      	<tbody>
		      		<tr>
		      			<th style="width:150px;">답변글 번호</th>
		      			<td>${dto2.no }</td>
		      		</tr>	
		      		<tr>
		      			<th style="width:150px;">답변글 제목</th>
		      			<td>${dto2.title }</td>
		      		</tr>
		      		<tr>
		      			<th style="width:150px;">답변글 내용</th>
		      			<td>${dto2.content }</td>
		      		</tr>
		      		<tr>
		      			<th style="width:150px;">작성자</th>
		      			<td>admin</td>
		      		</tr>
		      		<tr>
		      			<th style="width:150px;">작성일시</th>
		      			<td>${dto2.resdate }</td>
		      		</tr>
		      	</tbody>
		      	</c:if>
		      	<c:if test="${empty dto2}">
		      		<tr>
		      			<th style="width:150px;"></th>
		      			<td><h2 style="text-align: center; color:red; font-weight: bolder; ">아직 답변이 작성되지 않았습니다. </h2></td>
		      		<tr>
		      	</c:if>
		      </table>
		      <hr>
		      <div class="button-group" style="margin-top:5px; ">
		      		<a class="btn btn-primary" href="${path1 }/board/list3.do">목록으로 돌아가기</a>
		      		<!-- 답변 전에만 수정 가능 -->
		      	<c:if test="${empty dto2}">
		      		<a class="btn btn-primary" href="${path1 }/board/updateForm3.do?parno=${dto1.parno}">질문글 수정</a>
		      	</c:if>
		      	<c:if test="${sid }=='${dto1.author }'">
		      		<a class="btn btn-danger" href="${path1 }/board/delete3.do?parno=${dto1.parno}">글 삭제</a>
		      	</c:if>
		      	<c:if test="${sid=='admin'}">
					  <a class="btn btn-danger" href="${path1 }/board/insertForm3_1.do?parno=${dto1.parno}">답변 작성</a>
					  <a class="btn btn-danger" href="${path1 }/board/updateForm3_1.do?parno=${dto1.parno}">답변 수정</a>
					  <a class="btn btn-danger" href="${path1 }/board/delete3.do?parno=${dto1.parno}">글 삭제</a>
				</c:if>
		      </div>	
	      </div>
	</section>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>