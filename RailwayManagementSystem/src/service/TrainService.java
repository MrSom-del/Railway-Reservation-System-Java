package service;

import model.Train;
import java.util.ArrayList;

public class TrainService {

    private ArrayList<Train> trains = new ArrayList<>();

    public TrainService() {

        trains.add(new Train(101, "Shatabdi", "Delhi", "Amritsar", 50));

        trains.add(new Train(102, "Rajdhani", "Delhi", "Mumbai", 40));

        trains.add(new Train(103, "Duronto", "Kolkata", "Delhi", 60));
    }

    public void displayTrains() {

        for(Train train : trains) {
            System.out.println(train);
        }
    }

    public Train searchTrain(int trainId) {

        for(Train train : trains) {

            if(train.getTrainId() == trainId) {
                return train;
            }
        }

        return null;
    }
}