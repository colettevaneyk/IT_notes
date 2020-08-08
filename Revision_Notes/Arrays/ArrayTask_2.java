package Revision_Notes.Arrays;

public class ArrayTask_2 {
   public static void main(String[] args){
      
      int[] threeArray = new int[500];
      int threes = 0;
      // for loop to fill value
      for(int x = 0; x < threeArray.length; x++){
         threes = threes + 3;
         threeArray[x] = threes; // fill array  
         
      }
      // for loop to print
      int counter= 0;
      for(int y = 0; y < threeArray.length; y++){
         if(y%5 == 0){
            counter++;
            System.out.println(counter + " " + threeArray[y]);
         }
      }
   }
}