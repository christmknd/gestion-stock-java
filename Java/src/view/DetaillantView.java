package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class DetaillantView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetaillantView window = new DetaillantView();
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
	public DetaillantView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 475, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAjouter = new JButton("AjouterArticle");
		btnAjouter.setBounds(10, 50, 200, 25);
		panel.add(btnAjouter);
		
		JButton btnModifier = new JButton("ModifierArticle");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModifier.setBounds(10, 100, 200, 25);
		panel.add(btnModifier);
		
		JButton btnNewButton = new JButton("SupprimerArticle");
		btnNewButton.setBounds(10, 150, 200, 25);
		panel.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(146, 198, 6, -168);
		panel.add(separator);
		
		JButton btnNewButton_1 = new JButton("AjouterFournisseur");
		btnNewButton_1.setBounds(250, 51, 200, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ModifierFournisseur");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(250, 101, 200, 25);
		panel.add(btnNewButton_2);
		
		JButton btnSupprimerfournisseur = new JButton("SupprimerFournisseur");
		btnSupprimerfournisseur.setBounds(250, 151, 200, 25);
		panel.add(btnSupprimerfournisseur);
		
		JButton btnEnvoyercommande = new JButton("EnvoyerCommande");
		btnEnvoyercommande.setBounds(129, 224, 200, 25);
		panel.add(btnEnvoyercommande);
		
		
	}
}
