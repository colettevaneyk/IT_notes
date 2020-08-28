package Old_Notes.Code_Control;

public class SWITCH {
   public static void main(String[] args) {
      /*
      *    SWITCH CASES ARE BASICALLY ELSE IF CONTROL STRUCTURES.
      *     The switch expression is evaluated once.
         *     The value of the expression is compared with the values of each case.
         *     If there is a match, the associated block of code is executed.
         *     If there is no match, the default code block is executed.
         *     To make sure the code exits a case, 
         *     the <break;> function is used.
      *
      */
   
      int checkVal = GET.randInt(1,4);    
         
      switch(checkVal) {
         // the value after the <case> is similar to
         // if(checkVal == 1){}
         case 1:
            // code block
            System.out.println("A");
            break; 
         case 2:
            System.out.println("B");
            break;
         case 3:
            System.out.println("C");
            break;
            // the <default statement will be run
            // if 1,2,3 are not available.
         default:
            System.out.println("NULL");
      }
   }
}