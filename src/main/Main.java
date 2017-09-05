
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
		
		do{
			System.out.println(new Date(semaineActuelle,jourActuel,heureActuelle).toString());
			Evenement moment=null;
			for(Evenement e:e1){
				if(e.uneDateEvenement.getHeure()==heureActuelle && e.uneDateEvenement.getJour()==jourActuel && e.uneDateEvenement.getSemaine()==semaineActuelle){
					moment=e;
				}
			}
			if(moment==null){
				System.out.println("\n Il n'y a pas eu d'évenement à cette heure ci!");
			}else{
				System.out.println(moment.toString());
				//faire ici choix et gestion du choix
				
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
