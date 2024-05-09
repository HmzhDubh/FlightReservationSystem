package Factory;

import java.util.Random;

public class DomesticFlight implements Flight {
    @Override
  public void bookSeat() {
      System.out.println("Booking a seat on a domestic flight.");
  }

    @Override
    public String seatNumber() {

      // generate a random char
      Random r = new Random();
      char c = (char)(r.nextInt(26) + 'a');
      String s = String.valueOf(c);
      // generate a random number 10 - 50
      double n = 10 + (Math.random() * 50);

      String seatNum = s.toUpperCase() +"_"+ ((int)n);
      return seatNum;
    }
    @Override
    public String reservationNum(){
        
    // generate a random char
    Random r = new Random();
    char c = (char) (r.nextInt(26) + 'a');
    String s = String.valueOf(c);
    Random r2 = new Random();
    char c2 = (char) (r2.nextInt(26) + 'a');
    String s2 = String.valueOf(c2);

    // generate a random number 10 - 50
    double n = 10 + (Math.random() * 50);

    String reservationNumber = s.toUpperCase() + s2.toUpperCase()+ "_" + ((int) n);

    return reservationNumber;
    }
    
}
