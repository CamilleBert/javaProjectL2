package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fen1 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel p = new JPanel();
	
	JButton b_gest = new JButton("GESTION");
	JButton b_ach = new JButton("ACHAT");
	JButton b_quit = new JButton("Quitter");
	
	public Fen1() {
		
		// Fenêtre
		
		p.setBackground(new Color(200, 200, 200));
		p.setLayout(null);
		setContentPane(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		// Boutons : Gestion, Achat, Quitter
		
		b_gest.setBackground(new Color(147, 112, 219));
		b_gest.setFont(new Font("Arial", Font.BOLD, 55));
		b_gest.setBounds(50, 50, 400, 100);
		b_gest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Fen2_Gest();
				dispose();
			}
		});
		p.add(b_gest);
		
		b_ach.setFont(new Font("Arial", Font.BOLD, 55));
		b_ach.setBackground(new Color(205, 92, 92));
		b_ach.setBounds(50, 200, 400, 100);
		b_ach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Fen2_Ach();
				dispose();
			}
		});
		p.add(b_ach);
		
		b_quit.setBackground(new Color(255, 200, 200));
		b_quit.setFont(new Font("Arial", Font.BOLD, 10));
		b_quit.setBounds(0, 0, 80, 20);
		b_quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		p.add(b_quit);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fen1 frame = new Fen1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
