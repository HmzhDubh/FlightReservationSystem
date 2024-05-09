package Composition;

import java.util.ArrayList;
import java.util.List;

public class CompositeAirport implements AirportComponent {
    private List<AirportComponent> airports = new ArrayList<>();

    public void addAirport(AirportComponent airport) {
        airports.add(airport);
    }

    @Override
    public void display() {
        for (AirportComponent airport : airports) {
            airport.display();
        }
    }
}