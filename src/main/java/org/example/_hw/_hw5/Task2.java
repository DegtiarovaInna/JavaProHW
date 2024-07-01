package org.example._hw._hw5;

//void process(int[] a, e -> print(e * e))
//
//Создайте метод, который принимает список чисел и void-метод, отвечающий за логику.
// Метод должен применять переданный void-метод к каждому элементу списка. Например, вывести на экран квадрат каждого числа.
public class Task2 {
    public static void main(String[] args) {

        int[] array = {1, 2, 4, 6, 8, 99, 34};
         logic(array, numb -> System.out.println( numb * numb));



    }

   static void logic(int[] array, IntOperations oper) {

        for (int i = 0; i < array.length; i++) {
           oper.accept(array[i]);
        }

    }
}
@FunctionalInterface
interface IntOperations{
    void accept(int numb);
}


