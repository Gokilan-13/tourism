package tourismManagement.tourismapp.hotelbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer hotelbookingid;
    private String bookableHotel;
    private String touristPlace;

    public HotelBooking(String bookableHotel, String touristPlace, int guest, int hotelbookablePrice) {
        this.bookableHotel = bookableHotel;
        this.touristPlace = touristPlace;
        this.guest = guest;
        this.hotelbookablePrice = hotelbookablePrice;
    }

    private int guest;
    private int hotelbookablePrice;
}
