package flightapi.booking.fixture;

import flightapi.booking.model.Booking;
import flightapi.booking.model.Flight;
import flightapi.booking.model.Passenger;
import flightapi.booking.repository.BookingRepository;
import flightapi.booking.repository.FlightRepository;
import flightapi.booking.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class PopulatePassengersRunnerBean implements CommandLineRunner {

    @Autowired
    BookingRepository bookingRepository;
    
    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public void run(String... args) {

        // add passengers
        String[] names = {
            "Huey Wheatley",
            "Whitelaw Barrie",
            "Videl Atterton",
            "Sewell Cromwell",
            "Salim Sutherland",
            "Thornton Davenport",
            "Woodward Clinton",
            "Edward Leighton"
        };
        for (String name : names) {
            String[] parts = name.split(" ");
            passengerRepository.save(new Passenger(
                // this is passengerId. They should be randomized string forming
                // but for fixturing, quite ok
                (parts[0].substring(0, 1) + parts[1].substring(0, 1) + "123"),
                parts[0],
                parts[1],
                (parts[0] + "." + parts[1] + "@example.com").toLowerCase()
            ));
        }

        // add flights
        String[][] flights = {
            {"HEL", "NYC", "2018-12-18 07:00", "2018-12-18 16:20"},
            {"HEL", "MIA", "2018-12-18 10:20", "2018-12-18 19:10"},
            {"HEL", "ORD", "2018-12-18 11:15", "2018-12-18 12:40"}
        };
        for (String[] row: flights) {
            flightRepository.save(new Flight(
                row[0],
                row[1],
                row[2],
                row[3]
            ));
        }

        // add bookings
        Passenger p1 = passengerRepository.findByPassengerId("HW123");
        Flight f1 = flightRepository.findById(new Long(9)).get();

        bookingRepository.save(new Booking(p1, f1));
    }
}
