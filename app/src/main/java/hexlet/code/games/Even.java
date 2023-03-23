package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUND_COUNT;
import static hexlet.code.Engine.MAX_NUMBER;


public class Even {
    public static void start() {
        var rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameRounds = new String[ROUND_COUNT][];  // вопрос, ответ , вопрос , ответ
        // параметры методов и возвращаемое значение методов(повторить!) передача параметров по ссылке и по значению!

        for (var i = 0; i < ROUND_COUNT; i++) {
            gameRounds[i] = generateRound();

            // создать константу, так как упоминается в нескольких местах. Это позволяет изменить только одну константу
        }
        Engine.runGames(rule, gameRounds);
    }

    public static String[] generateRound() {
        String[] result = new String[2];   // генерация раундов, вопрос и ответ (генерация под массива)
        Random rand = new Random();
        int number = rand.nextInt(MAX_NUMBER);
        result[0] = String.valueOf(number);
        result[1] = number % 2 == 0 ? "yes" : "no";
        return result;
    }

}


