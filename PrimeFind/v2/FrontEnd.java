import java.awt.event.*;
import javax.swing.*;

public class FrontEnd {

    JFrame mainframe;

    FrontEnd() {
        mainframe = new JFrame("PrimeFind");// creating instance of JFrame

        // BUTTONS
        JButton btnOne = new JButton("START");// creating instance of JButton
        btnOne.setBounds(100, 400, 90, 50);
        // btnOne.setBounds(x, y, width, height);
        JButton btnTwo = new JButton("RESET");// creating instance of JButton
        btnTwo.setBounds(200, 400, 90, 50);
        // TEXT
        final JTextField textblock = new JTextField();
        textblock.setBounds(50, 50, 150, 20);
        // LABELS
        JLabel labelOne, labelTwo;
        labelOne = new JLabel("PRIME NUMBER BENCHMARK");
        labelOne.setBounds(10, 10, 200, 30);
        labelTwo = new JLabel("Second Label.");
        labelTwo.setBounds(50, 100, 100, 30);
        
        /*
         * ACTIONS DUE TO BUTTONS BEING PRESSED
         * 
         */

        btnOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int setValue = Integer.parseInt(JOptionPane.showInputDialog("How many Primes?"));
                System.out.print("New number of primes:" + setValue);
                Master.primeTotal = setValue;
                textblock.setText(Integer.toString(Master.primeTotal));
            }
        });

        // ADDING BLOCKS AND INFORMATION TO THE FRAME

        mainframe.add(btnOne);// adding button in JFrame
        mainframe.add(btnTwo);// adding button in JFrame
        mainframe.add(textblock);// adding button in JFrame
        mainframe.add(textblock);// adding button in JFrame
        mainframe.add(labelOne);// adding button in JFrame
        mainframe.add(labelTwo);// adding button in JFrame

        mainframe.setSize(500, 500);// 400 width and 500 height
        mainframe.setLayout(null);// using no layout managers
        mainframe.setVisible(true);// making the frame visible
    }

    public static void main(String[] args) {
        new FrontEnd();
    }
}