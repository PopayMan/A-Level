package ua.cherkasskiy.hw3;

import java.util.Scanner;

public class Task4 {
    private static int number;

    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number 0 to 100");
        int guess = -1;
        guess(number);
    }

    public static int guess(int guess) {
        while (guess != number) {
            System.out.println("\nEnter your guess: ");
            Scanner input = new Scanner(System.in);
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("Yes the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else
                System.out.println("Your guess is too low");

        }
        return number;
    }
}
