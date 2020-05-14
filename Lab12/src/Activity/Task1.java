package Activity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Task1 {

	static JTextField farenhiteTextfield;
	static JButton convertButton;
	static JTextField celciusTextfield;

	public static void main(String args[]) {
		JFrame frame = new JFrame("Convert Farenhite to Celcius");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 80);
		JPanel panel = new JPanel();
		panel.setLayout(null);

		JLabel farenhiteLabel = new JLabel("Farenhite");
		farenhiteLabel.setBounds(10, 0, 90, 30);
		panel.add(farenhiteLabel);

		farenhiteTextfield = new JTextField(10);
		farenhiteTextfield.setBounds(70, 0, 90, 30);
		panel.add(farenhiteTextfield);

		convertButton = new JButton("Convert");
		convertButton.setBounds(160, 0, 90, 30);

		convertButton.addActionListener(new buttonClicked());
		panel.add(convertButton);

		///////////////////////////////////////////
		JLabel celsiusLabel = new JLabel("Celsius");
		celsiusLabel.setBounds(255, 0, 90, 30);
		panel.add(celsiusLabel);

		celciusTextfield = new JTextField(10);
		celciusTextfield.setBounds(300, 0, 90, 30);
		panel.add(celciusTextfield);
		celciusTextfield.setEditable(false);

		frame.add(panel);
		frame.setVisible(true);
	}
}

class buttonClicked implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Task1.convertButton) {

			String farenhite_temp = Task1.farenhiteTextfield.getText();
			if (farenhite_temp.equals("")) {
				JOptionPane.showMessageDialog(null, "Field Missing! Please enter proper temperature value");

			} else {
				try {
					int farenhite_int = Integer.parseInt(farenhite_temp);
					double farenhite_to_celsius = (farenhite_int - 32) * 5 / 9;
					Task1.celciusTextfield.setText(new String(farenhite_to_celsius + ""));
				} catch (Exception f) {
					JOptionPane.showMessageDialog(null, "Please  proper temperature value");

				}
			}

		}
	}

}
