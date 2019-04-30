<!-- Start post-content Area -->
<section class="post-content-area single-post-area">
    <div class="container">
        <% 
            String error = (String) request.getAttribute("ERROR");
        %>
        <div class="row">
            <h2 style="color: red"><%= error %></h2>
        </div>
    </div>	
</section>
<!-- End post-content Area -->

