package tourismManagement.tourismapp.hotelbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourismManagement.tourismapp.hotelbooking.entity.Hotel;
import tourismManagement.tourismapp.hotelbooking.entity.HotelBooking;
import tourismManagement.tourismapp.hotelbooking.entity.HotelList;
import tourismManagement.tourismapp.hotelbooking.repository.HotelBookingRepository;
import tourismManagement.tourismapp.hotelbooking.repository.HotelListRepository;
import tourismManagement.tourismapp.hotelbooking.repository.HotelRepository;
import tourismManagement.tourismapp.trainbooking.entity3.TrainTicketBooking;

import java.util.List;

@Service
public class HotelServiceImple {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private HotelListRepository hotelListRepository;

    public static void saveHotelBooking(HotelBooking hotelBooking) {
    }


    public List<HotelList> findByPlace(String place){
        return hotelListRepository.findByPlace(place);
    }
    

}
