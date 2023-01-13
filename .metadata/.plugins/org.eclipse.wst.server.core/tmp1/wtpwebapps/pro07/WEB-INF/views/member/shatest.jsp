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

          		<form action="/member/sha256" method="post" role="form" class="php-email-form">
					<div class="form-outline mb-4">
					    <input type="password" id="pw" name="pw" class="form-control" />
					</div>
				  	<button type="submit" class="btn btn-link btn-floating mx-1">로그인</button>
				</form>

    </section>
    <!-- End Contact Section -->

	<jsp:include page="../common/footer.jsp" />
</body>
</html>
