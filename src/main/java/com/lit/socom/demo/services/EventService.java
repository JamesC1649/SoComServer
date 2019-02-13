package com.lit.socom.demo.services;

import com.lit.socom.demo.model.Event;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EventService {
    Event getAllEvents();
    Optional<Event> getEventById(int id);
}
