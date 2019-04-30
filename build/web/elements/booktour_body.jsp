<!-- Start post-content Area -->
<section class="post-content-area single-post-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 posts-list">
                <div class="single-post row">

                    <div class="col-lg-6 banner-right">
                        <h2 style="margin-left: -10px;">Number of Seats</h2><br>
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="holiday" role="tabpanel" aria-labelledby="holiday-tab">
                                <!--Number of seat-->
                                <div class="form-wrap">
                                    <input type="number" min="1" max="20" class="form-control" name="adult" id="adult" placeholder="Adults " onfocus="this.placeholder = ''" onblur="this.placeholder = 'Adults '">
                                    <input type="number" min="0" max="20" class="form-control" name="child" id="child" placeholder="Child " onfocus="this.placeholder = ''" onblur="this.placeholder = 'Child '">
                                    <button class="genric-btn info" onClick="calTotal()">Book !</button>
                                    <!--<input type="submit" value="Search Holidays" class="primary-btn text-uppercase">-->
                                </div>							  	
                            </div>
                        </div>	
                    </div>

                    <form action="" method="POST" style="width: 100%;">
                        <h2>Contact Information</h2>
                        <div class="row">
                            <div class="col-lg-6">
                                <div class="form-wrapper" style="margin: 5px 0px;">
                                    <span>Fullname (*)</span>
                                    <input type="text" value="" class="form-control">
                                    <i class="zmdi zmdi-lock"></i>
                                </div>
                                <div class="form-wrapper" style="margin: 5px 0px;">
                                    <span>Email (*)</span>
                                    <input type="text" value="" class="form-control">
                                    <i class="zmdi zmdi-lock"></i>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-wrapper" style="margin: 5px 0px;">
                                    <span>Phone number (*)</span>
                                    <input type="text" value="" class="form-control">
                                    <i class="zmdi zmdi-lock"></i>
                                </div>
                                <div class="form-wrapper" style="margin: 5px 0px;">
                                    <span>Address (*)</span>
                                    <input type="text" value="" class="form-control">
                                    <i class="zmdi zmdi-lock"></i>
                                </div>
                            </div>
                            <!--<input type="submit" value="Change" class="primary-btn" style="margin: 5px 15px;"/>-->
                        </div>

                        <h2>Payment Method</h2>
                        <div class="col-lg-12">

                        </div>
                    </form>								


                </div>



            </div>
            <div class="col-lg-4 sidebar-widgets">
                <div class="widget-wrap">
                    <div class="single-sidebar-widget search-widget">
                        <form class="search-form" action="#">
                            <input placeholder="Search Posts" name="search" type="text" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Search tours'" >
                            <button type="submit"><i class="fa fa-search"></i></button>
                        </form>
                    </div>


                    <img src="img/elements/g4.jpg"/>
                    <div class="single-sidebar-widget post-category-widget">
                        <ul class="cat-list" style="color: black;">
                            <li>
                                <span href="#" class="d-flex justify-content-between text-uppercase">
                                    <h3>Du lich Ha Noi - Lao Cai - Sapa</h3>

                                </span>
                            </li>
                            <li>
                                <span href="#" class="d-flex justify-content-between">
                                    <p>Tour ID:</p>
                                    <p>TT19-2019-0001</p>
                                </span>
                            </li>
                            <li>
                                <span href="#" class="d-flex justify-content-between">
                                    <p>Departure day:</p>
                                    <p>08/03/2019</p>
                                </span>
                            </li>
                            <li>
                                <span href="#" class="d-flex justify-content-between">
                                    <p>End day:</p>
                                    <p>12/03/2019</p>
                                </span>
                            </li>
                            <li>
                                <span href="#" class="d-flex justify-content-between">
                                    <p>Time:</p>
                                    <p>4 days 3 nights</p>
                                </span>
                            </li>
                            <li style="display: none;">
                                <span href="#" class="d-flex justify-content-between">
                                    <p>Adult price:</p>
                                    <p id="priceAdult">4.850.000</p>
                                    <span>...</span>
                                </span>
                            </li>
                            <li style="display: none;">
                                <span href="#" class="d-flex justify-content-between">
                                    <p>Adult price:</p>
                                    <p id="priceChild">3.700.000</p>
                                    <span>...</span>
                                </span>
                            </li>															
                        </ul>
                        <br>
                        <h3>Total: <span style="color: red;" id="total">0</span> ?</h3>
                    </div>



                </div>
            </div>
        </div>
    </div>	
</section>
<!-- End post-content Area -->