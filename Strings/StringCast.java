public class StringCast{
   public static void main(String[] args){
      // you cannot use the previous conversions
      // on strings and chars
      
      String number = "234";
      int number2 = Integer.parseInt(number);
      System.out.print(number2);
   }
}