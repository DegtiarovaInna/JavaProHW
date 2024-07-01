package org.example._hw._hw5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//String[] process(String[] a, e -> e.length >= 5)
//
//Напишите метод, который принимает список строк и предикат, и возвращает новый список,
// содержащий только те строки, которые удовлетворяют условию предиката. Например,
// отфильтровать все строки длиннее 5 символов.
public class Task1 {
    public static void main(String[] args) {
        String[] strings = {"String","12", "Processor", "12345", "Name"};
        String[] newString = logic(strings, str -> str.length() >= 5);

        for (String str: newString
             ) {
            System.out.println(str);
        }

    }

    static String[] logic(String[] strings, Predicate<String> predicatr) {
        List<String> newList = new ArrayList<>();
        for (String str : strings
        ) {
            if (predicatr.test(str)) {
             newList.add(str);
            }
        }
        return newList.toArray(new String[0]);
    }
}


