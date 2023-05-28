package tourismManagement.tourismapp.trainbooking.entity2.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismManagement.tourismapp.trainbooking.entity2.TrainFares;

import java.util.List;

@Repository
public interface RepositoryForTrainEntity2 extends JpaRepository<TrainFares,Integer> {
    TrainFares findByStationAndTrain(String station,String train);

    List<TrainFares> findByStation(String station);
}
