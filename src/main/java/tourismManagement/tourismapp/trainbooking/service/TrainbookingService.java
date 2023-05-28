package tourismManagement.tourismapp.trainbooking.service;

import tourismManagement.tourismapp.trainbooking.entity.Trainlist;


public interface TrainbookingService {
    public Trainlist findTrainByStationName(String destination);
}
