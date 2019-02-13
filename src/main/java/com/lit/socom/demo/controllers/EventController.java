package com.lit.socom.demo.controllers;

import com.lit.socom.demo.data.EventRepository;
import com.lit.socom.demo.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// TODO: Extend model and database schema with Events
// TODO: Add EventRepository
// TODO: Use repository here to find events
@RestController("EventController")
@RequestMapping("events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Event> getAllEvents() {
        return (List<Event>)eventRepository.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Event> getEventById(@PathVariable("id") int id) {
        return eventRepository.findById(id);
    }

}
