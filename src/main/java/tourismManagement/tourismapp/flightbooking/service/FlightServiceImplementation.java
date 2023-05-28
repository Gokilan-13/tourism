package tourismManagement.tourismapp.flightbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourismManagement.tourismapp.flightbooking.entity.Flight_list;
import tourismManagement.tourismapp.flightbooking.repository.FlightRepository;

import java.util.List;

@Service
public class FlightServiceImplementation {
    @Autowired
    FlightRepository flightRepository;

    public int getCapacitySeats(String destinationcountry,String airline){
        Flight_list temp =flightRepository.findByDestinationcountryAndAirline(destinationcountry, airline);
        int seatCapacity=temp.getSeatcapacity();
        return seatCapacity;
    }

    public List<Flight_list> findByDestination(String destinationcountry) {
       List<Flight_list>flightdetails= flightRepository.findByDestinationcountry(destinationcountry);
       return flightdetails;
    }

    public  Flight_list getFlightByDestinationcountryAndAirline(String destinationcountry,String airline){
        return flightRepository.findByDestinationcountryAndAirline(destinationcountry,airline);
    }
}
