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
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class StoreScreen {

	private JFrame window;
	private ScreenManager manager;
	static String[] crops = {"None","Carrot", "Corn", "Eggplant", "KiwiFruit", "Tomato"};
	static String[] animals = {"None","Pig", "Hen", "Cow"};
	static String[] items = {"None","AnimalFeedItems", "HappyAgentItems", "TimeAgentItems"};
	static String[] numbers = {"0","1", "2", "4","6","8"};
	private JTable table;
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
		window.setBounds(100, 100, 587, 670);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		JLabel lblWhichTypeWould = new JLabel("Crop List");
		lblWhichTypeWould.setBounds(10, 390, 106, 28);
		lblWhichTypeWould.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblWhichTypeWould);
		
		JLabel lblHowManyDays = new JLabel("Animal List");
		lblHowManyDays.setBounds(10, 452, 106, 28);
		lblHowManyDays.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblHowManyDays);
		
		String goodsName = "";
		JComboBox comboBox = new JComboBox(crops);
		comboBox.setBounds(126, 387, 200, 38);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String	cropName = comboBox.getSelectedItem().toString();

			}
		});
		window.getContentPane().add(comboBox);
		
		JLabel labelBalance = new JLabel("0");
		labelBalance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelBalance.setBounds(192, 294, 184, 38);
		window.getContentPane().add(labelBalance);
		labelBalance.setText("$"+String.valueOf(Controller.getMoney()));
		
		JComboBox comboBox_1 = new JComboBox(animals);
		comboBox_1.setBounds(126, 449, 200, 38);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String animalName =  comboBox_1.getSelectedItem().toString();
				System.out.print("choose to play "+ comboBox_1.getItemAt(comboBox_1.getSelectedIndex()) + " days\n" );
			}
		});
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
		lblItemList.setBounds(10, 520, 106, 28);
		lblItemList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblItemList);
		
		JComboBox comboBox_2 = new JComboBox(items);
		comboBox_2.setBounds(126, 517, 200, 38);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		window.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(numbers);
		comboBox_3.setBounds(352, 387, 200, 38);
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		window.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox(numbers);
		comboBox_4.setBounds(352, 449, 200, 38);
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		window.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox(numbers);
		comboBox_5.setBounds(352, 517, 200, 38);
		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		window.getContentPane().add(comboBox_5);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.setBounds(126, 579, 200, 38);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cropName = crops[comboBox.getSelectedIndex()];
				String animalName = animals[comboBox_1.getSelectedIndex()];
				String ItemName = items[comboBox_2.getSelectedIndex()];
				
				String cropNumber = numbers[comboBox_3.getSelectedIndex()];
				String animalNumber = numbers[comboBox_4.getSelectedIndex()];
				String itemsNumber = numbers[comboBox_5.getSelectedIndex()];
				
				System.out.print("chose "+ cropName + " " + cropNumber +"\n" );
				System.out.print("chose "+ animalName + " " + animalNumber +"\n" );
				System.out.print("chose "+ ItemName + " " + itemsNumber +"\n" );
				
				String sShow = "You bought ";
				String s = "";
				if(cropName.equals("None") == false && cropNumber.equals("0")==false)
				{
					if(Controller.buySeed(cropName,Integer.parseInt(cropNumber))== false)
						JOptionPane.showMessageDialog(null,"You do not have enough money to buy this item" , "Message",JOptionPane.PLAIN_MESSAGE);
					else
						s += ("  "+cropNumber + " " + cropName);
				}
				if(animalName.equals("None") == false && animalNumber.equals("0") == false)
				{
					if (Controller.buyAnimal(animalName,Integer.parseInt(animalNumber))== false)
						JOptionPane.showMessageDialog(null,"You do not have enough money to buy this item" , "Message",JOptionPane.PLAIN_MESSAGE);
					else
						s += ("  "+animalNumber + " " + animalName);
					
				}
				if(ItemName.equals("None") == false && itemsNumber.equals("0")==false)
				{
					if(Controller.buyItems(ItemName,Integer.parseInt(itemsNumber))==false)
						JOptionPane.showMessageDialog(null,"You do not have enough money to buy this item" , "Message",JOptionPane.PLAIN_MESSAGE);
					else
						s += ("  "+itemsNumber + " " + ItemName);
					
				}
				if (s.length() == 0)
					sShow += "nothing";
				else
					sShow += (s +" succeed! ");
				labelBalance.setText("$" +String.valueOf(Controller.getMoney()));
				JOptionPane.showMessageDialog(null,sShow , "Message",JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(btnNewButton);
		
		String[] columnNames = {"Name", "PurchasePrice","ExpectedSellPrice"};  
		Object[][] data = {  
			    {"Hen", "5", "20"},  
			    {"Cow", "200","1020"},
			    {"Pig", "100","500"},
			    {"Corn", "2","5"},
			    {"Carrot", "2","5"},
			    {"Tomato", "2","5"},
			    {"Eggplant", "2","5"},
			    {"KiwiFruit", "20","100"},
			    {"AnimalFeedItems", "50","None"},
			    {"TimeAgentItems", "100","None"},
			    {"HappinessAgentItems", "50","None"},
			};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 548, 204);
		window.getContentPane().add(scrollPane);
		
		
		JTable table = new JTable(data, columnNames);
		table.setEnabled(false);
		scrollPane.setColumnHeaderView(table);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(10, 22, 200, 38);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		window.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose what you want");
		lblNewLabel_1.setBounds(10, 342, 239, 38);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		window.getContentPane().add(lblNewLabel_1);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setBounds(10, 294, 184, 38);
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		window.getContentPane().add(lblBalance);
		
		
		
		
		
	}
}
