<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>my home page</title>
    </head>
    <body>
     <div class="container">
        <%@ include file="common/navigation.jspf" %>
      <form action="/flightticketreceived"method="post">
        <div class="col-md-4">
          <label for="validationDefault01" class="form-label">First name</label>
          <input type="text" class="form-control" id="validationDefault01" name="fname" value="Mark" required>
        </div>
        <div class="col-md-4">
          <label for="validationDefault02" class="form-label">Last name</label>
          <input type="text" class="form-control" id="validationDefault02" name="lname" value="Otto" required>
        </div>
        <div class="col-md-4">
          <label for="validationDefault09" class="form-label">Email</label>
          <input type="email" class="form-control" id="validationDefault09" name="email"value="Otto" required>
        </div>
        <div class="col-md-6">
          <label for="validationDefault03" class="form-label">City</label>
          <input type="text" class="form-control" id="validationDefault03" name="city" required>
        </div>
        <div class="col-md-3">
          <label for="validationDefault04" class="form-label">State</label>
          <select class="form-select" id="validationDefault04" required>
            <option selected disabled value="">Choose...</option>
            <%@ include file="common/statelist.jspf" %>
          </select>
        </div>
        <div class="col-md-3">
          <label for="validationDefault05" class="form-label">Zip</label>
          <input type="text" class="form-control" id="validationDefault05" required>
        </div>
        <div class="col-12">
          <div class="form-check">
            <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
            <label class="form-check-label" for="invalidCheck2">
              Agree to terms and conditions
            </label>
          </div>
        </div>
        <div class="col-12">
          <button class="btn btn-primary" type="submit">Submit form</button>
        </div>
      </form>
        </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>