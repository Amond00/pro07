/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-01-11 06:06:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joinForm2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/hth/pro07/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/hth/pro07/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1668995163779L));
    _jspx_dependants.put("jar:file:/D:/hth/pro07/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("	<title>회원가입</title>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("	<section class=\"vh-1300\" style=\"background-color: #eee;\">\r\n");
      out.write("	  <div class=\"container h-100\">\r\n");
      out.write("	    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("	      <div class=\"col-lg-12 col-xl-11\">\r\n");
      out.write("	        <div class=\"card text-black\" style=\"border-radius: 25px;\">\r\n");
      out.write("	          <div class=\"card-body p-md-5\">\r\n");
      out.write("	            <div class=\"row justify-content-center\">\r\n");
      out.write("	              <div class=\"col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1\">\r\n");
      out.write("	\r\n");
      out.write("	                <p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\">회원가입</p>\r\n");
      out.write("	\r\n");
      out.write("	                <form class=\"mx-1 mx-md-4\" action=\"join.do\" method=\"post\" onsubmit=\"return joinck(this)\">\r\n");
      out.write("	\r\n");
      out.write("	                  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("	                    <i class=\"fas fa-user fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("	                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("	                      <input type=\"text\" id=\"id\" name=\"id\" class=\"form-control\" required/>\r\n");
      out.write("	                      <input type=\"hidden\" name=\"idck\" id=\"idck\" value=\"no\"/>\r\n");
      out.write("	                      <label class=\"form-label\" for=\"form3Example1c\">*아이디</label>\r\n");
      out.write("	                      ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("	                      <input type=\"button\" value=\"아이디 중복 체크\" class=\"btn btn-primary idck\" id=\"idck_btn\" style=\"margin-left: 10px; margin-top: -55px; position: absolute;\"/>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  \r\n");
      out.write("	                  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("	                    <i class=\"fas fa-user fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("	                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("	                      <input type=\"password\" id=\"pw\" name=\"pw\" class=\"form-control\" />\r\n");
      out.write("	                      <label class=\"form-label\" for=\"form3Example1c\">*비밀번호</label>\r\n");
      out.write("	                      <input type=\"text\" id=\"pw2\" name=\"pw2\" class=\"form-control\" required/>\r\n");
      out.write("	                      <label class=\"form-label\" for=\"form3Example1c\">*비밀번호 확인</label>\r\n");
      out.write("	                      <div id=\"msg2\"></div>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                  </div>\r\n");
      out.write("	\r\n");
      out.write("					  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("	                    <i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("	                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("	                      <input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\" required/>\r\n");
      out.write("	                      <label class=\"form-label\" for=\"form3Example3c\">*이름</label>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                  </div>\r\n");
      out.write("	\r\n");
      out.write("	                  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("	                    <i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("	                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("	                      <input type=\"email\" id=\"email\" name=\"email\" class=\"form-control\" required/>\r\n");
      out.write("	                      <label class=\"form-label\" for=\"form3Example3c\">*이메일</label>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                  </div>\r\n");
      out.write("					  \r\n");
      out.write("					  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("	                    <i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("	                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("	                    	<input type=\"text\" name=\"postcode\" class=\"form-control\" id=\"postcode\" placeholder=\"우편번호\" maxlength=\"9\" required readonly>\r\n");
      out.write("                      		<input type=\"text\" name=\"addr1\" class=\"form-control\" id=\"addr1\" placeholder=\"기본주소\" maxlength=\"150\" required readonly><br><br>\r\n");
      out.write("		      				<input type=\"text\" name=\"addr2\" class=\"form-control\" id=\"addr2\" placeholder=\"상세주소를 입력해 주세요\" maxlength=\"90\" required><br><br>\r\n");
      out.write("		      				<input type=\"button\" id=\"isAddrBtn\" class=\"form-control\" value=\"주소 입력\" onclick=\"findAddr()\">\r\n");
      out.write("		      				<input type=\"hidden\" name=\"address\" id=\"address\" />\r\n");
      out.write("		      				<input type=\"hidden\" name=\"addrck\" id=\"addrck\" value=\"no\"/>\r\n");
      out.write("		      				 <button type=\"button\" class=\"btn btn-primary\" id=\"addrbtn\">상세정보 입력 후 클릭</button>\r\n");
      out.write("		      				 <p id=\"addrmsg\" style=\"color:red;\">주소 입력이 되지 않았습니다. </p>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                  </div>\r\n");
      out.write("					  \r\n");
      out.write("					  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("	                    <i class=\"fas fa-envelope fa-lg me-3 fa-fw\"></i>\r\n");
      out.write("	                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("	                      <input type=\"tel\" id=\"tel\" name=\"tel\" class=\"form-control\" pattern=\"[0-9]{2,3}-[0-9]{3,4}-[0-9]{3,4}\" maxlength=\"19\" required/>\r\n");
      out.write("	                      <label class=\"form-label\" for=\"form3Example3c\">*전화번호</label>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                  </div>\r\n");
      out.write("	\r\n");
      out.write("	                  <!-- <div class=\"form-check d-flex justify-content-center mb-5\">\r\n");
      out.write("	                    <input class=\"form-check-input me-2\" type=\"checkbox\" value=\"\" id=\"form2Example3c\" />\r\n");
      out.write("	                    <label class=\"form-check-label\" for=\"form2Example3\">\r\n");
      out.write("	                      I agree all statements in <a href=\"#!\">Terms of service</a>\r\n");
      out.write("	                    </label>\r\n");
      out.write("	                  </div> -->\r\n");
      out.write("	\r\n");
      out.write("	                  <div class=\"d-flex justify-content-center mx-4 mb-3 mb-lg-4\">\r\n");
      out.write("	                    <button type=\"submit\" class=\"btn btn-primary btn-lg btn-sb\">회원가입</button>\r\n");
      out.write("	                  </div>\r\n");
      out.write("	\r\n");
      out.write("	                </form>\r\n");
      out.write("	\r\n");
      out.write("	              </div>\r\n");
      out.write("	              <div class=\"col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2\">\r\n");
      out.write("	\r\n");
      out.write("	                <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp\"\r\n");
      out.write("	                  class=\"img-fluid\" alt=\"Sample image\">\r\n");
      out.write("	\r\n");
      out.write("	              </div>\r\n");
      out.write("	            </div>\r\n");
      out.write("	          </div>\r\n");
      out.write("	        </div>\r\n");
      out.write("	      </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("	  </div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<script>\r\n");
      out.write("    //주소관련 스크립트\r\n");
      out.write("	function findAddr() {\r\n");
      out.write("		new daum.Postcode({\r\n");
      out.write("			oncomplete: function(data) {\r\n");
      out.write("				console.log(data);\r\n");
      out.write("				var roadAddr = data.roadAddress;\r\n");
      out.write("				var jibunAddr = data.jibunAddress;\r\n");
      out.write("				document.getElementById(\"postcode\").value = data.zonecode;\r\n");
      out.write("				if(roadAddr !== '') {\r\n");
      out.write("					document.getElementById(\"addr1\").value = roadAddr;				\r\n");
      out.write("				} else if(jibunAddr !== ''){\r\n");
      out.write("					document.getElementById(\"addr1\").value = jibunAddr;\r\n");
      out.write("				} \r\n");
      out.write("			}\r\n");
      out.write("		}).open();\r\n");
      out.write("	}\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		$(\"#addrbtn\").click(function(){\r\n");
      out.write("			var addr1 = $(\"#addr1\").val();\r\n");
      out.write("			var addr2 = $(\"#addr2\").val();\r\n");
      out.write("			var postcode = $(\"#postcode\").val();\r\n");
      out.write("			if(addr1!='' && addr2!='' && postcode!=''){\r\n");
      out.write("				$(\"#address\").val(postcode+\" ,\"+addr1+\" ,\"+addr2);\r\n");
      out.write("				$(\"#addrmsg\").html(\"<strong>성공적으로 주소가 입력되었습니다.</strong>\").css(\"color\",\"blue\");\r\n");
      out.write("				$(\"#addrck\").val(\"yes\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		$(\"#addr2\").keyup(function(){\r\n");
      out.write("			$(\"#addrck\").val(\"no\");\r\n");
      out.write("			$(\"#addrmsg\").html(\"<strong>주소가 정상적으로 입력되지 않았습니다.</strong>\").css(\"color\",\"red\");\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	</script>\r\n");
      out.write("	<script>\r\n");
      out.write("	 $(document).ready(function(){\r\n");
      out.write("		 //아이디 관련 스크립트\r\n");
      out.write("		 $(\"#id\").keyup(function(){\r\n");
      out.write("			$(\"#idck\").val(\"no\");\r\n");
      out.write("			if($(this).val()!=\"\"){			\r\n");
      out.write("				$(\"#msg\").html(\"중복체크 필요\");\r\n");
      out.write("			} else {\r\n");
      out.write("				$(\"#msg\").html(\"아직 아이디 중복 체크를 하지 않으셨습니다.\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		 \r\n");
      out.write("		$(\"#idck_btn\").click(function(){\r\n");
      out.write("			if($(\"#id\").val()==\"\"){\r\n");
      out.write("				alert(\"아이디를 입력하지 않으셨습니다.\");\r\n");
      out.write("				$(\"#id\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			} \r\n");
      out.write("			var params = {	id : $(\"#id\").val()	} //전송되어질 데이터를 객체로 묶음\r\n");
      out.write("			console.log(params);\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/idck\",	//아이디가 전송되어질 곳\r\n");
      out.write("				type:\"post\",		//전송방식\r\n");
      out.write("				dataType:\"json\",	//데이터 반환 방식\r\n");
      out.write("				data:params,		//전송방식이 post인 경우 객체로 묶어서 전송\r\n");
      out.write("				success:function(result){\r\n");
      out.write("					console.log(result.result);\r\n");
      out.write("					var idChk = result.result;	//true 또는 false를 받음\r\n");
      out.write("					if(idChk==false){	//사용할 수 없는 아이디\r\n");
      out.write("						$(\"#idck\").val(\"no\");\r\n");
      out.write("						$(\"#msg\").html(\"<strong style='color:red'>기존에 사용되고 있는 아이디 입니다.</strong>\");\r\n");
      out.write("						$(\"#id\").focus();\r\n");
      out.write("					} else if(idChk==true){	//사용 가능한 아이디\r\n");
      out.write("						$(\"#idck\").val(\"yes\");\r\n");
      out.write("						$(\"#msg\").html(\"<strong style='color:blue'>사용가능한 아이디 입니다.</strong>\");\r\n");
      out.write("					} else if(idck==\"\"){\r\n");
      out.write("						$(\"#msg\").html(\"<strong>아이디가 확인되지 않았습니다. 다시 시도해주시기 바랍니다.</strong>\");\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	 //비밀번호 관련 스크립트	 \r\n");
      out.write("	 var pwck = false;	 \r\n");
      out.write("	 $(\"#pw1 , #pw2\").keyup(function(){\r\n");
      out.write("		 var pw = $(\"#pw\").val();\r\n");
      out.write("		 var pw2 = $(\"#pw2\").val();\r\n");
      out.write("		 if(pw!=pw2){\r\n");
      out.write("			 $(\"#msg2\").html(\"비밀번호가 일치하지 않습니다.\").css(\"color\",\"red\");\r\n");
      out.write("			 $(\"#pw2\").focus();\r\n");
      out.write("		 } else {\r\n");
      out.write("			 $(\"#msg2\").html(\"비밀번호가 일치합니다.\").css(\"color\",\"blue\");\r\n");
      out.write("			 pwck = true;\r\n");
      out.write("		 }\r\n");
      out.write("	 });\r\n");
      out.write("	 \r\n");
      out.write("	});\r\n");
      out.write("	</script>\r\n");
      out.write("	<script>\r\n");
      out.write("	//최종 확인 스크립트	 \r\n");
      out.write("	 function joinck(f){\r\n");
      out.write("		 if($(\"#idck\").val()=='no'){\r\n");
      out.write("			 alert(\"아이디 중복체크가 되지 않았습니다.\");\r\n");
      out.write("			 $(\"#id\").focus();\r\n");
      out.write("			 return false;\r\n");
      out.write("		 }\r\n");
      out.write("		 if(pwck==false){\r\n");
      out.write("			 alert(\"비밀번호와 비밀번호 확인란의 값이 일치하지 않습니다.\");\r\n");
      out.write("			 $(\"#pw\").focus();\r\n");
      out.write("			 return false;\r\n");
      out.write("		 }\r\n");
      out.write("		 if($(\"#addrck\").val()=='no'){\r\n");
      out.write("			 alert(\"주소가 정상적으로 입력되지 않았습니다.\");\r\n");
      out.write("			 $(\"#addr2\").focus();\r\n");
      out.write("			 return false;\r\n");
      out.write("		 }\r\n");
      out.write("	 };\r\n");
      out.write("	 \r\n");
      out.write("    </script>\r\n");
      out.write("	<script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/member/joinForm2.jsp(37,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty qid }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("								<p id=\"msg\" style=\"color:red;\">아이디 중복 체크를 하지 않으셨습니다.</p>\r\n");
          out.write("						  ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
