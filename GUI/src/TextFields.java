import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TextFields {
	static JTextField username_entry,password_entry;
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(300,150,400,240);
		window.setVisible(true);
		window.setTitle("Log IN");
		//window.setResizable(false);
		
		Container container = window.getContentPane();
		container.setLayout(null);
		Font font = new Font("Arial",Font.PLAIN,24);
		
		JLabel username_label = new JLabel("Username");
		username_label.setBounds(10,01,200,100);
		username_label.setFont(font);
		container.add(username_label);
			
		
		JLabel password_label = new JLabel("Password");
		password_label.setBounds(10,40,200,100);
		password_label.setFont(font);
		container.add(password_label);
		
		Font entry_font = new Font("Arial",Font.PLAIN,17);
		
		username_entry = new JTextField();
		username_entry.setBounds(150,40,200,30);
		username_entry.setVisible(true);
		username_entry.setFont(entry_font);
		container.add(username_entry);
		
		password_entry = new JPasswordField();
		password_entry.setBounds(150,80,200,30);
		password_entry.setVisible(true);
		password_entry.setFont(entry_font);
		container.add(password_entry);
		
		Cursor curson_for_button = new Cursor(Cursor.HAND_CURSOR);
		
		JButton log_in_button = new JButton("Sign In");
		log_in_button.setVisible(true);
		log_in_button.setBounds(200,130,100,40);
		log_in_button.setBackground(Color.yellow);
		log_in_button.setForeground(Color.red);
		log_in_button.setCursor(curson_for_button);
			
		container.add(log_in_button);
		
		
		log_in_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				System.out.println("Working");
				main_action(a);
			}
		});

	
	}

	public static void main_action(ActionEvent a) {
	String username_temp = username_entry.getText();
	String password_temp = password_entry.getText();
	String empty = "";
	if (username_temp.equals(empty) || password_temp.equals(empty) ) {
		System.out.println("Please enter both the fields");
	}else {
		
	}

	}
	
}




