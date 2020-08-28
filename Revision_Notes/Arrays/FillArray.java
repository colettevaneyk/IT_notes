package Revision_Notes.Arrays;

public class FillArray {
   public static void main(String[] args){
      // when setting up a empty array we 
      // need to tell it how many elements
      // it will contain. 
      int numInArray = 114748364;
      int[] variables = new int[numInArray];
      
      // variables[1] = 2;
      
      for(int e = 0; e < numInArray ; e++){
         variables[e] = e+1;
      }
      
      
      for(int e:variables){
         System.out.println(e);
      }
      
   }
}