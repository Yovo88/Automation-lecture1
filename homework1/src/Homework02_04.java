import java.util.concurrent.ThreadLocalRandom;

public class Homework02_04 {
    public static void main(String[] args) {


        int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        if (randomNum % 2 == 0) {
            System.out.println("The number is even: " + randomNum);
        } else {
            System.out.println("The number is odd: " + randomNum);
        }

    }
}
