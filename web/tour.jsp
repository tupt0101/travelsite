<%-- 
    Document   : tour
    Created on : Mar 2, 2019, 12:14:11 PM
    Author     : TuPT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="tupt.dtos.Tour"%>
<%@page import="tupt.daos.NormalDAO"%>
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
                                    <li><a href="login.jsp">Log in</li>
                                    </s:else>
                            </ul>			
                        </div>

                    </div>			  					
                </div>
            </div>
            <div class="container main-menu">
                <div class="row align-items-center justify-content-between d-flex">
                    <div id="logo">
                        <a href="index.jsp"><img src="img/logo.png" alt="" title="" /></a>
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
                            <s:property value="%{tour.tourName}"/>
                        </h1>	

                    </div>	
                </div>
            </div>
        </section>
        <!-- End banner Area -->
        <!-- Start post-content Area -->
        <section class="post-content-area single-post-area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 posts-list">
                        <div class="single-post row">

                            <!--info tour-->
                            <div class="col-lg-6">
                                <div class="single-defination">
                                    <span class="text-uppercase">Time: </span>
                                    <span class="font-weight-bold"> <s:property value="%{tour.numOfDay}"/> days <s:property value="%{tour.numOfNight}"/> nights</span>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="single-defination">
                                    <span class="text-uppercase">Transportation: </span>
                                    <span class="font-weight-bold"><s:property value="%{tour.transportation}"/></span>
                                </div>
                            </div>
                            <hr>
                            <div class="col-lg-6">
                                <div class="single-defination">
                                    <span class="text-uppercase">Departure spot: </span>
                                    <span class="font-weight-bold"><s:property value="%{tour.departure}"/></span>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="single-defination">
                                    <span class="text-uppercase">Destination: </span>
                                    <span class="font-weight-bold"><s:property value="%{tour.arrival}"/></span>
                                </div>
                            </div>


                            <hr>
                            <!--Table-->
                            <div class="progress-table">
                                <div class="table-head">
                                    <div class="visit">Tour ID</div>
                                    <div class="visit">Depature Day</div>
                                    <div class="visit">Adult price</div>
                                    <div class="visit">Children price</div>
                                    <div class="visit"></div>
                                </div>
                                <div class="table-row">
                                    <div class="visit font-weight-bold"><s:property value="%{tour.tourID}"/></div>
                                    <div class="visit font-weight-bold"><s:property value="%{tour.departureDay}"/></div>
                                    <div class="visit font-weight-bold"><s:property value="%{tour.adultPrice}"/></div>
                                    <div class="visit font-weight-bold"><s:property value="%{tour.childPrice}"/></div>
                                    <div>
                                        <s:url var="loadTourToBookLink" value="booktour.jsp">
                                            <s:param name="tourID" value="%{tour.tourID}"/>   
                                            <s:param name="DTO" value="%{tour}"/>
                                        </s:url>
                                        <a href="<s:property value="#loadTourToBookLink"/>" class="genric-btn success-border medium">Book now</a>
                                    </div>
                                </div>
                            </div>



                            <div class="col-lg-12 col-md-12">
                                <h3 class="mt-20 mb-20">This tour has:</h3>
                                <ul>
                                    ${tour.tourOverview}
                                </ul>
                                <br>

                            </div>

                            <!--Photo-->
                            <div class="col-lg-12">
