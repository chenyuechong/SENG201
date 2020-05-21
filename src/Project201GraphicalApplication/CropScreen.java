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


public class CropScreen {

	private JFrame window;
	private JTextField textFieldPurchasePrice;
	private ScreenManager manager;
	private JTextField textFieldHeight;
	private String name;
	private int index;
	private JTextField textFieldHarvestTime;
	private JTextField textFieldSerialNumber;
	static String[] crops = {"Carrot", "Corn", "Eggplant", "KiwiFruit", "Tomato"};
	private JTextField textFieldName;
	
	
	public CropScreen(ScreenManager incomingManager,String cropName, int n) {
		manager = incomingManager;
		name = cropName;
		index = n;
		initialize();
		window.setVisible(true);

	}
	
	
	public void closeWindows() {
		window.dispose();
	}
	
	public void finishedWindow() {
		manager.closeCropScreen(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setTitle("Funning Farm-Crop");
		window.setBounds(100, 100, 484, 508);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Purchase Price");
		lblNewLabel_1.setBounds(10, 141, 217, 28);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblNewLabel_1);
		
		textFieldPurchasePrice = new JTextField();
		textFieldPurchasePrice.setEditable(false);
		textFieldPurchasePrice.setBounds(237, 141, 200, 38);
		window.getContentPane().add(textFieldPurchasePrice);
		textFieldPurchasePrice.setColumns(10);
		
		
		JLabel lblWhatIsYour = new JLabel("Height:");
		lblWhatIsYour.setBounds(10, 201, 217, 28);
		lblWhatIsYour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblWhatIsYour);
		
		textFieldHeight = new JTextField();
		textFieldHeight.setBounds(237, 199, 200, 38);
		textFieldHeight.setColumns(10);
		textFieldHeight.setEditable(false);
		window.getContentPane().add(textFieldHeight);
		
		JLabel lblWhichTypeWould = new JLabel("Harvest Time:");
		lblWhichTypeWould.setBounds(10, 266, 217, 28);
		lblWhichTypeWould.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(lblWhichTypeWould);
		
		String farmTypes[]={"1: Normal","2:20% more money","3: 20% more animal's happiness","4: 20% crop grow speed"};
		
		
		String playDays[]={"5","6","7","8","9","10"};
		
		JButton btnNewButton_6 = new JButton("Back To MainScreen");
		btnNewButton_6.setBounds(237, 393, 200, 38);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		window.getContentPane().add(btnNewButton_6);
		
		textFieldHarvestTime = new JTextField();
		textFieldHarvestTime.setColumns(10);
		textFieldHarvestTime.setBounds(237, 264, 200, 38);
		textFieldHarvestTime.setEditable(false);
		window.getContentPane().add(textFieldHarvestTime);
		
		JLabel lblSerialNumber = new JLabel("Serial Number:");
		lblSerialNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSerialNumber.setBounds(10, 84, 217, 28);
		window.getContentPane().add(lblSerialNumber);
		
		textFieldSerialNumber = new JTextField();
		textFieldSerialNumber.setColumns(10);
		textFieldSerialNumber.setBounds(237, 84, 200, 38);
		window.getContentPane().add(textFieldSerialNumber);
		textFieldSerialNumber.setEditable(false);
		
		JButton btnNewButton = new JButton("Water it");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.waterCrop(name, index);
				String[] s = Controller.getCropObjectStatus(name, index).split(";");
				System.out.print(s[0] + s[1] + s[2]);
				textFieldPurchasePrice.setText(s[0]);
				textFieldHeight.setText(s[1]);
				textFieldHarvestTime.setText(s[2]);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 340, 200, 38);
		window.getContentPane().add(btnNewButton);
		
		JButton btnUsingTimeagentitem = new JButton("Using TimeAgentItems");
		btnUsingTimeagentitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controller.useTimeAgent(name, index)) {
					
				String[] s = Controller.getCropObjectStatus(name, index).split(";");
				System.out.print(s[0] + s[1] + s[2]);
				textFieldPurchasePrice.setText(s[0]);
				textFieldHeight.setText(s[1]);
				textFieldHarvestTime.setText(s[2]);
			}
			else {
				 JOptionPane.showMessageDialog(null,"oops, you do not have enough timeAgent items" , "Message",JOptionPane.PLAIN_MESSAGE);
			}
				
			}
			
			
		});
		btnUsingTimeagentitem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUsingTimeagentitem.setBounds(237, 340, 200, 38);
		window.getContentPane().add(btnUsingTimeagentitem);
		
		
		textFieldSerialNumber.setText(String.valueOf(index));
		
		String[] s = Controller.getCropObjectStatus(name, index).split(";");
		
		textFieldPurchasePrice.setText(s[0]);
		textFieldHeight.setText(s[1]);
		textFieldHarvestTime.setText(s[2]);
		
		JButton btnNewButton_1 = new JButton("Harvest and Sell");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controller.harvestCrop(name, index))
					JOptionPane.showMessageDialog(null,"Sold success, you earn 50 dollars" , "Message",JOptionPane.PLAIN_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"Detect this crop is not mature, can not be sold" , "Message",JOptionPane.PLAIN_MESSAGE);
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(10, 393, 200, 38);
		window.getContentPane().add(btnNewButton_1);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(10, 30, 217, 28);
		window.getContentPane().add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setText(name);
		textFieldName.setEditable(false);
		textFieldName.setColumns(10);
		textFieldName.setBounds(237, 20, 200, 38);
		window.getContentPane().add(textFieldName);
	}
}
