package EjemploSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;

public class Ejemplo {

	private JFrame frame;
	//Hola que tal
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo window = new Ejemplo();
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
	public Ejemplo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 102, 255));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Opcion2");
		chckbxNewCheckBox.setBackground(new Color(51, 255, 0));
		frame.getContentPane().add(chckbxNewCheckBox, BorderLayout.WEST);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("opcion2");
		chckbxNewCheckBox_1.setBackground(new Color(51, 255, 153));
		frame.getContentPane().add(chckbxNewCheckBox_1, BorderLayout.EAST);
		
		JButton btnNewButton_1 = new JButton("pulsar2");
		btnNewButton_1.setBackground(new Color(102, 255, 255));
		frame.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("pulsar3");
		btnNewButton_2.setBackground(new Color(255, 204, 0));
		frame.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		frame.setBounds(100, 100, 450, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
