package com.groupeangular.eventmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupeangular.eventmanager.entity.Event;
import com.groupeangular.eventmanager.service.EventService;

@RestController
@RequestMapping("event")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping
	public ResponseEntity<List<Event>> findAll() {
		return ResponseEntity.ok(eventService.findAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Event> find(@PathVariable Long id) {
		Optional<Event> opt = eventService.find(id);
		if(opt.isPresent()) {
			return ResponseEntity.ok(opt.get());
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
