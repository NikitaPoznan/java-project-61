package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void runGames(String rule, String[][] gameRounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rule);

        for (var process : gameRounds) {    // два цикла для генеарции вопросов и для отыгрыша
            System.out.println("Question:" + process[0]);
            System.out.println("Answer:");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(process[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was .\n" + process[1] +
                        " Let's try again," + userName);
                return;

            }
        }
        System.out.println("Congratulations," + userName + "!");
    }
 }
