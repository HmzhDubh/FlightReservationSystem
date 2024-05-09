import Observer.FlightObserver;

public class Passenger implements FlightObserver {

    
    private String name;
    private String email;
    private String status;
   

    // Constructor
    public Passenger(String name, String email) {
        this.name = name;
        this.email = email;
       
    }

    // Update method for flight status notification
    @Override
    public void update(String status) {
        this.status = status;
        System.out.println("Passenger " + name + " with email " + email + " has been notified: Flight status is " + status);
    }
    public String getStatus(){
        return status;
    }

    // Method to update passenger information
    public void updateInformation(String name, String email) {
        this.name = name;
        this.email = email;
        
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    

   
    @Override
    public void showPassengerInfo() {
    System.out.println("Passenger name: " + this.name);
    System.out.println("Passenger Email: " + this.email);
    }



}
 