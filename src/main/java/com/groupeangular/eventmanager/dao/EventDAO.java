package com.groupeangular.eventmanager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupeangular.eventmanager.entity.Event;

@Repository
public interface EventDAO extends JpaRepository<Event, Long> {

	public List<Event> findAllByNameContainingIgnoreCase(String pattern);
}
