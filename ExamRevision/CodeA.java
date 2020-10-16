public class CodeA{

   public static void main(String[] args){
      int number =34;
      int count = 0;
      System.out.println("i\t n\t m \t c");
      System.out.println("n/a" +"\t"+ number+ "\t"+ "n/a" + "\t"+ "count");
      for (int i = 0; i<12;i++){
         number = number -2;
         int moduloNumber = number % 3;
      
         if (moduloNumber == 0){
            count = count + 1;
         }
         
         System.out.println(i+"\t"+ number+ "\t"+ moduloNumber+ "\t"+ count);
      }
   }
}
10