package model;

public class Ticket {

    private int ticketId;
    private int userId;
    private int trainId;
    private String status;

    public Ticket(int ticketId, int userId, int trainId, String status) {

        this.ticketId = ticketId;
        this.userId = userId;
        this.trainId = trainId;
        this.status = status;
    }

    public int getTicketId() {
        return ticketId;
    }

    public int getUserId() {
        return userId;
    }

    public int getTrainId() {
        return trainId;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {

        return "Ticket ID: " +
                ticketId +
                " User: " +
                userId +
                " Train: " +
                trainId +
                " Status: " +
                status;
    }
}