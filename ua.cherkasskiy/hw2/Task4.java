import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int a = 0;
        int b = 0;
        System.out.println("Enter a number: ");
        i = scanner.nextInt();
        System.out.println("Enter a second number: ");
        a = scanner.nextInt();
        System.out.println("Enter a third number: ");
        b = scanner.nextInt();
        int abs1 = i < 0 ? i * -1 : i;
        int abs2 = a < 0 ? a * -1 : a;
        int abs3 = b < 0 ? b * -1 : b;
        smallestNum(i, a, b, abs1, abs2, abs3);
    }

    public static void smallestNum(int i, int a, int b, int abs1, int abs2, int abs3) {
        if (abs1 <= abs2 && abs1 <= abs3) {
            System.out.println("The smallest number in modulus is: " + i);
        } else if (abs2 <= abs1 && abs2 <= abs3) {
            System.out.println("The smallest number in modulus is: " + a);
        } else {
            System.out.println("The smallest number in modulus is: " + b);

        }
    }
}