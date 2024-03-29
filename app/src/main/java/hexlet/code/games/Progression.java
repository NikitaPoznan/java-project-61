package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


import static hexlet.code.Engine.ROUND_COUNT;


public class Progression {
    private static final int START_NUMBER = 20;
    private static final int PROGRESSION_SIZE = 10;
    private static final int STEP_STEP = 5;

    public static void start() {
        var rule = "What number is missing in the progression?";
        String[][] gameRounds = new String[ROUND_COUNT][];


        for (var i = 0; i < ROUND_COUNT; i++) {
            gameRounds[i] = generateRound();


        }
        Engine.runGames(rule, gameRounds);
    }

    public static String[] generateRound() {
        String[] result = new String[2];


        var firstNumber = Utils.generateNumber(START_NUMBER);
        var step = Utils.generateNumber(STEP_STEP);
        var randomIndex = Utils.generateNumber(PROGRESSION_SIZE - 1);
        var progressionItems = generateProgression(firstNumber, PROGRESSION_SIZE, step);

        result[1] = progressionItems[randomIndex];
        progressionItems[randomIndex] = "..";
        result[0] = String.join(" ", progressionItems);

        return result;


    }

    private static String[] generateProgression(int firstNumber, int lengthProgression, int step) {
        var progressionItems = new String[lengthProgression];

        for (int i = 0; i < lengthProgression; i++) {
            progressionItems[i] = String.valueOf(firstNumber);
            firstNumber = firstNumber + step;

        }
        return progressionItems;
    }

}

