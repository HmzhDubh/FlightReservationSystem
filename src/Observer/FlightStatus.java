package Observer;

import java.util.ArrayList;
import java.util.List;

public class FlightStatus {
    private List<FlightObserver> observers = new ArrayList<>();
   private String status;

   public void addObserver(FlightObserver observer) {
       observers.add(observer);
   }

   public void notifyObservers() {
       for (FlightObserver observer : observers) {
           observer.update(status);
       }
   }

   public void setStatus(String status) {
       this.status = status;
       notifyObservers(); // Notify observers when status changes
   }
}
