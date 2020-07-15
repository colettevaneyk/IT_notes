//NAME: CountDivThree.java 
//PURPOSE: Count the number of values divisable by 3 under and including 60.

public class CountDivThree
{
   public static void main(String [] args)
   {
      //VARIABLES
      int numberInc = 0; // number to be incremented in loop.
      int divCount = 0; // increase when number divisable by 3.
      
      while (numberInc <= 60)
      {
         numberInc++; //increment main number
         int modNumber = numberInc % 3;
         if(modNumber == 0)
         {
            divCount++;
         }
      }
      System.out.print(divCount);
      
   }
   
}