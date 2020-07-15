import java.util.Random;

public class GET {

   public static int randInt(int lowest, int highest) {
      Random rand = new Random();// new instance of rand
      int randNum = rand.nextInt((highest - lowest + 1)) + lowest;
      return randNum; // returns value to variable requesting it.
   }
   public static void main(String[] args) {
   }
}
