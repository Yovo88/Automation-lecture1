import java.util.Scanner;

public class Zadacha_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, how many numbers do you wish to enter? \n");

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Please enter a number: ");
            int enteredNumber  = scanner.nextInt();

            sum = sum + enteredNumber;


        }

        System.out.println("The sum is: " + sum);
    }
}
