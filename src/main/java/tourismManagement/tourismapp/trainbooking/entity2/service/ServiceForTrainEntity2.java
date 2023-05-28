package tourismManagement.tourismapp.trainbooking.entity2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourismManagement.tourismapp.trainbooking.entity2.TrainFares;
import tourismManagement.tourismapp.trainbooking.entity2.rep.RepositoryForTrainEntity2;

import java.util.List;

@Service
public class ServiceForTrainEntity2 {

    @Autowired
    private RepositoryForTrainEntity2 repositoryForTrainEntity2;

    public TrainFares findByStationAndTrain(String station_name,String train_name) throws InstantiationException, IllegalAccessException {
        TrainFares train= repositoryForTrainEntity2.findByStationAndTrain(station_name,train_name);
        return train;
    }

    public List<TrainFares> findByStation(String station_name){
        List<TrainFares> trainlist=repositoryForTrainEntity2.findByStation(station_name);
        return trainlist;
    }
}
