package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CaissierView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaissierView window = new CaissierView();
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
	public CaissierView() {
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
		
		JButton btnNewButton = new JButton("Valider Panier Client");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(170, 100, 150, 23);
		panel.add(btnNewButton);
		
		JButton button = new JButton("Déconnecter caisse");
		button.setBounds(170, 159, 150, 23);
		panel.add(button);
		
		JButton btnScannerProduit = new JButton("Scanner Produit");
		btnScannerProduit.setBounds(170, 40, 150, 23);
		panel.add(btnScannerProduit);
		
		JButton btnMettreJour = new JButton("Mettre \u00E0 jour caisse");
		btnMettreJour.setBounds(170, 216, 150, 23);
		panel.add(btnMettreJour);
	}

}
