package ua.cherkasskiy.hw5;

public class Practice1 {
    public static void main(String[] args) {
        double[] prices = {1001, 1500, 500, 3545,
                111, 15000, 20000, 50,
                900, 7000, 88888, 777};
        System.out.println(sumOfProduct(prices));
    }
    public static double sumOfProduct(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            if (price > 1000) {
                sum += price;
            }
        }
        return sum;
    }
}

