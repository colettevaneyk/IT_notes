package Old_Notes.Code_Control;

public class SPEEDTEST {
   public static void main(String[] args){
      long startTimer = System.nanoTime();
      
      //    TEST CODE START
      for(int loops = 0; loops < 100; loops++){
         System.out.print(loops);
         int randVal = GET.randInt(1,5);
         System.out.print("\t" + randVal);
         if (randVal == 1){
            System.out.println("A");
         }
         if (randVal == 2){
            System.out.println("B");
         }
         if (randVal == 3){
            System.out.println("C");
         }
         if (randVal == 4){
            System.out.println("D");
         }
         if (randVal == 5){
            System.out.println("E");
         }
      }
      //    TEST CODE END
      long endTimer = System.nanoTime();
     
      
      long deltaTimer = endTimer - startTimer;
      System.out.println("\nTIME: " + deltaTimer + "ns");
   }
}