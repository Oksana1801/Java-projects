package work63;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text ->");
        String str = sc.nextLine();

        System.out.print("Enter number word ->");
        int number = sc.nextInt();

        System.out.println(getFirstCharacterofWord(str, number) );
    }

    public static char getFirstCharacterofWord(String str, int numberWord) {
        char ch = '\u0000';
        str = str.trim();
        if (numberWord == 1) {
            return  str.charAt(0);
        }
        int position = 0;
        int counterWord = 1;

        return ch;
    }

}