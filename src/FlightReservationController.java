public class FlightReservationController {
    private FlightReservationView view;


   public FlightReservationController(FlightReservationView view) {
       this.view = view;
   }

//    public void displayReservationDetails(Reservation reservation) {
//        view.displayReservationDetails(reservation);
//    }
//    public String contactModel(){
//       String stauts = model.getStatus();
//       return stauts;
//    }
    public void checkModel(FlightReservationModel model){
       String status = model.getStatus();
       if (status.equalsIgnoreCase("Auth")){

           view.displayReservationDetails(model);
       }else {
           System.out.println("Model connection is not authorized");
       }
    }
}
