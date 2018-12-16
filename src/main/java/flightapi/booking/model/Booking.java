package flightapi.booking.model;

public class Booking {

    private final String id;
    private Passenger passenger;
    private Flight flight;

    public Booking(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return this.flight;
    }
}
