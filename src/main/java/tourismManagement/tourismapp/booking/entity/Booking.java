package tourismManagement.tourismapp.booking.entity;

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
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookingId;
    private String name;
    private String departure;
    private String destination;
    private java.util.Date tripdate;
    private  int price;

    public Booking(String name, String departure, String destination,Date tripdate, int price) {
        this.name = name;
        this.departure = departure;
        this.destination = destination;
        this.tripdate = tripdate;
        this.price = price;
    }
}
