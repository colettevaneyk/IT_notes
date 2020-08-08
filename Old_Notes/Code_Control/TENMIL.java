package Old_Notes.Code_Control;

public class TENMIL {

   public static void main(String[] args){
   
      int number = 0;
      int million = 1000000;
      int total_loops = 10;
      
      int[] mainTimer_array = new int[total_loops];
      int[] loopTimer_array = new int[total_loops];
      
      long startTimer_main = System.nanoTime();
   
      for( int loop = 0; loop < total_loops; loop++){
         
         long startTimer_loop = System.nanoTime();
         
         while(number < million){
            
            // System.out.print(number+"\t+\t");
            
            int random = GET.randInt(1,10);
            
            // System.out.print(random+"\t=\t");
            
            number = number + random;
            
            // System.out.println(number); 
            
         }
         
         million = million + 1000000;
         
         long endTimer = System.nanoTime();
         long deltaTime_main = endTimer - startTimer_main;
         long deltaTime_loop = endTimer - startTimer_loop;
         
         int millisec_main = (int)deltaTime_main/100000;
         int millisec_loop = (int)deltaTime_loop/100000;
         
         mainTimer_array[loop] = millisec_main;
         loopTimer_array[loop] = millisec_loop;
         
         // System.out.print((loop+1)+ "\t" +number + "\t" + deltaTime_main + " \t" + deltaTime_loop + "\n" ); 
      //              
      }
      
      for(int lines = 0; lines < total_loops; lines++){
         int x = lines;
         System.out.print((x+1) + "\t" + mainTimer_array[x] + " \t" + loopTimer_array[x] + "\n");   
      }
   }

}