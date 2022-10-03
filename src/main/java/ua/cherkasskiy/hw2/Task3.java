package ua.cherkasskiy.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = reader.nextInt();
        evenOddChecker(num);
    }

    private static <num> void evenOddChecker(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "even");
        } else {
            System.out.println(num + "odd");
        }
    }
}
