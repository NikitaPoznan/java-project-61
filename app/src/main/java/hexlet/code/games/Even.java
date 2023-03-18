package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;



public class Even {
    public static void start() {
        var rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameRounds = new String[3][];  // вопрос, ответ , вопрос , ответ
        Engine.runGames(rule, gameRounds); // параметры методов и возвращаемое значение методов(повторить!) передача параметров по ссылке и по значению!

        for (var i = 0; i < 3; i++) {
            gameRounds[i] = generateRound();
            // создать константу, так как упоминается в нескольких местах. Это позволяет изменить только одну константу
        }
    }
    public static String[] generateRound() {
        String[] result= new String[2];   // генерация раундов, вопрос и ответ (генерация под массива)
        Random rand = new Random();
        int number = rand.nextInt(100);
        result[0] = String.valueOf(number);
       result[1] = number % 2 == 0 ? "yes" : "no"; // return ??
        return result;
    }

    }


