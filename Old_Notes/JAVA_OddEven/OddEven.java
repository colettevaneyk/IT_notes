public class OddEven 
{
   public static void newLine() // function to be repeated
   {
      System.out.println();
   }
   //will print an interger it passes valueToPrint to the print
   public static void printInt(int valueToPrint) 
   {
      System.out.print(valueToPrint);
   }
   
   public static void main(String [] args)
   {
      int number = 0;
      for (int x = 0; x<20; x++)
      {
         number++;
         printInt(number);
         // System.out.print(number);
         int modNum = number%2;
         System.out.print("\t"+modNum);
         
         if(modNum == 0) //check if even
         {
            System.out.print("\tE");
         }
         
         if(modNum == 1) //check if odd
         {
            System.out.print("\tO");
         }
        // System.out.println();
        newLine();
      }
   }
}