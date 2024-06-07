package org.example._hw._hw3;

import java.time.LocalDateTime;
import java.util.UUID;

//Техническое задание на создание информационной системы для управления мероприятиями
//Общие сведения:
//Информационная система предназначена для управления мероприятиями, которые пользователи могут посещать. Система должна поддерживать базовые CRUD-операции (создание, чтение, обновление, удаление) и предоставлять метод для получения детальной информации о мероприятиях.
//
//Функциональные требования:
//CRUD-операции для мероприятий
//
//Создание мероприятия: Система должна позволять создавать новые мероприятия с обязательными полями: ID, наименование, дата, описание, категория типа мероприятия, статус отмены, данные о хозяине.
//Чтение мероприятий: Система должна предоставлять возможность получения списка всех мероприятий и поиска мероприятий по различным критериям (например, по категории типа мероприятия, дате и т.д.).
//Обновление мероприятия: Система должна позволять обновлять информацию о существующих мероприятиях.
//Удаление мероприятия: Система должна позволять удалять мероприятия.
//Получение детальной информации о мероприятии
//
//Метод получения детальной информации должен возвращать полную информацию о выбранном мероприятии, включая данные о хозяине.
public class EventMain {
    public static void main(String[] args) {
        UUID uuidHost = UUID.randomUUID();
        UUID uuidHost2 = UUID.randomUUID();

        UUID uuidEvent = UUID.randomUUID();
        UUID uuidEvent2 = UUID.randomUUID();

        LocalDateTime date1 = LocalDateTime.of(2024, 06, 06, 06, 06);
        LocalDateTime date2 = LocalDateTime.of(2024, 07, 07, 07, 07);

        Host host1 = new Host(uuidHost, "1234@gmail.com", "Name1", "Anna", "123");
        Host host2 = new Host(uuidHost2, "abcd@gmail.com", "Name2", "Inna", "345");

        EventManagement eventManager = new EventManagement();

        EventManagement event1 = new EventManagement(uuidEvent, "Event1", date1, "Description1", "1", false, host1);
        EventManagement event2 = new EventManagement(uuidEvent2, "Event2", date2, "Description2", "2", true, host2);

        System.out.println(event1);
        System.out.println(event2);

        eventManager.createEvent(event1);
        eventManager.createEvent(event2);
        System.out.println("All events:");
        eventManager.getAllEvents();


        System.out.println("Event By Id:");
        eventManager.getEventById(uuidEvent2);


        System.out.println("Event find:");
        eventManager.findEventsByCriteria("2");


        System.out.println("Update: ");
        EventManagement event3 = new EventManagement(uuidEvent2, "update", date2, "update", "music", false, host1);
        eventManager.updateEvent(event3);
        eventManager.getAllEvents();

        System.out.println("Delete:");
        eventManager.deleteEvent(uuidEvent2);
        eventManager.getAllEvents();

    }
}
