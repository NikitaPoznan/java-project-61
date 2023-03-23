package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUND_COUNT;


public class Progression {

    public static void start() {
        var rule = "What number is missing in the progression?";
        String[][] gameRounds = new String[ROUND_COUNT][];  // вопрос, ответ , вопрос , ответ
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

        var firstNumber = rand.nextInt(20);
        var lengthProgression = rand.nextInt(10); // a(n+1) = an + d
        var step = rand.nextInt(5);
        var randomIndex = rand.nextInt(lengthProgression - 1);
        var progressionItems = generateProgression(firstNumber, lengthProgression, step);

        result[0] = progressionItems[randomIndex];
        progressionItems[randomIndex] = "..";
        result[1] = String.join(" ", progressionItems);

        return result;
// требуется создать метод, в котором складывалось разница с первым числом и создать заявленный цикл?

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


// результирующий массив, цикл заполняем, в цикле по счётчику
// result [i] = result [i - 1] + step  // предыдущий элемент массива
// result [i] = firstNumber + i * step
// String join  чтобы соединить массив в одну строку, у нас есть последовательность по элементам и нужно это сделать два раза