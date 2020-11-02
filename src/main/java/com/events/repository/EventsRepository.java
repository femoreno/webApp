package com.events.repository;

import com.events.models.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Events, String > {
}
