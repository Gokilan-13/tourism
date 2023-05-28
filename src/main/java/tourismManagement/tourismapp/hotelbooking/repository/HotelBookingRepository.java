package tourismManagement.tourismapp.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismManagement.tourismapp.hotelbooking.entity.HotelBooking;

@Repository
public interface HotelBookingRepository extends JpaRepository<HotelBooking,Integer> {

}
