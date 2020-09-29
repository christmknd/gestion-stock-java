package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class MainView {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
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
	public MainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnConnexion = new JButton("Connexion");
		btnConnexion.setBounds(165, 206, 89, 23);
		panel.add(btnConnexion);
		
		JRadioButton rdbtnCaissier = new JRadioButton("Caisse");
		rdbtnCaissier.setBounds(100, 50, 109, 23);
		panel.add(rdbtnCaissier);
		
		JRadioButton rdbtnMagasin = new JRadioButton("Magasin");
		rdbtnMagasin.setBounds(250, 50, 109, 23);
		panel.add(rdbtnMagasin);
		
		textField = new JTextField();
		textField.setBounds(168, 103, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(100, 106, 46, 14);
		panel.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(100, 157, 46, 14);
		panel.add(lblPassword);
		
		JLabel lblEntreeSysteme = new JLabel("SYSTEME");
		lblEntreeSysteme.setBounds(168, 11, 46, 14);
		panel.add(lblEntreeSysteme);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 154, 86, 20);
		panel.add(passwordField);
	}
}
