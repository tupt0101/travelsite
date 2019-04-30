
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- Start destinations Area -->
<section class="destinations-area section-gap">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="widget-wrap">
                    <div class="single-sidebar-widget search-widget">
                        <form class="search-form" action="SearchTour" method="POST">
                            <input placeholder="Search Posts" name="search" type="text" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Search tours'" >
                            <button type="submit"><i class="fa fa-search"></i></button>
                        </form>
                    </div>
                </div>
            </div>
            
            <s:if test="%{requestScope.INFO != null}">
                
            </s:if>
            
            <div class="col-lg-4">
                <div class="single-destinations">
                    <div class="thumb">
                        <img src="img/hotels/d1.jpg" alt="">
                    </div>
                    <div class="details">
                        <h3 class="d-flex justify-content-between">
                            <span class="font-weight-bold text-uppercase">Ha Noi - Lao Cai - Sapa</span>                              							
                        </h3>
                        <ul class="package-list">
                            <li class="d-flex justify-content-between align-items-center">
                                <span class="text-uppercase">Da Nang - Sapa</span>										
                            </li>
                            <li class="d-flex justify-content-between align-items-center">
                                <span>Time : </span>
                                <span>3 days 2 nights</span>
                            </li>
                            <li class="d-flex justify-content-between align-items-center">
                                <span>Departure day:</span>
                                <span>07/03/2019</span>
                            </li>
                            <li class="d-flex justify-content-between align-items-center">
                                <span>Transportation : </span>
                                <span>Vietnam Air Line</span>
                            </li>											
                            <li class="d-flex justify-content-between align-items-center">
                                <span>Price from</span>
                                <a href="tour.jsp" class="price-btn">4.850.000</a>
                            </li>													
                        </ul>
                    </div>
                </div>
            </div>


        </div>
    </div>	
</section>
<!-- End destinations Area -->