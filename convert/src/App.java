import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
public class App {

    public static void converter(){
        // creates instance of JFrame
        JFrame frame1 = new JFrame();

        JLabel ruppia = new JLabel("Ruppies");
        ruppia.setBounds(20, 40,60,30);
        JLabel dollar = new JLabel("Dollar");
        dollar.setBounds(170, 40, 60, 30);
        
        JTextField ruppiaText = new JTextField("0");
        ruppiaText.setBounds(80, 40, 50, 30); 
        JTextField dollarText = new JTextField("0");
        dollarText.setBounds(240, 40, 50, 30);  


 
        // creates instance of JButton
        JButton button1 = new JButton("Ruipia");
        JButton button2 = new JButton("Dollar");
        JButton button3 = new JButton("close");

 
        // x axis, y axis, width, height
        button1.setBounds(50, 80, 60, 15); 
        button2.setBounds(190, 80, 60, 15); 
        button3.setBounds(150, 150, 60, 30);

        		// Adding action listener 
		button1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d 
					= Double.parseDouble(ruppiaText.getText()); 

				// Converting rupees to dollars 
				double d1 = (d / 65.25); 

				// Getting the string value of the 
				// calculated value 
				String str1 = String.valueOf(d1); 

				// Placing it in the text box 
				dollarText.setText(str1); 
			} 
		}); 

		// Adding action listener 
		button2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d2 
					= Double.parseDouble(dollarText.getText()); 

				// converting Dollars to rupees 
				double d3 = (d2 * 65.25); 

				// Getting the string value of the 
				// calculated value 
				String str2 = String.valueOf(d3); 

				// Placing it in the text box 
				ruppiaText.setText(str2); 
			} 
		}); 

		// Action listener to close the form 
		button3.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				frame1.dispose(); 
			} 
		}); 

		// Default method for closing the frame 
		frame1.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) 
			{ 
				System.exit(0); 
			} 
		}); 
 
        // adds button1 in Frame1
        frame1.add(button1);
        frame1.add(button2);
        frame1.add(button3);
        frame1.add(ruppia);
        frame1.add(dollar);
        frame1.add(ruppiaText);
        frame1.add(dollarText);





 
		frame1.setLayout(null); 
		frame1.setSize(400, 300); 
		frame1.setVisible(true); 
    }

    public static void main(String[] args) throws Exception {
        converter();
    }
}
