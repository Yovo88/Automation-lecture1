import java.util.concurrent.ThreadLocalRandom;

public class Homework_01 {
    public static void main(String[] args) {


        int randomNum = ThreadLocalRandom.current().nextInt(1, 30 + 1);

        if (randomNum >= 5) {

            System.out.println("The randomNumber is greater the 5: " + randomNum);

        }
        else {
            System.out.println("The number is lower then 5: " + randomNum);
        }
    }
}
