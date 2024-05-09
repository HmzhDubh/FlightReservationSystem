package Composition;

public class Airport implements AirportComponent {

    private String name;

    public Airport(String name) {
        this.name = name;
    }
    @Override
    public void display() {
        System.out.println("Airport: " + name);
    }
}
