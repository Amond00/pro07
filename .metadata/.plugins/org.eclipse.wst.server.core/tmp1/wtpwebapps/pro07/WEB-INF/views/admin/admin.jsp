<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:if test="${sid eq 'admin'}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>회원가입</title>
    <jsp:include page="../common/head.jsp" />
    <style>
		@import url('https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap');*{margin: 0;padding: 0;box-sizing: border-box;list-style: none;font-family: 'Montserrat', sans-serif}body{padding: 10px}.topnav{background-color: #ffff;overflow: hidden}.far.fa-user-circle{font-size: 29px;color: #726f6f;padding-top: 10px}.input-10{width: 40px;color: #4c4c96;font-weight: 600}.fas.fa-search{display: flex;flex-direction: column;align-items: center;justify-content: center;background-color: lightsalmon;height: 100%}.topnav a{float: left;display: block;color: #8d8b8b;font-weight: 800;font-size: 14px;text-transform: uppercase;padding: 14px 16px;text-decoration: none;border-bottom: 3px solid transparent}.topnav a:hover{color: black;border-bottom: 3px solid red}.topnav .active{color: black;border-bottom: 3px solid red}form.example input[type=text]{padding: 10px;font-size: 17px;border: 1px solid grey;float: left;width: 90%;height: 36px;background: #fff}form.example input[type=text]:focus{outline: none}form.example button{float: left;width: 10%;height: 36px;padding: 5px;border-top-right-radius: 5px;border-bottom-right-radius: 5px;background: #4c4c96;color: white;font-size: 14px;border: 1px solid grey;border-left: none;cursor: pointer}.navbar-toggler:focus{box-shadow: none;outline: none;border: none}::placeholder{font-size: 10px}form.example button:hover{background: #0b7dda}form.example::after{content: "";clear: both;display: table}.container .table-responsive{margin: 20px auto;overflow-x: auto}.container .table-responsive::-webkit-scrollbar{height: 5px}.container .table-responsive::-webkit-scrollbar-thumb{border-radius: 5px;background-image: linear-gradient(to right, #5D7ECD, #0C91E6)}.table thead tr th{font-size: 11px;color: #868585;padding: 10px 10px}.table tbody tr td{font-size: 13.5px;padding: 10px 10px}#navbars{width: 8.2%;background-color: #123649 !important;height: 50px;border: none}.bg-blight{color: #7f7fee;font-weight: 600}.bg-bdark{color: #4c4c96;font-weight: 600}.fas.fa-bars{color: white}#navbar2{width: 80%}#navbar-items{width: 8.2%;height: 70vh;background-color: rgba(30, 67, 86, 0.8)}ul#navbar-items li{color: #b6b5b5;padding: 15px 25px;font-weight: 600;text-transform: uppercase;font-size: 10px;display: flex;align-items: center}ul li .fas{font-size: 16px}ul#navbar-items li:hover{background-color: #123649;color: white}ul li:hover .fas{color: #f7910c}#topnavbar{width: 80%}.fs13{font-size: 13px}.fs14{font-size: 18px;color: white}.fas.fa-times{color: red}.fas.fa-check{color: greenyellow}.example{width: 50%}@media(max-width:780px){#navbar{width: 8.2%}#topnavbar{width: 80%}.text-decoration-none.fs14{font-size: 10px}.text-decoration-none .fs13{font-size: 9px}}@media(max-width:430px){#navbar-items, #topnavbar{width: 100%;height: 100%}#navbar-items{padding: 20px;margin-bottom: 30px}.topnav a{font-size: 12px;padding: 12px}#navbar{width: 100%;background-color: blue}.example{width: 100%}.text-decoration-none.fs14{font-size: 14px}.text-decoration-none .fs13{font-size: 13px}}@media(max-width:376px){#navbar-items{padding: 20px;margin-bottom: 30px}.topnav a{font-size: 12px;padding: 7px}}@media(max-width:320px){.topnav a{font-size: 10px;padding: 4px}}
		body { padding:0px; }
		th{background-color:#17455e; color:white; }
		#topnavbar { margin-left:90px; }
		
	</style>
</head>
<body>
	<jsp:include page="../common/header.jsp" />
	<section class="breadcrumbs">
        <div class="d-flex justify-content-between align-items-center"></div>
        <div class="d-flex justify-content-between align-items-center"></div>
</section>
<div class="px-0 bg-light">
    <div class="d-flex">
        <div class="d-flex align-items-center " id="navbars"> <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbar-items" aria-controls="navbarSupportedContent" aria-expanded="true" aria-label="Toggle navigation"> <span class="fas fa-bars"></span> </button> 
        <a class="text-decoration-none fs14 ps-2" href="#" style="text-align:center;">관리자 기능 목록</a> </div>
        <div id="navbar2" class="d-flex justify-content-end pe-4"> <span class="far fa-user-circle "></span> </div>
    </div>
    <div class="d-md-flex">
	        <ul id="navbar-items" class="p-0 m-0 text-center">
	            <li class="board"> <span class="fas fa-th-list"></span> <span class="ps-3 name">공지사항 관리</span> </li>
	            <li class="board2"> <span class="fas fa-chart-line"></span> <span class="ps-3 name">자유 게시판 관리</span> </li>
	            <li class="board3"> <span class="fas fa-clipboard-check"></span> <span class="ps-3 name">QnA게시판 관리</span> </li>
	            <li class="member"> <span class="fas fa-suitcase-rolling"></span> <span class="ps-3 name">회원목록</span> </li>
	        </ul>
	        <div id="topnavbar">
                <div class="table-responsive px-2">
                	<table class="tb">
				      	<thead class="boardsh">
				      		<tr style="display:none;"><th width="10">체크</th><th width="40">번호</th><th width="200">제목</th><th width="40">작성자</th><th width="80">작성일</th></tr>
				      	</thead>
				      	<tbody class="boards">
				      	</tbody>
			      	</table>
			      	<div class="button-group" style="margin-top:5px; ">
			      		<a class="btn btn-danger delete">삭제</a>
			      	</div>
		        	<script>
				  	$(document).ready(function(){
				  		$(".dataTables_empty").remove();
				  		var urls = "";	
				  		var detailUrl = '';
				  		var deleteUrl = '';
				  		$(".board, .board2, .board3").click(function(){
				  			$(".boardsh *").remove();
				  			$(".boards *").remove();
							var datah = "<tr><th>체크</th><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th></tr>";
							$(".boardsh").append(datah);
				  			var bc = $(this).attr('class');
				  			if(bc=='board'){
				  				urls = "/admin/list.do";
				  				detailUrl = '/board/detail.do?no=';
				  				deleteUrl = '/board/delete.do?no=';
				  			} else if (bc=='board2') {
				  				urls = "/admin/list2.do";
				  				detailUrl = '/board/detail2.do?no=';
				  				deleteUrl = '/board/delete2.do?no=';
				  			} else if (bc=='board3') {
				  				urls = "/admin/list3.do";
				  				detailUrl = '/board/detail3.do?no=';
				  				deleteUrl = '/board/delete3.do?parno=';
				  			}
							$.ajax({
								url:urls,	
								type:"GET",		//전송방식
								dataType:"json",//데이터 반환 방식
								success:function(list){	
									$.each(list, function(k, v){
										k+=1
										var data = "<tr><td><input type='checkbox' name='chk' class='chk' value="+v.no+"></td><td>"+ k +"</td>"
										data = data+"<td><a href='"+detailUrl+v.no+"'>"+v.title+"</a></td><td>"+v.author+"</td><td>"+v.resdate+"</td></tr>"
										$(".boards").append(data);
									});
								}
							});
				  		});
				  		
						$(".delete").click(function(){
			                var no = $(".chk[type=checkbox]:checked").attr("value");
			                var ckno = $('input:checkbox[name=chk]:checked').length;
			                $('input:checkbox[name=chk]:checked').each(function(){
			                	chkval = "";
		                		var chkval = $(this).attr("value");
								location.href=" "+deleteUrl+""+chkval+" ";
								alert("삭제에 성공하셨습니다.");
								location.href="/admin/adminPage";
		                	});
						});
						
						$(".member").click(function(){
							$(".boardsh *").remove();
				  			$(".boards *").remove();
							var datah = "<tr><th>체크</th><th class='idth'>아이디</th><th class='nameth'>이름</th><th class='emailth'>이메일</th><th class='addressth'>주소</th><th class='telth'>전화번호</th><th class='regdateth'>가입일</th><th class='visitedth'>방문횟수</th></tr>";
							var button = ""
							$(".boardsh").append(datah);
							$.ajax({
								url:"/admin/memlist.do",	
								type:"GET",		//전송방식
								dataType:"json",//데이터 반환 방식
								success:function(list){	
									$.each(list, function(k, v){
										var data = "<tr><td><input type='checkbox' name='chk'></td>"
										data = data+"<td>"+v.id+"</td><td>"+v.name+"</td><td>"+v.email+"</td><td>"+v.address+"</td><td>"+v.tel+"</td><td>"+v.regdate+"</td><td>"+v.visited+"</td></tr>"
										$(".boards").append(data);
									});
								}
							});
						});
		                
					});
				  	</script>
                </div>
            </div>
	    </div>
	</div>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>
</c:if>
<c:if test="${sid ne 'admin'}">
<script>
    window.setTimeout(function(){
        alert("허용되지 않은 접근입니다.");
        location.href="/";
    });
</script>
</c:if>