import java.util.Scanner;

public class FibonacciNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, please enter your limit: \n");

        int limit = scanner.nextInt();


        int start = 0;
        int next = 1;

        while (next <= limit) {

            int average =  start + next;

            start+=next;
            next+=average;

            if (next >= limit) {
                System.out.println(start);
                System.out.println(next);
                break;
            }
            System.out.println(start);
            System.out.println(next);

        }



    }
}
