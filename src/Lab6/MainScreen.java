package Lab6;

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
import java.awt.event.ActionEvent;

public class MainScreen {

	private JFrame frmRocketManagerMain;
	private RocketManager manager;
	
	public MainScreen(RocketManager incomingManager) {
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
		frmRocketManagerMain.setTitle("Rocket Manager Main Screen");
		frmRocketManagerMain.setBounds(100, 100, 628, 497);
		frmRocketManagerMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRocketManagerMain.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello Starman!");
		lblNewLabel.setBounds(10, 10, 277, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmRocketManagerMain.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Rocket1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 90, 187, 124);
		frmRocketManagerMain.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rocket2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(221, 90, 163, 124);
		frmRocketManagerMain.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_4.setBounds(418, 90, 148, 122);
		frmRocketManagerMain.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("Name: FalconHeavy");
		lblNewLabel_3.setBounds(25, 224, 172, 28);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmRocketManagerMain.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Fuel:              Full");
		lblNewLabel_5.setBounds(25, 262, 148, 28);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmRocketManagerMain.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cleanliness:    Dirty");
		lblNewLabel_6.setBounds(25, 306, 172, 28);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmRocketManagerMain.getContentPane().add(lblNewLabel_6);
		
		JButton btnCleanRocket = new JButton("Clean Rocket");
		btnCleanRocket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCleanRocket.setBounds(10, 397, 187, 37);
		frmRocketManagerMain.getContentPane().add(btnCleanRocket);
		
		JButton btnRefuelRocket = new JButton("Refuel Rocket");
		btnRefuelRocket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRefuelRocket.setBounds(226, 397, 167, 37);
		frmRocketManagerMain.getContentPane().add(btnRefuelRocket);
		
		JButton btnNewButton_6 = new JButton("Quit");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finishedWindow();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_6.setBounds(423, 393, 143, 37);
		frmRocketManagerMain.getContentPane().add(btnNewButton_6);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 224, 187, 143);
		frmRocketManagerMain.getContentPane().add(tabbedPane);
		
		JLabel label = new JLabel("Name: FalconHeavy");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(236, 224, 172, 28);
		frmRocketManagerMain.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Fuel:              Full");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(236, 262, 148, 28);
		frmRocketManagerMain.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Cleanliness:    Dirty");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(236, 306, 172, 28);
		frmRocketManagerMain.getContentPane().add(label_2);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(221, 223, 172, 144);
		frmRocketManagerMain.getContentPane().add(tabbedPane_1);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(418, 222, 148, 143);
		frmRocketManagerMain.getContentPane().add(tabbedPane_2);
	}
}
