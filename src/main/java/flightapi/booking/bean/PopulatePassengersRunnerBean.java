package flightapi.booking.bean;

import flightapi.booking.model.Passenger;
import flightapi.booking.repository.PassengerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class PopulatePassengersRunnerBean implements CommandLineRunner{

    @Autowired
    PassengerRepository repository;

    @Override
    public void run(String... args) {

        String[] names = new String[]{
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
