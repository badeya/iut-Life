
package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean fini=false;
		int jourActuel=1;
		int semaineActuelle=1;
		int heureActuelle=1;

		List<Evenement> e1 = new ArrayList<Evenement>();
		Evenement ev1 = new Evenement("Premier Amphi de l'annee","J'y vais !","J'y vais pas","J'arrive en retard",0,15,30,-10,10,0,20,-20,0,new Date(1,1,1));
		e1.add(ev1);
		do{
			for(Evenement e:e1){
				if(e.uneDateEvenement.getHeure()==heureActuelle && e.uneDateEvenement.getJour()==jourActuel && e.uneDateEvenement.getSemaine()==semaineActuelle){
					System.out.println(e.toString());
				}
			}
			System.out.println("Energie:"+Joueur.getBarreEnergie());
			System.out.println("Popularité:"+Joueur.getBarrePopularite());
			System.out.println("Résultats:"+Joueur.getBarreResultats());
			fini=true;
			
		}while(!fini);
	}
	

}
