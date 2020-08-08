package Task_1;

// package PrimeTask;

/* CHECK IF A NUMBER IS PRIME
  * WHAT IS A PRIME?
  * A number with 2 divisors, itself and one.
  * So to find out if a number is prime you
  * need to divide it by all the numbers lower
  * than and including itself.
  * You can you a modulo to test if a number
  * divides into another.
  * AIM: Input number, then check, then print result.
*/
public class PrimeTask {
   public static void main(String[] args) {
   
      int checkNum = 1543663;
      int divisorMod = 0;
      int divCount = 0;
   
      System.out.println("Is " + checkNum + " Prime?");
   
      for (int divNum = 1; divNum <= checkNum; divNum++) {
         divisorMod = checkNum % divNum;
         if (divisorMod == 0) {
            divCount++;
         }
      }
      if (divCount == 2) {
         System.out.println("YES");
      } else {
         System.out.println("NO");
      }
   }
}