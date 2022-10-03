package ua.cherkasskiy.hw5;

import java.util.Arrays;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = fillArray(25);
        System.out.println(Arrays.toString(numbers));
        System.out.println("The array dot grow:" + notGrow(numbers));
    }
    public static boolean notGrow(int[] numbers) {
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static int[] fillArray(int length) {
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}

