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


public class AnimalScreen {

	private JFrame window;
	private JTextField textFieldPurchasePrice;
	private ScreenManager manager;
	private JTextField textFieldHappiness;
	private String name;
	
	

	private JTextField textField;
	private JTextField textFieldSerialNumber;

	static String[] animals = {"Pig", "Hen", "Cow"};
	int index;
	public AnimalScreen(ScreenManager incomingManager,String animalName, int n) {
		
		System.out.print("AnimalScreen constructor:" + animalName + n);
		manager = incomingManager;
		name = animalName;
		index = n;
		initialize();
		window.setVisible(true);


	}
	
	
	public void closeWindows() {
		window.dispose();
	}
	
	public void finishedWindow() {
		manager.closeAnimalScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Hen hen = new Hen();
		Pig pig = new Pig();
		Cow cow = new Cow();
		window = new JFrame();
		window.setTitle("Funning Farm - Animal");
		window.setBounds(100, 100, 521, 403);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
					
		JLabel lblNewLabel_1 = new JLabel("Purchase Price:");
		lblNewLabel_1.setBounds(10, 67, 217, 28);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_1);
		
		textFieldPurchasePrice = new JTextField();
		textFieldPurchasePrice.setBounds(279, 67, 200, 38);
		textFieldPurchasePrice.setEditable(false);
		window.getContentPane().add(textFieldPurchasePrice);
		textFieldPurchasePrice.setColumns(10);
		
		
		JLabel lblWhatIsYour = new JLabel("Happiness:");
		lblWhatIsYour.setBounds(10, 127, 217, 28);
		lblWhatIsYour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblWhatIsYour);
		
		textFieldHappiness = new JTextField();
		textFieldHappiness.setBounds(279, 125, 200, 38);
		textFieldHappiness.setColumns(10);
		textFieldHappiness.setEditable(false);
		window.getContentPane().add(textFieldHappiness);
		
		String farmTypes[]={"1: Normal","2:20% more money","3: 20% more animal's happiness","4: 20% crop grow speed"};
		
		
		String playDays[]={"5","6","7","8","9","10"};
		
		JButton btnNewButton_6 = new JButton("Back To MainScreen");
		btnNewButton_6.setBounds(279, 317, 200, 38);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(btnNewButton_6);
		
		JLabel lblHealth = new JLabel("Health:");
		lblHealth.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHealth.setBounds(10, 186, 217, 28);
		window.getContentPane().add(lblHealth);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(279, 184, 200, 38);
		textField.setEditable(false);
		window.getContentPane().add(textField);
		
		JButton btnNewButtonFeed = new JButton("Feed");
		btnNewButtonFeed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("\n" + name + index);
				
				Controller.feedAnimal(name, index);
				
				String[] s = Controller.getAnimalObjectStatus(name, index).split(";");
				
				textFieldPurchasePrice.setText(s[0]);
				textFieldHappiness.setText(s[1]);
				textField.setText(s[2]);
				
			}
		});
		btnNewButtonFeed.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButtonFeed.setBounds(10, 258, 200, 38);
		window.getContentPane().add(btnNewButtonFeed);
		
		JButton btnPlayWithIt = new JButton("Play with it");
		btnPlayWithIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.playWithAnimal(name, index);
				String[] s = Controller.getAnimalObjectStatus(name, index).split(";");
				
				textFieldPurchasePrice.setText(s[0]);
				textFieldHappiness.setText(s[1]);
				textField.setText(s[2]);
			}
		});
		btnPlayWithIt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlayWithIt.setBounds(279, 258, 200, 38);
		window.getContentPane().add(btnPlayWithIt);
		
		JLabel lblSerialNumber = new JLabel("Serial Number:");
		lblSerialNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSerialNumber.setBounds(10, 10, 217, 28);
		window.getContentPane().add(lblSerialNumber);
		
		textFieldSerialNumber = new JTextField();
		textFieldSerialNumber.setColumns(10);
		textFieldSerialNumber.setBounds(279, 10, 200, 38);
		textFieldSerialNumber.setEditable(false);
		window.getContentPane().add(textFieldSerialNumber);
		
		JButton btnUsingHappyagentitem = new JButton("Using HappyAgentItem");
		btnUsingHappyagentitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.useHappyAgent(name, index);
				String[] s = Controller.getAnimalObjectStatus(name, index ).split(";");			
				textFieldPurchasePrice.setText(s[0]);
				textFieldHappiness.setText(s[1]);
				textField.setText(s[2]);
			}
			
		});
		btnUsingHappyagentitem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUsingHappyagentitem.setBounds(10, 317, 200, 38);
		window.getContentPane().add(btnUsingHappyagentitem);
		
		

		
		textFieldSerialNumber.setText(String.valueOf(index));
		
		String[] s = Controller.getAnimalObjectStatus(name, index).split(";");
		
		textFieldPurchasePrice.setText(s[0]);
		textFieldHappiness.setText(s[1]);
		textField.setText(s[2]);
			
		
		
	}
}
