import java.util.Random;

public class ArrayRandom{

   public static void main(String[] args){
      Random rand = new Random();
      int[] numArray = new int[10000];//new array with 10000 values
      
      // this part fills the array with a random (0-9)
      for(int each = 0; each<10000;each++){  // for each value in numArray.
         int randNum = rand.nextInt((1-0+1))+0;
         numArray[each] = randNum;
         // System.out.println(numArray[each]);
      }
      // print the results
      int counter = 0; // this will count to 10 and then be set to 0.
      
      for(int value : numArray){
         counter++;
         if(counter != 20){
            System.out.print(value + "\t");
         }
         else if(counter == 20){
            counter = 0;
            System.out.print(value + "\n");
         }
      }
   }
}