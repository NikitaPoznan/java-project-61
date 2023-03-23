package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUND_COUNT;
import static hexlet.code.Engine.MAX_NUMBER;

public class Prime {
    public static void start() {
        var rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameRounds = new String[ROUND_COUNT][];  // вопрос, ответ , вопрос , ответ
        // параметры методов и возвращаемое значение методов(повторить!) передача параметров по ссылке и по значению!

        for (var i = 0; i < ROUND_COUNT; i++) {
            gameRounds[i] = generateRound();

            // создать константу, так как упоминается в нескольких местах. Это позволяет изменить только одну константу
        }
        Engine.runGames(rule, gameRounds);
    }

    private static String[] generateRound() {
        String[] result = new String[2];   // генерация раундов, вопрос и ответ (генерация под массива)
        Random rand = new Random();
        int number = rand.nextInt(MAX_NUMBER);
        result[0] = String.valueOf(number);
        result[1] = countPrime(number) ? "yes" : "no";
        return result;
    }

    private static boolean countPrime(int number) {
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
