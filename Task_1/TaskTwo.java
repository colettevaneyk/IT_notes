// use the template to answer the question:
// 1) If the number is greater than or equal to 3
//    print "Three"
// 2) If the number is equal to 2 print "Two"
// 3) If the number is less than or equal to one
//    print "One"
import java.util.Random;
public class TaskTwo{
   public static void main(String[] args){
      Random rand = new Random();
      int number = rand.nextInt((4-0+1));
      System.out.println("Random: " + number);
      // WRITE YOUR CODE UNDER THIS COMMENT
      if(number>=3){
         System.out.println("Three");
      }
      else if(number==2){
         System.out.println("Two");
      }
      else{
         System.out.println("One");
      }
      // WRITE YOUR CODE ABOVE THIS COMMENT
   }
}