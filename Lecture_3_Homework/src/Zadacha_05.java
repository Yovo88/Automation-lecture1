import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Zadacha_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int revers = 0;

        while (number != 0) {

            int reminder = number % 10;

            revers = revers * 10 + reminder;

            number = number / 10;


        }
        System.out.println(revers);
    }

}
