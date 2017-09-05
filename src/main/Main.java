
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

		GenerationEvenements ge=new GenerationEvenements();

		List<Evenement> e1 = ge.getEvenements();

		do{
			heureActuelle++;
			if(heureActuelle>24){
				jourActuel++;
				heureActuelle=0;
			}
			if(jourActuel==8){
				jourActuel=1;
				semaineActuelle++;
			}
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
				if(moment.proba > r.nextDouble()){
					System.out.println(moment.toString());
					System.out.println("Energie:"+Joueur.getBarreEnergie());
					System.out.println("Popularité:"+Joueur.getBarrePopularite());
					System.out.println("Résultats:"+Joueur.getBarreResultats());
					//faire ici choix et gestion du choix
				}

			}

			//Vérifie la fin
			if(Joueur.BarreNegative()){
				fini=true;
			}
		}while(!fini);
	}


}
