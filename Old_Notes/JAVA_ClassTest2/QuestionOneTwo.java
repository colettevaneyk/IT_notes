import java.util.Scanner; 

public class QuestionOneTwo
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in); 
        String s = in.nextLine(); 
        System.out.println("You entered string "+s); 
  

         int number = 34;
         int count = 0;
         
         for (int i = 0; i<=12 ;i++)
         {
            number = number - 2;
            int modNumber = number % 3;
            
            if (modNumber == 0)
            {
               count++;
            }
         }
         System.out.println(count);
    }
}