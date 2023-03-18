package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static void start() {
        var rule = "What is the result of the expression?";
        String[][] gameRounds = new String[3][];  //
        Engine.runGames(rule, gameRounds); // параметры методов и возвращаемое значение методов(повторить!) передача параметров по ссылке и по значению!

        for (var i = 0; i < 3; i++) {
            gameRounds[i] = generateRound();

        }
    }

    public static String[] generateRound() {
        Random random = new Random();
        String[] result = new String[2];
        var firstNumber = random.nextInt(50);
        var secondNumber = random.nextInt(10);
        var operationPossibles = "+-*";
        var operation = operationPossibles.charAt((int) (Math.random() * operationPossibles.length()));
        result[0] = String.valueOf(firstNumber + operation + secondNumber);
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

// a b
// a % b

// while (a!==0 && b!==0)   // отдельный метод ( два параметра)

