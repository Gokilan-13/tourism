package tourismManagement.tourismapp.hotelbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourismManagement.tourismapp.hotelbooking.entity.HotelBooking;
import tourismManagement.tourismapp.hotelbooking.repository.HotelBookingRepository;
import tourismManagement.tourismapp.hotelbooking.repository.HotelListRepository;

@Service
public class HotelBookingServiceimple {

    @Autowired
    private HotelBookingRepository hotelBookingRepository;

    public void saveHotelBooking(HotelBooking hotelBooking){
        hotelBookingRepository.save(hotelBooking);
    }
}
