package Old_Notes.JAVA_ClassTest2;

public class ClassTest
{
   public static void main(String[] args)
   {
      int a = 1;
      int b = 0;
      for (int x = 0; x < 10; x++)
      {
         a++;
         System.out.print(a +"\t");
         int m = a % 2;
         System.out.print(m +"\t");
         
         if(m == 0)
         {
            //b++; //b = b+1;
            b = b + 2;
         }//if 1
         if (m != 0)
         {
            b = b -1; //b--
         }//if_2
         System.out.println(b +"\t");
      }//for
   }//main
   
}//class