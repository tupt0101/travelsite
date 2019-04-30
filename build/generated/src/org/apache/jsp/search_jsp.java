package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import tupt.dtos.Tour;
import java.util.List;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/elements/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_iterator_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_iterator_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_iterator_value.release();
    _jspx_tagPool_s_form_method_action.release();
    _jspx_tagPool_s_property_value_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\" class=\"no-js\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Mobile Specific Meta -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/fav.png\">\n");
      out.write("        <!-- Author Meta -->\n");
      out.write("        <meta name=\"author\" content=\"colorlib\">\n");
      out.write("        <!-- Meta Description -->\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <!-- Meta Keyword -->\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <!-- meta character set -->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <!-- Site Title -->\n");
      out.write("        <title>Travel</title>\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700\" rel=\"stylesheet\"> \n");
      out.write("        <!--\n");
      out.write("        CSS\n");
      out.write("        ============================================= -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/linearicons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\t\t\t\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\">\t\t\t\t\t\t\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\t\t\t\t\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\t\n");
      out.write("        <header id=\"header\">\n");
      out.write("            <div class=\"header-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row align-items-center\">\n");
      out.write("                        <div class=\"col-lg-6 col-sm-6 col-6 header-top-left\">\n");
      out.write("                            <div class=\"header-social\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-behance\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6 col-sm-6 col-6 header-top-right\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <select>\n");
      out.write("                                        <option value=\"1\">Ti?ng Vi?t</option>\n");
      out.write("                                        <option value=\"2\">English</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"profile.jsp\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CUSTOMER.customerName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                <li><a href=\"login.jsp\">Log in</a></li>\n");
      out.write("                            </ul>\t\t\t\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\t\t\t  \t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container main-menu\">\n");
      out.write("                <div class=\"row align-items-center justify-content-between d-flex\">\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"https://res.cloudinary.com/webcuatu/image/upload/v1551694365/project/logo.png\" alt=\"\" title=\"\" /></a>\n");
      out.write("                    </div>\n");
      out.write("                    <nav id=\"nav-menu-container\">\n");
      out.write("                        <ul class=\"nav-menu\">\n");
      out.write("                            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                            <li><a href=\"search.jsp\">Packages</a></li>\n");
      out.write("                            <li><a href=\"insurance.jsp\">Insurance</a></li>\n");
      out.write("                            <li><a href=\"blog.jsp\">Blog</a></li>\t\t\t\t\t          \t\t\t\t\t          \t\t          \n");
      out.write("                            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav><!-- #nav-menu-container -->\t\t\t\t\t      \t\t  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header><!-- #header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- start banner Area -->\n");
      out.write("        <section class=\"about-banner relative\">\n");
      out.write("            <div class=\"overlay overlay-bg\"></div>\n");
      out.write("            <div class=\"container\">\t\t\t\t\n");
      out.write("                <div class=\"row d-flex align-items-center justify-content-center\">\n");
      out.write("                    <div class=\"about-content col-lg-12\">\n");
      out.write("                        <h1 class=\"text-white\">\n");
      out.write("                            Tittle\t\t\t\t\n");
      out.write("                        </h1>\t\n");
      out.write("\n");
      out.write("                    </div>\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End banner Area -->\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Start destinations Area -->\n");
      out.write("        <section class=\"destinations-area section-gap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"widget-wrap\">\n");
      out.write("                            <div class=\"single-sidebar-widget search-widget\">\n");
      out.write("                                <form class=\"search-form\" action=\"SearchTour\" method=\"POST\">\n");
      out.write("                                    <input placeholder=\"Search tours\" name=\"search\" type=\"text\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Search tours'\" >\n");
      out.write("                                    <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_s_iterator_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\t\n");
      out.write("        </section>\n");
      out.write("        <!-- End destinations Area -->\n");
      out.write("\n");
      out.write("        ");
      out.write("<!-- start footer Area -->\t\t\n");
      out.write("<footer class=\"footer-area section-gap\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3  col-md-6 col-sm-6\">\n");
      out.write("                <div class=\"single-footer-widget\">\n");
      out.write("                    <h6>About Agency</h6>\n");
      out.write("                    <p>\n");
      out.write("                        The world has become so fast paced that people don?t want to stand by reading a page of information, they would much rather look at a presentation and understand the message. It has come to a point \n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                <div class=\"single-footer-widget\">\n");
      out.write("                    <h6>Navigation Links</h6>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Home</a></li>\n");
      out.write("                                <li><a href=\"#\">Feature</a></li>\n");
      out.write("                                <li><a href=\"#\">Services</a></li>\n");
      out.write("                                <li><a href=\"#\">Portfolio</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Team</a></li>\n");
      out.write("                                <li><a href=\"#\">Pricing</a></li>\n");
      out.write("                                <li><a href=\"#\">Blog</a></li>\n");
      out.write("                                <li><a href=\"#\">Contact</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                    </div>\t\t\t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("            </div>\t\t\t\t\t\t\t\n");
      out.write("            <div class=\"col-lg-3  col-md-6 col-sm-6\">\n");
      out.write("                <div class=\"single-footer-widget\">\n");
      out.write("                    <h6>Newsletter</h6>\n");
      out.write("                    <p>\n");
      out.write("                        For business professionals caught between high OEM price and mediocre print and graphic output.\t\t\t\t\t\t\t\t\t\n");
      out.write("                    </p>\t\t\t\t\t\t\t\t\n");
      out.write("                    <div id=\"mc_embed_signup\">\n");
      out.write("                        <form target=\"_blank\" action=\"https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01\" method=\"get\" class=\"subscription relative\">\n");
      out.write("                            <div class=\"input-group d-flex flex-row\">\n");
      out.write("                                <input name=\"EMAIL\" placeholder=\"Email Address\" onfocus=\"this.placeholder = ''\" onblur=\"this.placeholder = 'Email Address '\" required=\"\" type=\"email\">\n");
      out.write("                                <button class=\"btn bb-btn\"><span class=\"lnr lnr-location\"></span></button>\t\t\n");
      out.write("                            </div>\t\t\t\t\t\t\t\t\t\n");
      out.write("                            <div class=\"mt-10 info\"></div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3  col-md-6 col-sm-6\">\n");
      out.write("                <div class=\"single-footer-widget mail-chimp\">\n");
      out.write("                    <h6 class=\"mb-20\">InstaFeed</h6>\n");
      out.write("                    <ul class=\"instafeed d-flex flex-wrap\">\n");
      out.write("                        <li><img src=\"img/i1.jpg\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"img/i2.jpg\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"img/i3.jpg\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"img/i4.jpg\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"img/i5.jpg\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"img/i6.jpg\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"img/i7.jpg\" alt=\"\"></li>\n");
      out.write("                        <li><img src=\"img/i8.jpg\" alt=\"\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\t\t\t\t\t\t\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row footer-bottom d-flex justify-content-between align-items-center\">\n");
      out.write("            <p class=\"col-lg-8 col-sm-12 footer-text m-0\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Phan Thành Tú | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by Colorlib\n");
      out.write("                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n");
      out.write("            <div class=\"col-lg-4 col-sm-12 footer-social\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-behance\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<!-- End footer Area -->\t\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function openTab(evt, cityName) {\n");
      out.write("        var i, tabcontent, tablinks;\n");
      out.write("        tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("        for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("            tabcontent[i].style.display = \"none\";\n");
      out.write("        }\n");
      out.write("        tablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("        for (i = 0; i < tablinks.length; i++) {\n");
      out.write("            tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("        }\n");
      out.write("        document.getElementById(cityName).style.display = \"block\";\n");
      out.write("        evt.currentTarget.className += \" active\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Get the element with id=\"defaultOpen\" and click on it\n");
      out.write("    document.getElementById(\"defaultOpen\").click();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function openLink(link) {\n");
      out.write("        var newWindow = window.open(link, \"_self\");\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!--<script>\n");
      out.write("    function calculatePrice(adultPrice, childPrice) {\n");
      out.write("        var numOfAdult = document.getElementById(numOfAdult).value;\n");
      out.write("        var numOfChild = document.getElementById(numOfChild).value;\n");
      out.write("        var total = adultPrice*numOfAdult + childPrice*numOfChild;\n");
      out.write("        document.getElementById(total).set\n");
      out.write("    }\n");
      out.write("</script>-->\n");
      out.write("\n");
      out.write("<!--<script>\n");
      out.write("    //Hàm ??c giá tr? và hi?n th? thông tin\n");
      out.write("    function changeText() {\n");
      out.write("        var value = $( \"#numOfAdult\" ).val();\n");
      out.write("        $( \"p#adult\" ).text( value );\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //B?t s? ki?n keyup c?a textbox\n");
      out.write("    $( \"#numOfAdult\" ).keyup(changeText);\n");
      out.write("\n");
      out.write("    //Cho #inputext phát sinh m?t s? ki?n keyup ban ??u\n");
      out.write("    $( \"#numOfAdult\" ).keyup();\n");
      out.write("\n");
      out.write("</script>-->\n");
      out.write("\n");
      out.write("<script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/vendor/bootstrap.min.js\"></script>\t\t\t\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA\"></script>\t\t\n");
      out.write("<script src=\"js/jquery-ui.js\"></script>\t\t\t\t\t\n");
      out.write("<script src=\"js/easing.min.js\"></script>\t\t\t\n");
      out.write("<script src=\"js/hoverIntent.js\"></script>\n");
      out.write("<script src=\"js/superfish.min.js\"></script>\t\n");
      out.write("<script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.magnific-popup.min.js\"></script>\t\t\t\t\t\t\n");
      out.write("<script src=\"js/jquery.nice-select.min.js\"></script>\t\t\t\t\t\n");
      out.write("<script src=\"js/owl.carousel.min.js\"></script>\t\t\t\t\t\t\t\n");
      out.write("<script src=\"js/mail-script.js\"></script>\t\n");
      out.write("<script src=\"js/main.js\"></script>\t\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_s_iterator_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_iterator_0 = (org.apache.struts2.views.jsp.IteratorTag) _jspx_tagPool_s_iterator_value.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_s_iterator_0.setParent(null);
    _jspx_th_s_iterator_0.setValue("result");
    int _jspx_eval_s_iterator_0 = _jspx_th_s_iterator_0.doStartTag();
    if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_iterator_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_iterator_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <!-- Tour -->\n");
        out.write("                        <div class=\"col-lg-4\">\n");
        out.write("                            <div class=\"single-destinations\">\n");
        out.write("                                <div class=\"thumb\">\n");
        out.write("                                    <img src=\"");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\" alt=\"\">\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"details\">\n");
        out.write("                                    ");
        if (_jspx_meth_s_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_iterator_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_s_iterator_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_iterator_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
      return true;
    }
    _jspx_tagPool_s_iterator_value.reuse(_jspx_th_s_iterator_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_property_0.setValue("thumb");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_iterator_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_iterator_0);
    _jspx_th_s_form_0.setAction("LoadTour");
    _jspx_th_s_form_0.setMethod("POST");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                        <h3 class=\"d-flex justify-content-between\">\n");
        out.write("                                            <span class=\"font-weight-bold text-uppercase\"> ");
        if (_jspx_meth_s_property_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write(" </span>                              \t\t\t\t\t\t\t\n");
        out.write("                                        </h3>\n");
        out.write("                                        <ul class=\"package-list\">\n");
        out.write("                                            <li class=\"d-flex justify-content-between align-items-center\">\n");
        out.write("                                                <span class=\"text-uppercase\">");
        if (_jspx_meth_s_property_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write(" - ");
        if (_jspx_meth_s_property_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</span>\t\t\t\t\t\t\t\t\t\t\n");
        out.write("                                            </li>\n");
        out.write("                                            <li class=\"d-flex justify-content-between align-items-center\">\n");
        out.write("                                                <span>Time : </span>\n");
        out.write("                                                <span>");
        if (_jspx_meth_s_property_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write(" days ");
        if (_jspx_meth_s_property_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write(" nights</span>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li class=\"d-flex justify-content-between align-items-center\">\n");
        out.write("                                                <span>Departure day:</span>\n");
        out.write("                                                <span>");
        if (_jspx_meth_s_property_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</span>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li class=\"d-flex justify-content-between align-items-center\">\n");
        out.write("                                                <span>Transportation : </span>\n");
        out.write("                                                <span>");
        if (_jspx_meth_s_property_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("</span>\n");
        out.write("                                            </li>\t\t\t\t\t\t\t\t\t\t\t\n");
        out.write("                                            <li class=\"d-flex justify-content-between align-items-center\">\n");
        out.write("                                                <span>Price from</span>\n");
        out.write("                                                <input type=\"hidden\" name=\"tourID\" value=\"");
        if (_jspx_meth_s_property_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\"/>\n");
        out.write("                                                <input type=\"submit\" class=\"price-btn\" value=\"");
        if (_jspx_meth_s_property_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\"/>\n");
        out.write("                                            </li>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
        out.write("                                        </ul>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_property_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_1 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_1.setPageContext(_jspx_page_context);
    _jspx_th_s_property_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_property_1.setValue("tourName");
    int _jspx_eval_s_property_1 = _jspx_th_s_property_1.doStartTag();
    if (_jspx_th_s_property_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_1);
    return false;
  }

  private boolean _jspx_meth_s_property_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_2 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_2.setPageContext(_jspx_page_context);
    _jspx_th_s_property_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_property_2.setValue("%{departure}");
    int _jspx_eval_s_property_2 = _jspx_th_s_property_2.doStartTag();
    if (_jspx_th_s_property_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_2);
    return false;
  }

  private boolean _jspx_meth_s_property_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_3 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_3.setPageContext(_jspx_page_context);
    _jspx_th_s_property_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_property_3.setValue("%{arrival}");
    int _jspx_eval_s_property_3 = _jspx_th_s_property_3.doStartTag();
    if (_jspx_th_s_property_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_3);
    return false;
  }

  private boolean _jspx_meth_s_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_4 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_4.setPageContext(_jspx_page_context);
    _jspx_th_s_property_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_property_4.setValue("%{numOfDay}");
    int _jspx_eval_s_property_4 = _jspx_th_s_property_4.doStartTag();
    if (_jspx_th_s_property_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_4);
    return false;
  }

  private boolean _jspx_meth_s_property_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_5 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_5.setPageContext(_jspx_page_context);
    _jspx_th_s_property_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_property_5.setValue("%{numOfNight}");
    int _jspx_eval_s_property_5 = _jspx_th_s_property_5.doStartTag();
    if (_jspx_th_s_property_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_5);
    return false;
  }

  private boolean _jspx_meth_s_property_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_6 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_6.setPageContext(_jspx_page_context);
    _jspx_th_s_property_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_property_6.setValue("%{departureDay}");
    int _jspx_eval_s_property_6 = _jspx_th_s_property_6.doStartTag();
    if (_jspx_th_s_property_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_6);
    return false;
  }

  private boolean _jspx_meth_s_property_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_7 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_7.setPageContext(_jspx_page_context);
    _jspx_th_s_property_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_property_7.setValue("%{transportation}");
    int _jspx_eval_s_property_7 = _jspx_th_s_property_7.doStartTag();
    if (_jspx_th_s_property_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_7);
    return false;
  }

  private boolean _jspx_meth_s_property_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_8 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_8.setPageContext(_jspx_page_context);
    _jspx_th_s_property_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_property_8.setValue("%{tourID}");
    int _jspx_eval_s_property_8 = _jspx_th_s_property_8.doStartTag();
    if (_jspx_th_s_property_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_8);
    return false;
  }

  private boolean _jspx_meth_s_property_9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_9 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_9.setPageContext(_jspx_page_context);
    _jspx_th_s_property_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_property_9.setValue("%{adultPrice}");
    int _jspx_eval_s_property_9 = _jspx_th_s_property_9.doStartTag();
    if (_jspx_th_s_property_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_9);
    return false;
  }
}
