public class Characters{
   public static void main(String[] args){
      // a char is a primitive type.
      // char's in java use UNICODE
      // a char value is written with a single 
      //    quotation mark 'x'.
      
      char letter = 'a';// 97
      System.out.print(letter);
      // returns: a
      char code = 98;
      System.out.print(code);
      // returns: b
      code++;
      System.out.println(code);
      
      char alpha = 97;
      for (int i = 0; i < 26;i++){
         System.out.print(alpha++); 
      }
      System.out.println();
      
      // making a "string"
      char letterA = 'w';
      char letterB = 'o';
      char letterC = 'r';
      char letterD = 'd';
      System.out.print(letterA); 
      System.out.print(letterB);
      System.out.print(letterC);
      System.out.println(letterD);
      String word = "word";
      System.out.print(word);
   }
}