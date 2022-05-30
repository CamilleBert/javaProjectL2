package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import controller.*;

public class Fen3_Ach_ExistC extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Fen3_Ach_ExistC(Magasin m) {
		
		// Fen�tre
		
		Toolkit tk = Toolkit.getDefaultToolkit();  
        Image img = tk.getImage("src/resources/logo.png");
		setIconImage(img);
		JPanel p = new JPanel();
		setTitle("Identification du client");
		p.setBackground(new Color(200, 200, 200));
		p.setLayout(null);
		setContentPane(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		// Labels
		
		JLabel l_main = new JLabel("Renseignements du client");
		l_main.setHorizontalAlignment(SwingConstants.CENTER);
		l_main.setFont(new Font("Tahoma", Font.BOLD, 40));
		l_main.setBounds(0, 0, 584, 82);
		p.add(l_main);
		
		JLabel l_nom = new JLabel("Nom :");
		l_nom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l_nom.setBounds(20, 100, 150, 30);
		p.add(l_nom);
		
		JLabel l_prenom = new JLabel("Pr\u00E9nom :");
		l_prenom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l_prenom.setBounds(20, 140, 150, 30);
		p.add(l_prenom);
		
		JLabel l_mail = new JLabel("Adresse mail :");
		l_mail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l_mail.setBounds(20, 180, 150, 30);
		p.add(l_mail);
		
		// TextFields
		
		JTextField t_nom = new JTextField();
		t_nom.setBounds(184, 100, 370, 30);
		t_nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		p.add(t_nom);
		t_nom.setColumns(10);

		JTextField t_prenom = new JTextField();
		t_prenom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_prenom.setColumns(10);
		t_prenom.setBounds(184, 141, 370, 30);
		p.add(t_prenom);
		
		JTextField t_mail = new JTextField();
		t_mail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_mail.setColumns(10);
		t_mail.setBounds(184, 180, 370, 30);
		p.add(t_mail);
		
		// Boutons
		
		JButton b_retour = new JButton("Retour");
		b_retour.setBackground(new Color(200, 100, 100));
		b_retour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b_retour.setBounds(0, 281, 100, 30);
		b_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Fen2_Ach(m);
			}
		});
		p.add(b_retour);
		
		JButton b_valider = new JButton("VALIDER");
		b_valider.setBackground(new Color(100, 200, 100));
		b_valider.setFont(new Font("Tahoma", Font.BOLD, 20));
		b_valider.setBounds(217, 231, 150, 50);
		b_valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientExists ce = new ClientExists(m, t_nom, t_prenom, t_mail);
				if(ce.status == 1) {
					new Fen4_Ach_DoAch(m, ce.getClient());
					dispose();
				}
			}
		});
		p.add(b_valider);
	}
}