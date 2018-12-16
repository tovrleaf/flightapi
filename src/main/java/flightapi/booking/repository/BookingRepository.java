package flightapi.booking.repository;

import flightapi.booking.model.Booking;
import flightapi.booking.model.Passenger;

public class BookingRepository {

    public Booking findBookingById(String id) {

        Booking b = new Booking(id);
        Passenger p = new Passenger("foo", "bar", "foo@bar.biz");
        b.setPassenger(p);

        return b;
    }
}
