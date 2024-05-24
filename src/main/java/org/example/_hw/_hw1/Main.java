package org.example._hw._hw1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArraysWithData data = new ArraysWithData();
        //Заполнение и вывод данных:

//Создать цикл для добавления 10 человек с именами вида "Имя i" и случайными возрастами от 10 до 80 лет.
//Выводить информацию о каждом созданном человеке с помощью метода printPersonById.
//Удаление информации о человеке по ID:
////
//По указанному id человека удалить информацию о нём
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int age = random.nextInt(71) + 10;
            data.createPerson("Name " + i, age);
        }

        for (int i = 0; i < 10; i++) {
            data.printPersonById(i);
        }

        data.removePersonById(5);

        for (int i = 0; i < 10; i++) {
            data.printPersonById(i);
        }

        System.out.println();

        Person removePerson = new Person("Name 1", 71);
        data.remove(removePerson);

        for (int i = 0; i < 10; i++) {
            data.printPersonById(i);
        }
    }
}
