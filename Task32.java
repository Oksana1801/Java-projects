package work32;

public class Task32 {
    public static void main(String[] args) {
        double procent = 16.3;
        int sum = 25_000;
        int numberMonth = 18;
        double proMonth = procent / 100 / 12;
        double delta = sum * proMonth * numberMonth;
        System.out.println("Sum->" + delta);
    }
}
