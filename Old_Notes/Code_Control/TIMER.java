public class TIMER{

   public static void main(String[] args){
      System.out.print("number \t jumpCountA \t deltaTimeA \t jumpCountB \t deltaTimB \n" ); 
      int number = 0;
      int milNum = 1000000;
      int jumpCountA = 0;
      long startTimeA = System.nanoTime();
   
      for( int loop = 0; loop < 10; loop++){
         
         long startTimeB = System.nanoTime();
         int jumpCountB = 0;
         
         while(number<milNum){
            int randNum = GET.randInt(1,10);
            number = number + randNum;
           
            jumpCountA++;
            jumpCountB++;
            
            // System.out.println(jumpCountA+"\t" + jumpCountB + "\t" + number + "\t" + randNum); 
            
         }
         
         milNum = milNum + 1000000;
         
         long endTime = System.nanoTime();
         long deltaTimeA = endTime - startTimeA;
         long deltaTimeB = endTime - startTimeB;
         System.out.print((loop+1)+ "\t" +number + "\t" + jumpCountA + "\t" + deltaTimeA/1000000 + " \t" + jumpCountB + "\t" + deltaTimeB/1000000 + "\n" ); 
                   
      }
   
   }

}