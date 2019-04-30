<%@page import="tupt.dtos.Tour"%>
<%@page import="tupt.daos.UserDAO"%>
<!-- Start post-content Area -->
<section class="post-content-area single-post-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 posts-list">
                <div class="single-post row">
                    
                    <% 
                        String tourID = (String) request.getParameter("tourID");
                        UserDAO dao = new UserDAO();
                        Tour tour = dao.findTourByPK(tourID);
                    %>
                    
                    <!--info tour-->
                    <div class="col-lg-6">
                        <div class="single-defination">
                            <span class="text-uppercase">Time: </span>
                            <span class="font-weight-bold">${tour.numOfDay} days ${tour.numOfNight} nights</span>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="single-defination">
                            <span class="text-uppercase">Transportation: </span>
                            <span class="font-weight-bold">${tour.transportation}</span>
                        </div>
                    </div>
                    <hr>
                    <div class="col-lg-6">
                        <div class="single-defination">
                            <span class="text-uppercase">Departure spot: </span>
                            <span class="font-weight-bold">${tour.departure}</span>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="single-defination">
                            <span class="text-uppercase">Destination: </span>
                            <span class="font-weight-bold">${tour.arrival}</span>
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
                            <div class="visit font-weight-bold">${tour.tourID}</div>
                            <div class="visit font-weight-bold">${tour.departureDay}</div>
                            <div class="visit font-weight-bold">${tour.adultPrice}</div>
                            <div class="visit font-weight-bold">${tour.childPrice}</div>
                            <div>
                                <s:url>
                                    
                                </s:url>
                                <a href="booktour.jsp" class="genric-btn success-border medium">Book now</a>
                            </div>
                        </div>

                    </div>



                    <div class="col-lg-12 col-md-12">
                        <h3 class="mt-20 mb-20">This tour has:</h3>
                        <ul>
                            <li>&emsp;- adgasdgsdfg</li>
                            <li>&emsp;- adsfsdgsfgsdfgsfgs sdgjhskdjfgh sfg</li>
                            <li>&emsp;- adsfsdgsfgsdfgsfgs sdgjhskdjfgh sfg</li>
                            <li>&emsp;- adsfsdgsfgsdfgsfgs sdgjhskdjfgh sfg</li>
                        </ul>


                    </div>

                    <!--Photo-->
                    <div class="col-lg-12">
                        <div class="row gallery-item">
                            <div class="col-md-4">
                                <a href="img/elements/g1.jpg" class="img-gal"><div class="single-gallery-image" style="background: url(img/elements/g1.jpg);"></div></a>
                            </div>
                            <div class="col-md-4">
                                <a href="img/elements/g2.jpg" class="img-gal"><div class="single-gallery-image" style="background: url(img/elements/g2.jpg);"></div></a>
                            </div>
                            <div class="col-md-4">
                                <a href="img/elements/g3.jpg" class="img-gal"><div class="single-gallery-image" style="background: url(img/elements/g3.jpg);"></div></a>
                            </div>
                            <div class="col-md-6">
                                <a href="img/elements/g4.jpg" class="img-gal"><div class="single-gallery-image" style="background: url(img/elements/g4.jpg);"></div></a>
                            </div>
                            <div class="col-md-6">
                                <a href="img/elements/g5.jpg" class="img-gal"><div class="single-gallery-image" style="background: url(img/elements/g5.jpg);"></div></a>
                            </div>
                        </div>
                    </div>
                    <hr>
                    <div class="col-lg-12 col-md-12">
                        <h3 class="mt-20 mb-20">This tour has:</h3>
                        <p style="text-align: justify">
                            <span style="font-weight: bold; color: black">Ngày 1: TP.HCM - ?à L?t (?n sáng, tr?a chi?u)</span>
                        <hr style="border: none;">
                        ?ón quý khách t?i v?n phòng Saigontourist, kh?i hành ?i ?à L?t. ??n ?à L?t, tham quan thác Datanla (t? túc chi phí tham gia trò ch?i máng tr??t). Xe ??a ?oàn ??n Qu?ng tr??ng Lâm Viên v?i không gian r?ng l?n, thoáng mát h??ng ra h? Xuân H??ng cùng công trình ngh? thu?t kh?i bông hoa dã qu? và kh?i n? hoa Atiso kh?ng l? ???c thi?t k? b?ng kính màu r?t ??p m?t. Nh?n phòng và ngh? ?êm t?i ?à L?t.
                        <hr style="border: none;">
                        <img src="img/elements/g1.jpg"/>
                        <hr style="border: none;">

                        <span style="font-weight: bold; color: black">Ngày 2: TP.HCM - ?à L?t (?n sáng, tr?a chi?u)</span>
                        <hr style="border: none;">
                        ?ón quý khách t?i v?n phòng Saigontourist, kh?i hành ?i ?à L?t. ??n ?à L?t, tham quan thác Datanla (t? túc chi phí tham gia trò ch?i máng tr??t). Xe ??a ?oàn ??n Qu?ng tr??ng Lâm Viên v?i không gian r?ng l?n, thoáng mát h??ng ra h? Xuân H??ng cùng công trình ngh? thu?t kh?i bông hoa dã qu? và kh?i n? hoa Atiso kh?ng l? ???c thi?t k? b?ng kính màu r?t ??p m?t. Nh?n phòng và ngh? ?êm t?i ?à L?t.
                        <hr style="border: none;">
                        <img src="img/elements/g2.jpg"/>
                        <hr style="border: none;">

                        <span style="font-weight: bold; color: black">Ngày 3: TP.HCM - ?à L?t (?n sáng, tr?a chi?u)</span>
                        <hr style="border: none;">
                        ?ón quý khách t?i v?n phòng Saigontourist, kh?i hành ?i ?à L?t. ??n ?à L?t, tham quan thác Datanla (t? túc chi phí tham gia trò ch?i máng tr??t). Xe ??a ?oàn ??n Qu?ng tr??ng Lâm Viên v?i không gian r?ng l?n, thoáng mát h??ng ra h? Xuân H??ng cùng công trình ngh? thu?t kh?i bông hoa dã qu? và kh?i n? hoa Atiso kh?ng l? ???c thi?t k? b?ng kính màu r?t ??p m?t. Nh?n phòng và ngh? ?êm t?i ?à L?t.
                        <hr style="border: none;">
                        <img src="img/elements/g3.jpg"/>
                        <hr style="border: none;">
                        </p>
                        <p>
                            <span style="font-weight: bold; color: black">Note:</span>
                            ?i?m tham quan có th? s?p x?p l?i cho phù h?p mà v?n b?o ??m ??y ?? n?i dung c?a t?ng ch??ng trình.
                        <hr style="border: none;">
                        </p>


                    </div>


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