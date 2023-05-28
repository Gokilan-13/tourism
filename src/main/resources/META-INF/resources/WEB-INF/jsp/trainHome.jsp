<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>train booking page</title>
       <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
           <title>flight booking page</title>
    </head>
    <body>
         <div class="container">
           <%@ include file="common/navigation.jspf" %>
           <div class="row justify-content-center">
            <div class="col-md-10">
             <div class="card">
           <div class="card-header">
           <h4 class="text-center">Train Booking</h4>
           </div>
           <div class="card-body">
               <form action="/trainchecking" method="post">
                <div class="form-floating mb-3">
                 <select class="form-select" id="trainfrom" name="trainfrom"aria-label="Floating label select example" required>
                   <option value="" disabled selected hidden>Select Railway Station</option>
                   <%@ include file="common/railwaystationlist.jspf" %>
                 </select>
                 <label for="trainfrom">From</label>
               </div>
                <div class="form-floating mb-3">
                  <select class="form-select" id="trainto" name="trainto" aria-label="Floating label select example" required>
                    <option value="" disabled selected hidden>Select Railway Station</option>
                   <%@ include file="common/railwaystationlist.jspf" %>
                  </select>
                  <label for="trainto">To</label>
                </div>
                 <div class="form-floating mb-3">
                  <select class="form-select" id="trainclass" name="trainclass" aria-label="Floating label select example">
                    <option selected>Select Class</option>
                    <option value="Second_sitting">Second sitting(2S)</option>
                    <option value="Sleeper">Sleeper(SL)</option>
                    <option value="First_class">First Class(FC)</option>
                    <option value="AC_3_tier">AC 3 tier(3A)</option>
                    <option value="AC_2_tier">AC 2 tier(2A)</option>
                    <option value="AC_first_class">AC First Class(3A)</option>
                  </select>
                  <label for="trainclass">Class</label>
                </div>
                <div class="mb-3">
                <label for="targetDatefortrain">Check Out</label>
                <input type="date" id="targetDatefortrain" name="targetDatefortrain" class="form-control" required>
                </div>
                <input type="submit" name="submit" value="Search Train"class="btn btn-warning"/>
           </form>
           </div>
         </div>
       </div>
      </div>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    </body>
</html>