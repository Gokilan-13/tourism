package tourismManagement.tourismapp.hotelbooking;

import jakarta.servlet.RequestDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import tourismManagement.tourismapp.booking.entity.Booking;
import tourismManagement.tourismapp.hotelbooking.entity.Hotel;
import tourismManagement.tourismapp.hotelbooking.entity.HotelBooking;
import tourismManagement.tourismapp.hotelbooking.entity.HotelList;
import tourismManagement.tourismapp.hotelbooking.repository.HotelRepository;
import tourismManagement.tourismapp.hotelbooking.service.HotelBookingServiceimple;
import tourismManagement.tourismapp.hotelbooking.service.HotelServiceImple;
import tourismManagement.tourismapp.trainbooking.entity3.TrainTicketBooking;
import tourismManagement.tourismapp.validationpurpose.entity.ValEntity;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Controller
@SessionAttributes({"searchPlace","checkInDate","checkOutDate","guests","roomType","bookableHotelList","bookableHotel","bookableHotelPrice","hotelbookername"})
public class HotelController {

        private HotelBookingServiceimple hotelBookingServiceimple;

        @Autowired
        private HotelServiceImple hotelServiceImple;

        @GetMapping("/hotel")
        public String index() {
            return "hotelHome";
        }

        @PostMapping("/hotelListing")
        public String searchHotels(@RequestParam("searchPlace") String searchPlace,

                                   @RequestParam("checkInDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date checkInDate,
                                   @RequestParam("checkOutDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date checkOutDate ,
                                   @RequestParam("guests") String guests,
                                   @RequestParam("roomType") String roomType,ModelMap model ) throws ParseException {
                SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                String outputDateStr = outputDateFormat.format(checkInDate);
                System.out.println(outputDateStr);

                model.addAttribute("searchPlace",searchPlace);
                model.addAttribute("checkInDate",outputDateStr);
                model.addAttribute("checkOutDate",checkOutDate);
                model.addAttribute("guests",guests);
                model.addAttribute("roomType",roomType);

                List<HotelList> bookableHotel=hotelServiceImple.findByPlace(searchPlace);
                model.addAttribute("bookableHotelList",bookableHotel);

                return "forward:/WEB-INF/jsp/hotelList.jsp";
        }
        @PostMapping("/hotelPaymentPage")
        public String paymentPage(@RequestParam("hotelName") String hotel,@RequestParam("hotelPrice") String hotelPrice,ModelMap model)
        {
            model.addAttribute("bookableHotel",hotel);
            int BookableHotelPrice=Integer.parseInt(hotelPrice);
            String guest=(String)model.getAttribute("guests");
            int guests=Integer.parseInt(guest);
            int totalHotelCost=BookableHotelPrice*guests;
            model.addAttribute("bookableHotelPrice",totalHotelCost);
            return "hotelPaymentPage";
        }
    @PostMapping("/hotelBookingConfirm")
    public String getUserDetailsPage(@RequestParam("floatingInput")int cardnum,@RequestParam("floatingcvv")int cvv,@RequestParam("floatingName")String cardholder) {
        return "hotelBookingConfirm";
    }

    @PostMapping("/hotelBookingReceive")
    public String showFlightticket(@RequestParam("fname")String fname,@RequestParam("lname")String lname,@RequestParam("email")String email,@RequestParam("city")String city,ModelMap model) throws ParseException {
        int price =  Integer.parseInt((String) model.getAttribute("bookableHotelPrice"));
        int guest = Integer.parseInt((String)model.getAttribute("guests"));
        int hotelbookablePrice= Integer.parseInt((String) model.getAttribute("bookableHotelPrice"));
        String bookableHotel=(String) model.getAttribute("bookableHotel");
        String touristPlace=(String) model.getAttribute("searchPlace");
       // String checkinDate = (String)model.getAttribute("checkInDate");
       // String checkoutDate = (String)model.getAttribute("checkOutDate");
        String name=fname+lname;
        model.addAttribute("hotelbookername",name);
        HotelBooking hotelBooking=new HotelBooking(bookableHotel,touristPlace,guest,hotelbookablePrice);
        hotelBookingServiceimple.saveHotelBooking(hotelBooking);

        return "hotelBookingReceive";
    }


}
