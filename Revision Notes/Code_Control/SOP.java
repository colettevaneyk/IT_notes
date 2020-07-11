public class SOP{
   public static void num(int value){  //prints ints
      System.out.print(value + "\t");
   }
   public static void num(float value){  //prints ints
      System.out.print(value + "\t");
   }
   public static void num(long value){  //prints ints
      System.out.print(value + "\t");
   }
   public static void num(double value){  //prints ints
      System.out.print(value + "\t");
   }
   public static void num(short value){  //prints ints
      System.out.print(value + "\t");
   }
   public static void word(String value){ //prints Strings
      System.out.print(value + "\t");
   }
   public static void wordNum(String text, int value){
      System.out.println(">> " + text + ":\t" + value);
   }
   public static void wordNum(String text, float value){
      System.out.println(">> " + text + ":\t" + value);
   }
   public static void heading(String name){
      System.out.println("----------------");
      System.out.println("    "+ name);
      System.out.println("----------------");
   }
   public static void rule(){
      System.out.println("----------------");
   }
   public static void end(){
      System.out.println("");
   }

   public static int dotsPrinted(int value){
      int valueSet = value;
      return valueSet;
   }
   public static int running(int currentNum, int dotper, float print, int dotsCounts)  {
      
      if (dotsCounts == dotper){
         System.out.print("-\n");
         // SOP.dotsPrinted(0);
         return 1;
      }
      else if (dotsCounts == dotper/2){
         System.out.print(" " + print + " ");
         return 1;
      }
      else if (currentNum%dotper == 0){
         System.out.print("-");
         return 1;

      }
      else{
         return 0;
      }
   } 
   public static void main(String[] args){
      AVERAGE.main(null);
   }
}