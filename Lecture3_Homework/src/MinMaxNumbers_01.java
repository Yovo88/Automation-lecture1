import java.sql.SQLOutput;
import java.util.Scanner;

public class MinMaxNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, how many numbers do you wish to enter?");

        int count = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number = 0; number < count; number++) {
            System.out.println("Please enter a number: ");

            int enteredNumber = scanner.nextInt();

            if (enteredNumber < min) {

                min = enteredNumber;
            }
            else if (enteredNumber > max) {

                max= enteredNumber;
            }
        }

        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
    }
}
