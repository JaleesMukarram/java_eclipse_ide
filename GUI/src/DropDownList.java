
import java.awt.*;
import javax.swing.*;

public class DropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setBounds(300,100,500,200);
		window.setTitle("DropDownMenu");
		
		Container container = window.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.GRAY);
		
		String [] options = {"A","B","C","D","E","F"};
		
		JComboBox list = new JComboBox(options);
		list.setBounds(100,100,60,20);
		container.add(list);
		
		

	}

}
