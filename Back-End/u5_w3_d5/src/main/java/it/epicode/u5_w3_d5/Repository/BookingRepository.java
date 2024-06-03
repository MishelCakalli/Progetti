package it.epicode.u5_w3_d5.Repository;

import it.epicode.u5_w3_d5.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserUsername(String username);
}