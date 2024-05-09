
public class FlightReservationView {


    public void contactControl(FlightReservationModel model){
        FlightReservationController c = new FlightReservationController(new FlightReservationView());
        c.checkModel(model);
    }

    public void displayReservationDetails(FlightReservationModel reservation) {
        
        System.out.println("_____________________________________________________________");
        System.out.println("\n ### Reservation Details ###");
        System.out.println("Reservation Number: " + reservation.getReservationNumber());
        System.out.println("Passenger Seat Number: " + reservation.getSeatNumber());
        System.out.println("Passenger Name: " + reservation.getPassenger().getName());
        System.out.println("Passenger Email: " + reservation.getPassenger().getEmail());
        System.out.println("Departure City: " + reservation.getDeta().getDepartureCity());
        System.out.println("Destination City: " + reservation.getDeta().getDestinationCity());
        System.out.println("_____________________________________________________________");

        System.out.println("Ticket issued At: " + java.time.LocalDateTime.now());
        System.out.println("_________________________  THANK YOU _________________________");

    }
}