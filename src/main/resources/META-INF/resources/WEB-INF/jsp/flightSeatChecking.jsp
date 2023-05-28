<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>Flight list page</title>
    </head>
    <body>
     <div class="container">
        <%@ include file="common/navigation.jspf" %>
        <form action="/flightpayment" method="post">
         <div class="form-floating mb-3">
           <input type="number" class="form-control" id="childcount" name="childcount" min="0" max="50" required>
           <label for="childcount">How many children</label>
        </div>
        <div class="form-floating mb-3">
             <input type="number" class="form-control" id="adultcount" name="adultcount" min="1" max="50" required>
             <label for="adultcount">How many Adults</label>
        </div>
        <div class="form-floating mb-3">
           <input type="number" class="form-control" id="infantcount" name="infantcount" min="0" max="5" required>
           <label for="infantcount">How many Infants</label>
         </div>
        <button type="submit" class="btn btn-primary">Check seats</button>
      </form>
     </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>