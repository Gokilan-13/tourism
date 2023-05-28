<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>hotel booking page</title>
    </head>
    <body>
        <%@ include file="common/navigation.jspf" %>
     <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-10">
          <div class="card">
           <div class="card-header">
            <h4 class="text-center">Flight Booking</h4>
           </div>
          <div class="card-body">
             <form method="post">
            <div class="form-floating mb-3">
              <select class="form-select" id="from" name="from"aria-label="Floating label select example" required>
               <option value="" disabled selected hidden>Select Country</option>
                <%@ include file="common/countrylist.jspf" %>
              </select>
              <label for="from">From</label>
            </div>
            <div class="form-floating mb-9">
               <select class="form-select" id="to" name="to" aria-label="Floating label select example" required>
               <option value="" disabled selected hidden>Select Country</option>
                <%@ include file="common/countrylist.jspf" %>
               </select>
               <label for="to">To</label>
            <div class="form-group mb-3">
             <label for="targetDate">Check Out</label>
             <input type="date" id="targetDate" name="targetDate" class="form-control" required>
             </div>

             <input type="submit" name="submit" value="Search Flights"class="btn btn-warning"/>
           </form>
        </div>
       </div>
      </div>
     </div>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>