package Composition;

public class ConcreteAirport implements AirportComponent {
    
    private String name;

    public ConcreteAirport(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Airport: " + name);
    }
}