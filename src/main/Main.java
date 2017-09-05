
package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private static Barre barreEnergie=new Barre(NomBarre.ENERGIE);
	private static Barre barrePopularite=new Barre(NomBarre.POPULARITE);
	private static Barre barreResultats=new Barre(NomBarre.RESULTATS);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean fini=false;
		int jourActuel=1;
		int semaineActuelle=1;
		int heureActuelle=0;
		List e1 = new ArrayList<Evenement>();
		Evenement ev1 = new Evenement("Premier Amphi de l'annee","J'y vais !","J'y vais pas","J'arrive en retard",0,15,30,-10,10,0,20,-20,0,new Date(1,1,1));
		e1.add(ev1);
		do{
			
		}while(!fini);
		System.out.println();
		Barre barre=getBarreEnergie();
		System.out.println(barre);

	}
	public static Barre getBarreEnergie() {
		return barreEnergie;
	}
	public static Barre getBarrePopularite() {
		return barrePopularite;
	}
	public static Barre getBarreResultats() {
		return barreResultats;
	}
	public static void setBarreEnergie(Barre barreEnergie1) {
		barreEnergie = barreEnergie1;
	}
	public static void setBarrePopularite(Barre barrePopularite1) {
		barrePopularite = barrePopularite1;
	}
	public static void setBarreResultats(Barre barreResultats1) {
		barreResultats = barreResultats1;
	}

}
