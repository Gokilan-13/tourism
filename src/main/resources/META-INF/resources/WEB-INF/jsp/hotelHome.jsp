<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>hotel booking page</title>
    </head>
    <body>
        <%@ include file="common/navigation.jspf" %>
<body>
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-8">
        <div class="card">
          <div class="card-header">
            <h4 class="text-center">Hotel Booking</h4>
          </div>
          <div class="card-body">
            <form action="/hotelListing"method="post">
               <div class="form-group mb-3">
                <label for="searchPlace">Where are you looking for:</label>
                 <select class="form-control" id="searchPlace" name="searchPlace" required>
                   <option value="">  </option>
                   <%@ include file="common/famousplaces.jspf" %>
               </select>
              </div>
              <div class="form-group mb-3">
                <label for="checkindate">Check-in Date:</label>
                <input type="date" class="form-control" id="checkInDate" name="checkInDate"required>
              </div>

              <div class="form-group mb-3">
                <label for="checkOutDate">Check-out Date:</label>
                <input type="date" class="form-control" id="checkOutDate" name="checkOutDate" required>
              </div>
              <div class="form-group mb-3">
                <label for="guests">Guests:</label>
                <select class="form-control" id="guests" name="guests" required>
                  <option value="">Select Number of Guests</option>
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                  <option value="6">6</option>
                  <option value="7">7</option>
                  <option value="8">8</option>
                  <option value="5">9</option>
                  <option value="10">10</option>
                </select>
              </div>
              <div class="form-group mb-3">
                <label for="room-type">Room Type:</label>
                <select class="form-control" id="room-type" name="roomType" required>
                  <option value="">Select Room Type</option>
                  <option value="Single">Single</option>
                  <option value="Double">Double</option>
                  <option value="Suite">Suite</option>
                </select>
              </div>
              <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block">Search</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
</body>
</html>