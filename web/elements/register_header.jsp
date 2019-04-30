<%@taglib prefix="s" uri="/struts-tags" %>

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
        <!-- MATERIAL DESIGN ICONIC FONT -->
        <link rel="stylesheet" href="fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">

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
        <link rel="stylesheet" href="css/styleforlogin.css">
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
        <section class="banner-area relative">				
            <div class="container">
                <div class="row fullscreen align-items-center justify-content-between">

                    <div class="inner">
                        <div class="image-holder">
                            <img src="img/registration-form-1.jpg" alt="">
                        </div>
                        <form action="Insert" method="POST">
                            <h3>Registration Form</h3>
                            <div class="form-wrapper">
                                <input type="text" name="fullname" placeholder="Fullname (*)" class="form-control" required oninvalid="this.setCustomValidity('Fullname is required!')">
                                <i class="zmdi zmdi-account"></i>
                            </div>
                            <div class="form-wrapper">
                                <input type="email" name="email" placeholder="Email Address" class="form-control" required oninvalid="this.setCustomValidity('Email must be valid (example@abc.xyz)')">
                                <i class="zmdi zmdi-email"></i>
                            </div>
                            <div class="form-wrapper">
                                <input type="password" name="password" id="password" placeholder="Password" pattern="[0-9a-z]{6,20}" class="form-control" required oninvalid="this.setCustomValidity('Password must be 6 to 20 characters and contain both digit and alphabet.')">
                                <i class="zmdi zmdi-lock"></i>
                            </div>
                            <div class="form-wrapper">
                                <input type="password" name="confirm" id="confirm_password" placeholder="Confirm Password" class="form-control" required>
                                <i class="zmdi zmdi-lock"></i>
                            </div>
                            <div class="form-wrapper">
                                <input type="text" name="phone" placeholder="Phone" class="form-control" pattern="[0-9]{10}">
                                <i class="zmdi zmdi-phone"></i>
                            </div>
                            <div class="form-wrapper">
                                <input type="text" name="address" placeholder="Address" class="form-control">
                                <i class="zmdi zmdi-home"></i>
                            </div>
                            <input type="submit" value="Register" class="primary-btn"/>
                            <a href="index.jsp" class="primary-btn">Cancel</a><br>
                            <br>Already have an account ? <a href="login.jsp">Log in</a>

                        </form>
                    </div>
                </div>

            </div>					
        </section>
        <!-- End banner Area -->