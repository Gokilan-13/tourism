<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>Flight list page</title>
        <style>
              .highlight {
                color: teal;
                text-shadow: text-shadow: 0 2px 2px black;
              }
         </style>
    </head>
    <body>
       <div class="container">
        <%@ include file="common/navigation.jspf" %>
         <div class="row">
          <div class="col-md-12 mb-3">
          <h2>Available Flights:</h2>
        </div>
        </div>

          <c:forEach items="${flights}" var="flight">
          <div class="row">
           <div class="col-md-4">
           <img src="https://static.vecteezy.com/system/resources/previews/000/620/311/original/aircraft-airplane-airline-logo-label-journey-air-travel-airliner-symbol-vector-illustration.jpg" width="60" height="60" alt="flightlogo"><p class="h3"> ${flight.airline}</p>
           </div>
           <div class="col-md-8">
               <p class="h4"><strong><span class="highlight">${from} to ${to}</span></strong></p>
               <p><strong>Price:${flight.price}</strong></p>

               <form action="/flightseatchecking?flightname=${flight.airline}" method="post">
               <button type="submit" id="getflightdata" class="btn btn-primary">
                   Book Now
               </button>
               </form>
            </div>
            </div>
            <hr>
          </c:forEach>
        </div>
        </div>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>

    </body>
</html>
















