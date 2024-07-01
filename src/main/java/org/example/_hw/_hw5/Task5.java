package org.example._hw._hw5;
//Например, int[] process(int[] a, int[] b, (x, y) -> x + y);
//
//Напишите метод, который объединяет два списка в один, используя бинарный оператор для определения,
// как именно объединять элементы. Например, сложить попарно элементы двух числовых списков.

public class Task5 {
    public static void main(String[] args) {
        int[] array1 ={1,2,3,4,5,6,7};
        int[] array2 ={8,9,0,1,2,3,4};
        int[] res = logic(array1,array2, (x, y) -> x + y);

        for (int num: res
             ) {
            System.out.println(num);
        }
    }

    static int[] logic(int[] a, int[] b, BinaryOperator op){
        int length;
        if (a.length>b.length){
            length=b.length;
        } else {
            length = a.length;
        }
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
               res[i]= op.oper(a[i], b[i]);
        }
        return res;

    }

}
 @FunctionalInterface
interface BinaryOperator{
    int oper(int x,int y);
 }