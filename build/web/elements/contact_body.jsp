<!-- Start contact-page Area -->
<section class="contact-page-area section-gap">
    <div class="container">
        <div class="row">
            <div class="map-wrap" style="width:100%; height: 445px;">
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3918.1293692256045!2d106.64888341526067!3d10.877763660288286!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x317529e03cfee185%3A0xc4fa4835affe894b!2zMTUyIFRy4bqnbiBUaOG7iyBD4budLCBUw6JuIFRo4bubaSBBbiwgUXXhuq1uIDEyLCBI4buTIENow60gTWluaCwgVmnhu4d0IE5hbQ!5e0!3m2!1svi!2s!4v1551500212904" width="100%" height="445" frameborder="0" style="border:0" allowfullscreen></iframe>
            </div>
            <div class="col-lg-4 d-flex flex-column address-wrap">
                <div class="single-contact-address d-flex flex-row">
                    <div class="icon">
                        <span class="lnr lnr-home"></span>
                    </div>
                    <div class="contact-details">
                        <h5>District 12, Ho Chi Minh</h5>
                        <p>
                            34/4A TA32, Thoi An Ward
                        </p>
                    </div>
                </div>
                <div class="single-contact-address d-flex flex-row">
                    <div class="icon">
                        <span class="lnr lnr-phone-handset"></span>
                    </div>
                    <div class="contact-details">
                        <h5>84 38 563 8900</h5>
                        <p>Mon to Sun 9 am to 6 pm</p>
                    </div>
                </div>
                <div class="single-contact-address d-flex flex-row">
                    <div class="icon">
                        <span class="lnr lnr-envelope"></span>
                    </div>
                    <div class="contact-details">
                        <h5>support@tupt.com</h5>
                        <p>Send us your query anytime!</p>
                    </div>
                </div>														
            </div>
            <div class="col-lg-8">
                <form class="form-area contact-form text-right" id="myForm" action="SendContact" method="post">
                    <div class="row">	
                        <div class="col-lg-6 form-group">
                            <input name="fullname" placeholder="Enter your name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your name'" class="common-input mb-20 form-control" required="" type="text">

                            <input name="email" placeholder="Enter email address" pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}$" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter email address'" class="common-input mb-20 form-control" required="" type="email">

                            <input name="subject" placeholder="Enter subject" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter subject'" class="common-input mb-20 form-control" required="" type="text">
                        </div>
                        <div class="col-lg-6 form-group">
                            <textarea class="common-textarea form-control" name="message" placeholder="Enter Messege" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Messege'" required></textarea>				
                        </div>
                        <div class="col-lg-12">
                            <div class="alert-msg" style="text-align: left;"></div>
                            <!--<button class="genric-btn primary" style="float: right;">Send Message</button>-->
                            <input type="submit" class="genric-btn primary" value="Send Message"/>
                        </div>
                    </div>
                </form>	
            </div>
        </div>
    </div>	
</section>
<!-- End contact-page Area -->