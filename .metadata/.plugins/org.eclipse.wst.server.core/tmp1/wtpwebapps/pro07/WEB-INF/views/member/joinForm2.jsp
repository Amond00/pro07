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
	<title>회원가입</title>
    <jsp:include page="../common/head.jsp" />
</head>
<body>
	<jsp:include page="../common/header.jsp" />
	<section class="vh-1300" style="background-color: #eee;">
	  <div class="container h-100">
	    <div class="row d-flex justify-content-center align-items-center h-100">
	      <div class="col-lg-12 col-xl-11">
	        <div class="card text-black" style="border-radius: 25px;">
	          <div class="card-body p-md-5">
	            <div class="row justify-content-center">
	              <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
	
	                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">회원가입</p>
	
	                <form class="mx-1 mx-md-4" action="join.do" method="post" onsubmit="return joinck(this)">
	
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                      <input type="text" id="id" name="id" class="form-control" required/>
	                      <input type="hidden" name="idck" id="idck" value="no"/>
	                      <label class="form-label" for="form3Example1c">*아이디</label>
	                      <c:if test="${empty qid }">
								<p id="msg" style="color:red;">아이디 중복 체크를 하지 않으셨습니다.</p>
						  </c:if>
	                    </div>
	                    <div class="form-outline flex-fill mb-0">
	                      <input type="button" value="아이디 중복 체크" class="btn btn-primary idck" id="idck_btn" style="margin-left: 10px; margin-top: -55px; position: absolute;"/>
	                    </div>
	                  </div>
	                  
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                      <input type="password" id="pw" name="pw" class="form-control" />
	                      <label class="form-label" for="form3Example1c">*비밀번호</label>
	                      <input type="text" id="pw2" name="pw2" class="form-control" required/>
	                      <label class="form-label" for="form3Example1c">*비밀번호 확인</label>
	                      <div id="msg2"></div>
	                    </div>
	                  </div>
	
					  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                      <input type="text" id="name" name="name" class="form-control" required/>
	                      <label class="form-label" for="form3Example3c">*이름</label>
	                    </div>
	                  </div>
	
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                      <input type="email" id="email" name="email" class="form-control" required/>
	                      <label class="form-label" for="form3Example3c">*이메일</label>
	                    </div>
	                  </div>
					  
					  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                    	<input type="text" name="postcode" class="form-control" id="postcode" placeholder="우편번호" maxlength="9" required readonly>
                      		<input type="text" name="addr1" class="form-control" id="addr1" placeholder="기본주소" maxlength="150" required readonly><br><br>
		      				<input type="text" name="addr2" class="form-control" id="addr2" placeholder="상세주소를 입력해 주세요" maxlength="90" required><br><br>
		      				<input type="button" id="isAddrBtn" class="form-control" value="주소 입력" onclick="findAddr()">
		      				<input type="hidden" name="address" id="address" />
		      				<input type="hidden" name="addrck" id="addrck" value="no"/>
		      				 <button type="button" class="btn btn-primary" id="addrbtn">상세정보 입력 후 클릭</button>
		      				 <p id="addrmsg" style="color:red;">주소 입력이 되지 않았습니다. </p>
	                    </div>
	                  </div>
					  
					  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                      <input type="tel" id="tel" name="tel" class="form-control" pattern="[0-9]{2,3}-[0-9]{3,4}-[0-9]{3,4}" maxlength="19" required/>
	                      <label class="form-label" for="form3Example3c">*전화번호</label>
	                    </div>
	                  </div>
	
	                  <!-- <div class="form-check d-flex justify-content-center mb-5">
	                    <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3c" />
	                    <label class="form-check-label" for="form2Example3">
	                      I agree all statements in <a href="#!">Terms of service</a>
	                    </label>
	                  </div> -->
	
	                  <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
	                    <button type="submit" class="btn btn-primary btn-lg btn-sb">회원가입</button>
	                  </div>
	
	                </form>
	
	              </div>
	              <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">
	
	                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
	                  class="img-fluid" alt="Sample image">
	
	              </div>
	            </div>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</section>
	<script>
    //주소관련 스크립트
	function findAddr() {
		new daum.Postcode({
			oncomplete: function(data) {
				console.log(data);
				var roadAddr = data.roadAddress;
				var jibunAddr = data.jibunAddress;
				document.getElementById("postcode").value = data.zonecode;
				if(roadAddr !== '') {
					document.getElementById("addr1").value = roadAddr;				
				} else if(jibunAddr !== ''){
					document.getElementById("addr1").value = jibunAddr;
				} 
			}
		}).open();
	}
	$(document).ready(function(){
		$("#addrbtn").click(function(){
			var addr1 = $("#addr1").val();
			var addr2 = $("#addr2").val();
			var postcode = $("#postcode").val();
			if(addr1!='' && addr2!='' && postcode!=''){
				$("#address").val(postcode+" ,"+addr1+" ,"+addr2);
				$("#addrmsg").html("<strong>성공적으로 주소가 입력되었습니다.</strong>").css("color","blue");
				$("#addrck").val("yes");
			}
		});
		$("#addr2").keyup(function(){
			$("#addrck").val("no");
			$("#addrmsg").html("<strong>주소가 정상적으로 입력되지 않았습니다.</strong>").css("color","red");
		});
	});
	</script>
	<script>
	 $(document).ready(function(){
		 //아이디 관련 스크립트
		 $("#id").keyup(function(){
			$("#idck").val("no");
			if($(this).val()!=""){			
				$("#msg").html("중복체크 필요");
			} else {
				$("#msg").html("아직 아이디 중복 체크를 하지 않으셨습니다.");
			}
		});
		 
		$("#idck_btn").click(function(){
			if($("#id").val()==""){
				alert("아이디를 입력하지 않으셨습니다.");
				$("#id").focus();
				return;
			} 
			var params = {	id : $("#id").val()	} //전송되어질 데이터를 객체로 묶음
			console.log(params);
			$.ajax({
				url:"${path1 }/member/idck",	//아이디가 전송되어질 곳
				type:"post",		//전송방식
				dataType:"json",	//데이터 반환 방식
				data:params,		//전송방식이 post인 경우 객체로 묶어서 전송
				success:function(result){
					console.log(result.result);
					var idChk = result.result;	//true 또는 false를 받음
					if(idChk==false){	//사용할 수 없는 아이디
						$("#idck").val("no");
						$("#msg").html("<strong style='color:red'>기존에 사용되고 있는 아이디 입니다.</strong>");
						$("#id").focus();
					} else if(idChk==true){	//사용 가능한 아이디
						$("#idck").val("yes");
						$("#msg").html("<strong style='color:blue'>사용가능한 아이디 입니다.</strong>");
					} else if(idck==""){
						$("#msg").html("<strong>아이디가 확인되지 않았습니다. 다시 시도해주시기 바랍니다.</strong>");
					}
				}
			});
		});
	 //비밀번호 관련 스크립트	 
	 var pwck = false;	 
	 $("#pw1 , #pw2").keyup(function(){
		 var pw = $("#pw").val();
		 var pw2 = $("#pw2").val();
		 if(pw!=pw2){
			 $("#msg2").html("비밀번호가 일치하지 않습니다.").css("color","red");
			 $("#pw2").focus();
		 } else {
			 $("#msg2").html("비밀번호가 일치합니다.").css("color","blue");
			 pwck = true;
		 }
	 });
	 
	});
	</script>
	<script>
	//최종 확인 스크립트	 
	 function joinck(f){
		 if($("#idck").val()=='no'){
			 alert("아이디 중복체크가 되지 않았습니다.");
			 $("#id").focus();
			 return false;
		 }
		 if(pwck==false){
			 alert("비밀번호와 비밀번호 확인란의 값이 일치하지 않습니다.");
			 $("#pw").focus();
			 return false;
		 }
		 if($("#addrck").val()=='no'){
			 alert("주소가 정상적으로 입력되지 않았습니다.");
			 $("#addr2").focus();
			 return false;
		 }
	 };
	 
    </script>
	<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>