package ua.cherkasskiy.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] startArray = new int[5][5];
        fillArray(startArray);
        System.out.println("Expanded array: ");
        System.out.println(Arrays.deepToString(changeArray(startArray)));
    }

    public static void fillArray(int[][] startArray) {
        System.out.println("Initial array: ");
        for (int i = 0; i < startArray.length; i++) {
            for (int j = 0; j < startArray[i].length; j++) {
                int index = new Random().nextInt(100);
                startArray[i][j] = index;
                System.out.print(startArray[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int[][] changeArray(int[][] startArray) {
        int[][] resultArray = Arrays.copyOf(startArray, startArray.length);
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = i + 1; j < resultArray[i].length; j++) {
                int temp = resultArray[i][j];
                resultArray[i][j] = resultArray[j][i];
                resultArray[j][i] = temp;

            }
        }
        return resultArray;
    }
}
