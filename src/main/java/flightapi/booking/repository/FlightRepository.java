package flightapi.booking.repository;

import org.springframework.data.repository.CrudRepository;
import flightapi.booking.model.Flight;

public interface FlightRepository extends CrudRepository<Flight, Long> {
}
