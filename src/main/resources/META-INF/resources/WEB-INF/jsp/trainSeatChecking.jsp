<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>Train seat checking page</title>
    </head>
    <body>
     <div class="container">
        <%@ include file="common/navigation.jspf" %>
        <form action="/trainpayment" method="post">
         <div class="form-floating mb-3">
           <input type="number" class="form-control" id="childcount" name="childcount" min="0" max="50" required>
           <label for="childcount">How many children</label>
        </div>
        <div class="form-floating mb-3">
             <input type="number" class="form-control" id="adultcount" name="adultcount" min="1" max="50" required>
             <label for="adultcount">How many Adults</label>
        </div>
        <div class="form-floating mb-3">
           <input type="number" class="form-control" id="seniormencount" name="seniormencount" min="0" max="5" required>
           <label for="infantcount">How many SeniorMen</label>
         </div>
        <div class="form-floating mb-3">
            <input type="number" class="form-control" id="seniorwomencount" name="seniorwomencount" min="1" max="50" required>
            <label for="adultcount">How many SeniorWomen</label>
        </div>
        <button type="submit" class="btn btn-primary">Check seats</button>
      </form>
     </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>