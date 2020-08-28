package Revision_Notes.Arrays;

public class BasicArray {
   public static void main(String[] args){
   /*
    *    Arrays are a more efficient way to store data. 
    *    Arrays in java are static, this means they only hold
    *    a specific number of values. (This needs to be defined)
    *    Arrays are zero referenced, i.e. the first value in the 
    *    array is the 0th value.
    *    Arrays are a class in Java and so specific formats need to
    *    be used to initialize an array.
    *    - Any primitive variable type can be used for an array.
    *    - Strings can also be used.
   */
   
      // a normal int array with values.
      
      int[] numbers = {11,12,13,14,15};
      
      System.out.println( numbers[0] );
      System.out.println( numbers[1] );
      System.out.println( numbers[2] );
      System.out.println( numbers[3] );
      System.out.println( numbers[4] );
      
      for(int e = 0; e < 5 ; e++ ){
         System.out.println(numbers[e]);
      }
      //                   0      1       2    3       4
      String[] words = {"Hello","this", "is", "an", "array"};
      for(int e = 0;e<5;e++){
         System.out.print(words[e]+" ");
      }
      System.out.println("");
      
      // We can use the method x.length to find out how many 
      // elements are in the array.
      // int wordsLength = words.length;
      // output: 5
      
      for ( int e = 0 ; e < words.length;e++){
         System.out.println(words[e]);
      } 
      // there is an easier way to print all elements in an array.
      // It is called a FOR-EACH loop.
      // SYNTAX
      // for(type variable : arrange){}
      for(String e : words){
         System.out.println(e);
      }
   }
}