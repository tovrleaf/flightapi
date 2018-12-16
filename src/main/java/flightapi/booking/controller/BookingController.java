package flightapi.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flightapi.booking.model.Booking;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @GetMapping
    public Booking getBookingByBookingId(@PathVariable("booking_id") String bookingId) {

        return new Booking(bookingId);
    }
}
