package Factory;

public class FlightFactory {
    public static Flight createFlight(String type) {

        if (type.equalsIgnoreCase("domestic")) {
            return new DomesticFlight();

        } else if (type.equalsIgnoreCase("international")) {
            return new InternationalFlight();

        } else if (type.equalsIgnoreCase("composite")) {
            return new InternationalFlight();

        } 
            return null;
    }
}


