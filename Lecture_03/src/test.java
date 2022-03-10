import java.sql.SQLOutput;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while ( n > 0) {

           sum = sum + n;

            n--;

        }
        scanner.close();
        System.out.println("Final sum is: " + sum);
    }
}
