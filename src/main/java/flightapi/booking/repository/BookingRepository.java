package flightapi.booking.repository;

import flightapi.booking.model.Booking;
import flightapi.booking.model.Flight;
import flightapi.booking.model.Passenger;

public class BookingRepository {

    public Booking findBookingById(String id) {

        Booking b = new Booking(id);
        Passenger p = new Passenger("foo", "bar", "foo@bar.biz");
        b.setPassenger(p);

        Flight f = new Flight(
            "HEL",
            "ORD",
            "2018-12-16 7:55",
            "2018-12-16 16:20"
        );
        b.setFlight(f);

        return b;
    }
}
