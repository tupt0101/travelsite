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
                            Package Tour			
                        </h1>	

                    </div>	
                </div>
            </div>
        </section>
        <!-- End banner Area -->

        <%@ taglib prefix="s" uri="/struts-tags"%>

        <!-- Start destinations Area -->
        <section class="destinations-area section-gap">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="widget-wrap">
                            <div class="single-sidebar-widget search-widget">
                                <form class="search-form" action="SearchTour" method="POST">
                                    <input placeholder="Search tours" name="search" type="text" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Search tours'" >
                                    <button type="submit"><i class="fa fa-search"></i></button>
                                </form>
                            </div>
                        </div>
                    </div>

                    <s:if test="%{result != null}">
                        <s:if test="%{result.size() > 0}">
                            <s:iterator value="result">
                                <!-- Tour -->
                                <div class="col-lg-4">
                                    <div class="single-destinations">
                                        <div class="thumb">
                                            <img src="<s:property value="thumb"/>" alt="">
                                        </div>
                                        <div class="details">
                                            <s:form action="LoadTour" method="POST">
                                                <h3 class="d-flex justify-content-between">
                                                    <span class="font-weight-bold text-uppercase"> <s:property value="tourName"/> </span>                              							
                                                </h3>
                                                <ul class="package-list">
                                                    <li class="d-flex justify-content-between align-items-center">
                                                        <span class="text-uppercase"><s:property value="departure"/> - <s:property value="arrival"/></span>										
                                                    </li>
                                                    <li class="d-flex justify-content-between align-items-center">
                                                        <span>Time : </span>
                                                        <span><s:property value="numOfDay"/> days <s:property value="numOfNight"/> nights</span>
                                                    </li>
                                                    <li class="d-flex justify-content-between align-items-center">
                                                        <span>Departure day:</span>
                                                        <span><s:property value="departureDay"/></span>
                                                    </li>
                                                    <li class="d-flex justify-content-between align-items-center">
                                                        <span>Transportation : </span>
                                                        <span><s:property value="transportation"/></span>
                                                    </li>											
                                                    <li class="d-flex justify-content-between align-items-center">
                                                        <span>Price from</span>
                                                        <input type="hidden" name="tourID" value="<s:property value="tourID"/>"/>
                                                        <input type="submit" class="price-btn" value="<s:property value="adultPrice"/>"/>
                                                    </li>													
                                                </ul>
                                            </s:form>
                                        </div>
                                    </div>
                                </div>

                            </s:iterator>
                        </s:if>
                        <s:else>
                            No record found!
                        </s:else>
                    </s:if>




                </div>
            </div>	
        </section>
        <!-- End destinations Area -->

        <%@include file="elements/footer.jsp" %>


    </body>
</html>
