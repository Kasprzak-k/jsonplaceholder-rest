package com.example.jsonplaceholder.controller;

import com.example.jsonplaceholder.dto.UserResponseDTO;
import com.example.jsonplaceholder.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public UserResponseDTO getEvent() {
        return eventService.getEvent();
    }
}
