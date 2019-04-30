<!-- Start post-content Area -->
<section class="post-content-area single-post-area">
    <div class="container">
        <div class="row">
            <div class="tab">
                <button class="tablinks" onclick="openTab(event, 'Profile')" id="defaultOpen"> <a class="fa fa-user"></a>&emsp;Profile</button>
                <button class="tablinks" onclick="openTab(event, 'Booked')"> <a class="fa fa-cart-plus"></a>&emsp;My booked tour</button>
                <button class="tablinks" onclick="openTab(event, 'Edit')"> <a class="fa fa-cog"></a>&emsp;Edit information</button>
                <button class="tablinks" onclick="openTab(event, 'ChangePassword')"> <a class="fa fa-lock"></a>&emsp;Change password</button>
                <button class="tablinks" onclick=""><a class="fa fa-arrow-circle-left"></a>&emsp;<a href="login.jsp" style="color: black;">Log out</a></button>
            </div>

            <div id="Profile" class="tabcontent">
                <div class="row">

                    <div class="col-lg-6">
                        <h3>Profile</h3>
                        <table style="width: 100%; height: 250px; color: black;">
                            <tr>
                                <td>Fullname:</td>
                                <td>Phan Thanh Tu</td>
                            </tr>
                            <tr>
                                <td>Email:</td>
                                <td>tupt0101@gmail.com</td>
                            </tr>
                            <tr>
                                <td>Phone number:</td>
                                <td>038 563 8900</td>
                            </tr>
                            <tr>
                                <td>Gender:</td>
                                <td>Male</td>
                            </tr>
                            <tr>
                                <td>Date of birth:</td>
                                <td>01/01/1999</td>
                            </tr>
                        </table>
                    </div>

                    <div class="col-lg-6">
                        <h3>Contact</h3>
                        <table style="width: 100%; height: 50px; color: black;">
                            <tr>
                                <td>Address:</td>
                                <td>District 12, Ho Chi Minh City</td>
                            </tr>

                        </table>
                    </div>
                </div> 
                <button class="genric-btn info" onClick="openTab(event, 'Edit')">Edit profile</button>
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
                    <div class="table-row">
                        <div class="visit font-weight-bold">0009402</div>
                        <div class="visit font-weight-bold">27/02/2019</div>
                        <div class="visit font-weight-bold">27/03/2019</div>
                        <div class="visit font-weight-bold">3</div>
                        <div class="visit font-weight-bold">13.400.000</div>
                        <div class="visit font-weight-bold">New</div>
                        <div class="visit">
                            <a href="#" class="genric-btn success-border medium">Detail</a>
                        </div>
                    </div>

                </div>
            </div>

            <div id="Edit" class="tabcontent">
                <h3>Edit Information</h3>

                <form action="" method="POST" style="width: 100%;">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="form-wrapper" style="margin: 5px 0px;">
                                <span>Fullname</span>
                                <input type="text" value="" class="form-control">
                                <i class="zmdi zmdi-lock"></i>
                            </div>
                            <div class="form-wrapper" style="margin: 5px 0px;">
                                <span>Phone number</span>
                                <input type="text" value="" class="form-control">
                                <i class="zmdi zmdi-lock"></i>
                            </div>
                            <div class="form-wrapper" style="margin: 5px 0px;">
                                <span>Gender</span>
                                <select style="width: 100%; height: 40px;">
                                    <option value="1">Male</option>
                                    <option value="2">Female</option>
                                </select>
                            </div>
                            <div class="form-wrapper" style="margin: 5px 0px;">
                                <span>Date of birth (dd/mm/yyyy)</span>
                                <input type="text" value="" class="form-control">
                                <i class="zmdi zmdi-lock"></i>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="form-wrapper" style="margin: 5px 0px;">
                                <span>Address</span>
                                <input type="text" value="" class="form-control">
                                <i class="zmdi zmdi-lock"></i>
                            </div>
                        </div>
                        <input type="submit" value="Change" class="primary-btn" style="margin: 5px 15px;"/>
                    </div>
                </form>



            </div>

            <div id="ChangePassword" class="tabcontent">
                <h3>Change Password</h3>
                <div class="row">
                    <div class="col-lg-6">
                        <div class="inner">
                            <form action="" method="POST">
                                <div class="form-wrapper" style="margin: 15px 0px;">
                                    <input type="password" placeholder="Old password" class="form-control">
                                    <i class="zmdi zmdi-lock"></i>
                                </div>
                                <div class="form-wrapper" style="margin: 15px 0px;">
                                    <input type="password" placeholder="New password" class="form-control">
                                    <i class="zmdi zmdi-lock"></i>
                                </div>
                                <div class="form-wrapper" style="margin: 15px 0px;">
                                    <input type="password" placeholder="Confirm Password" class="form-control">
                                    <i class="zmdi zmdi-lock"></i>
                                </div>
                                <input type="submit" value="Change" class="primary-btn"/>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </div>	
</section>
<!-- End post-content Area -->