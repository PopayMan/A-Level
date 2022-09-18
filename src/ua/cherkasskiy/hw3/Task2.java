package ua.cherkasskiy.hw3;


import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wright some string: ");
        String someString = in.nextLine();
        System.out.println("String without the spase:" + deleteSpace(someString));
        System.out.println("String is:" + (reversString(someString) ? "a palindrome" : "not a palindrome"));
    }

    static public String deleteSpace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static boolean reversString(String str) {
        str.toLowerCase(Locale.ROOT);
        String reversStr = new StringBuffer(str).reverse().toString();
        return str.equals(reversStr);
    }
}