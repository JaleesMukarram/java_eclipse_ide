package Activity;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {
	
	public static void main(String[] args) {
		//Make sure we have nice window decorations.
		JFrame.setDefaultLookAndFeelDecorated(true);
		//Create and set up the window.
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Add the "Hello World" label.
		JLabel label = new JLabel("Hello World! How are you? Hopefully, doing Great!");
		frame.getContentPane().add(label);
		//Display the window.
		frame.pack();
		frame.setVisible(true);
		}

}
