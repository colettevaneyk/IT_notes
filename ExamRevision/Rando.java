// import the random class allow the random
// number to go up to 10
// if the number is less than 5 print
// 5 "-" using a for loop.
// if its greater than and equal to 5 print
// the random number. Name the class Rando
import java.util.Random;
// import java.util.System;
public class Rando{
   public static void main(String[] args){
      // sets up the random
      long startTimer = System.nanoTime();
      //check how long
      Random number = new Random();
      int value = number.nextInt(10);
      
      if(value < 5){
         for(int i = 0; i<5;i++){
            System.out.println("-");
         }
      } 
      else{
         System.out.print(value);
      }
      
      long endTimer = System.nanoTime();
      long deltaTimer = endTimer - startTimer;
      System.out.println("Total Time: " + deltaTimer);
      double seconds = deltaTimer/1000000000f;
      System.out.println("Seconds: " + seconds);
   
      
      
      
   }
}
