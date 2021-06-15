package work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digit - >");
        int digit = scanner.nextInt();

        if (digit == 1) {
            System.out.println("One");
        } else if (digit == 2) {
            System.out.println("Two");
        } else if (digit == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Other");
        }

        switch (digit) {
            default:
                System.out.printf("Other"); break;
            case 1:
                System.out.printf("One"); break;
            case 2:
                System.out.printf("Two"); break;
            case 3:
                System.out.printf("Three"); break;
        }
    }
}
