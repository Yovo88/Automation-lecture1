import java.util.Scanner;

public class Homework02_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int classes = Integer.parseInt(scanner.nextLine());
        int attendance = Integer.parseInt(scanner.nextLine());

        scanner.close();

        double percentAttendance = (attendance * 1.0 / classes) * 100;

        if (percentAttendance >= 75) {

            System.out.printf("%.0f%%%n",percentAttendance);
            System.out.println("You are able to attend");
        }
        else {
            System.out.printf("%.0f%%%n",percentAttendance);
            System.out.println("You are not able to attend");
        }



    }
}
