package flightapi.booking.model;

public class Booking {

    private final String id;

    public Booking(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
