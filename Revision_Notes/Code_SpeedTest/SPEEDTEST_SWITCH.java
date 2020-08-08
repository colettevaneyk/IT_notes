package Revision_Notes.Code_SpeedTest;

//5947ms
//6075ms
//5950ms
public class SPEEDTEST_SWITCH{
   public static void main(String[] args){
      long startTimer = System.nanoTime();
      int randCount = 0;
      int randVal = 0;
      //    TEST CODE START
      for(int loops = 0; loops < MASTER.test_loop; loops++){
         // System.out.print(loops);
         // int randVal = GET.randInt(1,15);
         randVal++;
         // System.out.print("\t" + randVal);
         switch (randVal){
            case 1:
               // System.out.println("A");
               randCount++;
               break;
            case 2:
               // System.out.println("B");
               randCount++;
               break;
            case 3:
               // System.out.println("C"); 
               randCount++;
               break;
            case 4:
               // System.out.println("D");
               randCount++;
               break;
            case 5:
               // System.out.println("E");
               randCount++;
               break;
            case 6:
               // System.out.println("A");
               randCount++;
               break;
            case 7:
               // System.out.println("B");
               randCount++;
               break;
            case 8:
               // System.out.println("C"); 
               randCount++;
               break;
            case 9:
               // System.out.println("D");
               randCount++;
               break;
            case 10:
               // System.out.println("E");
               randCount++;
               break;
            case 11:
               // System.out.println("A");
               randCount++;
               break;
            case 12:
               // System.out.println("B");
               randCount++;
               break;
            case 13:
               // System.out.println("C"); 
               randCount++;
               break;
            case 14:
               // System.out.println("D");
               randCount++;
               break;
            case 15:
               // System.out.println("E");
               randCount++;
               randCount++;
               randVal = 0;
               break;
         }
      }
      //    TEST CODE END
      long endTimer = System.nanoTime();
      
      
      long deltaTimer = endTimer - startTimer;
      double blockSec = (double)randCount / ((double)deltaTimer/100000000l);
      System.out.println("SWITCH \t" + deltaTimer/1000000 + "ms\t" + randCount + "\t" + blockSec);
      
      // System.out.println("COUNT: " + randCount );
   }
}