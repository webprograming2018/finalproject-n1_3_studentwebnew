package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexLogined_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>PTIT</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--\t<link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/index.css\">\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/popper.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<header class=\"blog-header py-3\">\n");
      out.write("\t\t\t<div class=\"row flex-nowrap justify-content-between align-items-center\">\n");
      out.write("\t\t\t\t<div class=\"col-4 pt-1\">\n");
      out.write("\t\t\t\t\t<a class=\"text-muted\" href=\"#\">Subscribe</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-4 text-center\">\n");
      out.write("\t\t\t\t\t<a class=\"blog-header-logo text-dark\" href=\"#\">PTIT</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-4 d-flex justify-content-end align-items-center\">\n");
      out.write("\t\t\t\t\t<a class=\"text-muted\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"mx-3\"><circle cx=\"10.5\" cy=\"10.5\" r=\"7.5\"></circle><line x1=\"21\" y1=\"21\" x2=\"15.8\" y2=\"15.8\"></line></svg>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("                                    <p class=\"text-dark\"><i>");

                                        String name = request.getParameter("username");
                                        out.print("welcome " + name);
                                            
      out.write("</i></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<!-- navbar -->\n");
      out.write("\t\t<div class=\"nav-scroller py-1 mb-2\">\n");
      out.write("\t\t\t<nav class=\"nav d-flex justify-content-between\">\n");
      out.write("\t\t\t\t<a class=\"p-2 text-muted\" href=\"index.html\">Trang ch?</a>\n");
      out.write("\t\t\t\t<a class=\"p-2 text-muted\" href=\"tkb.html\">Xem TKB</a>\n");
      out.write("\t\t\t\t<a class=\"p-2 text-muted\" href=\"lichthi.html\">Xem l?ch thi</a>\n");
      out.write("\t\t\t\t<a class=\"p-2 text-muted\" href=\"Diem.html\">Xem ?i?m</a>\n");
      out.write("\t\t\t\t<a class=\"p-2 text-muted\" href=\"hocphi.html\">H?c phí</a>\n");
      out.write("\t\t\t\t<a class=\"p-2 text-muted\" href=\"tailieu.html\">?? thi</a>\n");
      out.write("\t\t\t\t<a class=\"p-2 text-muted\" href=\"bikip.html\">Bí kíp qua môn</a>\n");
      out.write("\t\t\t\t<a class=\"p-2 text-muted\" href=\"suaTT.html\">S?a TT cá nhân</a>\n");
      out.write("\t\t\t\t<a class=\"p-2 text-muted\" href=\"lienhe.html\">Liên h?</a>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end navbar -->\n");
      out.write("\n");
      out.write("\t\t<!-- Carousel -->\n");
      out.write("\t\t<div id=\"carousel-index\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Indicators -->\n");
      out.write("\t\t\t<ul class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t<li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#demo\" data-slide-to=\"3\"></li>\n");
      out.write("\t\t\t\t<li data-target=\"#demo\" data-slide-to=\"4\"></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t<!-- The slideshow -->\n");
      out.write("\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t<div class=\"carousel-item active\">\n");
      out.write("\t\t\t\t\t<img src=\"img/la.jpg\" alt=\"Los Angeles\" width=\"1100\" height=\"500\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("\t\t\t\t\t\t<h5>...</h5>\n");
      out.write("\t\t\t\t\t\t<p>??ng nh?p b?ng tài kho?n QLDT</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t<img src=\"img/chicago.jpg\" alt=\"Chicago\" width=\"1100\" height=\"500\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("\t\t\t\t\t\t<h5>...</h5>\n");
      out.write("\t\t\t\t\t\t<p>Cho phép t? c?p nh?t l?ch th?c hành</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t<img src=\"img/ny.jpg\" alt=\"New York\" width=\"1100\" height=\"500\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("\t\t\t\t\t\t<h5>...</h5>\n");
      out.write("\t\t\t\t\t\t<p>N?m trong tay nh?ng bí kíp qua môn th?n thánh</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t<img src=\"img/chicago.jpg\" alt=\"New York\" width=\"1100\" height=\"500\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("\t\t\t\t\t\t<h5>...</h5>\n");
      out.write("\t\t\t\t\t\t<p>Thông báo l?ch h?c, th?c hành hàng ngày</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t<img src=\"./img/ny.jpg\" alt=\"New York\" width=\"1100\" height=\"500\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("\t\t\t\t\t\t<h5>...</h5>\n");
      out.write("\t\t\t\t\t\t<p>T?ng h?p ?? thi các n?m</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Left and right controls -->\n");
      out.write("\t\t\t<a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t<span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("\t\t\t\t<span class=\"carousel-control-next-icon\"></span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end -->\n");
      out.write("\n");
      out.write("\t\t<!-- Thông báo chính -->\n");
      out.write("\t\t<div class=\"jumbotron p-3 p-md-5 text-white rounded bg-dark\">\n");
      out.write("\t\t\t<div class=\"col-md-6 px-0\">\n");
      out.write("\t\t\t\t<h1 class=\"display-4 font-italic\"> H??ng d?n C?p nh?t l?ch th?c hành</h1>\n");
      out.write("\t\t\t\t<p class=\"lead my-3\">Multiple lines of text that form the lede, informing new readers quickly and efficiently about what's most interesting in this post's contents.</p>\n");
      out.write("\t\t\t\t<p class=\"lead mb-0\"><a href=\"#\" class=\"text-white font-weight-bold\">Continue reading...</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- bài vi?t thông báo -->\n");
      out.write("\t\t<div class=\"row mb-2\">\n");
      out.write("\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t<div class=\"card flex-md-row mb-4 box-shadow h-md-250 \">\n");
      out.write("\t\t\t\t\t<div class=\"card-body d-flex flex-column align-items-start no-overflow \">\n");
      out.write("\t\t\t\t\t\t<strong class=\"d-inline-block mb-2 text-primary\">H?c phí</strong>\n");
      out.write("\t\t\t\t\t\t<h3 class=\"mb-0\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"text-dark\" href=\"#\">Featured post</a>\n");
      out.write("\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"mb-1 text-muted\">Nov 12</div>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text mb-auto\">This is a wider card with supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Continue reading</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<img class=\"card-img-right flex-auto d-none d-md-block\" data-src=\"holder.js/200x250?theme=thumb\" alt=\"Thumbnail [200x250]\" style=\"width: 200px; height: 250px;\" src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22200%22%20height%3D%22250%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20200%20250%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_1664bff4384%20text%20%7B%20fill%3A%23eceeef%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A13pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_1664bff4384%22%3E%3Crect%20width%3D%22200%22%20height%3D%22250%22%20fill%3D%22%2355595c%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2256.203125%22%20y%3D%22131%22%3EThumbnail%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" data-holder-rendered=\"true\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t<div class=\"card flex-md-row mb-4 box-shadow h-md-250\">\n");
      out.write("\t\t\t\t\t<div class=\"card-body d-flex flex-column align-items-start no-overflow\">\n");
      out.write("\t\t\t\t\t\t<strong class=\"d-inline-block mb-2 text-success\">L?ch thi</strong>\n");
      out.write("\t\t\t\t\t\t<h3 class=\"mb-0\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"text-dark\" href=\"#\">Post title</a>\n");
      out.write("\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"mb-1 text-muted\">Nov 11</div>\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text mb-auto\">This is a wider card with supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Continue reading</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<img class=\"card-img-right flex-auto d-none d-md-block\" data-src=\"holder.js/200x250?theme=thumb\" alt=\"Thumbnail [200x250]\" src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22200%22%20height%3D%22250%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20200%20250%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_1664bff43b5%20text%20%7B%20fill%3A%23eceeef%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A13pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_1664bff43b5%22%3E%3Crect%20width%3D%22200%22%20height%3D%22250%22%20fill%3D%22%2355595c%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2256.203125%22%20y%3D%22131%22%3EThumbnail%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" data-holder-rendered=\"true\" style=\"width: 200px; height: 250px;\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end -->\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<main role=\"main\" class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-8 blog-main\">\n");
      out.write("\t\t\t\t<h3 class=\"pb-3 mb-4 font-italic border-bottom\">\n");
      out.write("\t\t\t\t\tFrom the Firehose\n");
      out.write("\t\t\t\t</h3>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"blog-post\">\n");
      out.write("\t\t\t\t\t<h2 class=\"blog-post-title\">Sample blog post</h2>\n");
      out.write("\t\t\t\t\t<p class=\"blog-post-meta\">January 1, 2014 by <a href=\"#\">Mark</a></p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<p>This blog post shows a few different types of content that's supported and styled with Bootstrap. Basic typography, images, and code are all supported.</p>\n");
      out.write("\t\t\t\t\t<hr>\n");
      out.write("\t\t\t\t\t<p>Cum sociis natoque penatibus et magnis <a href=\"#\">dis parturient montes</a>, nascetur ridiculus mus. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Sed posuere consectetur est at lobortis. Cras mattis consectetur purus sit amet fermentum.</p>\n");
      out.write("\t\t\t\t\t<blockquote>\n");
      out.write("\t\t\t\t\t\t<p>Curabitur blandit tempus porttitor. <strong>Nullam quis risus eget urna mollis</strong> ornare vel eu leo. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("\t\t\t\t\t</blockquote>\n");
      out.write("\t\t\t\t\t<p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>\n");
      out.write("\t\t\t\t\t<h2>Heading</h2>\n");
      out.write("\t\t\t\t\t<p>Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>\n");
      out.write("\t\t\t\t\t<h3>Sub-heading</h3>\n");
      out.write("\t\t\t\t\t<p>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>\n");
      out.write("\t\t\t\t\t<pre><code>Example code block</code></pre>\n");
      out.write("\t\t\t\t\t<p>Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa.</p>\n");
      out.write("\t\t\t\t\t<h3>Sub-heading</h3>\n");
      out.write("\t\t\t\t\t<p>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</li>\n");
      out.write("\t\t\t\t\t\t<li>Donec id elit non mi porta gravida at eget metus.</li>\n");
      out.write("\t\t\t\t\t\t<li>Nulla vitae elit libero, a pharetra augue.</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<p>Donec ullamcorper nulla non metus auctor fringilla. Nulla vitae elit libero, a pharetra augue.</p>\n");
      out.write("\t\t\t\t\t<ol>\n");
      out.write("\t\t\t\t\t\t<li>Vestibulum id ligula porta felis euismod semper.</li>\n");
      out.write("\t\t\t\t\t\t<li>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</li>\n");
      out.write("\t\t\t\t\t\t<li>Maecenas sed diam eget risus varius blandit sit amet non magna.</li>\n");
      out.write("\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t\t<p>Cras mattis consectetur purus sit amet fermentum. Sed posuere consectetur est at lobortis.</p>\n");
      out.write("\t\t\t\t</div><!-- /.blog-post -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"blog-post\">\n");
      out.write("\t\t\t\t\t<h2 class=\"blog-post-title\">Another blog post</h2>\n");
      out.write("\t\t\t\t\t<p class=\"blog-post-meta\">December 23, 2013 by <a href=\"#\">Jacob</a></p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<p>Cum sociis natoque penatibus et magnis <a href=\"#\">dis parturient montes</a>, nascetur ridiculus mus. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Sed posuere consectetur est at lobortis. Cras mattis consectetur purus sit amet fermentum.</p>\n");
      out.write("\t\t\t\t\t<blockquote>\n");
      out.write("\t\t\t\t\t\t<p>Curabitur blandit tempus porttitor. <strong>Nullam quis risus eget urna mollis</strong> ornare vel eu leo. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("\t\t\t\t\t</blockquote>\n");
      out.write("\t\t\t\t\t<p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>\n");
      out.write("\t\t\t\t\t<p>Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>\n");
      out.write("\t\t\t\t</div><!-- /.blog-post -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"blog-post\">\n");
      out.write("\t\t\t\t\t<h2 class=\"blog-post-title\">New feature</h2>\n");
      out.write("\t\t\t\t\t<p class=\"blog-post-meta\">December 14, 2013 by <a href=\"#\">Chris</a></p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<p>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</li>\n");
      out.write("\t\t\t\t\t\t<li>Donec id elit non mi porta gravida at eget metus.</li>\n");
      out.write("\t\t\t\t\t\t<li>Nulla vitae elit libero, a pharetra augue.</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>\n");
      out.write("\t\t\t\t\t<p>Donec ullamcorper nulla non metus auctor fringilla. Nulla vitae elit libero, a pharetra augue.</p>\n");
      out.write("\t\t\t\t</div><!-- /.blog-post -->\n");
      out.write("\n");
      out.write("\t\t\t\t<nav class=\"blog-pagination\">\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-outline-primary\" href=\"#\">Older</a>\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-outline-secondary disabled\" href=\"#\">Newer</a>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t</div><!-- /.blog-main -->\n");
      out.write("\n");
      out.write("\t\t\t<aside class=\"col-md-4 blog-sidebar\">\n");
      out.write("\t\t\t\t<div class=\"p-3 mb-3 bg-light rounded\">\n");
      out.write("\t\t\t\t\t<h4 class=\"font-italic\">About</h4>\n");
      out.write("\t\t\t\t\t<p class=\"mb-0\">Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"p-3\">\n");
      out.write("\t\t\t\t\t<h4 class=\"font-italic\">Archives</h4>\n");
      out.write("\t\t\t\t\t<ol class=\"list-unstyled mb-0\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">March 2014</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">February 2014</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">January 2014</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">December 2013</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">November 2013</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">October 2013</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">September 2013</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">August 2013</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">July 2013</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">June 2013</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">May 2013</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">April 2013</a></li>\n");
      out.write("\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"p-3\">\n");
      out.write("\t\t\t\t\t<h4 class=\"font-italic\">Elsewhere</h4>\n");
      out.write("\t\t\t\t\t<ol class=\"list-unstyled\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">GitHub</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Twitter</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Facebook</a></li>\n");
      out.write("\t\t\t\t\t</ol>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</aside><!-- /.blog-sidebar -->\n");
      out.write("\n");
      out.write("\t\t</div><!-- /.row -->\n");
      out.write("\n");
      out.write("\t</main><!-- /.container -->\n");
      out.write("\n");
      out.write("\t<footer class=\"blog-footer\">\n");
      out.write("\t\t<p>Trang web xây d?ng cho <a href=\"tacgia.html\">Sinh viên PTIT </a> b?i <a href=\"#\"> Sinh viên PTIT</a>.</p>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t<a href=\"#\">Back to top</a>\n");
      out.write("\t\t</p>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
