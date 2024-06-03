package it.epicode.u5_w3_d5.Service;

import it.epicode.u5_w3_d5.Repository.EventRepository;
import it.epicode.u5_w3_d5.Repository.UserRepository;
import it.epicode.u5_w3_d5.entity.Event;
import it.epicode.u5_w3_d5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event createEvent(Event event, Authentication authentication) {
        String username = authentication.getName();
        User organizer = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        event.setOrganizer(organizer);
        return eventRepository.save(event);
    }

    public Event updateEvent(Long eventId, Event eventDetails, Authentication authentication) {
        Event event = eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found"));
        if (!event.getOrganizer().getUsername().equals(authentication.getName())) {
            throw new RuntimeException("Unauthorized");
        }
        event.setTitle(eventDetails.getTitle());
        event.setDescription(eventDetails.getDescription());
        event.setDate(eventDetails.getDate());
        event.setLocation(eventDetails.getLocation());
        event.setAvailableSeats(eventDetails.getAvailableSeats());
        return eventRepository.save(event);
    }

    public void deleteEvent(Long eventId, Authentication authentication) {
        Event event = eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found"));
        if (!event.getOrganizer().getUsername().equals(authentication.getName())) {
            throw new RuntimeException("Unauthorized");
        }
        eventRepository.delete(event);
    }
}