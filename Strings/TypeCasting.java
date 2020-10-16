import java.lang.Math;

public class TypeCasting{
   public static void main(String[] args){
      // widening conversion
      //    this is when we convert to data with a wider
      //      range than the original value.
      //       java does this automatically.
      int num = 7*(int)2.9d;
      double dbl = num;
      double root = Math.sqrt(dbl);
      double square = Math.pow(dbl,2);
      double rounding = Math.round(root);
      System.out.println(num);
      System.out.println(dbl);
      System.out.println(root);
      System.out.println(square);
      System.out.println(rounding);
      // WHen we convert a larger datatype to a lower
      // we perform a narrowing convertion.
      // this not usually a good idea as data is lost.
      // when a double is converted to an int the value is
      // truncated. (gets rid of decimals, no rounding is done)
   }
}