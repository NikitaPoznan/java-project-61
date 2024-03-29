package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;
    public static final int MAX_NUMBER = 100;

    public static void runGames(String rule, String[][] gameRounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);

        for (var result : gameRounds) {
            System.out.println("Question: " + result[0]);
            System.out.println("Answer: ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase(result[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;


            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
