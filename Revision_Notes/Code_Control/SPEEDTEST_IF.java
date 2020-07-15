//6066
//6245ms
// 6314ms
public class SPEEDTEST_IF{
   public static void main(String[] args){
      long startTimer = System.nanoTime();
      
      //    TEST CODE START
      int randCount = 0;
      
      for(int loops = 0; loops < MASTER.test_loop; loops++){
         // System.out.print(loops);
         int randVal = GET.randInt(1,15);
         // System.out.print("\t" + randVal);
         if (randVal == 1){
            // System.out.println("A");
            randCount = randCount + 1;
         }
         if (randVal == 2){
            // System.out.println("B");
            randCount = randCount + 1;
         }
         if (randVal == 3){
            // System.out.println("C");
            randCount = randCount + 1;
         }
         if (randVal == 4){
            // System.out.println("D");
            randCount = randCount + 1;
         }
         if (randVal == 5){
            // System.out.println("E");
            randCount = randCount + 1;
         }
         if (randVal == 6){
            // System.out.println("A");
            randCount = randCount + 1;
         }
         if (randVal == 7){
            // System.out.println("B");
            randCount = randCount + 1;
         }
         if (randVal == 8){
            // System.out.println("C");
            randCount = randCount + 1;
         }
         if (randVal == 9){
            // System.out.println("D");
            randCount = randCount + 1;
         }
         if (randVal == 10){
            // System.out.println("E");
            randCount = randCount + 1;
         }
         if (randVal == 11){
            // System.out.println("A");
            randCount = randCount + 1;
         }
         if (randVal == 12){
            // System.out.println("B");
            randCount = randCount + 1;
         }
         if (randVal == 13){
            // System.out.println("C");
            randCount = randCount + 1;
         }
         if (randVal == 14){
            // System.out.println("D");
            randCount = randCount + 1;
         }
         if (randVal == 15){
            // System.out.println("E");
            randCount = randCount + 1;
         }
      }
      //    TEST CODE END
      long endTimer = System.nanoTime();
     
      
      long deltaTimer = endTimer - startTimer;
      double blockSec = (double)randCount / ((double)deltaTimer/100000000l);
      System.out.println("IF     \t" + deltaTimer/1000000 + "ms\t" + randCount + "\t" + blockSec);
   }
}