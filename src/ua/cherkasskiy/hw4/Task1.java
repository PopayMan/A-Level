package ua.cherkasskiy.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] input = new int[400];
        fillArray(input);
        System.out.println(Arrays.toString(input));

    }
    public static void fillArray(int[] input) {
        Random random = new Random();
        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(1, 10 + 1);
        }
    }
}