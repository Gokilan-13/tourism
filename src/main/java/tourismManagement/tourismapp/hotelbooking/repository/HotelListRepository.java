package tourismManagement.tourismapp.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourismManagement.tourismapp.hotelbooking.entity.HotelList;

import java.util.List;

public interface HotelListRepository extends JpaRepository<HotelList,Integer> {
    List<HotelList>findByPlace(String place);
}
