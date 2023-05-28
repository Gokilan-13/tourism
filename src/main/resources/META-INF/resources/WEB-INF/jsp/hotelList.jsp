<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>hotel booking page</title>
    </head>
    <body>
        <%@ include file="common/navigation.jspf" %>
        <div class="container">
          <div class="row">
            <div class="col-md-12 mb-3">
              <h3>Available Hotels:</h3>
            </div>
          </div>
          <c:forEach items="${bookableHotelList}" var="place">
          <div class="row">
            <div class="col-md-4">
             <img src="${place.image_url}" alt="Hotel Image" width="352"height="234">
            </div>
            <div class="col-md-8">
              <h4>${place.hotel}</h4>
              <form action="/hotelPaymentPage?hotelName=${place.hotel}&hotelPrice=${place.price}" method="post">
              <p><strong>Price:${place.price}</strong></p>
             <button type="submit" id="getdata" class="btn btn-primary">
                Book Now
             </button>
             </form>
            </div>
          </div>
          <hr>
          </c:forEach>

        </div>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
        <script>
         $(document).ready(function(){
             $('#getdata').on('click',function(){
                 var start=${place.hotel}.val();
                 $.ajax({
                     type:'post',
                     url:'/hotelPaymentPage?hotelName=start',
                     data:{
                       hotelName:start
                     },
                     success:function(){
                     console.log("success");
                     }
                 });
             });
         });
        </script>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>

    </body>
</html>