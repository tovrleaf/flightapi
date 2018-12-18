package flightapi.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import flightapi.booking.model.Booking;
import flightapi.booking.model.Passenger;
import flightapi.booking.repository.BookingRepository;
import flightapi.booking.repository.PassengerRepository;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping
    public Passenger getBookingByPassengerId(@RequestParam("passenger_id") String passengerId) {

        return passengerRepository.findByPassengerId(passengerId);
    }
    
    @GetMapping("/{booking_id}")
    public Booking getBookingByBookingId(@PathVariable("booking_id") String bookingId) {

        return bookingRepository.findById(bookingId).get();
    }
}
