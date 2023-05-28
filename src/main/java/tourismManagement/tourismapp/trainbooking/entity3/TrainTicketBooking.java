package tourismManagement.tourismapp.trainbooking.entity3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainTicketBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer trainbookingid;
    private String name;
    private String trainname;
    private String departure;
    private String destination;
    private String ticketclass;
    private Integer totalTrainBookingSeats;
    private java.util.Date tripdate;
    private  int price;

    public TrainTicketBooking(String name,String trainname ,String departure, String destination, String ticketclass, Integer totalTrainBookingSeats, Date tripdate, int price) {
        this.name = name;
        this.trainname=trainname;
        this.departure = departure;
        this.destination = destination;
        this.ticketclass = ticketclass;
        this.totalTrainBookingSeats = totalTrainBookingSeats;
        this.tripdate = tripdate;
        this.price = price;
    }
}
