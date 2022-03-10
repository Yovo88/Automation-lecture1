import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadacha_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello please select an option:  \n" +
                "To open the menu please select 1: \n" +
                "To view more options please select 2: \n" +
                "To exit the program please select 3: \n");


        int inputN = scanner.nextInt();
        int input = 3;
        do {
            switch (inputN) {
                    case 1:
                        System.out.println("The menu is opened");
                        break;
                    case 2:
                        System.out.println("Please choose an option");
                        break;
                    default:
                        System.out.println("Exit");
                        return;

                }
                inputN = scanner.nextInt();
            }
            while (inputN <= input) ;
        }
    }
