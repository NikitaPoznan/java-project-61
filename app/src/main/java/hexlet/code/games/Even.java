package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


public class Even {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {

            int number = rand.nextInt(100);
            System.out.println("Question:" + number);
            System.out.println("Your answer:");
            String answer = scanner.next();
            String expectAnswer = number % 2 == 0 ? "yes" : "no";

            if (expectAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(expectAnswer + "is wrong answer ;(. Correct answer was .\n" + answer +
                        "Let's try again," + userName);
                return;
            }
        }
        System.out.println("Congratulations," + userName + "!");
    }
}

