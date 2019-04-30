<%-- 
    Document   : search
    Created on : Mar 2, 2019, 12:10:00 PM
    Author     : TuPT
--%>

<%@page import="tupt.dtos.Tour"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="zxx" class="no-js">
    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Favicon-->
        <link rel="shortcut icon" href="img/fav.png">
        <!-- Author Meta -->
        <meta name="author" content="colorlib">
        <!-- Meta Description -->
        <meta name="description" content="">
        <!-- Meta Keyword -->
        <meta name="keywords" content="">
        <!-- meta character set -->
        <meta charset="UTF-8">
        <!-- Site Title -->
        <title>Travel</title>

        <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
        <!--
        CSS
        ============================================= -->
        <link rel="stylesheet" href="css/linearicons.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/jquery-ui.css">				
        <link rel="stylesheet" href="css/nice-select.css">							
        <link rel="stylesheet" href="css/animate.min.css">
        <link rel="stylesheet" href="css/owl.carousel.css">				
        <link rel="stylesheet" href="css/main.css">

        <style>
            body {font-family: Arial;}

            /* Style the tab */
            .tab {
                overflow: hidden;
                border: 1px solid #ccc;
                background-color: #f1f1f1;
            }

            /* Style the buttons inside the tab */
            .tab button {
                background-color: inherit;
                float: left;
                border: none;
                outline: none;
                cursor: pointer;
                padding: 14px 16px;
                transition: 0.3s;
                font-size: 17px;
            }

            /* Change background color of buttons on hover */
            .tab button:hover {
                background-color: #ddd;
            }

            /* Create an active/current tablink class */
            .tab button.active {
                background-color: #ccc;
            }

            /* Style the tab content */
            .tabcontent {
                padding: 0px 0px;
                border: 1px solid #ccc;
                width: 100%;
            }
        </style>

    </head>
    <body>	
        <header id="header">
            <div class="header-top">
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-lg-6 col-sm-6 col-6 header-top-left">
                            <div class="header-social">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-dribbble"></i></a>
                                <a href="#"><i class="fa fa-behance"></i></a>
                            </div>
                        </div>
                        <div class="col-lg-6 col-sm-6 col-6 header-top-right">
                            <ul>
                                <li>
                                    <select>
                                        <option value="1">Ti?ng Vi?t</option>
                                        <option value="2">English</option>
                                    </select>
                                </li>
                                <s:if test="%{#session.CUSTOMER != null}">
                                    <li><a href="profile.jsp"> <s:property value="%{#session.CUSTOMER.customerName}"/> </a></li>
                                        <s:url var="logoutLink" action="Logout.action"/>
                                    <li><a href="<s:property value="#logoutLink"/>"> | Log out</a></li>
                                    </s:if>
                                    <s:else>
                                    <li><a href="login.jsp">Log in</a></li>
                                    </s:else>
                            </ul>			
                        </div>

                    </div>			  					
                </div>
            </div>
            <div class="container main-menu">
                <div class="row align-items-center justify-content-between d-flex">
                    <div id="logo">
                        <a href="index.jsp"><img src="https://res.cloudinary.com/webcuatu/image/upload/v1551694365/project/logo.png" alt="" title="" /></a>
                    </div>
                    <nav id="nav-menu-container">
                        <ul class="nav-menu">
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="about.jsp">About</a></li>
                            <li><a href="search.jsp">Packages</a></li>
                            <li><a href="insurance.jsp">Insurance</a></li>
                            <li><a href="blog.jsp">Blog</a></li>					          					          		          
                            <li><a href="contact.jsp">Contact</a></li>
                        </ul>
                    </nav><!-- #nav-menu-container -->					      		  
                </div>
            </div>
        </header><!-- #header -->


        <!-- start banner Area -->
        <section class="about-banner relative">
            <div class="overlay overlay-bg"></div>
            <div class="container">				
                <div class="row d-flex align-items-center justify-content-center">
                    <div class="about-content col-lg-12">
                        <h1 class="text-white">
                            User Management				
                        </h1>	

                    </div>	
                </div>
            </div>
        </section>
        <!-- End banner Area -->



        <!-- Start destinations Area -->
        <section class="destinations-area section-gap">
            <div class="container">
                <div class="row">
                    <!--tab-->
                    <div class="tab col-lg-12">
                        <button class="tablinks" onclick="openLink('admin.jsp')" id="defaultOpen"> <a class="fa fa-home"></a>&emsp;Welcome</button>
                        <button class="tablinks" onclick="openLink('tour-management.jsp')"> <a class="fa fa-cart-plus"></a>&emsp;Tour Management</button>
                        <button class="tablinks" onclick="openLink('user-management.jsp')"> <a class="fa fa-user"></a>&emsp;User Management</button>
                        <form action="Logout">
                            <button class="tablinks" type="submit"><a class="fa fa-arrow-circle-left"></a>&emsp;Log out</button>
                        </form>
                    </div>


                    <div class="col-lg-6">
                        <div class="widget-wrap">
                            <div class="single-sidebar-widget search-widget">
                                <form class="search-form" action="AdminSearchCustomer" method="POST">
                                    <input placeholder="Search users" name="search" type="text" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Search users'" >
                                    <button type="submit"><i class="fa fa-search"></i></button>
                                </form>
                            </div>
                        </div>
                    </div>

