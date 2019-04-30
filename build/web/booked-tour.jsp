<%-- 
    Document   : account
    Created on : Mar 2, 2019, 11:47:18 AM
    Author     : TuPT
--%>

<%@page import="tupt.daos.NormalDAO"%>
<%@page import="tupt.dtos.Customer"%>
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

            /* Style the tab */
            .tab {
                float: left;
                border: 1px solid #ccc;
                background-color: #f1f1f1;
                width: 25%;
                height: 262px;
            }

            /* Style the buttons inside the tab */
            .tab button {
                display: block;
                background-color: inherit;
                color: black;
                padding: 15px 15px;
                width: 100%;
                border: none;
                outline: none;
                text-align: left;
                cursor: pointer;
                transition: 0.3s;
                font-size: 17px;
            }

            /* Change background color of buttons on hover */
            .tab button:hover {
                background-color: #ddd;
            }

            /* Create an active/current "tab button" class */
            .tab button.active {
                background-color: #ccc;
            }

            /* Style the tab content */
            .tabcontent {
                float: left;
                padding: 0px 12px;
                border: 0px solid #ccc;
                width: 75%;
                border-left: none;
                height: 300px;
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
                        <a href="index.jsp"><img src="img/logo.png" alt="" title="" /></a>
                    </div>
                    <nav id="nav-menu-container">
                        <ul class="nav-menu">
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="about.jsp">About</a></li>
                            <li><a href="search.jsp">Packages</a></li>
                            <li><a href="insurance.jsp">Insurance</a></li>
                            <li><a href="blog-home.jsp">Blog</a></li>					          					          		          
                            <li><a href="contact.jsp">Contact</a></li>
                        </ul>
                    </nav><!-- #nav-menu-container -->					      		  
                </div>
            </div>
        </header><!-- #header -->

        <!-- start banner Area -->
        <section class="relative about-banner">	
            <div class="overlay overlay-bg"></div>
            <div class="container">				
                <div class="row d-flex align-items-center justify-content-center">
                    <div class="about-content col-lg-12">
                        <h1 class="text-white">
                            Booked Tour				
                        </h1>	
                        <!--<p class="text-white link-nav"><a href="index.html">Home </a>  <span class="lnr lnr-arrow-right"></span><a href="blog-home.html">Blog </a> <span class="lnr lnr-arrow-right"></span> <a href="blog-single.html"> Blog Details Page</a></p>-->
                    </div>	
                </div>
            </div>
        </section>
        <!-- End banner Area -->
        <!-- Start post-content Area -->
        <section class="post-content-area single-post-area">
            <div class="container">
                <div class="row">
                    <div class="tab">
                        <button class="tablinks" onclick="openLink('profile.jsp')"> <a class="fa fa-user"></a>&emsp;Profile</button>
                        <s:url var="loadBookedTourLink" action="LoadBookTour.action">
                            <s:param name="customerID" value="%{#session.CUSTOMER.customerID}"/>
                        </s:url>
                        <button class="tablinks" onclick="openLink('<s:property value="#loadBookedTourLink"/>')"> <a class="fa fa-cart-plus"></a>&emsp;My booked tour</button>
                        <button class="tablinks" onclick="openLink('edit-profile.jsp')"> <a class="fa fa-cog"></a>&emsp;Edit information</button>
                        <button class="tablinks" onclick="openLink('change-password.jsp')"> <a class="fa fa-lock"></a>&emsp;Change password</button>
                        <button class="tablinks" onclick="openLink('login.jsp')"><a class="fa fa-arrow-circle-left"></a>&emsp;Log out</button>
                    </div>

                    <div id="Booked" class="tabcontent">
                        <h3>My Booked Tour</h3>
                        <div class="progress-table">
                            <div class="table-head">
                                <div class="visit">Booked ID</div>
                                <div class="visit">Booked Day</div>
                                <div class="visit">Expired Day</div>
                                <div class="visit">Seats</div>
                                <div class="visit">Total</div>
                                <div class="visit">Status</div>
                                <div class="visit"></div>
                            </div>
                            <s:if test="%{#session.CART != null}">
                                <s:iterator value="%{#session.CART}">
                                    <div class="table-row">
                                        <div class="visit font-weight-bold"><s:property value="bookTourID"/></div>
                                        <div class="visit font-weight-bold"><s:property value="bookDay"/></div>
                                        <div class="visit font-weight-bold"><s:property value="expiredDay"/></div>
                                        <div class="visit font-weight-bold"><s:property value="numOfSeat"/></div>
                                        <div class="visit font-weight-bold"><s:property value="totalPrice"/></div>
                                        <div class="visit font-weight-bold"><s:property value="status"/></div>
                                        <div class="visit">
                                            <s:url var="deleteLink" action="DeleteBookTour.action">
                                                <s:param name="bookTourID" value="bookTourID"/>
                                                <s:param name="customerID" value="%{#session.CUSTOMER.customerID}"/>
                                            </s:url>
                                            <a href="<s:property value="#deleteLink"/>" class="genric-btn danger-border medium">Cancel</a>
                                        </div>
                                    </div>
                                </s:iterator>
                            </s:if>

                        </div>
                    </div>

                </div>

            </div>	
        </section>
        <!-- End post-content Area -->
        <%@include file="elements/footer.jsp" %>
    </body>
</html>
