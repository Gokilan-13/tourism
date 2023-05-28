package tourismManagement.tourismapp.validationpurpose.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValEntity {
    @Id
    private Date tripdate;
    private int seatsfilled;
    private String flightname;
}
