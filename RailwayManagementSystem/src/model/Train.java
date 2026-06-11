package model;

public class Train {

    private int trainId;
    private String trainName;
    private String source;
    private String destination;
    private int availableSeats;

    public Train(int trainId,
                 String trainName,
                 String source,
                 String destination,
                 int availableSeats) {

        this.trainId = trainId;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public int getTrainId() {
        return trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return trainId + " | " + trainName + " | " + source + " -> " + destination + " | Seats: " + availableSeats;
    }
}