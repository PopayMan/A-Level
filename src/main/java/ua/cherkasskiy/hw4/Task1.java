package ua.cherkasskiy.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] input = new int[400];
        fillArray(input);
        System.out.println(Arrays.toString(input));
        System.out.println("Sum average: " + average(input));
        System.out.println("Sum geometric: " + geometricMean(input));
    }

    public static int[] fillArray(int[] input) {
        Random random = new Random();
        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(1, 10 + 1);
        }
        return input;
    }

    public static double average(int[] array) {
        double average = 0;
        for (int element : array) {
            average += element;
        }
        average /= array.length;
        return average;
    }

    public static double geometricMean(int[] array) {
        double mean = 1;
        for (int element : array) {
            mean *= element;
        }
        mean = Math.pow(mean, 1.0 / array.length);
        return mean;
    }
}