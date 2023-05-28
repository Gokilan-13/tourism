package tourismManagement.tourismapp.trainbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import tourismManagement.tourismapp.trainbooking.entity2.TrainFares;
import tourismManagement.tourismapp.trainbooking.entity2.service.ServiceForTrainEntity2;
import tourismManagement.tourismapp.trainbooking.entity.Trainlist;
import tourismManagement.tourismapp.trainbooking.entity3.TrainTicketBooking;
import tourismManagement.tourismapp.trainbooking.entity3.service.TrainTicketBookingServiceImple;
import tourismManagement.tourismapp.trainbooking.service.TrainbookingService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@SessionAttributes({"trainfrom","trainto","targetDatefortrain","trainclass","trainname","traincost","trainlist","totalTrainbookedseats","totalTraincost","passengernameoftrain"})
public class TrainController {

     @Autowired
     private TrainbookingService trainbookingService;

    @Autowired
    private ServiceForTrainEntity2 serviceForTrainEntity2;

    @Autowired
    private TrainTicketBookingServiceImple trainTicketBookingServiceImple;

        @GetMapping("/train")
        public String showFlightHomepage() {
            return "trainHome";
        }

        @PostMapping("/trainchecking")
        public String showFlightlistpage(@RequestParam("trainfrom") String trainfrom, @RequestParam("trainto") String trainto, @RequestParam("targetDatefortrain")String traindate,@RequestParam("trainclass")String trainclass, ModelMap model){
            model.addAttribute("trainfrom",trainfrom);
            model.addAttribute("trainto",trainto);
            model.addAttribute("targetDatefortrain",traindate);
            model.addAttribute("trainclass",trainclass);
            List<TrainFares>trainlist=serviceForTrainEntity2.findByStation(trainto);
            System.out.println(trainlist);
            model.addAttribute("trainlist",trainlist);
            return "trainList";
        }
        @PostMapping("/trainseatchecking")
        public String checkseatsForPassenger(@RequestParam("trainname") String trainname,ModelMap model) throws InstantiationException, IllegalAccessException {
            model.addAttribute("trainname",trainname);
            String  trainclass= (String)model.getAttribute("trainclass");
            String station=(String) model.getAttribute("trainto");
            TrainFares trainFares=serviceForTrainEntity2.findByStationAndTrain(station,trainname);
            Trainclassenum trainclassenum = Trainclassenum.valueOf(trainclass.toUpperCase());
            int cost=0;

            switch (trainclassenum) {

                case SECOND_SITTING:
                    cost=trainFares.getSecondsitting();
                    break;
                case SLEEPER:
                    cost=trainFares.getSleeper();
                    break;
                case FIRST_CLASS:
                   cost=trainFares.getFirst_class();
                    break;
                case AC_3_TIER:
                    cost=trainFares.getAc_three_tier();
                    break;
                case AC_2_TIER:
                    cost=trainFares.getAc_two_tier();
                    break;
                case AC_FIRST_CLASS:
                    cost=trainFares.getAc_first_class();
            }
            model.addAttribute("traincost",cost);



            return "trainSeatChecking";
        }

        @PostMapping("/trainpayment")
        public String showpayment(@RequestParam("childcount") int childcount,@RequestParam("adultcount") int adultcount,@RequestParam("seniormencount") int seniormencount,@RequestParam("seniorwomencount") int seniorwomencount,ModelMap model) throws InstantiationException, IllegalAccessException {
            int totalbookedSeats=childcount+adultcount+seniormencount+seniorwomencount;
            model.addAttribute("totalTrainbookedseats",totalbookedSeats);
            String trainname=(String) model.getAttribute("trainname");
            String station=(String) model.getAttribute("trainto");
            TrainFares trainFares=serviceForTrainEntity2.findByStationAndTrain(station,trainname);
            int cost=(int)model.getAttribute("traincost");
            int totalTraincost=cost*totalbookedSeats;
            model.addAttribute("totalTraincost",totalTraincost);

            return "trainpaymentpage";
        }
        @PostMapping("/trainticketconfirm")
        public String getUserDetailsPage(@RequestParam("floatingInput")int cardnum,@RequestParam("floatingcvv")int cvv,@RequestParam("floatingName")String cardholder) {
            return "trainBookingUserdetails";
        }
        @PostMapping("/trainticketrecieved")
        public String showFlightticket(@RequestParam("fname")String fname,@RequestParam("lname")String lname,@RequestParam("email")String email,@RequestParam("city")String city,ModelMap model) throws ParseException {
            int price = (int) model.getAttribute("totalTraincost");
            int trainbookedseats = (int) model.getAttribute("totalTrainbookedseats");
            String departure=(String)model.getAttribute("trainfrom");
            String destination=(String) model.getAttribute("trainto");
            String trainclass=(String) model.getAttribute("trainclass");
            String trainname =(String) model.getAttribute("trainname");
            String dateString = (String)model.getAttribute("targetDatefortrain");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(dateString);
            String name=fname+lname;
            model.addAttribute("passengernameoftrain",name);
            TrainTicketBooking trainBooking=new TrainTicketBooking(name,trainname,departure,destination,trainclass,trainbookedseats,date,price);
            trainTicketBookingServiceImple.saveTraintikect(trainBooking);
          return "trainTicketReceivedPage";
        }
}
