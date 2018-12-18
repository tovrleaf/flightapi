package flightapi.booking.repository;

import org.springframework.data.repository.CrudRepository;
import flightapi.booking.model.Booking;

public interface BookingRepository extends CrudRepository<Booking, String> {
}
