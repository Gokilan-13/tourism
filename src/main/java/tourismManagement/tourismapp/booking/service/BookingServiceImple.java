package tourismManagement.tourismapp.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourismManagement.tourismapp.booking.entity.Booking;
import tourismManagement.tourismapp.booking.repository.BookingRepository;

@Service
public class BookingServiceImple {
    @Autowired
    private BookingRepository bookingRepository;

    public void saveBookingdetails(Booking booking){
        bookingRepository.save(booking);
    }
}
