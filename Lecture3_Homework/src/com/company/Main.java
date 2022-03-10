package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fNumber = scanner.nextInt();
        int sum = 0;

        while (fNumber >= 0) {

            int n = fNumber - 1;

            sum = fNumber * n * (--n) + sum ;


            fNumber--;
        }

        System.out.println(sum);

    }
}
