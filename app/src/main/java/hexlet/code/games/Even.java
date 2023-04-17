package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.MAX_NUMBER;
import static hexlet.code.Engine.ROUND_COUNT;


public class Even {
    public static void start() {
        var rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameRounds = new String[ROUND_COUNT][];  // вопрос, ответ , вопрос , ответ


        for (var i = 0; i < ROUND_COUNT; i++) {
            gameRounds[i] = generateRound();


        }
        Engine.runGames(rule, gameRounds);
    }

    public static String[] generateRound() {
        String[] result = new String[2];
        int number = Utils.generateNumber(MAX_NUMBER);
        result[0] = String.valueOf(number);
        result[1] = isEven(number) ? "yes" : "no";
        return result;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}


