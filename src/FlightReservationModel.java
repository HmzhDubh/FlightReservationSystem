import Factory.Flight;
    // Model of the flight reservation
public class FlightReservationModel {

    private String reservationNumber;
    private String seatNumber;
    private Flight flight;
    private Passenger passenger;
    private FlightDetails deta;
    private String status = "Auth";

    private FlightReservationView view;

    // Constructor
    public FlightReservationModel(String reservationNumber, String seatNumber, Flight flight, Passenger passenger, FlightDetails deta) {
        
        this.reservationNumber = reservationNumber;
        this.flight = flight;
        this.passenger = passenger;
        this.deta = deta;
        this.seatNumber = seatNumber;
    }

    // Setters and Getters
    public FlightDetails getDeta() {
        return deta;
    }
    public void setDeta(FlightDetails deta) {
        this.deta = deta;
    }
    public String getReservationNumber() {
        return reservationNumber;
    }
    public Flight getFlight() {
        return flight;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public String getStatus() {
        return status;
    }
//    public void setStatus(String status){
//        this.status = status;
//    }


    // display reservation details to the view
//    public void displayReservationDetails(FlightReservationModel flightReservationModel) {
//        view.displayReservationDetails(flightReservationModel);
//    }

}
