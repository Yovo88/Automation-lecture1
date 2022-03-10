import java.util.Scanner;

public class Zadacha_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int lastNumber = (number % 10) * 100;
        int middleNumber  = ((number / 10) % 10) * 10;
        int firstNumber =  number / 100;

        int reversNumber = lastNumber + middleNumber + firstNumber;
        System.out.println("The number is: " + reversNumber);

    }
}
