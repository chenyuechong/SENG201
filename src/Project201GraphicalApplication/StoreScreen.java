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

import Project201.Controller;

import java.awt.Color;
import javax.swing.JComboBox;


public class StoreScreen {

	private JFrame window;
	private ScreenManager manager;
	static String[] crops = {"None","Carrot", "Corn", "Eggplant", "KiwiFruit", "Tomato"};
	static String[] animals = {"None","Pig", "Hen", "Cow"};
	static String[] items = {"None","AnimalFeedItems", "HappyAgentItems", "TimeAgentItems"};
	static String[] numbers = {"0","1", "2", "4","6","8"};
	public StoreScreen(ScreenManager incomingManager) {
		manager = incomingManager;
		initialize();
		window.setVisible(true);
	}
	
	
	public void closeWindows() {
		window.dispose();
	}
	
	public void finishedWindow() {
		manager.closeStoreScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setTitle("Funning Farm-Country Store");
		window.setBounds(100, 100, 742, 683);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		JLabel lblWhichTypeWould = new JLabel("Crop List");
		lblWhichTypeWould.setBounds(10, 363, 106, 28);
		lblWhichTypeWould.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblWhichTypeWould);
		
		JLabel lblHowManyDays = new JLabel("Animal List");
		lblHowManyDays.setBounds(10, 425, 106, 28);
		lblHowManyDays.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblHowManyDays);
		
	  
		JComboBox comboBox = new JComboBox(crops);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type = "Selected: "   
						   + comboBox.getSelectedItem().toString()+ " \n";  
				System.out.print(type);
			}
		});
		comboBox.setBounds(126, 360, 200, 38);
		window.getContentPane().add(comboBox);
		
		
		JComboBox comboBox_1 = new JComboBox(animals);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String playday =  comboBox_1.getItemAt(comboBox_1.getSelectedIndex()).toString();
				System.out.print("choose to play "+ comboBox_1.getItemAt(comboBox_1.getSelectedIndex()) + " days\n" );
			}
		});
		comboBox_1.setBounds(126, 422, 200, 38);
		window.getContentPane().add(comboBox_1);
		
		JButton btnNewButton_6 = new JButton("Back to MainScreen");
		btnNewButton_6.setBounds(352, 579, 200, 38);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(btnNewButton_6);
		
		JLabel lblItemList = new JLabel("Item List");
		lblItemList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblItemList.setBounds(10, 493, 106, 28);
		window.getContentPane().add(lblItemList);
		
		JComboBox comboBox_2 = new JComboBox(items);
		comboBox_2.setBounds(126, 490, 200, 38);
		window.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(numbers);
		comboBox_3.setBounds(352, 360, 200, 38);
		window.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox(numbers);
		comboBox_4.setBounds(352, 422, 200, 38);
		window.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox(numbers);
		comboBox_5.setBounds(352, 490, 200, 38);
		window.getContentPane().add(comboBox_5);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(126, 579, 200, 38);
		window.getContentPane().add(btnNewButton);
		
		
	}
}
