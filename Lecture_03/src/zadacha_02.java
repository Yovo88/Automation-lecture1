import java.util.Scanner;

public class zadacha_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you want to enter? ");

        int number = scanner.nextInt();

        int sumOfNumbers = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Next number ");

           int inputNumber = scanner.nextInt();

            sumOfNumbers += inputNumber;
        }

        System.out.println("The final sum is: " + sumOfNumbers);

    }
}
