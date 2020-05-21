package Project201GraphicalApplication;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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


public class SetupScreen {

	private JFrame window;
	private JTextField textField;
	private ScreenManager manager;
	private JTextField textField_1;
	
	public SetupScreen(ScreenManager incomingManager) {
		manager = incomingManager;
		initialize();
		window.setVisible(true);
	}
	
	
	public void closeWindows() {
		window.dispose();
	}
	
	public void finishedWindow() {
		Controller.init();
		manager.closeSetupScreen(this);
	}

	
	public static boolean isCharacter(String s) {
		if ((s != null) && !"".equals(s.trim()))
			return s.matches("^[a-zA-Z]*$");
		else
			return false;
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setTitle("Funning Farm Setup");
		window.setBounds(100, 100, 548, 440);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
			
		JLabel lblNewLabel = new JLabel("Welcome to Funning Farm !");
		lblNewLabel.setBounds(10, 10, 277, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("What is your farm name?");
		lblNewLabel_1.setBounds(10, 67, 217, 28);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(237, 67, 200, 38);
		window.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblWhatIsYour = new JLabel("What is your farmer name?");
		lblWhatIsYour.setBounds(10, 127, 217, 28);
		lblWhatIsYour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblWhatIsYour);
		
		textField_1 = new JTextField();
		textField_1.setBounds(237, 125, 200, 38);
		textField_1.setColumns(10);
		window.getContentPane().add(textField_1);
		
		JLabel lblWhichTypeWould = new JLabel("Which type would you like");
		lblWhichTypeWould.setBounds(10, 183, 217, 28);
		lblWhichTypeWould.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblWhichTypeWould);
		
		JLabel lblHowManyDays = new JLabel("How many days to play?");
		lblHowManyDays.setBounds(10, 245, 217, 28);
		lblHowManyDays.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblHowManyDays);
		
		String farmTypes[]={"1:  Normal","2:  50% more money","3:  50% more animal's happiness","4:  50% crop grow speed"};  
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
		JComboBox comboBox_1 = new JComboBox(playDays);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String playday =  comboBox_1.getItemAt(comboBox_1.getSelectedIndex()).toString();
				System.out.print("choose to play "+ comboBox_1.getItemAt(comboBox_1.getSelectedIndex()) + " days\n" );
			}
		});
		comboBox_1.setBounds(237, 242, 200, 38);
		window.getContentPane().add(comboBox_1);
		
		JButton btnNewButton_6 = new JButton("Start Adventure");
		btnNewButton_6.setBounds(210, 325, 175, 52);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String farmName = textField.getText().toString();
				String farmerName = textField_1.getText().toString();
				int playDay = comboBox_1.getSelectedIndex();
				int type = comboBox.getSelectedIndex();
				
				if((isCharacter(farmName) && (farmName.length()<=15 && farmName.length() >= 3)) &&(isCharacter(farmerName) && (farmerName.length()<=15 && farmerName.length() >= 3)))
				{
					String types[] = {"1","2","3","4"};
					String ss = types[type] + "-" + farmerName + "-" + farmName + "-" + playDays[playDay];
					Controller.writeToFile(ss);
					System.out.print(farmName+ farmerName + playDay + type);
					finishedWindow();
				}
				else
					JOptionPane.showMessageDialog(null,"Name must 3-15 characters", "Message",JOptionPane.PLAIN_MESSAGE);
				
				
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(btnNewButton_6);
		
		
	}
}
