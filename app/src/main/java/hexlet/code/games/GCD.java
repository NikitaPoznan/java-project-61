package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



import static hexlet.code.Engine.MAX_NUMBER;
import static hexlet.code.Engine.ROUND_COUNT;

public class GCD {

    public static void start() {
        var rule = "Find the greatest common divisor of given numbers.";
        String[][] gameRounds = new String[ROUND_COUNT][2];

        for (var i = 0; i < ROUND_COUNT; i++) {
            gameRounds[i] = generateRound();


        }
        Engine.runGames(rule, gameRounds);
    }

    public static String[] generateRound() {
        String[] result = new String[2];
        int firstNumber = Utils.generateNumber(MAX_NUMBER);
        int secondNumber = Utils.generateNumber(MAX_NUMBER);

        result[0] = firstNumber + " " + secondNumber;
        result[1] = String.valueOf(calculateGcd(firstNumber, secondNumber));
        return result;

    }

    public static int calculateGcd(int firstNumber, int secondNumber) {
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;

            }
        }

        return firstNumber + secondNumber;
    }
}
