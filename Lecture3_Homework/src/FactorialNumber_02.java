import java.util.Scanner;

public class FactorialNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fNumber = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i<=fNumber; i++) {


            int middleSum = i * (i+1);

            sum = middleSum * (i);

        }
        System.out.println(sum);
    }
}
