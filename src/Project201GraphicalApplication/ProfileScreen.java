package Project201GraphicalApplication;

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
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;


public class ProfileScreen {

	private JFrame window;
	private JTextField textField;
	private ScreenManager manager;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public ProfileScreen(ScreenManager incomingManager) {
		manager = incomingManager;
		initialize();
		window.setVisible(true);
	}
	
	
	public void closeWindows() {
		window.dispose();
	}
	
	public void finishedWindow() {
		manager.closeProfileScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setTitle("Funning Farm Profile");
		window.setBounds(100, 100, 495, 502);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
			
		JLabel lblNewLabel = new JLabel("Farm Information");
		lblNewLabel.setBounds(10, 10, 277, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Farm Name:");
		lblNewLabel_1.setBounds(10, 67, 217, 28);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(237, 67, 200, 38);
		window.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblWhatIsYour = new JLabel("Farmer Name:");
		lblWhatIsYour.setBounds(10, 127, 217, 28);
		lblWhatIsYour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblWhatIsYour);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(237, 125, 200, 38);
		textField_1.setColumns(10);
		window.getContentPane().add(textField_1);
		
		JLabel lblWhichTypeWould = new JLabel("Farm Type:");
		lblWhichTypeWould.setBounds(10, 183, 217, 28);
		lblWhichTypeWould.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblWhichTypeWould);
		
		JLabel lblHowManyDays = new JLabel("CurrentPlayDay:");
		lblHowManyDays.setBounds(10, 245, 217, 28);
		lblHowManyDays.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblHowManyDays);
		
		String farmTypes[]={"1: Normal","2:20% more money","3: 20% more animal's happiness","4: 20% crop grow speed"};  
		JComboBox comboBox = new JComboBox(farmTypes);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type = "Selected: "   
						   + comboBox.getSelectedItem().toString()+ " \n";  
				System.out.print(type);
			}
		});
		comboBox.setBounds(237, 180, 200, 38);
		window.getContentPane().add(comboBox);
		
		
		String playDays[]={"5","6","7","8","9","10"};
		
		JButton btnNewButton_6 = new JButton("Back To MainScreen");
		btnNewButton_6.setBounds(95, 393, 261, 52);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(btnNewButton_6);
		
		JLabel lblCurrentMoney = new JLabel("Current Money:");
		lblCurrentMoney.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCurrentMoney.setBounds(10, 310, 217, 28);
		window.getContentPane().add(lblCurrentMoney);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(237, 308, 200, 38);
		window.getContentPane().add(textField_2);	
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(237, 240, 200, 38);
		window.getContentPane().add(textField_3);
		
		
		String[] s = Controller.getFarmMessage().split(";");
		textField.setText(s[0]);
		textField_1.setText(s[1]);
		comboBox.setSelectedIndex(Integer.parseInt(s[2]));
		textField_3.setText(s[3]);
		textField_2.setText(s[4]);
		
	}
}
