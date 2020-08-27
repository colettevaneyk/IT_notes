public class BasicData
{
   public static void main(String[] args)
   {
      // bytes
      byte[] var_A = {0b1111111,0b1111110,0b1111100,0b1111000,0b1110000,0b1100000,0b100000,0b0111111};
      
      for(int num : var_A)
      {
         System.out.println(num);
      }
   }
}