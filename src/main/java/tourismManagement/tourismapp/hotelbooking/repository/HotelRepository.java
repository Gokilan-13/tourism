package tourismManagement.tourismapp.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismManagement.tourismapp.hotelbooking.entity.Hotel;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {
    Hotel findByPlace(String place);
}
