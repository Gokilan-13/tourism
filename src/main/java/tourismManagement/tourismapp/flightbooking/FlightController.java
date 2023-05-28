package tourismManagement.tourismapp.flightbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import tourismManagement.tourismapp.booking.entity.Booking;
import tourismManagement.tourismapp.booking.service.BookingServiceImple;
import tourismManagement.tourismapp.flightbooking.entity.Flight_list;
import tourismManagement.tourismapp.flightbooking.service.FlightServiceImplementation;
import tourismManagement.tourismapp.validationpurpose.entity.ValEntity;
import tourismManagement.tourismapp.validationpurpose.service.ValServiceImple;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes({"from","to","targetDate","flights","flightname","totalcost","totalbookedseats","passengername"})
public class FlightController {

    @Autowired
    FlightServiceImplementation flightServiceImplementation;

    @Autowired
    ValServiceImple valServiceImple;
    @Autowired
    BookingServiceImple bookingServiceImple;




    @GetMapping("/flight")
    public String showFlightHomepage(){
        return "flightHome";
    }

    @PostMapping("/flight")
    public String showFlightListPage(@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("targetDate") String targetDate, ModelMap model){
        model.addAttribute("from",from);
        model.addAttribute("to",to);
        model.addAttribute("targetDate",targetDate);
        List<Flight_list>flightdetails=flightServiceImplementation.findByDestination(to);
        model.addAttribute("flights",flightdetails);
        return "flightList";
    }
    @PostMapping("/flightseatchecking")
    public String showFlightBookingPage(@RequestParam("flightname") String flight, ModelMap model){
        model.addAttribute("flightname",flight);
        return "flightSeatChecking";
    }

    @PostMapping("/flightpayment")
    public String showPaymentpage(@RequestParam("adultcount")int adultcount,@RequestParam("childcount")int childcount,@RequestParam("infantcount")int infantcount,ModelMap model) throws ParseException {
        int totalBookedSeats=adultcount+childcount+infantcount;
        model.addAttribute("totalbookedseats",totalBookedSeats);
        String bookableFlight= (String) model.getAttribute("flightname");
        String destination= (String) model.getAttribute("to");

        String tripdate = (String)model.getAttribute("targetDate");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(tripdate);
        Flight_list bookflight = flightServiceImplementation.getFlightByDestinationcountryAndAirline(destination,bookableFlight);
        int availableSeat=bookflight.getSeatcapacity();
        try {
            ValEntity valEntity = valServiceImple.getValEntityById(date);
            int bookedseats = valEntity.getSeatsfilled();
             availableSeat = bookflight.getSeatcapacity() - bookedseats;
            if (availableSeat >= totalBookedSeats) {
                int cost = (int) (totalBookedSeats * bookflight.getPrice());
                model.addAttribute("totalcost", cost);
            } else {
                return "unavailableseats";
            }
            return "flightpaymentpage";
        }catch (Exception e) {
            System.out.println("An exception occurred: ");
        }
        if(availableSeat==bookflight.getSeatcapacity()) {
            int cost = (int) (totalBookedSeats * bookflight.getPrice());
            model.addAttribute("totalcost", cost);
        }
        return "flightpaymentpage";
    }
    @PostMapping("/flightticketconfirm")
    public String getUserDetailsPage(@RequestParam("floatingInput")int cardnum,@RequestParam("floatingcvv")int cvv,@RequestParam("floatingName")String cardholder){
        return "flightBookingUserdetails";
    }
    @PostMapping("/flightticketreceived")
    public String showFlightticket(@RequestParam("fname")String fname,@RequestParam("lname")String lname,@RequestParam("email")String email,@RequestParam("city")String city,ModelMap model) throws ParseException {
        int price = (int) model.getAttribute("totalcost");
        String departure=(String)model.getAttribute("from");
        String destination=(String) model.getAttribute("to");
        String dateString = (String)model.getAttribute("targetDate");
        String tripdate = dateString;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(tripdate);
        String name=fname+lname;
        model.addAttribute("passengername",name);
        Booking currentbooking=new Booking(name,departure,destination,date,price);
        String flightName=(String)model.getAttribute("flightname");
        int totalBookedSeats=(int)model.getAttribute("totalbookedseats");
        ++totalBookedSeats;
        ValEntity validation=new ValEntity(date, totalBookedSeats, flightName);
        valServiceImple.saveValEntity(validation);
        bookingServiceImple.saveBookingdetails(currentbooking);
        return "flightTicketReceivePage";
    }

}
