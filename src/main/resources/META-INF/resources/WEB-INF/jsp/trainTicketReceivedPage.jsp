<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>Train booking page</title>
    </head>
    <body>
        <%@ include file="common/navigation.jspf" %>
        <div class="container mt-5">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Train Ticket</h4>
            </div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-6">
                        <p><strong>Passenger Name:</strong> ${passengernameoftrain}</p>
                        <p><strong>From:</strong> ${trainfrom}</p>
                        <p><strong>To:</strong> ${trainto}</p>
                        <p><strong>Date:</strong> ${targetDatefortrain}</p>
                        <p><strong>Time:</strong> 10:30 AM</p>
                    </div>
                    <div class="col-md-6">
                        <p><strong>Train Name:</strong> ${trainname}</p>
                        <p><strong>Class:</strong> ${trainclass}</p>
                        <p><strong>Price:</strong> Rs.${totalTraincost}</p>
                        <p><strong>Booked Seats:</strong> ${totalTrainbookedseats}</p>
                    </div>
                </div>
            </div>
        </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>