<!--                                <div class="row gallery-item">
                                    <div class="col-md-4">
                                        <a href="<s:property value="%{tour.image}"/>" class="img-gal"><div class="single-gallery-image" style="background: url(<s:property value="%{tour.image}"/>);"></div></a>
                                    </div>
                                </div>-->
                                <img src="<s:property value="%{tour.image}"/>" class="col-lg-12"/>
                            </div>
                            <hr>
                            <div class="col-lg-12 col-md-12">
                                <h3 class="mt-20 mb-20">Tour destination:</h3>

                                ${tour.tourContent}

                                <p>
                                    <span style="font-weight: bold; color: black">Note:</span>
                                    ${tour.note}
                                <hr style="border: none;">
                                </p>


                            </div>


                        </div>



                    </div>
                    <div class="col-lg-4 sidebar-widgets">
                        <div class="widget-wrap">
                            <div class="single-sidebar-widget search-widget">
                                <form class="search-form" action="SearchTour" method="POST">
                                    <input placeholder="Search Posts" name="search" type="text" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Search tours'" >
                                    <button type="submit"><i class="fa fa-search"></i></button>
                                </form>
                            </div>


                            <div class="single-sidebar-widget ads-widget">
                                <a href="#"><img class="img-fluid" src="img/blog/ads-banner.jpg" alt=""></a>
                            </div>
                            <div class="single-sidebar-widget post-category-widget">
                                <h4 class="category-title">Why choose us?</h4>
                                <ul class="cat-list">
                                    <li>
                                        <a href="#" class="d-flex justify-content-between">
                                            <p><a class="fa fa-star"></a>&emsp; Safety - Security</p>

                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" class="d-flex justify-content-between">
                                            <p><a class="fa fa-star"></a>&emsp; Convenient, time-saving</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" class="d-flex justify-content-between">
                                            <p><a class="fa fa-star"></a>&emsp; No transaction fees</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#" class="d-flex justify-content-between">
                                            <p><a class="fa fa-star"></a>&emsp; Security Transactions</p>
                                        </a>
                                    </li>

                                </ul>
                            </div>
                            <div class="single-sidebar-widget popular-post-widget">
                                <h4 class="popular-title">Popular Posts</h4>
                                <div class="popular-post-list">
                                    <div class="single-post-list d-flex flex-row align-items-center">
                                        <div class="thumb">
                                            <img class="img-fluid" src="img/blog/pp1.jpg" alt="">
                                        </div>
                                        <div class="details">
                                            <a href="blog-single.html"><h6>Space The Final Frontier</h6></a>
                                            <p>02 Hours ago</p>
                                        </div>
                                    </div>
                                    <div class="single-post-list d-flex flex-row align-items-center">
                                        <div class="thumb">
                                            <img class="img-fluid" src="img/blog/pp2.jpg" alt="">
                                        </div>
                                        <div class="details">
                                            <a href="blog-single.html"><h6>The Amazing Hubble</h6></a>
                                            <p>02 Hours ago</p>
                                        </div>
                                    </div>
                                    <div class="single-post-list d-flex flex-row align-items-center">
                                        <div class="thumb">
                                            <img class="img-fluid" src="img/blog/pp3.jpg" alt="">
                                        </div>
                                        <div class="details">
                                            <a href="blog-single.html"><h6>Astronomy Or Astrology</h6></a>
                                            <p>02 Hours ago</p>
                                        </div>
                                    </div>
                                    <div class="single-post-list d-flex flex-row align-items-center">
                                        <div class="thumb">
                                            <img class="img-fluid" src="img/blog/pp4.jpg" alt="">
                                        </div>
                                        <div class="details">
                                            <a href="blog-single.html"><h6>Asteroids telescope</h6></a>
                                            <p>02 Hours ago</p>
                                        </div>
                                    </div>															
                                </div>
                            </div>	
                            <div class="single-sidebar-widget newsletter-widget">
                                <h4 class="newsletter-title">Newsletter</h4>
                                <p>
                                    Here, I focus on a range of items and features that we use in life without
                                    giving them a second thought.
                                </p>
                                <div class="form-group d-flex flex-row">
                                    <div class="col-autos">
                                        <div class="input-group">
                                            <div class="input-group-prepend">
                                                <div class="input-group-text"><i class="fa fa-envelope" aria-hidden="true"></i>
                                                </div>
                                            </div>
                                            <input type="text" class="form-control" id="inlineFormInputGroup" placeholder="Enter email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter email'" >
                                        </div>
                                    </div>
                                    <a href="#" class="bbtns">Subcribe</a>
                                </div>	
                                <p class="text-bottom">
                                    You can unsubscribe at any time
                                </p>								
                            </div>

                        </div>
                    </div>
                </div>
            </div>	
        </section>
        <!-- End post-content Area -->
        <%@include file="elements/footer.jsp" %>
    </body>
</html>