<!--                    <div class="col-lg-6">
                        <div class="widget-wrap">
                            <div class="single-sidebar-widget search-widget">
                                <a href="insertTour.jsp" class="genric-btn success circle arrow">Add a new User<span class="lnr lnr-arrow-right"></span></a>
                            </div>
                        </div>
                    </div>-->

                    <div class="col-lg-12 tabcontent">
                        <s:if test="%{listUser != null}">
                            <s:if test="%{listUser.size() > 0}">
                                <div class="progress-table">
                                    <div class="table-head">
                                        <div class="visit">Cust ID</div>
                                        <div class="visit">Cust name</div>
                                        <div class="visit">Gender</div>
                                        <div class="visit">Phone</div>
                                        <div class="visit">Address</div>
                                        <div class="visit">DOB</div>
                                        <div class="visit">Mail</div>
                                        <div class="serial">Role</div>
                                        <div class="serial">Disable</div>
                                    </div>
                                    <s:iterator value="listUser">
                                        <div class="table-row">
                                            <div class="visit font-weight-bold"><s:property value="customerID"/></div>
                                            <div class="visit font-weight-bold"><s:property value="customerName"/></div>
                                            <div class="visit font-weight-bold"><s:property value="sex"/></div>
                                            <div class="visit font-weight-bold"><s:property value="phone"/></div>
                                            <div class="visit font-weight-bold"><s:property value="address"/></div>
                                            <div class="visit font-weight-bold"><s:property value="dob"/></div>
                                            <div class="visit font-weight-bold"><s:property value="mail"/></div>                                          
                                            <div class="serial">
                                                <s:form action="AdminEditTour" method="POST">
                                                    <input type="hidden" name="tourID" value="${tour.tourID}"/>
                                                    <input type="hidden" name="search" value="${param.search}"/>
                                                    <input type="submit" value="Edit" />
                                                </s:form>
                                            </div>
                                            <div class="serial">
                                                <s:url var="banCustLink" action="AdminBanCustomer.action">
                                                    <s:param name="customerID" value="customerID"/>                                                    
                                                    <s:param name="search" value="%{param.search}"/>                                                    
                                                </s:url>
                                                <a href="<s:property value="#banCustLink"/>" style="color: red;">Ban</a>
                                            </div>
                                        </div>
                                    </s:iterator>
                                </div>
                            </s:if>
                            <s:else>
                                No record found!
                            </s:else>
                        </s:if>
                    </div>


                </div>
            </div>	
        </section>
        <!-- End destinations Area -->


        <%@include file="elements/footer.jsp" %>

    </body>
</html>
