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
        	<!-- 공지사항 최신순으로 8개 까지만 출력 -->
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
          	<iframe id="youtube_vdo" name="youtube_vdo" class="youtube_iframe" width="560" height="315" src="https://www.youtube.com/embed/GsmSwgNL4KA" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
          </div>

          <div class="col-lg-6 d-flex flex-column justify-content-center p-5">
          
          	<div class="icon-box">
              <div class="icon"><i class="bx bx-file"></i></div>
              <h4 class="title"><a href="https://www.youtube.com/embed/GsmSwgNL4KA"  target="youtube_vdo">환경부</a></h4>
              <p class="description">2023년 환경부 업무계획 사전 브리핑 | 환경부 한화진 장관</p>
            </div>
          
            <div class="icon-box">
              <div class="icon"><i class="bx bx-file"></i></div>
              <h4 class="title"><a href="https://www.youtube.com/embed/reZl5j7oeTQ"  target="youtube_vdo">환경부</a></h4>
              <p class="description">윤석열 대통령 2023년 국토교통·환경 정책방향 보고 참석! 국토교통부와 환경부의 업무보고 현장과 모두발언 풀버전</p>
            </div>

            <div class="icon-box">
              <div class="icon"><i class="bx bx-file"></i></div>
              <h4 class="title"><a href="https://www.youtube.com/embed/QStZTjk3EA8" target="youtube_vdo">환경부</a></h4>
              <p class="description">2023년 환경부 업무계획 사전 브리핑 | 환경부 한화진 장관</p>
            </div>

          </div>
        </div>

      </div>
    </section><!-- End Why Us Section -->

    <!-- ======= Features Section ======= -->
    <section class="features">
      <div class="container">

        <div class="section-title">
          <h2>정책 브리핑</h2>
          <p>나라를 <strong>단단</strong>하게 국민을 <strong>든든</strong>하게</p>
        </div>

        <div class="row" data-aos="fade-up">
          <div class="col-md-5">
            <img src="${path1}/resources/img/main_img4.png" class="img-fluid" alt="2022-01-10">
          </div>
          <div class="col-md-7 pt-4">
            <h3>정부의 정책, 사실은 이렇습니다. </h3>
            <p class="fst-italic">
				제10차 전력수급기본계획, 관계부처와 충분히 협의해 최종안 마련
            </p>
            <ul>
              <li><i class="bi bi-check"></i> 산업통상자원부는 “제10차 전력수급기본계획은 환경부, 탄녹위 등 관계부처와 충분히 협의해 최종안이 마련됐으며, 재생에너지 목표 비중 조정은 원전 확대와 별도의 관점에서 반영된 것”이라고 밝혔습니다.</li>
            </ul>
          </div>
        </div>

        <div class="row" data-aos="fade-up">
          <div class="col-md-5 order-1 order-md-2">
            <img src="${path1}/resources/img/main_img3.png" class="img-fluid" alt="2022-01-10">
          </div>
          <div class="col-md-7 pt-5 order-2 order-md-1 text-center">
            <h3>환경정책</h3>
            <p class="fst-italic">
             	<a href="https://me.go.kr/home/web/index.do?menuId=10260">#환경정책일반</a><br>
             	<a href="https://me.go.kr/home/web/index.do?menuId=10276">#환경보건</a><br>
             	<a href="https://me.go.kr/home/web/index.do?menuId=10262">#기후대기</a><br>
            </p>
            <p class="fst-italic">
             	<a href="https://me.go.kr/home/web/index.do?menuId=10263">#물 환경 관리</a><br>
             	<a href="https://me.go.kr/home/web/index.do?menuId=10264">#상하수도</a><br>
             	<a href="https://me.go.kr/home/web/index.do?menuId=10265">#자연보건</a><br>
            </p>
          </div>
        </div>

        <div class="row" data-aos="fade-up">
          <div class="col-md-5">
            <img src="/resources/img/main_img5.png" class="img-fluid" alt="2022-01-10">
          </div>
          <div class="col-md-7 pt-5">
            <h3>미세먼지 항공 관측 현장 점검</h3>
            <p>한화진 환경부 장관이 9일 오후 충남 태안군 소재 한서대학교 비행장에서 미세먼지 항공관측 현황에 대한 설명을 듣고, 관측자료를 적극 활용하여 미세먼지 저감 대책을 효과적으로 추진해 줄 것을 당부하고 있다.
				한화진 환경부 장관이 9일 오후 충남 태안군 소재 한서대학교 비행장에서 국립환경과학원이 운영 중인 미세먼지 관측 항공기에 탑승하여 충남 서해안 상공을 비행하며 미세먼지 배출시설에 대한 관측 과정과 관측자료의 특성에 대한 설명을 듣고 있다.
			</p>
          </div>
        </div>

        <div class="row" data-aos="fade-up">
          <div class="col-md-5 order-1 order-md-2">
            <img src="${path1}/resources/img/main_img6.png" class="img-fluid" alt="2022-01-10">
          </div>
          <div class="col-md-7 pt-5 order-2 order-md-1">
            <h3>하남시 환경기초시설 점검</h3>
            <p class="fst-italic">
              	한화진 환경부 장관이 10일 오후 경기 하남시 환경기초시설인 하남유니온타워를 방문하여 대기방지시설 최적 운영여부 등 미세먼지 감축 자발적 협약 이행상황을 점검하고, "미세먼지 저감을 위해 시설을 철저히 관리해 줄 것"을 당부하고 있다.
            </p>
          </div>
        </div>

      </div>
    </section><!-- End Features Section -->

  </main><!-- End #main -->
  	<!-- 공지사항 섹션 로딩 -->
  	<script>
  	$(document).ready(function(){
  		var cnt = 0;
		$.ajax({
			url:"/main_board2.do",	
			type:"GET",		//전송방식
			dataType:"json",//데이터 반환 방식
			success:function(list){	
				
				$.each(list, function(k, v){
					if(cnt<=6){
					var data = "<div class='col-md-6 col-lg-3 d-flex align-items-stretch' data-aos='fade-up'><div class='icon-box icon-box-pink'><div class='icon'><img src='${path1 }/resources/img/main_img2.png' alt='문서' style='width: 42px;''></div>"
					data = data+"<h4 class='title'><a class='main_board_title' href='/board/detail.do?no="+v.no+"'>"+v.title+"</a></h4>"
					data = data+"<p class='description main_board_content'></p></div></div></div>"
					$(".board").append(data);
					cnt += 1
					console.log(cnt);
					}
				});
				
			}
		});
		//여백 제거
		$(".breadcrumbs").remove();
	});
  	</script>
	<script>
    $(document).ready(function(){
    	var result = '${joinck}';
    	if(result!=''){
    		alert(result);
    	} else {
    		return false;
    	}

    });
    </script>
	<jsp:include page="./common/footer.jsp" />
</body>
</html>
