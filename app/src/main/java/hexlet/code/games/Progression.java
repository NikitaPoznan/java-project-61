package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUND_COUNT;


public class Progression {

    public static void start() {
        var rule = "What number is missing in the progression?";
        String[][] gameRounds = new String[ROUND_COUNT][];  // вопрос, ответ , вопрос , ответ


        for (var i = 0; i < ROUND_COUNT; i++) {
            gameRounds[i] = generateRound();


        }
        Engine.runGames(rule, gameRounds);
    }

    public static String[] generateRound() {
        String[] result = new String[2];
        Random rand = new Random();

        var firstNumber = rand.nextInt(20);
        var lengthProgression = 10; // a(n+1) = an + d
        var step = rand.nextInt(5);
        var randomIndex = rand.nextInt(lengthProgression - 1);
        var progressionItems = generateProgression(firstNumber, lengthProgression, step);

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

