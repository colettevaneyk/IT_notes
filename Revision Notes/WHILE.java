public class WHILE{
   public static void main(String[] args){
      
      // THE DO WHILE LOOP
      // The aim of loops is just to repeat a
      //   piece of code simply.
      // do whiles are useful as you tell it 
      //   what you want to happen and check the condition
      //   at the end.
      int counter = 6;
      do{
         counter++;
         System.out.println("Do Loop: "+ counter);
      } 
      while(counter < 5);
      
      //and a while loop
      counter = 6;
      while(counter < 5){
         counter++;
         System.out.println("While Loop: "+ counter);
         
      }
      // Do loops are useful if you want the code to
      //    run at least once, and then if condition is not met
      //    will kick you out, where the normal while will just 
      //    not run at all.
      
   }
}