package LabSession1;

import java.util.Arrays;
import java.util.Random;
public class ex3 {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
        }


        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Random Numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }

}
