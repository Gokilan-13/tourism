package tourismManagement.tourismapp.trainbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tourismManagement.tourismapp.trainbooking.entity.Trainlist;

public interface TrainbookingRepository extends JpaRepository<Trainlist,String> {
}
