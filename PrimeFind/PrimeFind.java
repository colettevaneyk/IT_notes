// the point of this is to find a certain number
// of prime numbers.

public class PrimeFind{
   public static void main(String[] args){
      int primesToFind = 500;// the primes to find
      int primesFound = 0;// will increment when p found
      int currentNumber = 0;// the number to check
      
      long startTimer = System.nanoTime(); // start timing
      
      while(primesFound<primesToFind){
         currentNumber++; //just increments the number to check
         int divisorCount = 0;
         for (int divisor = 1;divisor<=currentNumber;divisor++){
            int moduloDivisor = currentNumber%divisor;
            if(moduloDivisor == 0){
               divisorCount++;
            }
         }
         if(divisorCount == 2){
            primesFound++;
            System.out.println(currentNumber);
         }
      }
      long stopTimer = System.nanoTime();
      long deltaTimer = stopTimer - startTimer;
      double deltaTimerSec = deltaTimer/1000000000d;
      System.out.println(deltaTimerSec);
   }
}