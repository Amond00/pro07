<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%> 			
<!-- ======= Header ======= -->
<header id="header" class="fixed-top d-flex align-items-center header-transparent" style="background-color:rgba(30, 67, 86, 0.8); ">
  <div class="container d-flex justify-content-between align-items-center">
  
    <div class="logo">
    	<a href="/"><img src="http://me.go.kr/images/home/main/2018/logo.png" alt="로고" class="img-fluid"></a>
    </div>
    
    <nav id="navbar" class="navbar">
      <ul>
        <li><a class="active" href="/" style="color:white">Home</a></li>
        <li><a class="active" href="/sub/portfolio" style="color:white">포트폴리오</a></li>
        
        <li class="dropdown"><a href="#" style="color:white"><span>Drop Down</span> <i class="bi bi-chevron-down"></i></a>
          <ul>
            <li><a href="#">Drop Down 1</a></li>
            <li class="dropdown"><a href="#"><span>Deep Drop Down</span> <i class="bi bi-chevron-right"></i></a>
              <ul>
                <li><a href="#">Deep Drop Down 1</a></li>
                <li><a href="#">Deep Drop Down 2</a></li>
                <li><a href="#">Deep Drop Down 3</a></li>
                <li><a href="#">Deep Drop Down 4</a></li>
                <li><a href="#">Deep Drop Down 5</a></li>
              </ul>
            </li>
            <li><a href="#">Drop Down 2</a></li>
            <li><a href="#">Drop Down 3</a></li>
          </ul>
        </li>
        <li class="dropdown"><a href="#" style="color:white"><span>회원기능</span> <i class="bi bi-chevron-down"></i></a>
          <ul>
	         <c:if test="${empty sid}">
				<li><a href="/member/loginForm">로그인</a></li>
				<li><a href="/member/joinForm">회원가입</a></li>
				<li><a href="/board/list.do">공지사항</a></li>
				<li><a href="/board/list2.do">자유게시판</a></li>
				<li><a href="/board/list3.do">QnA게시판</a></li>
			</c:if>
			<c:if test="${not empty sid}">
			   <li><p style="padding:10px 20px;">${sid }님 환영합니다.</p></li>
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