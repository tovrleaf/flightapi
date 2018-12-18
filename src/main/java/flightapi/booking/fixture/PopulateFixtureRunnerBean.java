package flightapi.booking.fixture;

import flightapi.booking.model.Flight;
import flightapi.booking.model.Passenger;
import flightapi.booking.repository.FlightRepository;
import flightapi.booking.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class PopulatePassengersRunnerBean implements CommandLineRunner {

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
    }
}
