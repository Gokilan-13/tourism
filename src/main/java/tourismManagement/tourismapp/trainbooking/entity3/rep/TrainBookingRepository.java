package tourismManagement.tourismapp.trainbooking.entity3.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismManagement.tourismapp.trainbooking.entity3.TrainTicketBooking;

@Repository
public interface TrainBookingRepository extends JpaRepository<TrainTicketBooking,Integer> {

}
