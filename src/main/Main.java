
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import verifSaisie.EntierPositifNonVide;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean fini=false;
		int jourActuel=1;
		int semaineActuelle=1;
		int heureActuelle=1;
		int nbrHeures=0;
		double score=0;

		GenerationEvenements ge=new GenerationEvenements();

		List<Evenement> e1 = ge.getEvenements();



		do{
			heureActuelle++;
			if(heureActuelle>23){
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

					System.out.println("Faites votre choix : (entrez un chiffre)");
					String str="";
					do{
						str = sc.nextLine();
					}while(!EntierPositifNonVide.entre(str, 1, 3));
					if(Integer.parseInt(str)==1){
						moment.consequenceChoix1();
					}
					else if(Integer.parseInt(str) == 2){
						moment.consequenceChoix2();
					}
					else if(Integer.parseInt(str) == 3){
						moment.consequenceChoix3();
					}


				}
			}
			//Vérifie la fin
			Joueur.BarreHorsLimites();
			nbrHeures++;
			if(Joueur.getBarreEnergie().getValeur()+Joueur.getBarrePopularite().getValeur()+Joueur.getBarreResultats().getValeur()>150) score=Joueur.getBarreEnergie().getValeur()+Joueur.getBarrePopularite().getValeur()+Joueur.getBarreResultats().getValeur()-150;
			if(Joueur.getBarreEnergie().getValeur()+Joueur.getBarrePopularite().getValeur()+Joueur.getBarreResultats().getValeur()<150) score=150-Joueur.getBarreEnergie().getValeur()+Joueur.getBarrePopularite().getValeur()+Joueur.getBarreResultats().getValeur();
			if(nbrHeures==14) score=score/2;
			if (jourActuel == 7 && semaineActuelle == 2 && heureActuelle == 23) {
				Fins.setFinactive(1);
				
			}
		}while(Fins.getFinactive() == -1);
		
		System.out.println(Fins.finDuJeu());
		System.out.println("Tu as survecu " + nbrHeures + " heures avec un score de " + score);
	}
	

}
