package ua.cherkasskiy.hw5;

public class Practice2 {
    public static void main(String[] args) {
        int[] heights = {158, -175, 182, -156, 194, -146, 205, -195, 199, -156, 210, -144, 185, 199, -177, 170, -100,
        200, 222, -212, 198, 111, -222, -111, 200};
        System.out.println("girls height: " + sumGirlsHeight(heights));
        System.out.println("boys height: " + sumBoysHeight(heights));
    }
    public static double sumBoysHeight(int[] heights) {
        return sum(heights, true);
    }
    public static double sumGirlsHeight(int[] heights) {
        return sum(heights, false);
    }
    public static double sum(int[] heights, boolean isBoy) {
        double sum = 0;
        int amount = 0;
        for (int height : heights) {
            if ((isBoy && height < 0) || (!isBoy && height > 0)) {
                amount++;
                sum += height;
            }
        }
        return Math.abs(sum / amount);
    }
}

