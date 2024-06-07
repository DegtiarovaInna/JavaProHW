package org.example._hw._hw3;

import java.util.UUID;

public interface Event {
    void createEvent(EventManagement event);
    void getEventById(UUID id);
    void getAllEvents();
    boolean findEventsByCriteria(String criteria);
    void updateEvent(EventManagement event);
    void deleteEvent(UUID id);
}
