package controller;

import model.*;

public class ListCommande {
	Object[] list;
	String[] formattedList;
	
	public ListCommande(Magasin m) {
		list = m.listCom.toArray();
		formattedList = new String[list.length];
		System.out.println("Beginning list construction");
		for(int i = 0; i < list.length; i++) {
			String b = (((Commande)list[i]).getId()+" - Client : " + 
						((Client)list[i]).getId() + "  "+ 
						((Client)list[i]).getNom()+ 
						((Client)list[i]).getPrenom()+
						(((Commande) list[i]).getPrixTotal()));
			formattedList[i] = b;
			System.out.println(b);
		}
		System.out.println("Ending list construction");
	}
	
	public String[] getListCli() {
		return formattedList;
	}
}