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
      float valueB = 4.7f;
      // to convert to int use method below.
      int valueB_int = (int)valueB;
      System.out.println(valueB_int);
      // if statments use a condition and runs if the 
      // condition is met.
      if (valueA == 5){
         System.out.println("It's 5");
      }
      if (valueA != 4){
         System.out.println("It's not 4");
      }
      if (valueA < 6){
         System.out.println("Its less than 6");
      }
      if (valueA >= 3){
         System.out.println("Its equal to or greater than 3");
      } 
      // to test two conditions we use the && and ||
      // these are called logical operators.
      // the && checks if both conditions are true.
      // the || checks if one of the conditions are true.
      if (valueA == 5 && valueB == 4.75f){
         System.out.println("Both are true");
      }
      if (valueA == 5 || valueB == 4.75f){
         System.out.println("One of them are true");
      }
      
      
      
      
   }
}