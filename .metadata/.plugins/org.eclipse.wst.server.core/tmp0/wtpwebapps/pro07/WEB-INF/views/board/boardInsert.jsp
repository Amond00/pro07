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
      <h2>공지사항 글쓰기</h2>
      <hr>
      <form action="/board/insert.do" method="post">
	      <table class="tb">
	      	<tbody>	
	      		<tr>
	      			<th>글 제목</th>
	      			<td><textarea id="title" name="title"></textarea></td>
	      		</tr>
	      		<tr>
	      			<th>글 내용</th>
	      			<td><textarea id="content" name="content"></textarea></td>
	      		</tr>
	      		<tr>
	      			<th>작성자</th>
	      			<td><textarea id="author" name="author" readonly>${sid }</textarea></td>
	      		</tr>
	      	</tbody>
	      </table>
	      <button type="submit">글쓰기</button>
      </form>
      <div class="button-group">
		  <a class="button" href="${path1 }/board/list.do">목록으로 돌아가기</a>
      </div>	
	<jsp:include page="../common/footer.jsp" />
</body>
</html>