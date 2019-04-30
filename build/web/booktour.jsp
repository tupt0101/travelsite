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

        <%
            NormalDAO dao = new NormalDAO();
            String tourID = request.getParameter("tourID");
            request.setAttribute("TOUR", dao.findTourByPK(tourID));
        %>

        <!-- start banner Area -->
        <section class="about-banner relative">
            <div class="overlay overlay-bg"></div>
            <div class="container">				
                <div class="row d-flex align-items-center justify-content-center">
                    <div class="about-content col-lg-12">
                        <h1 class="text-white">
                            ${requestScope.TOUR.tourName}				
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
                        <form action="BookTour" method="POST" style="width: 100%;">
                            <h2>Number of seats</h2>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="form-wrapper">
                                        <span>Adult (*)</span>
                                        <input type="number" name="numOfAdult" id="numOfAdult" min="1" value="" class="form-control">
                                    </div>
                                </div>
                                <div class="col-lg-6">

                                </div>
                                <div class="col-lg-6">
                                    <div class="form-wrapper">
                                        <span>Children</span>
                                        <input type="number" name="numOfChild" id="numOfChild" min="0" value="" class="form-control">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <ul>
                                        <li><p>Tour nuoc ngoai ap dung tu 2 den 12 tuoi</p></li>
                                        <li><p>Tour trong nuoc ap dung tu 6 den 11 tuoi</p></li>
                                    </ul>
                                </div>
                            </div>
                            <br>
                            <h2>Contact Information</h2>
                            <div class="row">
                                <s:if test="%{#session.CUSTOMER != null}">
                                    <div class="col-lg-6">
                                        <div class="form-wrapper">
                                            <span>Fullname (*)</span>
                                            <input type="text" value="<s:property value="%{#session.CUSTOMER.customerName}"/>" class="form-control" required>
                                        </div>
                                        <div class="form-wrapper">
                                            <span>Email (*)</span>
                                            <input type="text" value="<s:property value="%{#session.CUSTOMER.mail}"/>" class="form-control">
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-wrapper">
                                            <span>Phone number (*)</span>
                                            <input type="text" value="<s:property value="%{#session.CUSTOMER.phone}"/>" class="form-control">
                                        </div>
                                        <div class="form-wrapper">
                                            <span>Address (*)</span>
                                            <input type="text" value="<s:property value="%{#session.CUSTOMER.address}"/>" class="form-control">
                                        </div>
                                    </div>
                                    <s:hidden name="customerID" value="%{#session.CUSTOMER.customerID}"/>
                                </s:if>
                                <s:else>
                                    <div class="col-lg-6">
                                        <div class="form-wrapper">
                                            <span>Fullname (*)</span>
                                            <input type="text" value="" class="form-control" required>
                                        </div>
                                        <div class="form-wrapper">
                                            <span>Email (*)</span>
                                            <input type="text" value="" class="form-control">
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-wrapper">
                                            <span>Phone number (*)</span>
                                            <input type="text" value="" class="form-control">
                                        </div>
                                        <div class="form-wrapper">
                                            <span>Address (*)</span>
                                            <input type="text" value="" class="form-control">
                                        </div>
                                    </div>
                                </s:else>
                            </div>
                            <br>
                            <h2>Payment Method</h2>
                            <div class="col-lg-12">

                            </div>
                            <br>

                            <s:hidden name="tourID" value="%{#request.TOUR.tourID}"/>
                            <s:hidden name="unit" value="vnd"/>
                            <s:hidden name="status" value="new"/>
                            <input type="submit" class="genric-btn success circle" value="Check out" style="float: right"/>
                        </form>								
                    </div>

                    <div class="col-lg-4 sidebar-widgets">
                        <div class="widget-wrap">
                            <div class="single-sidebar-widget search-widget">
                                <form class="search-form" action="SearchTour" method="POST">
                                    <input placeholder="Search Posts" name="search" type="text" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Search tours'" >
                                    <button type="submit"><i class="fa fa-search"></i></button>
                                </form>
                            </div>


                            <img src="img/elements/g4.jpg"/>
                            <div class="single-sidebar-widget post-category-widget">
                                <ul class="cat-list" style="color: black;">
                                    <li>
                                        <span href="#" class="d-flex justify-content-between text-uppercase">
                                            <h3>${requestScope.TOUR.tourName}</h3>

                                        </span>
                                    </li>
                                    <li>
                                        <span href="#" class="d-flex justify-content-between">
                                            <p>Tour ID:</p>
                                            <p>${requestScope.TOUR.tourID}</p>
                                        </span>
                                    </li>
                                    <li>
                                        <span href="#" class="d-flex justify-content-between">
                                            <p>Departure day:</p>
                                            <p>${requestScope.TOUR.departureDay}</p>
                                        </span>
                                    </li>
                                    <li>
                                        <span href="#" class="d-flex justify-content-between">
                                            <p>End day:</p>
                                            <p>${requestScope.TOUR.endDay}</p>
                                        </span>
                                    </li>
                                    <li>
                                        <span href="#" class="d-flex justify-content-between">
                                            <p>Time:</p>
                                            <p>${requestScope.TOUR.numOfDay} days ${requestScope.TOUR.numOfNight} nights</p>
                                        </span>
                                    </li>
                                    <li>
                                        <span href="#" class="d-flex justify-content-between">
                                            <p>Adult price:</p>
                                            <p id="priceAdult">${requestScope.TOUR.adultPrice}</p>
                                        </span>
                                    </li>
                                    <li>
                                        <span href="#" class="d-flex justify-content-between">
                                            <p>Adult price:</p>
                                            <p id="priceChild">${requestScope.TOUR.childPrice}</p>
                                        </span>
                                    </li>															
                                </ul>
                                <br>
                                <s:if test="%{#request.TOTAL != null}">
                                    <h3>Total: <span style="color: red;" id="total"> <s:property value="%{#request.TOTAL}"/> </span> </h3>
                                </s:if>
                                <s:else>
                                    <h3>Total: <span style="color: red;" id="total">0</span> </h3>
                                </s:else>   
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
