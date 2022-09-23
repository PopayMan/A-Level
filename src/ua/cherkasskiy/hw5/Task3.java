package ua.cherkasskiy.hw5;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = fillArray(8);
        System.out.println();
      changeValueArray(numbers);
    }
    public static int[][] changeValueArray(int[][] numbers) {
        int[][] newNumbers = new int[numbers.length][numbers[1].length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                newNumbers[i][j] = numbers[j][i];
                System.out.println(Arrays.deepToString(numbers));
            }
        }
        return newNumbers;
    }
    public static int[][] fillArray(int length) {
        int[][] numbers = new int[length][length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int j;
            for (j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10);
                System.out.println(Arrays.deepToString(numbers));
            }
        }
        return numbers;
    }

}

