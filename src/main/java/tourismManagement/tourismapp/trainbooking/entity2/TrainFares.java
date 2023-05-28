package tourismManagement.tourismapp.trainbooking.entity2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(name = "TrainFares.findByStationAndTrain",
        query = "SELECT t FROM TrainFares t WHERE t.station = :station AND t.train = :train")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainFares {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer train_id;
    private String station;
    private String train;
    private Integer Secondsitting;
    private Integer Sleeper;
    private Integer First_class;
    private Integer Ac_three_tier;
    private Integer Ac_two_tier;
    private Integer Ac_first_class;





}
