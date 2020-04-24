package Lab6;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SetupScreen {

	private JFrame window;
	private JTextField textField;
	private RocketManager manager;
	
	public SetupScreen(RocketManager incomingManager) {
		manager = incomingManager;
		initialize();
		window.setVisible(true);
	}
	
	
	public void closeWindows() {
		window.dispose();
	}
	
	public void finishedWindow() {
		manager.closeSetupScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setTitle("Rocket Manager Setup");
		window.setBounds(100, 100, 750, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
			
		JLabel lblNewLabel = new JLabel("Welcome to Rocket Manager!");
		lblNewLabel.setBounds(10, 10, 277, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("What is your name?");
		lblNewLabel_1.setBounds(10, 67, 217, 28);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(366, 45, 200, 38);
		window.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("How many rockets do you want?");
		lblNewLabel_2.setBounds(10, 105, 320, 38);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_2);
		
		JSlider slider = new JSlider();
		slider.setBounds(366, 105, 200, 22);
		window.getContentPane().add(slider);
		
		JButton btnNewButton = new JButton("Rocket1");
		btnNewButton.setBounds(25, 167, 95, 57);
		window.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rocket2");
		btnNewButton_1.setBounds(156, 167, 95, 57);
		window.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Rocket4");
		btnNewButton_2.setBounds(25, 234, 95, 57);
		window.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Rocket5");
		btnNewButton_3.setBounds(156, 236, 95, 55);
		window.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Rocket3");
		btnNewButton_4.setBounds(292, 171, 96, 53);
		window.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Rocket6");
		btnNewButton_5.setBounds(293, 235, 95, 56);
		window.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("Name: FalconHeavy");
		lblNewLabel_3.setBounds(513, 211, 172, 28);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rocket status");
		lblNewLabel_4.setBounds(513, 167, 148, 38);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fuel:              Full");
		lblNewLabel_5.setBounds(513, 256, 148, 28);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cleanliness:    Dirty");
		lblNewLabel_6.setBounds(513, 303, 172, 28);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Selected:");
		lblNewLabel_7.setBounds(33, 351, 103, 28);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_7);
		
		JButton button = new JButton("Rocket1");
		button.setBounds(25, 389, 95, 57);
		window.getContentPane().add(button);
		
		JButton button_1 = new JButton("Rocket2");
		button_1.setBounds(166, 389, 95, 57);
		window.getContentPane().add(button_1);
		
		JButton btnNewButton_6 = new JButton("Accept");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_6.setBounds(531, 389, 95, 52);
		window.getContentPane().add(btnNewButton_6);
	}
	

}
