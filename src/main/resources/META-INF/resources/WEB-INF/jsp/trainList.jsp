<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title>Train list page</title>
        <style>
           .highlight {
             color: teal;
             text-shadow: text-shadow: 0 2px 2px black;
           }
          </style>
    </head>
    <body>
       <div class="container">
        <%@ include file="common/navigation.jspf" %>
         <div class="row">
          <div class="col-md-12 mb-3">
          <h2>Available Train:</h2>
         </div>
         </div>
         <c:forEach items="${trainlist}" var="trains">
             <div class="row">
             <div class="col-md-4">
               <img src="https://th.bing.com/th/id/OIP.-b9wSwzcqn5KVf-7g5HuHQHaJ9?w=150&h=200&c=7&r=0&o=5&dpr=1.3&pid=1.7" width="60" height="60" alt="trainlogo"><p class="h3">${trains.train}</p>
             </div>
             <div class="col-md-8">
                   <p class="h4"><strong><span class="highlight">${trainfrom}   to   ${trainto}</span></strong></p>
                   <p><strong>Second_sitting:${trains.secondsitting}</strong></p>
                   <p><strong>Sleeper:${trains.sleeper}</strong></p>
                   <p><strong>First_class:Rs.${trains.first_class}</strong></p>
                   <p><strong>AC_3_tier:Rs.${trains.ac_three_tier}</strong></p>
                   <p><strong>AC_2_tier:Rs.${trains.ac_two_tier}</strong></p>
                   <p><strong>AC_first_class:Rs.${trains.ac_first_class}</strong></p>
                   <form action="/trainseatchecking?trainname=${trains.train}" method="post">
                   <button type="submit" id="gettraindata" class="btn btn-primary">
                     Book Now
                   </button>
                   </form>
             </div>
             </div>
             <hr>
         </c:forEach>

        </div>
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>