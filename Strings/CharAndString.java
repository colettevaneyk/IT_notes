public class CharAndString{
   public static void main(String[] args){
      // strings are a series of chars (array)
      // Strings are not primitive. They are a class.
      String s1 = "word";
      String s2 = "again";
      
      System.out.println(s1.charAt(0)+""+s2.charAt(0)+""+s1.charAt(2));
      
      int len1 = s1.length();
      int len2 = s2.length();
      System.out.println(len1);
      System.out.println(len2);
      
      System.out.print(s1.charAt(len1-1));
   }
}