package it.epicode.u5_w3_d5.Controller;

import it.epicode.u5_w3_d5.Service.BookingService;
import it.epicode.u5_w3_d5.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getUserBookings(Authentication authentication) {
        return bookingService.getBookingsByUser(authentication);
    }

    @PostMapping("/{eventId}")
    public Booking createBooking(@PathVariable Long eventId, Authentication authentication) {
        return bookingService.createBooking(eventId, authentication);
    }

    @DeleteMapping("/{bookingId}")
    public void cancelBooking(@PathVariable Long bookingId, Authentication authentication) {
        bookingService.cancelBooking(bookingId, authentication);
    }
}