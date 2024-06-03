package it.epicode.u5_w3_d5.Controller;

import it.epicode.u5_w3_d5.Service.EventService;
import it.epicode.u5_w3_d5.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event, Authentication authentication) {
        return eventService.createEvent(event, authentication);
    }

    @PutMapping("/{eventId}")
    public Event updateEvent(@PathVariable Long eventId, @RequestBody Event eventDetails, Authentication authentication) {
        return eventService.updateEvent(eventId, eventDetails, authentication);
    }

    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable Long eventId, Authentication authentication) {
        eventService.deleteEvent(eventId, authentication);
    }
}