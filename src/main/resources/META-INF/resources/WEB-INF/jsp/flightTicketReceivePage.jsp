<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>my home page</title>
    </head>
    <body>
        <div class="container mt-5">
        <%@ include file="common/navigation.jspf" %>
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Flight Ticket</h4>
            </div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-6">
                        <p><strong>Passenger Name:</strong> ${passengername}</p>
                        <p><strong>From:</strong> ${from}</p>
                        <p><strong>To:</strong> ${to}</p>
                        <p><strong>Date:</strong> ${targetDate}</p>
                    </div>
                    <div class="col-md-6">
                        <p><strong>Airline:</strong> ${flightname}</p>
                        <p><strong>Flight:</strong> BA123</p>
                        <p><strong>Class:</strong> Economy</p>
                        <p><strong>Price:</strong> Rs.${totalcost}</p>
                        <p><strong>Booked Seats: </strong>${totalbookedseats}</p>
                    </div>
                </div>
            </div>
        </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>