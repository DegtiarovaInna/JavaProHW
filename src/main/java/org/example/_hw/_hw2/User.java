package org.example._hw._hw2;

//## Задание со звездочкой: Создание класса "Пользователь"
//Для усложнения задания и практики дополнительных концепций ООП, мы создадим отдельный класс
// "Пользователь" и свяжем его с классом "Банковский счет".
//### Требования
//1. Создайте класс `User` со следующими свойствами:
//   - `firstName` (строка): имя пользователя
//   - `lastName` (строка): фамилия пользователя
//   - `address` (строка): домашний адрес пользователя
//Это расширенное задание позволит вам практиковать создание связанных классов,
// работу с объектами и их свойствами, а также композицию классов в ООП. Вы научитесь
// создавать более сложные и реалистичные модели данных, что пригодится при разработке более крупных приложений.
public class User {

    private String firstName;
    private String lastName;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public User(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + address;
    }
}
