package org.example._hw._hw1;
//
import java.util.Arrays;

public class ArraysWithData {
    ////Создать массив String[] names для хранения имен.
       ////Создать массив int[] ages для хранения возрастов.
      ////Размер массивов — 10 элементов.
    int size = 10;
    String[] names = new String[size];
    int[] ages = new int[size];
    int currentIndex = 0;


    //   Создание людей:

//Создать метод createPerson, принимающий параметры String personName и int personAge.
// Метод должен добавлять имя и возраст в соответствующие массивы.
//Проверить, что текущий индекс не превышает размер массива. Если превышает, метод
// должен завершаться без добавления нового человека.
//

    public void createPerson(String personName, int personAge) {
        if (currentIndex < size) {
            names[currentIndex] = personName;
            ages[currentIndex] = personAge;
            currentIndex++;
        }
    }
    //Создать метод getPersonById, который принимает int id и возвращает массив из двух элементов:
// имя и возраст (String[]). Если ID не существует (меньше нуля или больше текущего индекса),
// возвращать массив с значениями по умолчанию: {"empty", "-1"}.

    public String[] getPersonById(int id) {
        if (id < 0 || id > currentIndex) {
            return new String[]{"empty", "-1"};
        }
        String[] person = new String[2];
        person[0] = names[id];
        person[1] = String.valueOf(ages[id]);
        return person;
    }
    //Получение информации о человеке по ID:
//Создать метод printPersonById, который принимает int id и выводит в консоль имя
// и возраст человека с данным ID. Если ID не существует, метод ничего не выводит.
//

    public void printPersonById(int id) {
        if (id >= 0 && id < currentIndex) {
            System.out.println(names[id] + ", " + ages[id]);
        }
    }
    //Вывод информации о человеке из массива:
//
//Создать метод printPerson, который принимает массив из двух элементов (String[] person) и выводит
// информацию о человеке в консоль.

    public void printPerson(String[] person) {
        System.out.println(Arrays.toString(person));
    }

    //Изменение информации о человеке по ID:
//Создать метод updatePersonById, который принимает int id, String newName, int newAge
// и изменяет имя и возраст человека с данным ID. Если ID не существует, метод должен завершаться без изменений.
//

    public void updatePersonById(int id, String newName, int newAge) {
        if (id >= 0 && id < currentIndex) {
            names[id] = newName;
            ages[id] = newAge;
        }
    }

    //  Добавить метод удаления человека по id.
//    public static void removePersonById(int id){
//        if (id>0 && id<=currentIndex ){
//            names[id]=null;
//            ages[id]=0;
//        }
//    }

    public void removePersonById(int id) {
        if (id >= 0 && id < currentIndex) {
            for (int i = id; i < currentIndex - 1; i++) {
                names[i] = names[i + 1];
                ages[i] = ages[i + 1];
            }
            currentIndex--;
        }
    }

    //Добавить метод удаления человека, если в качестве формального аргумента будет передаваться экземпляр типа Person
    public void remove(Person person) {
//        for (int i = 0; i < currentIndex; i++) {
//            if (names[i].equals(person.name) && ages[i] == person.age) {
//                names[i] = names[i + 1];
//                ages[i] = ages[i + 1];
//            }
//            currentIndex--;
//            break;
//        }
        for (int i = 0; i < currentIndex; i++) {
            if (names[i].equals(person.name) && ages[i] == person.age) {
                removePersonById(i);
                break;
            }
        }
    }


}
