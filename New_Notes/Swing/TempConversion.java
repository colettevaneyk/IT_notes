import javax.swing.*;
public class TempConversion{
   public static void main(String[] args){
     System.out.println("Program Started");
      double celcius = 0; // using double to use decimals.
      double fahr = 0;
      double kelvin = 0;
      // the <*.parse*> converts String to double.
      celcius = Double.parseDouble(JOptionPane.showInputDialog("Temp:"));
      System.out.println("C:" + celcius);
      
      kelvin = celcius + 273.15;
      System.out.println("K:" + kelvin);
      JOptionPane.showMessageDialog(null, "Temp in Kelvin: " + kelvin);
      
      fahr = (9*celcius)/5 + 32;
      System.out.println("F: " + fahr);
      JOptionPane.showMessageDialog(null, "Temp in Freedom: " + fahr);
      
   }
}