package org.example._hw._hw3;

import java.time.LocalDateTime;
import java.util.UUID;

////Создание мероприятия: Система должна позволять создавать новые
// мероприятия с обязательными полями: ID, наименование, дата, описание,
// категория типа мероприятия, статус отмены, данные о хозяине.
////Чтение мероприятий: Система должна предоставлять возможность получения
// списка всех мероприятий и поиска мероприятий по различным критериям
// (например, по категории типа мероприятия, дате и т.д.).
////Обновление мероприятия: Система должна позволять обновлять информацию о существующих мероприятиях.
////Удаление мероприятия: Система должна позволять удалять мероприятия.
////Получение детальной информации о мероприятии
public class EventManagement implements Event {
    private UUID id;
    private String title;
    private LocalDateTime date;
    private String description;
    private String eventTypeCategory;
    private boolean isCancelled;
    private Host host;
    private int size = 10;
    private EventManagement[] events = new EventManagement[size];

    int count;

    public EventManagement(UUID id, String title, LocalDateTime date, String description, String eventTypeCategory, boolean isCancelled, Host host) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.description = description;
        this.eventTypeCategory = eventTypeCategory;
        this.isCancelled = isCancelled;
        this.host = host;
    }

    public EventManagement() {
    }


    @Override
    public void createEvent(EventManagement event) {
        if (count < size) {
            events[count] = event;
            count++;
        }
    }

    @Override
    public void getEventById(UUID id) {
        for (int i = 0; i < count; i++) {
            if (events[i].id.equals(id)) {
                System.out.println(events[i]);
            }
        }
    }

    @Override
    public void getAllEvents() {
        for (int i = 0; i < count; i++) {
            if (events[i] != null) {
                System.out.println(events[i]);
            }
        }
    }

    @Override
    public boolean findEventsByCriteria(String criteria) {
        for (int i = 0; i < count; i++) {
            if (events[i].eventTypeCategory.equals(criteria)) {
                System.out.println(events[i]);
                return true;
            }
        }
        return false;
    }

    @Override
    public void updateEvent(EventManagement newEvent) {
        for (int i = 0; i < count; i++) {
            if (events[i].id.equals(newEvent.id)) {
                events[i] = newEvent;
                break;
            }
        }
    }

    @Override
    public void deleteEvent(UUID id) {
        //   int index=-1;
        for (int i = 0; i < count; i++) {
            if (events[i].id.equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    events[j] = events[j + 1];
                }
                count--;
            }
        }

    }


    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", eventTypeCategory='" + eventTypeCategory + '\'' +
                ", isCancelled=" + isCancelled +
                ", host=" + host +
                '}';
    }
}
