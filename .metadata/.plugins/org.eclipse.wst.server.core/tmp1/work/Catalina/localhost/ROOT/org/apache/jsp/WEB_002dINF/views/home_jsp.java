/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-01-16 04:35:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/hth/pro07/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1668995163779L));
    _jspx_dependants.put("jar:file:/D:/hth/pro07/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/hth/pro07/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/pro07/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
  }

  public void _jspDestroy() {
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write(" 	<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("	<title>?????????</title>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./common/head.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./common/header.jsp", out, false);
      out.write("\n");
      out.write("	<!-- ======= Hero Section ======= -->\n");
      out.write("  <section id=\"hero\" class=\"d-flex justify-cntent-center align-items-center\">\n");
      out.write("    <div id=\"heroCarousel\" class=\"container carousel carousel-fade\" data-bs-ride=\"carousel\" data-bs-interval=\"5000\">\n");
      out.write("      <!-- Slide 1 -->\n");
      out.write("      <div class=\"carousel-item active\">\n");
      out.write("        <div class=\"carousel-container\">\n");
      out.write("          <h2 class=\"animate__animated animate__fadeInDown\">????????? ????????? ??? ?????? ??????,<br> ?????? ???????????? ???????????? ????????????</h2>\n");
      out.write("          <p class=\"animate__animated animate__fadeInUp\">1??? 6???, ?????????????? ??????????????? ?????????????????? </p>\n");
      out.write("          <a href=\"http://me.go.kr/home/web/board/read.do?menuId=10525&boardId=1572660&boardMasterId=1\" class=\"btn-get-started animate__animated animate__fadeInUp\">Read More</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Slide 2 -->\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <div class=\"carousel-container\">\n");
      out.write("          <h2 class=\"animate__animated animate__fadeInDown\">????????? ????????? ??? ?????? ??????,<br> ?????? ???????????? ???????????? ????????????</h2>\n");
      out.write("          <p class=\"animate__animated animate__fadeInUp\">2023??? ????????? ????????????</p>\n");
      out.write("          <a href=\"http://www.me.go.kr/2023briefing/index.html\" class=\"btn-get-started animate__animated animate__fadeInUp\">Read More</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Slide 3 -->\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <div class=\"carousel-container\">\n");
      out.write("          <h2 class=\"animate__animated animate__fadeInDown\">????????? ????????? ??? ?????? ??????,<br> ?????? ???????????? ???????????? ????????????</h2>\n");
      out.write("          <p class=\"animate__animated animate__fadeInUp\">???????????? ????????? ????????? ????????? ??????</p>\n");
      out.write("          <a href=\"http://me.go.kr/home/web/board/read.do?pagerOffset=0&maxPageItems=6&maxIndexPages=10&searchValue=&menuId=10392&orgCd=&boardId=1561920&boardMasterId=713&boardCategoryId=&rn=5\" class=\"btn-get-started animate__animated animate__fadeInUp\">Read More</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <a class=\"carousel-control-prev\" href=\"#heroCarousel\" role=\"button\" data-bs-slide=\"prev\">\n");
      out.write("        <span class=\"carousel-control-prev-icon bx bx-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a class=\"carousel-control-next\" href=\"#heroCarousel\" role=\"button\" data-bs-slide=\"next\">\n");
      out.write("        <span class=\"carousel-control-next-icon bx bx-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </section><!-- End Hero -->\n");
      out.write("\n");
      out.write("  <main id=\"main\">\n");
      out.write("\n");
      out.write("    <!-- ======= Services Section ======= -->\n");
      out.write("    \n");
      out.write("    <section class=\"services\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row board\">\n");
      out.write("        	<!-- ???????????? ??????????????? 8??? ????????? ?????? -->\n");
      out.write("        	<h1 style=\"text-align:center; margin-bottom:40px;\">?????? ??????????????</h1>\n");
      out.write("          ");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Services Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= Why Us Section ======= -->\n");
      out.write("    <section class=\"why-us section-bg\" data-aos=\"fade-up\" date-aos-delay=\"200\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-6 video-box\">\n");
      out.write("          	<iframe id=\"youtube_vdo\" name=\"youtube_vdo\" class=\"youtube_iframe\" width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/GsmSwgNL4KA\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-6 d-flex flex-column justify-content-center p-5\">\n");
      out.write("          \n");
      out.write("          	<div class=\"icon-box\">\n");
      out.write("              <div class=\"icon\"><i class=\"bx bx-file\"></i></div>\n");
      out.write("              <h4 class=\"title\"><a href=\"https://www.youtube.com/embed/GsmSwgNL4KA\"  target=\"youtube_vdo\">?????????</a></h4>\n");
      out.write("              <p class=\"description\">2023??? ????????? ???????????? ?????? ????????? | ????????? ????????? ??????</p>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <div class=\"icon-box\">\n");
      out.write("              <div class=\"icon\"><i class=\"bx bx-file\"></i></div>\n");
      out.write("              <h4 class=\"title\"><a href=\"https://www.youtube.com/embed/reZl5j7oeTQ\"  target=\"youtube_vdo\">?????????</a></h4>\n");
      out.write("              <p class=\"description\">????????? ????????? 2023??? ???????????????????? ???????????? ?????? ??????! ?????????????????? ???????????? ???????????? ????????? ???????????? ?????????</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"icon-box\">\n");
      out.write("              <div class=\"icon\"><i class=\"bx bx-file\"></i></div>\n");
      out.write("              <h4 class=\"title\"><a href=\"https://www.youtube.com/embed/QStZTjk3EA8\" target=\"youtube_vdo\">?????????</a></h4>\n");
      out.write("              <p class=\"description\">2023??? ????????? ???????????? ?????? ????????? | ????????? ????????? ??????</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Why Us Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= Features Section ======= -->\n");
      out.write("    <section class=\"features\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>?????? ?????????</h2>\n");
      out.write("          <p>????????? <strong>??????</strong>?????? ????????? <strong>??????</strong>??????</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\" data-aos=\"fade-up\">\n");
      out.write("          <div class=\"col-md-5\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/main_img4.png\" class=\"img-fluid\" alt=\"2022-01-10\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-7 pt-4\">\n");
      out.write("            <h3>????????? ??????, ????????? ???????????????. </h3>\n");
      out.write("            <p class=\"fst-italic\">\n");
      out.write("				???10??? ????????????????????????, ??????????????? ????????? ????????? ????????? ??????\n");
      out.write("            </p>\n");
      out.write("            <ul>\n");
      out.write("              <li><i class=\"bi bi-check\"></i> ???????????????????????? ??????10??? ??????????????????????????? ?????????, ????????? ??? ??????????????? ????????? ????????? ???????????? ???????????????, ??????????????? ?????? ?????? ????????? ?????? ????????? ????????? ???????????? ????????? ??????????????? ???????????????.</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\" data-aos=\"fade-up\">\n");
      out.write("          <div class=\"col-md-5 order-1 order-md-2\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/main_img3.png\" class=\"img-fluid\" alt=\"2022-01-10\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-7 pt-5 order-2 order-md-1 text-center\">\n");
      out.write("            <h3>????????????</h3>\n");
      out.write("            <p class=\"fst-italic\">\n");
      out.write("             	<a href=\"https://me.go.kr/home/web/index.do?menuId=10260\">#??????????????????</a><br>\n");
      out.write("             	<a href=\"https://me.go.kr/home/web/index.do?menuId=10276\">#????????????</a><br>\n");
      out.write("             	<a href=\"https://me.go.kr/home/web/index.do?menuId=10262\">#????????????</a><br>\n");
      out.write("            </p>\n");
      out.write("            <p class=\"fst-italic\">\n");
      out.write("             	<a href=\"https://me.go.kr/home/web/index.do?menuId=10263\">#??? ?????? ??????</a><br>\n");
      out.write("             	<a href=\"https://me.go.kr/home/web/index.do?menuId=10264\">#????????????</a><br>\n");
      out.write("             	<a href=\"https://me.go.kr/home/web/index.do?menuId=10265\">#????????????</a><br>\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\" data-aos=\"fade-up\">\n");
      out.write("          <div class=\"col-md-5\">\n");
      out.write("            <img src=\"/resources/img/main_img5.png\" class=\"img-fluid\" alt=\"2022-01-10\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-7 pt-5\">\n");
      out.write("            <h3>???????????? ?????? ?????? ?????? ??????</h3>\n");
      out.write("            <p>????????? ????????? ????????? 9??? ?????? ?????? ????????? ?????? ??????????????? ??????????????? ???????????? ???????????? ????????? ?????? ????????? ??????, ??????????????? ?????? ???????????? ???????????? ?????? ????????? ??????????????? ????????? ??? ?????? ???????????? ??????.\n");
      out.write("				????????? ????????? ????????? 9??? ?????? ?????? ????????? ?????? ??????????????? ??????????????? ???????????????????????? ?????? ?????? ???????????? ?????? ???????????? ???????????? ?????? ????????? ????????? ???????????? ???????????? ??????????????? ?????? ?????? ????????? ??????????????? ????????? ?????? ????????? ?????? ??????.\n");
      out.write("			</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\" data-aos=\"fade-up\">\n");
      out.write("          <div class=\"col-md-5 order-1 order-md-2\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/main_img6.png\" class=\"img-fluid\" alt=\"2022-01-10\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-7 pt-5 order-2 order-md-1\">\n");
      out.write("            <h3>????????? ?????????????????? ??????</h3>\n");
      out.write("            <p class=\"fst-italic\">\n");
      out.write("              	????????? ????????? ????????? 10??? ?????? ?????? ????????? ????????????????????? ???????????????????????? ???????????? ?????????????????? ?????? ???????????? ??? ???????????? ?????? ????????? ?????? ??????????????? ????????????, \"???????????? ????????? ?????? ????????? ????????? ????????? ??? ???\"??? ???????????? ??????.\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Features Section -->\n");
      out.write("\n");
      out.write("  </main><!-- End #main -->\n");
      out.write("  	<!-- ???????????? ?????? ?????? -->\n");
      out.write("  	<script>\n");
      out.write("  	$(document).ready(function(){\n");
      out.write("  		var cnt = 0;\n");
      out.write("		$.ajax({\n");
      out.write("			url:\"/main_board2.do\",	\n");
      out.write("			type:\"GET\",		//????????????\n");
      out.write("			dataType:\"json\",//????????? ?????? ??????\n");
      out.write("			success:function(list){	\n");
      out.write("				\n");
      out.write("				$.each(list, function(k, v){\n");
      out.write("					if(cnt<=6){\n");
      out.write("					var data = \"<div class='col-md-6 col-lg-3 d-flex align-items-stretch' data-aos='fade-up'><div class='icon-box icon-box-pink'><div class='icon'><img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/main_img2.png' alt='??????' style='width: 42px;''></div>\"\n");
      out.write("					data = data+\"<h4 class='title'><a class='main_board_title' href='/board/detail.do?no=\"+v.no+\"'>\"+v.title+\"</a></h4>\"\n");
      out.write("					data = data+\"<p class='description main_board_content'></p></div></div></div>\"\n");
      out.write("					$(\".board\").append(data);\n");
      out.write("					cnt += 1\n");
      out.write("					console.log(cnt);\n");
      out.write("					}\n");
      out.write("				});\n");
      out.write("				\n");
      out.write("			}\n");
      out.write("		});\n");
      out.write("		//?????? ??????\n");
      out.write("		$(\".breadcrumbs\").remove();\n");
      out.write("	});\n");
      out.write("  	</script>\n");
      out.write("	<script>\n");
      out.write("    $(document).ready(function(){\n");
      out.write("    	var result = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${joinck}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("    	if(result!=''){\n");
      out.write("    		alert(result);\n");
      out.write("    	} else {\n");
      out.write("    		return false;\n");
      out.write("    	}\n");
      out.write("\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./common/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}
