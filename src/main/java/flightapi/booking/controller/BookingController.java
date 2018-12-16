package flightapi.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flightapi.booking.model.Booking;
import flightapi.booking.repository.BookingRepository;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @GetMapping("/{booking_id}")
    public Booking getBookingByBookingId(@PathVariable("booking_id") String bookingId) {

        BookingRepository repository = new BookingRepository();

        return repository.findBookingById(bookingId);
    }
}
