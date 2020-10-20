public class Example{
   // we are going to find out the sum of your
   // name in ascii.
   public static void main(String[] args){
   
      String name = "Kurt";
      char letterA = name.charAt(0);
      char letterB = name.charAt(1);
      char letterC = name.charAt(2);
      char letterD = name.charAt(3);
      
      int numA = (int)letterA;
      int numB = (int)letterB;
      int numC = (int)letterC;
      int numD = (int)letterD;
      
      System.out.println(letterA + " = " + numA);
      System.out.println(letterB + " = " + numB);
      System.out.println(letterC + " = " + numC);
      System.out.println(letterD + " = " + numD);
      
      int total = numA + numB + numC + numD;
      
      System.out.println("Total = " + total);
      
      double totalM = (double)numA * (double)numB * (double)numC * (double)numD;
      System.out.println("TotalM = " + totalM);
      
   }
}