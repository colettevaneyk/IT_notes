import java.util.Date;  

public class SWITCH{
   public static void main(String[] args) {
      /*
      *    SWITCH CASES ARE BASICALLY ELSE IF CONTROL OPERATIONS.
      *     The switch expression is evaluated once.
         *     The value of the expression is compared with the values of each case.
         *     If there is a match, the associated block of code is executed.
         *     If there is no match, the default code block is executed.
      *
      */
      
      long startTimer = System.nanoTime();
      // int day = new Date().getDay(); 
      for(int x = 0;x<1000;x++){
      
         int checkVal = GET.randInt(1,10);    
         switch(checkVal) {
            case 1:
            // code block
               System.out.println("A");
               break; 
            case 2:
            // code block
               System.out.println("B");
               break;
            case 3:
            // code block
               System.out.println("C");
               break;
            case 4:
            // code block
               System.out.println("D");
               break; 
            case 5:
            // code block
               System.out.println("E");
               break;
            case 6:
            // code block
               System.out.println("F");
               break;
            case 7:
            // code block
               System.out.println("G");
               break;
            case 8:
            // code block
               System.out.println("H");
               break;
            case 9:
            // code block
               System.out.println("I");
               break;
            case 10:
            // code block
               System.out.println("J");
               break;
            default:
               System.out.println("NULL");
         // code block
         }
      }
      long endTimer = System.nanoTime();
      long deltaTimer = endTimer - startTimer;
      System.out.println("ns: " + deltaTimer);
      
   }
}