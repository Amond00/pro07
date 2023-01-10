<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
 	<meta content="width=device-width, initial-scale=1.0" name="viewport">
	<title>환경부</title>
	<jsp:include page="./common/head.jsp" />
</head>
<body>
	<jsp:include page="./common/header.jsp" />
	<!-- ======= Hero Section ======= -->
  <section id="hero" class="d-flex justify-cntent-center align-items-center">
    <div id="heroCarousel" class="container carousel carousel-fade" data-bs-ride="carousel" data-bs-interval="5000">
      <!-- Slide 1 -->
      <div class="carousel-item active">
        <div class="carousel-container">
          <h2 class="animate__animated animate__fadeInDown">국민이 안심할 수 있는 환경,<br> 탄소 중립으로 도약하는 대한민국</h2>
          <p class="animate__animated animate__fadeInUp">1월 6일, 부산·울산 초미세먼지 비상저감조치 </p>
          <a href="http://me.go.kr/home/web/board/read.do?menuId=10525&boardId=1572660&boardMasterId=1" class="btn-get-started animate__animated animate__fadeInUp">Read More</a>
        </div>
      </div>

      <!-- Slide 2 -->
      <div class="carousel-item">
        <div class="carousel-container">
          <h2 class="animate__animated animate__fadeInDown">국민이 안심할 수 있는 환경,<br> 탄소 중립으로 도약하는 대한민국</h2>
          <p class="animate__animated animate__fadeInUp">2023년 환경부 업무보고</p>
          <a href="http://www.me.go.kr/2023briefing/index.html" class="btn-get-started animate__animated animate__fadeInUp">Read More</a>
        </div>
      </div>

      <!-- Slide 3 -->
      <div class="carousel-item">
        <div class="carousel-container">
          <h2 class="animate__animated animate__fadeInDown">국민이 안심할 수 있는 환경,<br> 탄소 중립으로 도약하는 대한민국</h2>
          <p class="animate__animated animate__fadeInUp">저소득층 가정용 저녹스 보일러 지원</p>
          <a href="http://me.go.kr/home/web/board/read.do?pagerOffset=0&maxPageItems=6&maxIndexPages=10&searchValue=&menuId=10392&orgCd=&boardId=1561920&boardMasterId=713&boardCategoryId=&rn=5" class="btn-get-started animate__animated animate__fadeInUp">Read More</a>
        </div>
      </div>

      <a class="carousel-control-prev" href="#heroCarousel" role="button" data-bs-slide="prev">
        <span class="carousel-control-prev-icon bx bx-chevron-left" aria-hidden="true"></span>
      </a>

      <a class="carousel-control-next" href="#heroCarousel" role="button" data-bs-slide="next">
        <span class="carousel-control-next-icon bx bx-chevron-right" aria-hidden="true"></span>
      </a>

    </div>
  </section><!-- End Hero -->

  <main id="main">

    <!-- ======= Services Section ======= -->
    
    <section class="services">
      <div class="container">

        <div class="row board">
        	<h1 style="text-align:center; margin-bottom:40px;">공지 소식·알림</h1>
          <%-- <div class="col-md-6 col-lg-3 d-flex align-items-stretch" data-aos="fade-up">
            <div class="icon-box icon-box-pink">
              <div class="icon"><img src="${path1 }/resources/img/main_img2.png" alt="문서" style="width: 42px;"></div>
              <h4 class="title"><a class="main_board" href=""></a></h4>
              <p class="description"></p>
            </div>
          </div> --%>

        </div>

      </div>
    </section><!-- End Services Section -->

    <!-- ======= Why Us Section ======= -->
    <section class="why-us section-bg" data-aos="fade-up" date-aos-delay="200">
      <div class="container">

        <div class="row">
          <div class="col-lg-6 video-box">
            <img src="${path1}/resources/img/main_img1.jpg" class="img-fluid" alt="환경부 유튜브 2023">
            <a href="https://www.youtube.com/watch?v=GsmSwgNL4KA" class="venobox play-btn mb-4" data-vbtype="video" data-autoplay="true"></a>
          </div>

          <div class="col-lg-6 d-flex flex-column justify-content-center p-5">

            <div class="icon-box">
              <div class="icon"><i class="bx bx-fingerprint"></i></div>
              <h4 class="title"><a href="" class="youtube_btn1">환경부 </a></h4>
              <p class="description">윤석열 대통령 2023년 국토교통·환경 정책방향 보고 참석! 국토교통부와 환경부의 업무보고 현장과 모두발언 풀버전</p>
            </div>

            <div class="icon-box">
              <div class="icon"><i class="bx bx-gift"></i></div>
              <h4 class="title"><a href="" class="youtube_btn2">Nemo Enim</a></h4>
              <p class="description">At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque</p>
            </div>

          </div>
        </div>

      </div>
    </section><!-- End Why Us Section -->

    <!-- ======= Features Section ======= -->
    <section class="features">
      <div class="container">

        <div class="section-title">
          <h2>Features</h2>
          <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
        </div>

        <div class="row" data-aos="fade-up">
          <div class="col-md-5">
            <img src="${path1}/resources/img/features-1.svg" class="img-fluid" alt="">
          </div>
          <div class="col-md-7 pt-4">
            <h3>Voluptatem dignissimos provident quasi corporis voluptates sit assumenda.</h3>
            <p class="fst-italic">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
              magna aliqua.
            </p>
            <ul>
              <li><i class="bi bi-check"></i> Ullamco laboris nisi ut aliquip ex ea commodo consequat.</li>
              <li><i class="bi bi-check"></i> Duis aute irure dolor in reprehenderit in voluptate velit.</li>
            </ul>
          </div>
        </div>

        <div class="row" data-aos="fade-up">
          <div class="col-md-5 order-1 order-md-2">
            <img src="${path1}/resources/img/features-2.svg" class="img-fluid" alt="">
          </div>
          <div class="col-md-7 pt-5 order-2 order-md-1">
            <h3>Corporis temporibus maiores provident</h3>
            <p class="fst-italic">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
              magna aliqua.
            </p>
            <p>
              Ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate
              velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
              culpa qui officia deserunt mollit anim id est laborum
            </p>
          </div>
        </div>

        <div class="row" data-aos="fade-up">
          <div class="col-md-5">
            <img src="${path1}/resources/img/features-3.svg" class="img-fluid" alt="">
          </div>
          <div class="col-md-7 pt-5">
            <h3>Sunt consequatur ad ut est nulla consectetur reiciendis animi voluptas</h3>
            <p>Cupiditate placeat cupiditate placeat est ipsam culpa. Delectus quia minima quod. Sunt saepe odit aut quia voluptatem hic voluptas dolor doloremque.</p>
            <ul>
              <li><i class="bi bi-check"></i> Ullamco laboris nisi ut aliquip ex ea commodo consequat.</li>
              <li><i class="bi bi-check"></i> Duis aute irure dolor in reprehenderit in voluptate velit.</li>
              <li><i class="bi bi-check"></i> Facilis ut et voluptatem aperiam. Autem soluta ad fugiat.</li>
            </ul>
          </div>
        </div>

        <div class="row" data-aos="fade-up">
          <div class="col-md-5 order-1 order-md-2">
            <img src="${path1}/resources/img/features-4.svg" class="img-fluid" alt="">
          </div>
          <div class="col-md-7 pt-5 order-2 order-md-1">
            <h3>Quas et necessitatibus eaque impedit ipsum animi consequatur incidunt in</h3>
            <p class="fst-italic">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
              magna aliqua.
            </p>
            <p>
              Ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate
              velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
              culpa qui officia deserunt mollit anim id est laborum
            </p>
          </div>
        </div>

      </div>
    </section><!-- End Features Section -->

  </main><!-- End #main -->
  	<!-- 공지사항 섹션 로딩 -->
  	<!-- <script>
  	$(document).ready(function(){
		$.ajax({
			url:"${path1 }/main_board.do",	
			type:"GET",		//전송방식
			dataType:"json",//데이터 반환 방식
			success:function(list){
				console.log(list.list);
				var list = list.list;
				if(list==null){ //로딩 실패
					alert("로딩에 실패하였습니다.");
				} else if(list!=null){ //로딩 성공
					alert("로딩 성공");	
					$.each(list, function(index, key, value){
						alert('인덱스'+index+' : 키값'+key.title);
						$(".main_board").append(key.title);
						
					});
				} else if(list==""){
					alert("공지사항이 확인되지 않습니다.");
				}
			}
		});
  	});
  	</script> -->
  	<script>
  	$(document).ready(function(){
		$.ajax({
			url:"/main_board2.do",	
			type:"GET",		//전송방식
			dataType:"json",//데이터 반환 방식
			success:function(list){
				$.each(list, function(k, v){
					var data = "<div class='col-md-6 col-lg-3 d-flex align-items-stretch' data-aos='fade-up'><div class='icon-box icon-box-pink'><div class='icon'><img src='${path1 }/resources/img/main_img2.png' alt='문서' style='width: 42px;''></div>"
					data = data+"<h4 class='title'><a class='main_board_title' href='/board/detail.do?no="+v.no+"'>"+v.title+"</a></h4>"
					data = data+"<p class='description main_board_content'></p></div></div></div>"
					$(".board").append(data);
					
				});
			}
		});
		//여백 제거
		$(".breadcrumbs").remove();
		$("youtube_btn1").click(function(){
			$(".venobox").attr("href", "https://www.youtube.com/watch?v=reZl5j7oeTQ");
		});
		
  	});
  	</script>
	<script>
    $(document).ready(function(){
    	var result = '${joinck}';
    	if(result!=''){
    		alert(result);
    	}

    });
    </script>
	<jsp:include page="./common/footer.jsp" />
</body>
</html>
