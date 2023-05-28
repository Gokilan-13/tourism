package tourismManagement.tourismapp.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismManagement.tourismapp.booking.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {
}
