package flightapi.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Booking {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @ManyToOne
    @NotEmpty
    private Passenger passenger;

    @OneToOne
    @NotEmpty
    private Flight flight;

    protected Booking() {
    }

    public Booking(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    public String getId() {
        return this.id;
    }


    public Passenger getPassenger() {
        return this.passenger;
    }

    public Flight getFlight() {
        return this.flight;
    }
}
