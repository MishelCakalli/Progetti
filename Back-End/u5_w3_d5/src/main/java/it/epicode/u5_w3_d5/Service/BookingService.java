package it.epicode.u5_w3_d5.Service;

import it.epicode.u5_w3_d5.Repository.BookingRepository;
import it.epicode.u5_w3_d5.Repository.EventRepository;
import it.epicode.u5_w3_d5.Repository.UserRepository;
import it.epicode.u5_w3_d5.entity.Booking;
import it.epicode.u5_w3_d5.entity.Event;
import it.epicode.u5_w3_d5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Booking> getBookingsByUser(Authentication authentication) {
        String username = authentication.getName();
        return bookingRepository.findByUserUsername(username);
    }

    public Booking createBooking(Long eventId, Authentication authentication) {
        String username = authentication.getName();
        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        Event event = eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found"));

        if (event.getAvailableSeats() <= 0) {
            throw new RuntimeException("No available seats");
        }

        event.setAvailableSeats(event.getAvailableSeats() - 1);
        eventRepository.save(event);

        Booking booking = new Booking();
        booking.setUser(user);
        booking.setEvent(event);
        return bookingRepository.save(booking);
    }

    public void cancelBooking(Long bookingId, Authentication authentication) {
        Booking booking = bookingRepository.findById(bookingId).orElseThrow(() -> new RuntimeException("Booking not found"));
        if (!booking.getUser().getUsername().equals(authentication.getName())) {
            throw new RuntimeException("Unauthorized");
        }

        Event event = booking.getEvent();
        event.setAvailableSeats(event.getAvailableSeats() + 1);
        eventRepository.save(event);

        bookingRepository.delete(booking);
    }
}