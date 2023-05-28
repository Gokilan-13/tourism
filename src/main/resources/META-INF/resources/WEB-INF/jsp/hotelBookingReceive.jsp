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
                    <h4 class="card-title">Hotel Booking Ticket</h4>
                </div>
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-6">
                            <p><strong>Place Name:</strong> ${searchPlace}</p>
                            <p><strong>Hotel Name:</strong> ${bookableHotel}</p>

                        </div>
                    </div>
                </div>
            </div>
            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
        </body>
</html>