
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		//frame.setSize(222,333);
		//frame.setLocation(252,244);
		frame.setBounds(500,244,400,333);
		frame.setTitle("Train Manager");
		frame.setBackground(Color.green);
		Container container = frame.getContentPane();
		container.setBackground(Color.green);
		frame.setResizable(false);
		
		
		

	}

}
