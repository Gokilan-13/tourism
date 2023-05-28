package tourismManagement.tourismapp.flightbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(name = "Flight_list.findByDestinationcountryAndAirline",
        query = "SELECT t FROM Flight_list t WHERE t.destinationcountry = :destinationcountry AND t.airline = :airline")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight_list {
    @Id
    private Integer id;
    private String destinationcountry;
    private String airline;
    private Integer seatcapacity;
    private Long price;

}
