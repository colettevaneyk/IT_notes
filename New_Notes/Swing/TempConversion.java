import javax.swing.*;

public class TempConversion{
   public static void main(String[] args){
      double celcius = Double.parseDouble(JOptionPane.showInputDialog("Enter a temp:"));
      double fahr = (9*celcius)/5 + 32;
      JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit:\n" + fahr);
      JOptionPane.showConfirmDialog(null,"Hi");
   }
}