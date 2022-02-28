import java.util.Scanner;

public class Homework02_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        boolean isFalse = false;

        scanner.close();

        if (day <= 31 && month == 1) {

            System.out.println("Valid date");
        } else if (day <= 29 && month == 2) {

            if (year % 4 == 0) {
                isFalse = true;
            }

            System.out.println("Valid date");
        } else if (day <= 31 && month == 3) {

            System.out.println("Valid date");
        }
        else if (day <= 30 && month == 4) {

        System.out.println("Valid date");
        }else if (day <= 31 && month == 5) {

            System.out.println("Valid date");
        }else if (day <= 30 && month == 6) {

            System.out.println("Valid date");
        }else if (day <= 31 && month == 7) {

            System.out.println("Valid date");
        }else if (day <= 31 && month == 8) {

            System.out.println("Valid date");
        }else if (day <= 30 && month == 9) {

            System.out.println("Valid date");
        }else if (day <= 31 && month == 10) {

            System.out.println("Valid date");
        }else if (day <= 30 && month == 11) {

            System.out.println("Valid date");
        }else if (day <= 31 && month == 12) {

            System.out.println("Valid date");
        } else {
            System.out.println("Not a valid date");
        }
    }
}
