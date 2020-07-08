// Every java file needs to have a class
// The class needs to be named the same as the file.

public class IF{
   //Then we need a main method.
   // public means other files can access the method.
   // void means no return value is nessesary.
   public static void main(String[] args){
      // you need to decare variables using  
      // their data type.
      int valueA = 5;
      float valueB = 4.75f;
      // to convert to int use method below.
      int valueB_int = (int)valueB;
      System.out.println(valueB_int);
      // if statments use a condition and runs if the 
      // condition is met.
      if (valueA == 5){
         System.out.println("It's 5");
      }
      if (valueA != 5){
         System.out.println("It's not 5");
      }
      
   }
}