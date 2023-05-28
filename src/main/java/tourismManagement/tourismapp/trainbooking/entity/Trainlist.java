package tourismManagement.tourismapp.trainbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainlist {
    @Id
    private String stationName;
    private String train1;
    private String train2;
    private String train3;
}
 