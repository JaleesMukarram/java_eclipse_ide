package ClassActivity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonAdder {
	static JLabel textToShow;
	static JButton ButtontoClick;
	static int counter;

	public static void main(String args[]) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		;
		frame.setSize(300, 200);
		JPanel panel = new JPanel();
		panel.setLayout(null);

		textToShow = new JLabel("Button is clicked 0 time");
		textToShow.setBounds(70, 4, 300, 30);
		panel.add(textToShow);

		ButtontoClick = new JButton("Click Me");
		ButtontoClick.setBounds(65, 50, 150, 30);
		ButtontoClick.addActionListener(new WhenButtonPressed());
		panel.add(ButtontoClick);

		frame.add(panel);
		frame.setVisible(true);

	}
}

class WhenButtonPressed implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ButtonAdder.counter++;
		if (ButtonAdder.counter == 1) {
			ButtonAdder.textToShow.setText("Button is clicked " + ButtonAdder.counter + " time");

		} else {
			ButtonAdder.textToShow.setText("Button is clicked " + ButtonAdder.counter + " times");
		}

	}

}
