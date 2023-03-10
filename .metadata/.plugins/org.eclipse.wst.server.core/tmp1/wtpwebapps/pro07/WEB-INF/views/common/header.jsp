<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%> 			
<!-- ======= Header ======= -->
<header id="header" class="fixed-top d-flex align-items-center header-transparent" style="background-color:rgba(30, 67, 86, 0.8); ">
  <div class="container d-flex justify-content-between align-items-center">
  
    <div class="logo">
    	<a href="/"><img src="${path1 }/resources/img/logo.png" alt="로고" class="img-fluid"></a>
    </div>
    
    <nav id="navbar" class="navbar">
      <ul>
        <li><a class="active" href="/" style="color:white">Home</a></li>
        
        <li class="dropdown"><a href="#" style="color:white"><span>회원기능</span> <i class="bi bi-chevron-down"></i></a>
          <ul>
	         <c:if test="${empty sid}">
				<li><a href="/member/loginForm">로그인</a></li>
				<li><a href="/member/joinForm">회원가입</a></li>
				<li><a href="/board/list.do">공지사항</a></li>
				<li><a href="/board/list2.do">자유게시판</a></li>
				<li><a href="/board/list3.do">QnA게시판</a></li>
			</c:if>
			<c:if test="${not empty sid and sid ne 'admin'}">
			   <li><p style="padding:10px 20px;">${sid }님 환영합니다.</p></li>
			   <li><a href="/member/logout.do">로그아웃</a></li>
			   <li><a href="/board/list.do">공지사항</a></li>
			   <li><a href="/board/list2.do">자유게시판</a></li>
			   <li><a href="/board/list3.do">QnA게시판</a></li>
			</c:if>
			<c:if test="${sid eq 'admin'}">
			   <li><p style="padding:10px 20px;">${sid }님 환영합니다.</p></li>
			   <li><a style="font-weight:bolder; color:red; text-align:center;" href="/admin/adminPage">괸리자 메뉴</a></li>
			   <li><a href="/member/logout.do">로그아웃</a></li>
			   <li><a href="/board/list.do">공지사항</a></li>
			   <li><a href="/board/list2.do">자유게시판</a></li>
			   <li><a href="/board/list3.do">QnA게시판</a></li>
			</c:if>
          </ul>
        </li>
         	
      </ul>
      <i class="bi bi-list mobile-nav-toggle"></i>
    </nav><!-- .navbar -->

  </div>
  
</header><!-- End Header -->
<section class="breadcrumbs">
        <div class="d-flex justify-content-between align-items-center"></div>
        <div class="d-flex justify-content-between align-items-center"></div>
</section>