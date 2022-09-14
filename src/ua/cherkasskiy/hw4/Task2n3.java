package ua.cherkasskiy.hw4;

import java.util.Arrays;

public class Task2n3 {

    public static void main(String[] args) {
        int[] number = new int[1000];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 20 + 1);
        }
        System.out.println("Arrays: " + Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            if (PrimeNumber(number[i]))
                System.out.println("Number: " + number[i] + " is simple !");
        }
    }
    private static boolean PrimeNumber(int n) {
        int temp;
        if (n == 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            temp = n % i;
            if (temp == 0)
                return false;
        }
        return true;
    }

}