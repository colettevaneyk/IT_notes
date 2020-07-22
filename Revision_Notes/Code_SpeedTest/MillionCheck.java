public class MillionCheck{
   public static void main(String[] args){
      int number = 0;
      int million = 1000000;
      
      for(int loops = 0; loops < 10; loops++){
         long startTimer = System.nanoTime();
         while(number <= million){
            int random = GET.randInt(1,10);
            // int random = 1;
            number = number + random;  
         }
         million = million + 1000000;
         long endTimer = System.nanoTime();
         long deltaTimer = endTimer - startTimer;
         System.out.println((loops+1) + "\t" + number +"\t" + deltaTimer);
      }
   }
}