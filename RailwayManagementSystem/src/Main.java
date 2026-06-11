import java.util.*;

import model.Train;
import service.TicketService;
import service.TrainService;
import service.UserService;
import model.User;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        TrainService trainService = new TrainService();
        TicketService ticketService = new TicketService();

        User currentUser = null;

        while(true) {

            System.out.println("\n===== Railway Reservation System =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Trains");
            System.out.println("4. Search Train");
            System.out.println("5. Book Ticket");
            System.out.println("6. My Tickets");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();
                    userService.registerUser(name, email, password);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter Email: ");
                    email = sc.nextLine();
                    System.out.print("Enter Password: ");
                    password = sc.nextLine();
                    User loggedInUser = userService.loginUser(email, password);
                    if(loggedInUser != null) {
                        currentUser = loggedInUser;
                        System.out.println("Welcome " + loggedInUser.getName());
                    } else {
                        System.out.println("Invalid Credentials");
                    }
                    break;

                case 3:
                    trainService.displayTrains();
                    break;

                case 4:
                    System.out.print("Enter Train ID: ");
                    int trainId = sc.nextInt();
                    Train train = trainService.searchTrain(trainId);
                    if(train != null) {
                        System.out.println(train);
                    } else {
                        System.out.println("Train Not Found");
                    }
                    break;

                case 5:
                    if(currentUser == null) {
                        System.out.println("Please Login First");
                        break;
                    }
                    System.out.print("Enter Train ID: ");
                    trainId = sc.nextInt();
                    train = trainService.searchTrain(trainId);
                    if(train != null) {
                        ticketService.bookTicket(currentUser.getUserId(), train);
                    } else {
                        System.out.println("Train Not Found");
                    }
                    break;

                case 6:
                    if(currentUser == null) {
                        System.out.println("Please Login First");
                        break;
                    }
                    ticketService.viewTickets(currentUser.getUserId());
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}