import java.util.Scanner;

public class Zadacha_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sumNumbers = 0;

        for (int i = 1; i <= n ; i++) {

            sumNumbers = sumNumbers + i;


        }
        System.out.println("The sum is: " + sumNumbers);
    }
}
