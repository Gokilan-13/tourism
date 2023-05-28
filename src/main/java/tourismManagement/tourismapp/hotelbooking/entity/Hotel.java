package tourismManagement.tourismapp.hotelbooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "hotels")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

        @Id
        private String place;

        private String hotel1;
        private String hotel2;
        private String hotel3;
        private String hotel4;
        private String hotel5;



}