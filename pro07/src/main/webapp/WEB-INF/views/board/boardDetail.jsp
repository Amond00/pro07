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
      			<td>${dto.resdate }</td>
      		</tr>
      		<tr>
      			<th>방문횟수</th>
      			<td>${dto.visited }</td>
      		</tr>
      	</tbody>
      </table>
      <div class="button-group">
		  <a class="button" href="${path1 }/board/list.do">목록으로 돌아가기</a>
		  <a class="button" href="${path1 }/board/updateForm.do?no=${dto.no}">글 수정</a>
		  <a class="button" href="${path1 }/board/delete.do?no=${dto.no}">글 삭제</a>
      </div>	
	<jsp:include page="../common/footer.jsp" />
</body>
</html>