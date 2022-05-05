package view;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

import javax.swing.*;

import controller.NewDepense;
import controller.NewLivre;
import model.*;

public class Fen4_Gest_NewLiv extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane = new JPanel();
	private JTextField t_titre;
	private JTextField t_auteur;
	private JTextField t_editeur;
	private JTextField t_prix;
	private JTextField t_resume;
	private JTextField t_categorie;
	private JTextField t_format;
	private JTextField t_langueVO;
	private JTextField t_stock;

	private JTextField t_idEmploye;
	private JTextField t_nomEmploye;

	private JTextField t_preEmploye;
	
	LocalDate currentdate = LocalDate.now();
	String v = String.valueOf(currentdate.toString());
	String strArray[] = v.split("-");
	
	JButton b_effacer = new JButton("EFFACER");
	JButton b_valider = new JButton("VALIDER");
	JButton b_retour = new JButton("RETOUR");
	JComboBox<String> c_jour = new JComboBox();
	JComboBox<String> c_mois = new JComboBox();
	
	private JTextField t_annee;
	private JTextField t_pStock;
	public Fen4_Gest_NewLiv(Magasin m) {
		contentPane.setBackground(new Color(200, 200, 200));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 930);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		
		// JLabel "Renseignements du nouveau livre"
		
		JLabel l_rens = new JLabel("Renseignements du nouveau livre");
		l_rens.setHorizontalAlignment(SwingConstants.CENTER);
		l_rens.setFont(new Font("Tahoma", Font.PLAIN, 40));
		l_rens.setBounds(35, 37, 774, 65);
		contentPane.add(l_rens);
		
		// JLabel & JTextfield "Titre"
		
		JLabel l_titre = new JLabel("Titre :");
		l_titre.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_titre.setBounds(35, 128, 190, 31);
		contentPane.add(l_titre);
		
		t_titre = new JTextField();
		t_titre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_titre.setBounds(35, 159, 319, 31);
		contentPane.add(t_titre);
		t_titre.setColumns(10);
		
		// JLabel & JTextfield "Auteur"
		
		JLabel l_auteur = new JLabel("Auteur :");
		l_auteur.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_auteur.setBounds(35, 201, 190, 31);
		contentPane.add(l_auteur);
		
		t_auteur = new JTextField();
		t_auteur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_auteur.setColumns(10);
		t_auteur.setBounds(35, 231, 319, 31);
		contentPane.add(t_auteur);

		// JLabel & JTextfield "Editeur"
				
		JLabel l_editeur = new JLabel("Editeur :");
		l_editeur.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_editeur.setBounds(35, 273, 190, 31);
		contentPane.add(l_editeur);
		
		t_editeur = new JTextField();
		t_editeur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_editeur.setColumns(10);
		t_editeur.setBounds(35, 303, 319, 31);
		contentPane.add(t_editeur);
		
		// JLabel & JTextfield "Prix"
		
		JLabel l_prix = new JLabel("Prix : ");
		l_prix.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_prix.setBounds(35, 340, 190, 31);
		contentPane.add(l_prix);
		
		t_prix = new JTextField();
		t_prix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_prix.setColumns(10);
		t_prix.setBounds(35, 372, 319, 31);
		contentPane.add(t_prix);
		
		// JLabel & JTextfield "R�sum�"
		
		JLabel l_resume = new JLabel("R�sum� : ");
		l_resume.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_resume.setBounds(35, 410, 190, 31);
		contentPane.add(l_resume);
		
		t_resume = new JTextField();
		t_resume.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_resume.setColumns(10);
		t_resume.setBounds(35, 440, 774, 139);
		contentPane.add(t_resume);
		
		// JLabel & JTextfield "Cat�gorie"
		
		JLabel l_categorie = new JLabel("Cat�gorie : ");
		l_categorie.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_categorie.setBounds(490, 128, 190, 31);
		contentPane.add(l_categorie);
		
		t_categorie = new JTextField();
		t_categorie.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_categorie.setColumns(10);
		t_categorie.setBounds(490, 159, 319, 31);
		contentPane.add(t_categorie);
		
		// JLabel & JTextfield "Format"
		
		JLabel l_format = new JLabel("Format : ");
		l_format.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_format.setBounds(490, 201, 190, 31);
		contentPane.add(l_format);
		
		t_format = new JTextField();
		t_format.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_format.setColumns(10);
		t_format.setBounds(490, 231, 319, 31);
		contentPane.add(t_format);
		
		// JLabel & JTextfield "Langue originale"
		
		JLabel l_langueVO = new JLabel("Langue originale :");
		l_langueVO.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_langueVO.setBounds(490, 273, 319, 31);
		contentPane.add(l_langueVO);
		
		t_langueVO = new JTextField();
		t_langueVO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_langueVO.setColumns(10);
		t_langueVO.setBounds(490, 303, 319, 31);
		contentPane.add(t_langueVO);
		
		// JLabel & JTextfield "Date de parution"
		
		JLabel l_dateP = new JLabel("Date de parution : ");
		l_dateP.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_dateP.setBounds(490, 340, 319, 31);
		contentPane.add(l_dateP);
		
		// JLabel & JTextfield "Langue originale"
		
		JLabel l_idEmploye = new JLabel("Identifiant employé");
		l_idEmploye.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_idEmploye.setBounds(35, 667, 319, 31);
		contentPane.add(l_idEmploye);
				
		t_idEmploye = new JTextField();
		t_idEmploye.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_idEmploye.setColumns(10);
		t_idEmploye.setBounds(35, 700, 319, 31);
		contentPane.add(t_idEmploye);
				
		// JLabel & JTextfield "Langue originale"
		
		JLabel l_nomEmploye = new JLabel("Nom employé");
		l_nomEmploye.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_nomEmploye.setBounds(490, 667, 319, 31);
		contentPane.add(l_nomEmploye);
				
		t_nomEmploye = new JTextField();
		t_nomEmploye.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_nomEmploye.setColumns(10);
		t_nomEmploye.setBounds(490, 700, 319, 31);
		contentPane.add(t_nomEmploye);
		
		// JLabel & JTextfield "Langue originale"
		
		JLabel l_preEmploye = new JLabel("Prénom employé");
		l_preEmploye.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_preEmploye.setBounds(490, 740, 319, 31);
		contentPane.add(l_preEmploye);
						
		t_preEmploye = new JTextField();
		t_preEmploye.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_preEmploye.setColumns(10);
		t_preEmploye.setBounds(490, 777, 319, 31);
		contentPane.add(t_preEmploye);
				
		// Bouton retour 
		
		JButton b_retour = new JButton("Retour");
		b_retour.setBackground(new Color(255, 215, 0));
		b_retour.setFont(new Font("Tahoma", Font.BOLD, 30));
		b_retour.setBounds(30, 820, 207, 64);
		b_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Fen3_Gest_Liv(m);
			}
		});
		contentPane.add(b_retour);
		
		// Bouton enregistrer
		
		JButton b_enregistrer = new JButton("Enregistrer");
		b_enregistrer.setBackground(new Color(255, 215, 0));
		b_enregistrer.setFont(new Font("Tahoma", Font.BOLD, 30));
		b_enregistrer.setBackground(new Color(30, 144, 255));
		b_enregistrer.setBounds(574, 820, 235, 64);
		b_enregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 {System.out.println(currentdate);}
				 {System.out.println(strArray[1]);}
				if(new NewLivre(m, t_titre, t_auteur, t_editeur, c_jour, c_mois, t_annee, t_prix, t_categorie, t_resume, t_stock).status == 1  ) {
				if(
	new NewDepense(m, t_idEmploye, t_nomEmploye , t_preEmploye, t_pStock, "Achat nouveau stock", currentdate.getDayOfMonth(), strArray[1],currentdate.getYear()).status==1) {
				  	
				
					new Fen3_Gest_Liv(m);
						
					dispose();
					}}
				else {
					JFrame a = new JFrame();
					JOptionPane.showMessageDialog(a, "Veuillez remplir tous les champs.", "Erreur", 2);
					
				}
				
				}
			
		});
		contentPane.add(b_enregistrer);
		
		JLabel l_prix_1 = new JLabel("Stock initial :");
		l_prix_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_prix_1.setBounds(35, 597, 190, 31);
		contentPane.add(l_prix_1);
		
		t_stock = new JTextField("0");
		t_stock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_stock.setColumns(10);
		t_stock.setBounds(35, 630, 319, 31);
		contentPane.add(t_stock);
		
		t_annee = new JTextField();
		t_annee.setColumns(10);
		t_annee.setBounds(729, 407, 80, 22);
		contentPane.add(t_annee);
		
		JLabel l_annee = new JLabel("Ann\u00E9e");
		l_annee.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		l_annee.setBounds(729, 372, 80, 31);
		contentPane.add(l_annee);
		
		JLabel l_jour = new JLabel("Jour");
		l_jour.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		l_jour.setBounds(490, 372, 80, 31);
		contentPane.add(l_jour);
		
		JLabel l_mois = new JLabel("Mois");
		l_mois.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		l_mois.setBounds(600, 372, 80, 31);
		contentPane.add(l_mois);
		
		c_jour.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		c_jour.setBounds(490, 407, 80, 22);
		contentPane.add(c_jour);
		
		c_mois.setModel(new DefaultComboBoxModel<String>(new String[] {"Janvier", "F\\u00E8vrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Ao\\u00FAt", "Septembre", "Octobre", "Novembre", "D\\u00E8cembre"}));
		c_mois.setBounds(600, 407, 80, 22);
		contentPane.add(c_mois);
		
		JLabel l_pStock = new JLabel("Prix du stock :");
		l_pStock.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
		l_pStock.setBounds(490, 597, 190, 31);
		contentPane.add(l_pStock);
		
		t_pStock = new JTextField();
		t_pStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		t_pStock.setColumns(10);
		t_pStock.setBounds(490, 630, 319, 31);
		contentPane.add(t_pStock);
	}
}