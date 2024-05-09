public class FlightDetails {
    private String departureCity;
   private String destinationCity;

   public FlightDetails(String departureCity, String destinationCity) {
       this.departureCity = departureCity;
       this.destinationCity = destinationCity;
   }

   public void setDepartureCity(String departureCity) {
       this.departureCity = departureCity;
   }

   public void setDestinationCity(String destinationCity) {
       this.destinationCity = destinationCity;
   }

   public String getDepartureCity() {
       return departureCity;
   }

   public String getDestinationCity() {
       return destinationCity;
   }
}