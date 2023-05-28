package tourismManagement.tourismapp.hotelbooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelList {
    @Id
    private Integer id;
    private String place;
    private String hotel;
    private String image_url;
    private Integer price;
}
