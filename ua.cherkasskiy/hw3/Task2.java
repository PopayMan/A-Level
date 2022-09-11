import java.util.Scanner;

public class Task2 {
    public static String reverse(String word) {
        StringBuilder reversed = new StringBuilder(word.length());
        for (int i = word.length(); i > 0; i--) {
            reversed.append(word.charAt(i - 1));
        }
        return word;
    }


    private static String removeSpace(String aword) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < aword.length(); i++) {
            if (aword.charAt(i) != ' ') {
                buffer.append(aword.charAt(i));
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String word = in.nextLine().replaceAll(" ", "");
        String reversed = reverse(word);
        if (word.equals(reversed)) {
            System.out.println("The string " + word + " is a palindrome");
        } else {
            System.out.println("The string " + word + " is not a palindrome");
        }
    }
}