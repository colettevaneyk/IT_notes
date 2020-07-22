public class BasicArray{
   public static void main(String[] args){
   /*
    *    Arrays are a more efficent way to store data. 
    *    Arrays in java are static, this means they only hold
    *    a specific number of values. (This needs to be defined)
    *    Arrays are zero referenced, i.e. the first value in the 
    *    array is the 0th value.
    *    Arrays are a class in Java and so specific formats need to
    *    be used to initilise an array.
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
      
      int wordsLength = words.length;
      
      for ( int e = 0 ; e < words.length;e++){
         System.out.println(words[e]);
      } 
      
   }
}