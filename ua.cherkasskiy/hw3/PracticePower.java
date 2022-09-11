public class PracticePower {
    public static void main(String[] args) {
        PracticePower Solution = null;
        System.out.println(Solution.pow(2, 3));
    }
    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++){
            result = result * value;
        }
        return result;
    }
}
