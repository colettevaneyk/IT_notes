import java.util.Random;

public class GET {

    public static int randInt(int lowest, int highest) {
        Random rand = new Random();

        int randNum = rand.nextInt((highest - lowest + 1)) + lowest;
        // randNum = randNum + 1;
        return randNum;
    }

    public static void main(String[] args) {

    }
}
