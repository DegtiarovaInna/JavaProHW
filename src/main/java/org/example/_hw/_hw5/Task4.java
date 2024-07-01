package org.example._hw._hw5;
//int[] process(int[] a, e -> e + 1);
//
//Реализуйте метод, который принимает список чисел и унарный оператор, а
// возвращает новый список, где каждый элемент преобразован с помощью переданного оператора.
// Например, увеличить каждое число на 1.
public class Task4 {
    public static void main(String[] args) {
        int[] array = {1,-2,5,5,-66,7,0,456};
        int[] newArr = logic(array, e -> e+1 );


        for (int numb: newArr
             ) {
            System.out.println(numb);
        }
    }

    static int[] logic(int[] arr, UnaryOperator op){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]= op.oper(arr[i]);;
        }
       return newArr;
    }
}

@FunctionalInterface
interface UnaryOperator{
   int oper(int x);
}