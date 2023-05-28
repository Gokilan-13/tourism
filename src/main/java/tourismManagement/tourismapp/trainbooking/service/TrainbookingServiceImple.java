package tourismManagement.tourismapp.trainbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourismManagement.tourismapp.trainbooking.entity.Trainlist;
import tourismManagement.tourismapp.trainbooking.repository.TrainbookingRepository;

@Service
public class TrainbookingServiceImple implements TrainbookingService{

    @Autowired private TrainbookingRepository trainbookingRepository;

    @Override
    public Trainlist findTrainByStationName(String destination) {
        return trainbookingRepository.findById(destination).get();
    }
}
