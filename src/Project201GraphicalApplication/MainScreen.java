package Project201GraphicalApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

	private JFrame frmRocketManagerMain;
	private ScreenManager manager;
	
	public MainScreen(ScreenManager incomingManager) {
		manager = incomingManager;
		initialize();
		frmRocketManagerMain.setVisible(true);
	}
	
	public void closeWindows() {
		frmRocketManagerMain.dispose();
	}
	
	public void finishedWindow() {
		manager.closeMainScreen(this);
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRocketManagerMain = new JFrame();
		frmRocketManagerMain.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmRocketManagerMain.setTitle("Rocket Manager Main Screen");
		frmRocketManagerMain.setBounds(100, 100, 945, 775);
		frmRocketManagerMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRocketManagerMain.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Aboard!");
		lblNewLabel.setBounds(10, 10,2837, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmRocketManagerMain.getContentPane().add(lblNewLabel);
		
		JButton btnCleanRocket = new JButton("Move to next day");
		btnCleanRocket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCleanRocket.setBounds(59, 691, 187, 37);
		frmRocketManagerMain.getContentPane().add(btnCleanRocket);
		
		JButton btnRefuelRocket = new JButton("Expand Land");
		btnRefuelRocket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRefuelRocket.setBounds(347, 691, 167, 37);
		frmRocketManagerMain.getContentPane().add(btnRefuelRocket);
		
		JButton btnNewButton_6 = new JButton("Quit");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_6.setBounds(761, 691, 143, 37);
		frmRocketManagerMain.getContentPane().add(btnNewButton_6);
		
		JButton btnCountryStore = new JButton("Country Store");
		btnCountryStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchStoreScreen();
				finishedWindow();
			}
		});
		btnCountryStore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCountryStore.setBounds(761, 10, 143, 37);
		frmRocketManagerMain.getContentPane().add(btnCountryStore);
		
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
		frmRocketManagerMain.getContentPane().add(panel);
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
		
		JButton btnChooseOne_2 = new JButton("Choose One");
		btnChooseOne_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchAnimalScreen();
				finishedWindow();
			}
		});
		btnChooseOne_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseOne_2.setBounds(731, 51, 148, 33);
		panel.add(btnChooseOne_2);
		
		JButton btnChooseOne_1 = new JButton("Choose One");
		btnChooseOne_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchAnimalScreen();
				finishedWindow();
			}
		});
		btnChooseOne_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseOne_1.setBounds(731, 94, 148, 33);
		panel.add(btnChooseOne_1);
		
		JButton btnChooseOne = new JButton("Choose One");
		btnChooseOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchAnimalScreen();
				finishedWindow();
			}
		});
		btnChooseOne.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseOne.setBounds(731, 137, 148, 33);
		panel.add(btnChooseOne);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(20, 251, 889, 247);
		frmRocketManagerMain.getContentPane().add(panel_1);
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
		
		JButton btnWaterIt = new JButton("Choose One");
		btnWaterIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen();
				finishedWindow();
			}
		});
		btnWaterIt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnWaterIt.setBounds(731, 40, 148, 33);
		panel_1.add(btnWaterIt);
		
		JButton btnChooseOne_3 = new JButton("Choose One");
		btnChooseOne_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen();
				finishedWindow();
			}
		});
		btnChooseOne_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseOne_3.setBounds(731, 81, 148, 33);
		panel_1.add(btnChooseOne_3);
		
		JButton btnChooseOne_4 = new JButton("Choose One");
		btnChooseOne_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen();
				finishedWindow();
			}
		});
		btnChooseOne_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseOne_4.setBounds(731, 124, 148, 33);
		panel_1.add(btnChooseOne_4);
		
		JButton btnChooseOne_5 = new JButton("Choose One");
		btnChooseOne_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen();
				finishedWindow();
			}
		});
		btnChooseOne_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseOne_5.setBounds(731, 168, 148, 33);
		panel_1.add(btnChooseOne_5);
		
		JButton btnChooseOne_6 = new JButton("Choose One");
		btnChooseOne_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.launchCropScreen();
				finishedWindow();
			}
		});
		btnChooseOne_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChooseOne_6.setBounds(731, 210, 148, 33);
		panel_1.add(btnChooseOne_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(20, 524, 889, 157);
		frmRocketManagerMain.getContentPane().add(panel_2);
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
		frmRocketManagerMain.getContentPane().add(btnNewButton);
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String s = Controller.readFromFile();
		Controller.init(s);
		
		Controller.showStore();
		Map<String, Integer> map = Controller.showStore(); 
		Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator(); 
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
