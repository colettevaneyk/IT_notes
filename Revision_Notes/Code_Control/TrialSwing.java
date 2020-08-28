package Revision_Notes.Code_Control;

import javax.swing.*;
public class TrialSwing{
   public static void main(String[] args){
      
      Object[] possibleValues = { "First", "Second", "Third" };
      Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
         
      if(selectedValue == "First"){
         System.out.println("Yep");
      }
         
   
   }
}