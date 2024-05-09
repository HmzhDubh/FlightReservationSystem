
import Composition.ConcreteAirport;
import Factory.*;
import Observer.FlightStatus;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize model objects
        // Prompt user to choose flight type
 
        ConcreteAirport jeddah = new ConcreteAirport("JED");
        ConcreteAirport riyadh = new ConcreteAirport("RUH");
        ConcreteAirport dmmam = new ConcreteAirport("DMM");
        ConcreteAirport medina = new ConcreteAirport("MED");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a flight type:");
        System.out.println("1. Domestic");
        System.out.println("2. International");
        System.out.println("3. Composite");
        System.out.print("Enter your Flight choice: ");
        int choice = input.nextInt();

        // Create flight based on user's choice
        Flight flight = null;
        switch (choice) {
            case 1:
                System.out.println("Booking a seat on a domestic flight.");
                flight = FlightFactory.createFlight("domestic");
                jeddah.display(); riyadh.display(); dmmam.display(); medina.display();

                break;
            case 2:
                System.out.println("Booking a seat on an international flight.");
                flight = FlightFactory.createFlight("international");
                break;
            case 3:
                System.out.println("Booking a seat for a composite flight.");
                
                flight = FlightFactory.createFlight("composite");
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

      

        // Prompt user to enter name, email, departure city, and destination city
        input.nextLine();
       
        while (true) {
            
        
        System.out.print("Enter the departure city: ");
        String departureCity = input.nextLine();

        System.out.print("Enter the destination city: ");
        String destinationCity = input.nextLine();
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your email: ");
        String email = input.nextLine();
        if (flight instanceof DomesticFlight){
            System.out.println("Domestic");

        }
        else if (flight instanceof InternationalFlight){
            System.out.println("International");
        }
        else if (flight instanceof CompositeFlight){
            System.out.println("Composite");
        }
        if ((departureCity.equalsIgnoreCase("JED")|| departureCity.equalsIgnoreCase("RUH")||departureCity.equalsIgnoreCase("DMM")||departureCity.equalsIgnoreCase("MED")) & (destinationCity.equalsIgnoreCase("JED") || destinationCity.equalsIgnoreCase("RUH") || destinationCity.equalsIgnoreCase("DMM") ||destinationCity.equalsIgnoreCase("MED"))) {

        flight.bookSeat();
        String seatNum = flight.seatNumber();
        String reservationNum = flight.reservationNum();
        FlightDetails details = new FlightDetails(departureCity, destinationCity);
        Passenger passenger = new Passenger(name, email);
        String status = passenger.getStatus();

        // Passenger Observer
        FlightStatus flightStatus = new FlightStatus();
        flightStatus.addObserver(passenger);
        // send to the model
        FlightReservationModel flightReservationModel = new FlightReservationModel(reservationNum, seatNum, flight, passenger, details);
        // MVC integration
        FlightReservationView view = new FlightReservationView();
        // Display reservation details using MVC
        view.contactControl(flightReservationModel);


       // User Confirmation of the reservation
        System.out.print("Do you want to cancel the reservation? (yes/no): ");
        
        String ans = input.nextLine();
        // If user chooses to cancel reservation, update flight status
        if (ans.equalsIgnoreCase("yes")) {
            
            flightStatus.setStatus("Cancelled");
            System.out.println("\n>>> Flight Reservation Cancelled.");
            break;
           
        } else {
            System.out.println("\n>>> Reservation remains active.");
            flightStatus.setStatus("Confirmed");
        }

        
        // Change status to COMPLETE
        System.out.println("\n>>> Reservation Complete");
        flightStatus.setStatus("Complete");

        break;
        }else{
            System.out.println(" ERROR : False information ;( , Please Try Again with correct information");
        }
        
        }        
    }
//    public static void s(Flight flight){
//
//
//        flight.bookSeat();
//        String seatNum = flight.seatNumber();
//        String reservationNum = flight.reservationNum();
//        FlightDetails details = new FlightDetails(departureCity, destinationCity);
//        Passenger passenger = new Passenger(name, email);
//        String status = passenger.getStatus();
//
//        // Passenger Observer
//        FlightStatus flightStatus = new FlightStatus();
//        flightStatus.addObserver(passenger);
//        // send to the model
//        FlightReservationModel flightReservationModel = new FlightReservationModel(reservationNum, seatNum, flight, passenger, details);
//        // MVC integration
//        FlightReservationView view = new FlightReservationView();
//        // Display reservation details using MVC
//        view.contactControl(flightReservationModel);
//
//    }
}
