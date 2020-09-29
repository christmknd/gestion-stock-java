package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FournisseurView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FournisseurView window = new FournisseurView();
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
	public FournisseurView() {
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
		
		JLabel lblNewLabel = new JLabel("CodeBarre");
		lblNewLabel.setBounds(90, 50, 70, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantité");
		lblNewLabel_1.setBounds(90, 85, 70, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblDestinataire = new JLabel("Destinataire");
		lblDestinataire.setBounds(90, 122, 70, 14);
		panel.add(lblDestinataire);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(90, 163, 75, 14);
		panel.add(lblAdresse);
		
		textField = new JTextField();
		textField.setBounds(170, 47, 150, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 82, 150, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 119, 150, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(170, 160, 150, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnEnvoyerLaCommande = new JButton("Envoyer la commande");
		btnEnvoyerLaCommande.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnEnvoyerLaCommande.setBounds(170, 204, 150, 23);
		panel.add(btnEnvoyerLaCommande);
	}
}
