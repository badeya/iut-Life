
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		boolean fini=false;
		int jourActuel=1;
		int semaineActuelle=1;
		int heureActuelle=1;

		List<Evenement> e1 = new ArrayList<Evenement>();
		
		do{
			System.out.println(new Date(semaineActuelle,jourActuel,heureActuelle).toString());
			for(Evenement e:e1){
				if(e.uneDateEvenement.getHeure()==heureActuelle && e.uneDateEvenement.getJour()==jourActuel && e.uneDateEvenement.getSemaine()==semaineActuelle){
					System.out.println(e.toString());
					if(e.proba != 1 && r.nextDouble() == e.proba){
						System.out.println(e.toString());
					}
				}
			}
			System.out.println("Energie:"+Joueur.getBarreEnergie());
			System.out.println("Popularité:"+Joueur.getBarrePopularite());
			System.out.println("Résultats:"+Joueur.getBarreResultats());
			//Vérifie la fin
			if(Joueur.BarreNegative()){
				fini=true;
			}
		}while(!fini);
	}
	

}
