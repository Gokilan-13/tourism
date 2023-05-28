package tourismManagement.tourismapp.trainbooking.entity3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourismManagement.tourismapp.trainbooking.entity3.TrainTicketBooking;
import tourismManagement.tourismapp.trainbooking.entity3.rep.TrainBookingRepository;

@Service
public class TrainTicketBookingServiceImple {

    @Autowired
    private TrainBookingRepository trainBookingRepository;

    public void saveTraintikect(TrainTicketBooking trainBooking){
        trainBookingRepository.save(trainBooking);
    }
}
