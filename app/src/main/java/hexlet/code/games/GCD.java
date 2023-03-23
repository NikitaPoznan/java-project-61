package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.MAX_NUMBER;
import static hexlet.code.Engine.ROUND_COUNT;

public class GCD {

    public static void start() {
        var rule = "Find the greatest common divisor of given numbers.";
        String[][] gameRounds = new String[ROUND_COUNT][2];  // вопрос, ответ , вопрос , ответ
        // параметры методов и возвращаемое значение методов(повторить!) передача параметров по ссылке и по значению!

        for (var i = 0; i < ROUND_COUNT; i++) {
            gameRounds[i] = generateRound();

            // создать константу, так как упоминается в нескольких местах. Это позволяет изменить только одну константу
        }
        Engine.runGames(rule, gameRounds);
    }

    public static String[] generateRound() {
        String[] result = new String[2];
        Random rand = new Random();
        int firstNumber = rand.nextInt(MAX_NUMBER);
        int secondNumber = rand.nextInt(MAX_NUMBER);

        result[0] = firstNumber + " " + secondNumber;
        result[1] = String.valueOf(gcd(firstNumber, secondNumber));
        return result;

    }

    public static int gcd(int firstNumber, int secondNumber) {
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
