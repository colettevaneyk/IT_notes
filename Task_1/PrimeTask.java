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
public class PrimeTask{
   public static void main(String[] args){
      int checkNum = 12;
      int divMod = 0; //used to get modulo
      int divCount = 0; // increments when there is a divisor.
      
      System.out.println("Is " + checkNum + " prime?");
      
      // for loop to divide checkNum by all numbers lower than it.
      for(int div = 1; div <= checkNum; div++){
         divMod = checkNum % div; 
         // System.out.println(checkNum + "%" + div + "=" + divMod);
         if (divMod == 0){
            divCount++;
         }
      }
      if(divCount == 2){
         System.out.println("Yes");
      }
      else{
         System.out.println("No");
      }
   }
  }