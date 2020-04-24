package Lab6;

import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ListExampleWindow {

	private JFrame frame;

	private ArrayList<Astronaut> astronauts = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListExampleWindow window = new ListExampleWindow();
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
	public ListExampleWindow() {
		astronauts.add(new Astronaut(48, "Elon", "Musk"));
		astronauts.add(new Astronaut(69, "Richard", "Branson"));
		astronauts.add(new Astronaut(56, "Jeff", "Bezos"));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	

		DefaultListModel<Astronaut> astronautListModel = new DefaultListModel<Astronaut>();
		astronautListModel.addAll(astronauts);
		
		JList<Astronaut> astronautList = new JList<>(astronautListModel);
		astronautList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		astronautList.setBounds(106, 19, 223, 101);
		frame.getContentPane().add(astronautList);
		
		JButton btnNewButton = new JButton("Show Selected Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button pressed! Currently selected astronaut is:");
				System.out.println(astronautList.getSelectedValue());
			}
		});
		btnNewButton.setBounds(106, 156, 149, 21);
		frame.getContentPane().add(btnNewButton);
		
		astronautList.getSelectedValue();
	}

}
class Astronaut {
	private int age;
	private String firstName;
	private String lastName;
	
	public Astronaut(int age, String firstName, String lastName) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getAge() {
		return  age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s, %d years old", firstName, lastName, age);
	}
}
