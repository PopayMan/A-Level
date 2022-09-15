package ua.cherkasskiy.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] input = new int[2000];
        fillArray(input);
        replaceEvenElements(input);
        System.out.println(Arrays.toString(input));
    }

    public static void fillArray(int[] input) {
        Random random = new Random();
        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(0, 10 + 1);
        }
    }
        public static void replaceEvenElements( int[] input){
            for (int i = 0; i < input.length; i++) {
                input[i] = (input[i] % 2 == 0 ? 0 : input[i]);
                }
            }
        }


