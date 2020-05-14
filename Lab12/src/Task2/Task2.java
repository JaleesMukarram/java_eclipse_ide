package Task2;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Task2 {
	static String toShow = "";
	static JButton buttons[];
	static JButton button0,buttonSteric,buttonHash;
	static JLabel textLabel;
	static JTextField textField;
	
	public static void main(String args[]) {
		
		JFrame frame  = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Telephone");
		frame.setSize(300,200);
		//frame.addContainerListener(l);
		
		
		GridLayout g1 = new GridLayout(5,5);
		
		frame.setLayout(g1);
		
		buttons = new JButton[9];
		
		for (int i = 0;i<9;i++) {
			buttons[i] = new JButton(i+1+"");
			buttons[i].addActionListener(new buttonClicked());
			frame.add(buttons[i]);
		}
		
		buttonSteric = new JButton("*");
		buttonSteric.addActionListener(new buttonClicked());
		frame.add(buttonSteric);
		
		button0 = new JButton("0");
		button0.addActionListener(new buttonClicked());
		frame.add(button0);
		
		buttonHash = new JButton("#");
		buttonHash.addActionListener(new buttonClicked());
		frame.add(buttonHash);
		////
		
		
		JPanel p1 = new JPanel();
		
		BorderLayout  b1 = new BorderLayout();
		//p1.setLayout(null);
		p1.setLayout(b1);
	
		
		
		textLabel = new JLabel("Number to dial");
		textLabel.setBounds(0,0,100,100);

		p1.add(textLabel);
		
		JPanel p2 = new JPanel();

		
		
		
		textField = new JTextField(8);
		textField.setBounds(40,0,100,100);
		p2.add(textField);
		
		
		frame.add(p1);
		frame.add(p2);
		frame.setVisible(true);
		
	}

}

class buttonClicked implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == Task2.buttons[0]) {
			Task2.toShow += "1";
		}else if (e.getSource() == Task2.buttons[1]) {
			Task2.toShow += "2";
		}else if (e.getSource() == Task2.buttons[2]) {
			Task2.toShow += "3";
		}else if (e.getSource() == Task2.buttons[3]) {
			Task2.toShow += "4";
		}else if (e.getSource() == Task2.buttons[4]) {
			Task2.toShow += "5";
		}else if (e.getSource() == Task2.buttons[5]) {
			Task2.toShow += "6";
		}else if (e.getSource() == Task2.buttons[6]) {
			Task2.toShow += "7";
		}else if (e.getSource() == Task2.buttons[7]) {
			Task2.toShow += "8";
		}else if (e.getSource() == Task2.buttons[8]) {
			Task2.toShow += "9";
		}else if (e.getSource() == Task2.button0) {
			Task2.toShow += "0";
		}else if (e.getSource() == Task2.buttonSteric) {
			Task2.toShow += "*";
		}else if (e.getSource() == Task2.buttonHash) {
			Task2.toShow +="#";
		}
		
		Task2.textField.setText(Task2.toShow);
		
	}
	
}
