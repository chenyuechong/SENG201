package Project201GraphicalApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class MainScreen {

	private JFrame frmManagerMain;
	private ScreenManager manager;
	private JTextField textHenField;
	private JTextField textCowField;
	private JTextField textPigField;
	private JTextField textFieldTomato;
	private JTextField textFieldCarrot;
	private JTextField textFieldCorn;
	private JTextField textFieldEggplaint;
	private JTextField textField_KiwiFruit;
	
	public MainScreen(ScreenManager incomingManager) {
		manager = incomingManager;
		initialize();
		frmManagerMain.setVisible(true);
	}
	
	public void closeWindows() {
		frmManagerMain.dispose();
	}
	
	public void finishedWindow() {
		
		manager.closeMainScreen(this);
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManagerMain = new JFrame();
		frmManagerMain.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmManagerMain.setTitle("Rocket Manager Main Screen");
		frmManagerMain.setBounds(100, 100, 945, 775);
		frmManagerMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManagerMain.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Aboard!");
		lblNewLabel.setBounds(10, 10,2837, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmManagerMain.getContentPane().add(lblNewLabel);
		
		JButton btnCleanRocket = new JButton("Move to next day");
		btnCleanRocket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Controller.currentDay == Controller.playDays)
				{
					JOptionPane.showMessageDialog(null, "oops, you are in the final day,can not move to the next day", "Message",JOptionPane.PLAIN_MESSAGE);
				}
				else
				{
				Controller.moveToNextDay();
				String s = "Move to next day Success! Acconding the number of crops you'v got " + Controller.cropCount *5 +" dollers , every animal and crop's status is changed";
				JOptionPane.showMessageDialog(null, s, "Message",JOptionPane.PLAIN_MESSAGE);
				
				
				int n = Controller.dealRandomEvent();
				  if (n == 1)
					  JOptionPane.showMessageDialog(null,"oops, you wells have dried up, and the crops are thirsty, you will lost some crops,check it" , "Message",JOptionPane.PLAIN_MESSAGE);
				  if (n == 2)
					  JOptionPane.showMessageDialog(null,"oops, your fence is broken, you will lost some animals,check it" , "Message",JOptionPane.PLAIN_MESSAGE);
				  if (n == 3)
					  JOptionPane.showMessageDialog(null,"Congratulation! Your farm has won the top award at the annual county fair.You earn a lot a money, you can check in your profile" , "Message",JOptionPane.PLAIN_MESSAGE);

				}
			}
		});
		btnCleanRocket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCleanRocket.setBounds(59, 691, 187, 37);
		frmManagerMain.getContentPane().add(btnCleanRocket);
		
		JButton btnRefuelRocket = new JButton("Expand Land");
		btnRefuelRocket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean isSuccess = Controller.expandFarmArea();
				if(isSuccess) {
				int n = Controller.getFarmArea() * 5;
				
				String s = "Expand Area Success! You can have " + n +" crops";
				JOptionPane.showMessageDialog(null, s, "Message",JOptionPane.PLAIN_MESSAGE);}
				else {
					JOptionPane.showMessageDialog(null, "oops, you do not have enough money to expand area", "Message",JOptionPane.PLAIN_MESSAGE);}
				}
			
		});
		btnRefuelRocket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRefuelRocket.setBounds(296, 691, 167, 37);
		frmManagerMain.getContentPane().add(btnRefuelRocket);
		
		JButton btnNewButton_6 = new JButton("Quit");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.writePlayConfigureToFile();
				finishedWindow();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_6.setBounds(761, 691, 143, 37);
		frmManagerMain.getContentPane().add(btnNewButton_6);
		
		JButton btnCountryStore = new JButton("Country Store");
		btnCountryStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchStoreScreen();
				finishedWindow();
			}
		});
		btnCountryStore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCountryStore.setBounds(761, 10, 143, 37);
		frmManagerMain.getContentPane().add(btnCountryStore);
		
		JLabel lblCropList = new JLabel("Crop List");
		lblCropList.setBounds(10, 10, 68, 20);
		lblCropList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("Animal List");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 10, 84, 20);
		
		JLabel lblNewLabel_2 = new JLabel("Items List");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 10, 99, 27);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(20, 52, 889, 175);
		frmManagerMain.getContentPane().add(panel);
		panel.setLayout(null);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Hen:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 51, 94, 33);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cow:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(10, 94, 94, 33);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pig:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(10, 137, 94, 36);
		panel.add(lblNewLabel_5);
		
		JLabel lblHenNumber = new JLabel("New label");
		lblHenNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHenNumber.setBounds(114, 53, 94, 33);
		panel.add(lblHenNumber);
		
		JLabel lblCowNumber = new JLabel("New label");
		lblCowNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCowNumber.setBounds(114, 94, 94, 33);
		panel.add(lblCowNumber);
		
		JLabel lblPigNumber = new JLabel("New label");
		lblPigNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPigNumber.setBounds(114, 139, 94, 33);
		panel.add(lblPigNumber);
		
		JButton btnChooseHen = new JButton("Interaction");
		btnChooseHen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchAnimalScreen("Hen", Integer.parseInt(textHenField.getText()));
				finishedWindow();
			}
		});
		btnChooseHen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseHen.setBounds(731, 51, 148, 33);
		panel.add(btnChooseHen);
		
		JButton btnChooseCow = new JButton("Interaction");
		btnChooseCow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = Integer.parseInt(textCowField.getText());
				System.out.print(index);
				manager.launchAnimalScreen("Cow", index);
				finishedWindow();
			}
		});
		btnChooseCow.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseCow.setBounds(731, 94, 148, 33);
		panel.add(btnChooseCow);
		
		JButton btnChoosePig = new JButton("Interaction");
		btnChoosePig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchAnimalScreen("Pig", Integer.parseInt(textPigField.getText()));
				finishedWindow();
			}
		});
		btnChoosePig.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChoosePig.setBounds(731, 137, 148, 33);
		panel.add(btnChoosePig);
		
		JLabel lblSerialNumber = new JLabel("Serial Number:");
		lblSerialNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSerialNumber.setBounds(404, 51, 112, 33);
		panel.add(lblSerialNumber);
		
		textHenField = new JTextField();
		textHenField.setBounds(526, 51, 148, 33);
		panel.add(textHenField);
		textHenField.setColumns(10);
		textHenField.setText("0");
		
		JLabel label = new JLabel("Serial Number:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(404, 94, 112, 33);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Serial Number:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(404, 139, 112, 33);
		panel.add(label_1);
		
		textCowField = new JTextField();
		textCowField.setColumns(10);
		textCowField.setBounds(526, 96, 148, 33);
		panel.add(textCowField);
		textCowField.setText("0");
		
		textPigField = new JTextField();
		textPigField.setColumns(10);
		textPigField.setBounds(526, 137, 148, 33);
		panel.add(textPigField);
		textPigField.setText("0");
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(20, 251, 889, 247);
		frmManagerMain.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(lblCropList);
		
		JLabel lblNewLabel_6 = new JLabel("Tomato:");
		lblNewLabel_6.setBounds(10, 40, 94, 31);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Carrot:");
		lblNewLabel_7.setBounds(10, 81, 94, 31);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Corn:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(10, 122, 94, 31);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Eggplant:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(10, 162, 94, 25);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("KiwiFruit:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(10, 201, 94, 31);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblTomatoNumber = new JLabel("New label");
		lblTomatoNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTomatoNumber.setBounds(114, 38, 94, 33);
		panel_1.add(lblTomatoNumber);
		
		JLabel lblCarrotNumber = new JLabel("New label");
		lblCarrotNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCarrotNumber.setBounds(114, 79, 94, 33);
		panel_1.add(lblCarrotNumber);
		
		JLabel lblCornNumber = new JLabel("New label");
		lblCornNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCornNumber.setBounds(114, 121, 94, 33);
		panel_1.add(lblCornNumber);
		
		JLabel lblEggplantNumber = new JLabel("New label");
		lblEggplantNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEggplantNumber.setBounds(114, 158, 94, 33);
		panel_1.add(lblEggplantNumber);
		
		JLabel lblKiwiFruitNumber = new JLabel("New label");
		lblKiwiFruitNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKiwiFruitNumber.setBounds(114, 200, 94, 33);
		panel_1.add(lblKiwiFruitNumber);
		
		
		JButton btnChooseCarrot = new JButton("Operate");
		btnChooseCarrot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen("Carrot", Integer.parseInt(textFieldCarrot.getText()));
				finishedWindow();
			}
		});
		btnChooseCarrot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseCarrot.setBounds(731, 80, 148, 33);
		panel_1.add(btnChooseCarrot);
		
		JButton btnChooseCorn = new JButton("Operate");
		btnChooseCorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen("Corn", Integer.parseInt(textFieldCorn.getText()));
				finishedWindow();
			}
		});
		btnChooseCorn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseCorn.setBounds(731, 121, 148, 33);
		panel_1.add(btnChooseCorn);
		
		JButton btnChooseEggplant = new JButton("Operate");
		btnChooseEggplant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen("Eggplant", Integer.parseInt(textFieldEggplaint.getText()));
				finishedWindow();
			}
		});
		btnChooseEggplant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseEggplant.setBounds(731, 158, 148, 33);
		panel_1.add(btnChooseEggplant);
		
		JButton btnChooseKiwiFruit = new JButton("Operate");
		btnChooseKiwiFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen("KiwiFruit", Integer.parseInt(textField_KiwiFruit.getText()));
				finishedWindow();
			}
		});
		btnChooseKiwiFruit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseKiwiFruit.setBounds(731, 200, 148, 33);
		panel_1.add(btnChooseKiwiFruit);
		
		JLabel label_2 = new JLabel("Serial Number:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(404, 39, 112, 33);
		panel_1.add(label_2);
		
		textFieldTomato = new JTextField();
		textFieldTomato.setBounds(530, 41, 148, 33);
		panel_1.add(textFieldTomato);
		textFieldTomato.setColumns(10);
		textFieldTomato.setText("0");
		
		JLabel label_3 = new JLabel("Serial Number:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(404, 80, 112, 33);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Serial Number:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(404, 121, 112, 33);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Serial Number:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(404, 158, 112, 33);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Serial Number:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(404, 200, 112, 33);
		panel_1.add(label_6);
		
		textFieldCarrot = new JTextField();
		textFieldCarrot.setColumns(10);
		textFieldCarrot.setBounds(530, 81, 148, 33);
		panel_1.add(textFieldCarrot);
		textFieldCarrot.setText("0");
		
		textFieldCorn = new JTextField();
		textFieldCorn.setColumns(10);
		textFieldCorn.setBounds(530, 122, 148, 33);
		panel_1.add(textFieldCorn);
		textFieldCorn.setText("0");
		
		textFieldEggplaint = new JTextField();
		textFieldEggplaint.setColumns(10);
		textFieldEggplaint.setBounds(530, 162, 148, 33);
		panel_1.add(textFieldEggplaint);
		textFieldEggplaint.setText("0");
		
		textField_KiwiFruit = new JTextField();
		textField_KiwiFruit.setColumns(10);
		textField_KiwiFruit.setBounds(530, 201, 148, 33);
		panel_1.add(textField_KiwiFruit);
		textField_KiwiFruit.setText("0");
		
		JButton btnChooseTomato = new JButton("Operate");
		btnChooseTomato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen("Tomato", Integer.parseInt(textFieldTomato.getText()));
				finishedWindow();
				
			}
		});
		btnChooseTomato.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseTomato.setBounds(731, 38, 148, 33);
		panel_1.add(btnChooseTomato);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(20, 524, 889, 157);
		frmManagerMain.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_11 = new JLabel("AnimalFeedItems:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(10, 47, 159, 27);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("HappyAgentItems:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(10, 84, 159, 27);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("TimeAgentItems:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(10, 121, 159, 26);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblAnimalFeedItems = new JLabel("New label");
		lblAnimalFeedItems.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAnimalFeedItems.setBounds(166, 47, 127, 27);
		panel_2.add(lblAnimalFeedItems);
		
		JLabel lblHappyAgentItems = new JLabel("New label");
		lblHappyAgentItems.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHappyAgentItems.setBounds(166, 84, 127, 27);
		panel_2.add(lblHappyAgentItems);
		
		JLabel lblTimeAgentItems = new JLabel("New label");
		lblTimeAgentItems.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTimeAgentItems.setBounds(166, 121, 127, 26);
		panel_2.add(lblTimeAgentItems);
		
	JButton btnNewButton = new JButton("Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchProfileScreen();
				finishedWindow();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(571, 10, 136, 37);
		frmManagerMain.getContentPane().add(btnNewButton);
		
		JButton btnCleardata = new JButton("Finish Game");
		btnCleardata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.finishGame();
				finishedWindow();
				
			}
		});
		btnCleardata.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCleardata.setBounds(521, 691, 167, 37);
		frmManagerMain.getContentPane().add(btnCleardata);
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String s = Controller.readFromFile();
		String[] p = s.split("-");
		int typeId = Integer.parseInt(p[0].trim());
		String farmerName = p[1];
		String farmName = p[2];
		int playDays = Integer.parseInt(p[3].trim());
		Controller.createFarm(typeId, farmerName.toUpperCase(), farmName.toUpperCase(), playDays);
		
		Map<String, Integer> map = Controller.showStore(); 
		Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator(); 
		 System.out.println("run here"); 
		while (entries.hasNext()) { 
		  Map.Entry<String, Integer> entry = entries.next(); 
		  System.out.print(entry.getKey()+ entry.getValue());
		  switch(entry.getKey())
		  {
		  	
		  case "Corn":
				lblCornNumber.setText(entry.getValue().toString());
				break;
			case "Carrot":
				lblCarrotNumber.setText(entry.getValue().toString());
				break;
			case "Eggplant":
				lblEggplantNumber.setText(entry.getValue().toString());
				break;
			case "KiwiFruit":
				lblKiwiFruitNumber.setText(entry.getValue().toString());
				break;
			case "Tomato":
				lblTomatoNumber.setText(entry.getValue().toString());
				break;
			case "Pig":
				lblPigNumber.setText(entry.getValue().toString());
				break;
			case "Hen":
				lblHenNumber.setText(entry.getValue().toString());
				break;
			case "Cow":
				lblCowNumber.setText(entry.getValue().toString());
				break;
			case "AnimalFeedItems":
				lblAnimalFeedItems.setText(entry.getValue().toString());
				break;
			case "TimeAgentItems":
				lblTimeAgentItems.setText(entry.getValue().toString());
				break;
			case "HappyAgentItems":
				lblHappyAgentItems.setText(entry.getValue().toString());
				break;
		  }
		  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		  	  
		 		}
	}
}
