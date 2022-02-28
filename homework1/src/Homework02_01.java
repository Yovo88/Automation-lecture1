import java.util.Scanner;

public class Homework02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 0) {

            System.out.println(number);
        }
        else {

            number *= (- 1);

            System.out.println(number);

        }

    }
}
