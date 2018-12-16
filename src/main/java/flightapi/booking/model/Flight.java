package flightapi.booking.model;

public class Flight {

    private String departure;
    private String arrival;
    private String departureDate;
    private String arrivalDate;

    public Flight(String departure, String arrival, String departureDate, String arrivalDate) {
        this.departure = departure;
        this.arrival = arrival;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    public String getDeparture() {
        return this.departure;
    }

    public String getArrival() {
        return this.arrival;
    }

    public String getDepartureDate() {
        return this.departureDate;
    }

    public String getArrivalDate() {
        return this.arrivalDate;
    }
}
