package org.example.operators;

public class Operators {

    public static void main(String[] args) {

        int[] numbers = {2, 5, 44, 33, 8, 14, 10};
        int x = 0;
        for (int element : numbers) {
            if (element % 2 == 0 && element > 10) {
                System.out.println("Четное число (больше 10): " + element);
                x++;
            }
        }
        System.out.println("Количество четных чисел,которые (больше 10): " + x);
    }
}