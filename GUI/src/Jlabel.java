import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;
public class Jlabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setBounds(350,200,600,300);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	Container container = frame.getContentPane();
	//container.setBackground(Color.magenta);
	container.setLayout(null);
	Font font_for_username = new Font("Arial",Font.PLAIN,20);
	
	JLabel username_label = new JLabel("Username");
	username_label.setFont(font_for_username);
	
	
	
	username_label.setBounds(10,01,200,100);
	container.add(username_label);
	
	JLabel password_label = new JLabel("Password");
	password_label.setBounds(10,40,200,100);
	password_label.setFont(font_for_username);

	container.add(password_label);
	


	}

}
