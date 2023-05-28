<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>hotel booking payment page</title>
    </head>
    <body>
           <div class ="container">
             <%@ include file="common/navigation.jspf" %>
             <p class="h1 mb-3">Your payment is Rs.${bookableHotelPrice}</p>
             <p class="h1">Credit/Debit Card Details</p>
             <img src="https://www.web2ink.com/wp-content/uploads/2019/04/payment-logos.png" width="500" alt=".">
            <div class="container">
            <form action="/hotelBookingConfirm" method="post">
            <div class="form-floating mb-3">
              <input type="number" class="form-control" id="floatingInput" name="floatingInput" required>
              <label for="floatingInput">Card Number</label>
            </div>
            <div class="form-floating mb-3" data-date-format="mm/yyyy">
                 <input type="text" class="form-control" id="floatingexpiry" placeholder="11/23" required>
                 <label for="floatingexpiry">Expiry Date</label>
                </div>
            <div class="form-floating mb-3">
                 <input type="number" class="form-control" id="floatingcvv" name="floatingcvv"placeholder="228" required>
                 <label for="floatingcvv">Cvv</label>
                </div>
            <div class="form-floating mb-3">
             <input type="text" class="form-control" id="floatingName" name="floatingName" placeholder="XXXXXXX X" required>
             <label for="floatingName">Card Holder Name</label>
            </div>

            <script>
              $('#floatingexpiry'){
                format: 'mm/yyyy'
              };
            </script>
            <input type="submit" class="btn btn-success" value="Tap to Pay">
            </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>