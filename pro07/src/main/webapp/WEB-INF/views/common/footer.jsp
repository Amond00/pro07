<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%> 			
  <!-- ======= Footer ======= -->
  <footer id="footer" data-aos="fade-up" data-aos-easing="ease-in-out" data-aos-duration="500">

    <!-- <div class="footer-newsletter">
      <div class="container">
        <div class="row">
          <div class="col-lg-6">
            <ul style="list-style: none;">
				<li>
					<a href="http://me.go.kr/#">외청·소속기관</a><br>
					<a href="http://me.go.kr/#">산하기관</a><br>
					<a href="http://me.go.kr/#">협회</a><br>
					<a href="http://me.go.kr/#">정부부처</a><br>
					<a href="http://me.go.kr/#">지방자치단체</a>
				<li>
			</ul>
          </div>
          <div class="col-lg-6">
            <form action="" method="post">
              <input type="email" name="email"><input type="submit" value="Subscribe">
            </form>
          </div>
        </div>
      </div>
    </div> -->

    <div class="footer-top">
      <div class="container">
        <div class="row">

          <div class="col-lg-3 col-md-6 footer-links">
            <h4>메뉴</h4>
            <ul>
              <li><i class="bx bx-chevron-right"></i><a href="http://me.go.kr/#">외청·소속기관</a></li>
              <li><i class="bx bx-chevron-right"></i><a href="#">산하기관</a></li>
              <li><i class="bx bx-chevron-right"></i><a href="#">협회</a></li>
              <li><i class="bx bx-chevron-right"></i><a href="#">정부부처</a></li>
              <li><i class="bx bx-chevron-right"></i><a href="#">지방자치단체</a></li>
            </ul>
          </div>

          <div class="col-lg-3 col-md-6 footer-links">
            <h4>회원기능</h4>
            <ul>
	            <c:if test="${empty sid}">
					<li><a href="/member/loginForm">로그인</a></li>
					<li><a href="/member/joinForm">회원가입</a></li>
					<li><a href="/board/list.do">공지사항</a></li>
					<li><a href="/board/list2.do">자유게시판</a></li>
					<li><a href="/board/list3.do">QnA게시판</a></li>
				</c:if>
				<c:if test="${not empty sid}">
				   <li><a href="/member/logout.do">로그아웃</a></li>
				   <li><a href="/board/list.do">공지사항</a></li>
				   <li><a href="/board/list2.do">자유게시판</a></li>
				   <li><a href="/board/list3.do">QnA게시판</a></li>
				</c:if>
            </ul>
          </div>

          <div class="col-lg-3 col-md-6 footer-contact">
            <h4>주소 :</h4>
            <p>
          	  03172 서울특별시 종로구 사직로8길 60 | <br> (여권영사민원실) 서울특별시 서초구 남부순환로 2558 외교타운 6층<br>
              <strong>Phone:</strong> 02.2100.2114(주간),<br> 02.3210.0404(영사콜센터, 24시간)<br>
            </p>

          </div>

          <div class="col-lg-3 col-md-6 footer-info">
            <h3>민원실 : 1577-8866</h3>
            <p>
				- 누리집 저작권은 환경부에 있습니다.
            </p>
            <div class="social-links mt-3">
              <a href="https://twitter.com/mevpr" class="twitter"><i class="bx bxl-twitter"></i></a>
              <a href="https://www.facebook.com/mevpr" class="facebook"><i class="bx bxl-facebook"></i></a>
              <a href="https://www.instagram.com/ministry_environment/" class="instagram"><i class="bx bxl-instagram"></i></a>
            </div>
          </div>

        </div>
      </div>
    </div>

    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong><span>Moderna</span></strong>. All Rights Reserved <br>
	       주소 : 03172 서울특별시 종로구 사직로8길 60 | <br>
	    (여권영사민원실) 서울특별시 서초구 남부순환로 2558 외교타운 6층 <br>
		전화번호 : 02.2100.2114(주간), 02.3210.0404(영사콜센터, 24시간) <br>
		팩스 : 02.2100.7998
      </div>
      <div class="credits">
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
      </div>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>