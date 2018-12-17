package flightapi.booking.repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import flightapi.booking.model.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, UUID> {
}
