package flightapi.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    @NotNull
    private String departure;

    @NotNull
    private String arrival;

    @NotNull
    private String departureDate;

    @NotNull
    private String arrivalDate;

    protected Flight() {
    }

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
