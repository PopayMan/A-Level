package ua.cherkasskiy.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] input = new int[2000];
        fillArray(input);
        System.out.println(Arrays.toString(input));
        int[] modified = replaceEvenElements(input);
        System.out.println(Arrays.toString(modified));
    }

    public static int[] fillArray(int[] input) {
        Random random = new Random();
        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(1, 10 + 1);
        }
        return input;
    }
    public static int[] replaceEvenElements(int[] input) {
        int[] inputArray = new int[input.length];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (input[i] % 2 == 0 ? 0 : input[i]);
        }
        return inputArray;
    }
}


