package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

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
        Random rand = new Random();
        int number = rand.nextInt(MAX_NUMBER);
        result[0] = String.valueOf(number);
        result[1] = number % 2 == 0 ? "yes" : "no";
        return result;
    }

}


