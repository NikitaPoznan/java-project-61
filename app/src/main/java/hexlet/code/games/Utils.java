package hexlet.code.games;

import java.util.Random;
public class Utils {
    private static final Random RAND = new Random();
    public static int generateNumber(int a){

        return RAND.nextInt(a);
    }
}
