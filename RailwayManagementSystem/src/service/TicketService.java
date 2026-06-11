package service;

import model.Ticket;
import model.Train;

import java.util.ArrayList;

public class TicketService {

    private ArrayList<Ticket> tickets = new ArrayList<>();
    private int ticketCounter = 5001;

    public void bookTicket(int userId, Train train) {

        if(train.getAvailableSeats() <= 0) {
            System.out.println("No Seats Available");
            return;
        }

        Ticket ticket = new Ticket(ticketCounter++, userId, train.getTrainId(), "CONFIRMED");
        tickets.add(ticket);

        train.setAvailableSeats(train.getAvailableSeats() - 1);

        System.out.println("Ticket Booked Successfully");

        System.out.println(ticket);
    }

    public void viewTickets(
            int userId) {

        for(Ticket ticket : tickets) {

            if(ticket.getUserId() == userId) {
                System.out.println(ticket);
            }
        }
    }
}