package tourismManagement.tourismapp.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismManagement.tourismapp.flightbooking.entity.Flight_list;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight_list,Integer> {
      List<Flight_list>findByDestinationcountry(String destinationcountry);

      Flight_list findByDestinationcountryAndAirline(String destinationcountry,String airline);
}
