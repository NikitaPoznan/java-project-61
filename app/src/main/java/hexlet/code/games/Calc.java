package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


import static hexlet.code.Engine.MAX_NUMBER;
import static hexlet.code.Engine.ROUND_COUNT;


public class Calc {

    public static void start() {
        var rule = "What is the result of the expression?";
        String[][] gameRounds = new String[ROUND_COUNT][];  //
        // параметры методов и возвращаемое значение методов(повторить!) передача параметров по ссылке и по значению!

        for (var i = 0; i < ROUND_COUNT; i++) {
            gameRounds[i] = generateRound();

        }
        Engine.runGames(rule, gameRounds);
    }

    public static String[] generateRound() {
        String[] result = new String[2];
        var firstNumber = Utils.generateNumber(MAX_NUMBER);
        var secondNumber = Utils.generateNumber(MAX_NUMBER);
        var operationPossibles = "+-*";
        var operation = operationPossibles.charAt((int) (Math.random() * operationPossibles.length()));
        result[0] = String.format("%s %s %s", firstNumber, operation, secondNumber);
        result[1] = String.valueOf(calculate(firstNumber, secondNumber, operation));
        return result;


    }

    private static int calculate(int firstNumber, int secondNumber, char operation) {
        if (operation == '+') {
            return firstNumber + secondNumber;
        } else if (operation == '-') {
            return firstNumber - secondNumber;
        } else {
            return firstNumber * secondNumber;
        }

    }
}

