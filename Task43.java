package work43;

public class Task43 {
    public static void main(String[] args) {
        int numberline = 1;
        while (numberline <= 8) {
            int digit = numberline;
            while (digit > 0) {
                System.out.print(digit + " ");
                digit--;
            }
            System.out.println();
            numberline++;
        }
    }
}
