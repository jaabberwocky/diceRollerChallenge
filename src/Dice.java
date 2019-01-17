import java.util.Random;

public class Dice {

    public static String Roll(){
        Random rand = new Random();
        int resultFirst = rand.nextInt(6) + 1;
        int resultSecond = rand.nextInt(6) + 1;
        int result = resultFirst + resultSecond;
        return String.format("Roll: %d + %d = %d ", resultFirst, resultSecond, result);
    }
}
