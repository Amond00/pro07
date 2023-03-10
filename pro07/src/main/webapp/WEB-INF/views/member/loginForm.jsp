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
	<title>로그인</title>
	<jsp:include page="../common/head.jsp" />
	<style>
		.wrap { min}
	</style>
</head>
<body>
	<jsp:include page="../common/header.jsp" />
	<!-- ======= Contact Section ======= -->
    <section class="contact" data-aos="fade-up" data-aos-easing="ease-in-out" data-aos-duration="500">
      <div class="container">

        <div class="row">

          <div class="col-lg-6">
            <div class="row">
              <div class="col-md-12">
                <div class="info-box">
                  <i class="bx bx-map"></i>
                  <h3>Our Address</h3>
                  <p>A108 Adam Street, New York, NY 535022</p>
                </div>
              </div>
              <div class="col-md-6">
                <div class="info-box">
                  <i class="bx bx-envelope"></i>
                  <h3>Email Us</h3>
                  <p>info@example.com<br>contact@example.com</p>
                </div>
              </div>
              <div class="col-md-6">
                <div class="info-box">
                  <i class="bx bx-phone-call"></i>
                  <h3>Call Us</h3>
                  <p>+1 5589 55488 55<br>+1 6678 254445 41</p>
                </div>
              </div>
            </div>
          </div>

          <div class="col-lg-6">
          		<form action="/member/login.do" method="post" role="form" class="php-email-form">
	            	<div class="form-outline mb-4">
				    	<input type="text" id="id" name="id" class="form-control" />
				  	</div>
				
					<div class="form-outline mb-4">
					    <input type="password" id="pw" name="pw" class="form-control" />
					</div>
				  	<button type="submit" class="btn btn-link btn-floating mx-1">로그인</button>
				</form>
			</div>

        </div>
      </div>
    </section><!-- End Contact Section -->
    <script>
    $(document).ready(function(){
    	var result = '${loginck}';
    	if(result!=''){
    		alert(result);
    	}
    });
    </script>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>
