package Task_1;

/* Use the following format to
* print 100 dots (.)
* use a for loop and if statements to
* print 10 dots on each line, and then 10 lines.
* eg. 
* ..........
* .......... etc 
*/
public class TaskOne{
   public static void main(String[] args){
      System.out.println("START");
      // WRITE YOUR CODE UNDER THIS COMMENT
      for(int x = 1; x <= 100;x++){
         System.out.print(".");
         // counter++;
         if(x%10==0){
            System.out.print("\n");
         }
      }
      
      // WRITE YOUR CODE ABOVE THIS COMMENT
      System.out.println("END");
   }
}
