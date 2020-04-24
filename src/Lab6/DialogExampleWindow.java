package Lab6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogExampleWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogExampleWindow window = new DialogExampleWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DialogExampleWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Notify");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*int choice = JOptionPane.showConfirmDialog(frame, "Yes or no?",  "Title Here", JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					System.out.println("They pressed yes");
				} else if (choice == JOptionPane.NO_OPTION) {
					System.out.println("They pressed no");
				} else {
					System.out.println("They didn't press either button!");
				}*/
				String[] choices = {"Elon Musk", "Jeff Bezos", "Richard Branson"};
				String selection = (String) JOptionPane.showInputDialog(
				                    frame,
				                    "Who's going to go to Mars first?",
				                    "Mars Quiz Question",
				                    JOptionPane.PLAIN_MESSAGE,
				                    null,
				                    choices,
				                    null);

				// Make sure to check that the String isn't null!
				if (selection != null) {
					if (selection == "Elon Musk") {
						// Do something
						System.out.println("They selected Elon Musk");
					} else if (selection == "Jeff Bezos") {
						// Do something else
						System.out.println("They selected Jeff Bezos");
					} else if (selection == "Richard Branson") {
						// Do a third thing
						System.out.println("They selected Richard Branson");
					}
				}
				else {
					System.out.println("They selected nothing");
				}
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
	}

}
