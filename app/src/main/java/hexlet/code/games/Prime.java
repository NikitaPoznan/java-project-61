package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


import static hexlet.code.Engine.MAX_NUMBER;
import static hexlet.code.Engine.ROUND_COUNT;

public class Prime {
    public static void start() {
        var rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameRounds = new String[ROUND_COUNT][];

        for (var i = 0; i < ROUND_COUNT; i++) {
            gameRounds[i] = generateRound();


        }
        Engine.runGames(rule, gameRounds);
    }

    private static String[] generateRound() {
        String[] result = new String[2];
        int number = Utils.generateNumber(MAX_NUMBER);
        result[0] = String.valueOf(number);
        result[1] = isPrime(number) ? "yes" : "no";
        return result;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
}
