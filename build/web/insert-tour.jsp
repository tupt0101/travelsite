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
                width: 100%;
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
                                    <li><a href="login.jsp"> | Log out</li>
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
                            Insert tour				
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
                    <div class="col-lg-12">
                        <h3>Edit Tour Information</h3>

                        <form action="AdminInsertTour" method="POST" style="width: 100%;" enctype="multipart/form-data">
                            <div class="row">
                                <div class="col-lg-6">
                                    
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Tour name</span>
                                        <input type="text" name="tourName" class="form-control" required>
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Departure</span>
                                        <input type="text" name="departure" class="form-control" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Arrival</span>
                                        <input type="text" name="arrival" class="form-control" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Departure day</span>
                                        <input type="text" name="departureDay" class="form-control date-picker" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>End day</span>
                                        <input type="text" name="endDay" class="form-control date-picker" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Transportation</span>
                                        <input type="text" name="transportation" class="form-control" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Tour overview</span>
                                        <input type="text" name="tourOverview" class="form-control" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Tour content</span>
                                        <input type="text" name="tourContent" class="form-control" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Type tour</span>
                                        <select name="typeTourID" style="width: 100%; height: 40px;">
                                            <option value="TN">TN - Tinh Nhan</option>
                                            <option value="LS">LS - Lich Su</option>
                                        </select>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Thumb</span>
                                        <input type="file" name="thumb" class="form-control">                             
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Image</span>
                                        <input type="file" name="image" accept="image/*" class="form-control" multiple="true">
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Adult price</span>
                                        <input type="text" name="adultPrice" class="form-control" pattern="[0-9]+" title="Price must be integer!">
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Child price</span>
                                        <input type="text" name="childPrice" class="form-control" pattern="[0-9]+" title="Price must be integer!">                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Unit</span>
                                        <input type="text" name="unit" class="form-control" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Number Of Days</span>
                                        <input type="number" name="numOfDay" class="form-control" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Number of Nights</span>
                                        <input type="number" name="numOfNight" class="form-control" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Number of seats</span>
                                        <input type="number" name="numOfSeat" class="form-control" required>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Number of booked seats</span>
                                        <input type="number" name="numOfBookedSeat" class="form-control">                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Type IN OUT:</span>
                                        <br><s:checkbox name="typeINOUT" class="form-control"/>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Full packaged tour:</span>
                                        <br><s:checkbox name="fullpackagedTour" class="form-control"/>                             
                                    </div>
                                    <div class="form-wrapper" style="margin: 5px 0px;">
                                        <span>Note</span>
                                        <input type="text" name="note" class="form-control">                             
                                    </div>
                                </div>
                                <input type="submit" value="Insert" class="primary-btn" style="margin: 5px 15px;"/>
                            </div>
                        </form>
                        <a href="tour-management.jsp">Back to Tour management</a>
                    </div>

                </div>

            </div>	
        </section>
        <!-- End post-content Area -->
        <%@include file="elements/footer.jsp" %>
    </body>
</html>
