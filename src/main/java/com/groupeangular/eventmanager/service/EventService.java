package com.groupeangular.eventmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupeangular.eventmanager.dao.EventDAO;
import com.groupeangular.eventmanager.entity.Event;

@Service
public class EventService {

	@Autowired
	private EventDAO eventDAO;
	
	public List<Event> findAll() {
		return this.eventDAO.findAll();
	}
	
	public Optional<Event> find(Long id) {
		return this.eventDAO.findById(id);
	}
	
}
