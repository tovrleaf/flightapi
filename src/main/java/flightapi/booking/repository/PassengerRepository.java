package flightapi.booking.repository;

import org.springframework.data.repository.CrudRepository;
import flightapi.booking.model.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {

    Passenger findByPassengerId(String passengerId);
}
