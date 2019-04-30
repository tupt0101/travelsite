package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import tupt.daos.NormalDAO;
import tupt.dtos.Customer;

public final class insert_002dtour_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/elements/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_property_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_else;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_checkbox_name_class_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_property_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_else = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_checkbox_name_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_if_test.release();
    _jspx_tagPool_s_property_value_nobody.release();
    _jspx_tagPool_s_else.release();
    _jspx_tagPool_s_checkbox_name_class_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            /* Style the tab */\n");
      out.write("            .tab {\n");
      out.write("                float: left;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                width: 25%;\n");
      out.write("                height: 262px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the buttons inside the tab */\n");
      out.write("            .tab button {\n");
      out.write("                display: block;\n");
      out.write("                background-color: inherit;\n");
      out.write("                color: black;\n");
      out.write("                padding: 15px 15px;\n");
      out.write("                width: 100%;\n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                text-align: left;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: 0.3s;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Change background color of buttons on hover */\n");
      out.write("            .tab button:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Create an active/current \"tab button\" class */\n");
      out.write("            .tab button.active {\n");
      out.write("                background-color: #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the tab content */\n");
      out.write("            .tabcontent {\n");
      out.write("                float: left;\n");
      out.write("                padding: 0px 12px;\n");
      out.write("                border: 0px solid #ccc;\n");
      out.write("                width: 100%;\n");
      out.write("                border-left: none;\n");
      out.write("                height: 300px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                ");
      if (_jspx_meth_s_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_s_else_0(_jspx_page_context))
        return;
      out.write("       \n");
      out.write("                            </ul>\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\t\t\t  \t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container main-menu\">\n");
      out.write("                <div class=\"row align-items-center justify-content-between d-flex\">\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"img/logo.png\" alt=\"\" title=\"\" /></a>\n");
      out.write("                    </div>\n");
      out.write("                    <nav id=\"nav-menu-container\">\n");
      out.write("                        <ul class=\"nav-menu\">\n");
      out.write("                            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                            <li><a href=\"search.jsp\">Packages</a></li>\n");
      out.write("                            <li><a href=\"insurance.jsp\">Insurance</a></li>\n");
      out.write("                            <li><a href=\"blog-home.jsp\">Blog</a></li>\t\t\t\t\t          \t\t\t\t\t          \t\t          \n");
      out.write("                            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav><!-- #nav-menu-container -->\t\t\t\t\t      \t\t  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header><!-- #header -->\n");
      out.write("\n");
      out.write("        <!-- start banner Area -->\n");
      out.write("        <section class=\"relative about-banner\">\t\n");
      out.write("            <div class=\"overlay overlay-bg\"></div>\n");
      out.write("            <div class=\"container\">\t\t\t\t\n");
      out.write("                <div class=\"row d-flex align-items-center justify-content-center\">\n");
      out.write("                    <div class=\"about-content col-lg-12\">\n");
      out.write("                        <h1 class=\"text-white\">\n");
      out.write("                            Insert tour\t\t\t\t\n");
      out.write("                        </h1>\t\n");
      out.write("\n");
      out.write("                    </div>\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End banner Area -->\n");
      out.write("        <!-- Start post-content Area -->\n");
      out.write("        <section class=\"post-content-area single-post-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h3>Edit Tour Information</h3>\n");
      out.write("\n");
      out.write("                        <form action=\"AdminInsertTour\" method=\"POST\" style=\"width: 100%;\" enctype=\"multipart/form-data\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Tour name</span>\n");
      out.write("                                        <input type=\"text\" name=\"tourName\" class=\"form-control\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Departure</span>\n");
      out.write("                                        <input type=\"text\" name=\"departure\" class=\"form-control\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Arrival</span>\n");
      out.write("                                        <input type=\"text\" name=\"arrival\" class=\"form-control\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Departure day</span>\n");
      out.write("                                        <input type=\"text\" name=\"departureDay\" class=\"form-control date-picker\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>End day</span>\n");
      out.write("                                        <input type=\"text\" name=\"endDay\" class=\"form-control date-picker\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Transportation</span>\n");
      out.write("                                        <input type=\"text\" name=\"transportation\" class=\"form-control\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Tour overview</span>\n");
      out.write("                                        <input type=\"text\" name=\"tourOverview\" class=\"form-control\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Tour content</span>\n");
      out.write("                                        <input type=\"text\" name=\"tourContent\" class=\"form-control\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Type tour</span>\n");
      out.write("                                        <select name=\"typeTourID\" style=\"width: 100%; height: 40px;\">\n");
      out.write("                                            <option value=\"TN\">TN - Tinh Nhan</option>\n");
      out.write("                                            <option value=\"LS\">LS - Lich Su</option>\n");
      out.write("                                        </select>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Thumb</span>\n");
      out.write("                                        <input type=\"file\" name=\"thumb\" class=\"form-control\">                             \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Image</span>\n");
      out.write("                                        <input type=\"file\" name=\"image\" accept=\"image/*\" class=\"form-control\" multiple=\"true\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Adult price</span>\n");
      out.write("                                        <input type=\"text\" name=\"adultPrice\" class=\"form-control\" pattern=\"[0-9]+\" title=\"Price must be integer!\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Child price</span>\n");
      out.write("                                        <input type=\"text\" name=\"childPrice\" class=\"form-control\" pattern=\"[0-9]+\" title=\"Price must be integer!\">                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Unit</span>\n");
      out.write("                                        <input type=\"text\" name=\"unit\" class=\"form-control\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Number Of Days</span>\n");
      out.write("                                        <input type=\"number\" name=\"numOfDay\" class=\"form-control\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Number of Nights</span>\n");
      out.write("                                        <input type=\"number\" name=\"numOfNight\" class=\"form-control\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Number of seats</span>\n");
      out.write("                                        <input type=\"number\" name=\"numOfSeat\" class=\"form-control\" required>                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Number of booked seats</span>\n");
      out.write("                                        <input type=\"number\" name=\"numOfBookedSeat\" class=\"form-control\">                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Type IN OUT:</span>\n");
      out.write("                                        <br>");
      if (_jspx_meth_s_checkbox_0(_jspx_page_context))
        return;
      out.write("                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Full packaged tour:</span>\n");
      out.write("                                        <br>");
      if (_jspx_meth_s_checkbox_1(_jspx_page_context))
        return;
      out.write("                             \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-wrapper\" style=\"margin: 5px 0px;\">\n");
      out.write("                                        <span>Note</span>\n");
      out.write("                                        <input type=\"text\" name=\"note\" class=\"form-control\">                             \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"submit\" value=\"Insert\" class=\"primary-btn\" style=\"margin: 5px 15px;\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <a href=\"tour-management.jsp\">Back to Tour management</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\t\n");
      out.write("        </section>\n");
      out.write("        <!-- End post-content Area -->\n");
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

  private boolean _jspx_meth_s_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_if_0 = (org.apache.struts2.views.jsp.IfTag) _jspx_tagPool_s_if_test.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_if_0.setPageContext(_jspx_page_context);
    _jspx_th_s_if_0.setParent(null);
    _jspx_th_s_if_0.setTest("%{#session.CUSTOMER != null}");
    int _jspx_eval_s_if_0 = _jspx_th_s_if_0.doStartTag();
    if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_if_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_if_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                    <li><a href=\"profile.jsp\"> ");
        if (_jspx_meth_s_property_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_if_0, _jspx_page_context))
          return true;
        out.write(" </a></li>\n");
        out.write("                                    <li><a href=\"login.jsp\"> | Log out</li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_s_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_if_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
      return true;
    }
    _jspx_tagPool_s_if_test.reuse(_jspx_th_s_if_0);
    return false;
  }

  private boolean _jspx_meth_s_property_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_property_0 = (org.apache.struts2.views.jsp.PropertyTag) _jspx_tagPool_s_property_value_nobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_property_0.setPageContext(_jspx_page_context);
    _jspx_th_s_property_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_if_0);
    _jspx_th_s_property_0.setValue("%{#session.CUSTOMER.customerName}");
    int _jspx_eval_s_property_0 = _jspx_th_s_property_0.doStartTag();
    if (_jspx_th_s_property_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
      return true;
    }
    _jspx_tagPool_s_property_value_nobody.reuse(_jspx_th_s_property_0);
    return false;
  }

  private boolean _jspx_meth_s_else_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_else_0 = (org.apache.struts2.views.jsp.ElseTag) _jspx_tagPool_s_else.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_else_0.setPageContext(_jspx_page_context);
    _jspx_th_s_else_0.setParent(null);
    int _jspx_eval_s_else_0 = _jspx_th_s_else_0.doStartTag();
    if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_else_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_else_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                    <li><a href=\"login.jsp\">Log in</a></li>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_s_else_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_else_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_else_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
      return true;
    }
    _jspx_tagPool_s_else.reuse(_jspx_th_s_else_0);
    return false;
  }

  private boolean _jspx_meth_s_checkbox_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_checkbox_0 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _jspx_tagPool_s_checkbox_name_class_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_s_checkbox_0.setParent(null);
    _jspx_th_s_checkbox_0.setName("typeINOUT");
    _jspx_th_s_checkbox_0.setDynamicAttribute(null, "class", new String("form-control"));
    int _jspx_eval_s_checkbox_0 = _jspx_th_s_checkbox_0.doStartTag();
    if (_jspx_th_s_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkbox_name_class_nobody.reuse(_jspx_th_s_checkbox_0);
      return true;
    }
    _jspx_tagPool_s_checkbox_name_class_nobody.reuse(_jspx_th_s_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_s_checkbox_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:checkbox
    org.apache.struts2.views.jsp.ui.CheckboxTag _jspx_th_s_checkbox_1 = (org.apache.struts2.views.jsp.ui.CheckboxTag) _jspx_tagPool_s_checkbox_name_class_nobody.get(org.apache.struts2.views.jsp.ui.CheckboxTag.class);
    _jspx_th_s_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_s_checkbox_1.setParent(null);
    _jspx_th_s_checkbox_1.setName("fullpackagedTour");
    _jspx_th_s_checkbox_1.setDynamicAttribute(null, "class", new String("form-control"));
    int _jspx_eval_s_checkbox_1 = _jspx_th_s_checkbox_1.doStartTag();
    if (_jspx_th_s_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_checkbox_name_class_nobody.reuse(_jspx_th_s_checkbox_1);
      return true;
    }
    _jspx_tagPool_s_checkbox_name_class_nobody.reuse(_jspx_th_s_checkbox_1);
    return false;
  }
}
