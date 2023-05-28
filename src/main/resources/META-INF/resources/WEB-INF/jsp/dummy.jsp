<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>hotel booking page</title>
    </head>
    <body>
        <%@ include file="common/navigation.jspf" %>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>















   <form action="/flightseatchecking" method="Post">
         <select id="flightname" name="flightname" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
           <option selected>Select your flight</option>
            <c:forEach items="${flights}" var="flight">
            <option value=${flight.flightName}>${flight.flightName}</option>
            </c:forEach>
         </select>
         <button type="submit" class="btn btn-primary">Ready to book</button>
         </form>
         <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
         <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
       </div>
     </body>
 </html>










  <form action="/trainseatchecking?trainName=${trains.train}" method="post">
                  <button type="submit" id="gettraindata" class="btn btn-primary">
                    Book Now
                  </button>
                  </form>









 <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
         <script type="text/javascript">
         	$('#targetDate').datepicker({
         	    format: 'yyyy-mm-dd'
         	});
         </script>
