package flightapi.booking.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Booking {

    // this should be replaced with custom generator
    // to create 4-6 character long codes
    @Id
    @Column(columnDefinition = "CHAR(32)")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    @ManyToOne
    @NotNull
    private Passenger passenger;

    @OneToOne
    @NotNull
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
