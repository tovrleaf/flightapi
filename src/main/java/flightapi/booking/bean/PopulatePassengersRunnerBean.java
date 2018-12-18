package flightapi.booking.bean;

import flightapi.booking.model.Passenger;
import flightapi.booking.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
class PopulatePassengersRunnerBean implements CommandLineRunner {

    @Autowired
    PassengerRepository repository;

    @Override
    public void run(String... args) {

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
            repository.save(new Passenger(
                parts[0],
                parts[1],
                (parts[0] + "." + parts[1] + "@example.com").toLowerCase()
            ));
        }
    }
}
