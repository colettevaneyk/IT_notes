package Swing_Notes;

import javax.swing.*;
public class TempConversion{
   public static void main(String[] args){
     System.out.println("Program Started");
      double celsius = 0; // using double to use decimals.
      double fahr = 0;
      double kelvin = 0;
      // the <*.parse*> converts String to double.
      celsius = Double.parseDouble(JOptionPane.showInputDialog("Temp in C:"));
      System.out.println("C:" + celsius);
      
      kelvin = celsius + 273.15;
      fahr = (9*celsius)/5 + 32;
      
      System.out.println("K:" + kelvin);
      System.out.println("F: " + fahr);
      
      JOptionPane.showMessageDialog(null, "Temp in... \n K: " + kelvin + "\n F: " + fahr);
	

   }
}