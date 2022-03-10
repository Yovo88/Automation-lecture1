import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game! Please enter type: \n");
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 +1);
        String type = scanner.nextLine();

        int countEvenGames = 0;
        int countYovoWins = 0;
        int countCompWins = 0;

        while (type != "close"){

            if (type.equals("close")) {

                System.out.println("Game Over, Bye!");
                System.out.println("Even games: "+ countEvenGames);
                System.out.println("Computer wins: "+ countCompWins);
                System.out.println("Yovo's wins: " + countYovoWins);
                return;
            }
            switch (randomNum) {

                case 1:
                    System.out.println("rock");
                    break;
                case 2:
                    System.out.println("scissors");
                    break;
                case 3:
                    System.out.println("paper");
                    break;

            }
                if (type.equals("rock")&& randomNum == 1) {
                    countEvenGames ++;
                    System.out.println("The game is even. Current Even wins: "+ countEvenGames);
                }else if (type.equals("rock")&& randomNum == 2) {
                    countYovoWins ++;
                    System.out.println("Yovo wins the game!Current Yovo's wins: " + countYovoWins);
                }else if (type.equals("rock")&& randomNum == 3) {
                    countCompWins++;
                    System.out.println("Computer wins the game! Current computer wins: " + countCompWins);
                }else if (type.equals("paper")&& randomNum == 1) {
                    countYovoWins++;
                    System.out.println("Yovo wins the game!Current Yovo's wins: " + countYovoWins);
                }else if (type.equals("paper")&& randomNum == 2) {
                    countCompWins++;
                    System.out.println("Computer wins the game! Current computer wins: " + countCompWins);
                }else if (type.equals("paper")&& randomNum == 3) {
                    countEvenGames ++;
                    System.out.println("The game is even. Current Even wins: "+ countEvenGames);
                }else if (type.equals("scissors")&& randomNum == 1) {
                    countCompWins++;
                    System.out.println("Computer wins the game! Current computer wins: " + countCompWins);
                }else if (type.equals("scissors")&& randomNum == 2) {
                    countEvenGames++;
                    System.out.println("The game is even. Current Even wins: "+ countEvenGames);
                }else if (type.equals("scissors")&& randomNum == 3) {
                    countYovoWins ++;
                    System.out.println("Yovo wins the game!Current Yovo's wins: " + countYovoWins);
                }
            randomNum = ThreadLocalRandom.current().nextInt(1, 3 +1);
            type = scanner.nextLine();
        }

        }

    }

