import javax.swing.*; // import swing class.
// swing is a class that allows us to inferface with 
// GUI elements.
public class SwingOption{
   public static void main(String[] args){
      String theNumber = JOptionPane.showInputDialog("Input a Number");
      System.out.println(theNumber);
      // this will then convert the string to an int.
     
      // this part will do things using theNumber as a string.
      if(theNumber.equals("5")){
         System.out.println("Its 5");
      }
      else{
         System.out.println("It's not 5");
      }
      // and this part will do something based on theNumber as
      // an int.
      int newNumber = Integer.parseInt(theNumber);
      int count = 0;
      while(count<newNumber){
         count++;
         System.out.print(count + "\t");
      }
      // then we can also convert Strings to double this
      // works similar to the int converting.
      double decNum = Double.parseDouble(theNumber);
      System.out.print("\n" + decNum + "\n");
      for(double i = 0;i<decNum;i++){
         double value = decNum - i;
         System.out.print(value + "\t");
      }

      
   }
} 