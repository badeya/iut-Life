
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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

		List<Evenement> e1 = new ArrayList<Evenement>();
		
		do{
			System.out.println(new Date(semaineActuelle,jourActuel,heureActuelle).toString());
			Evenement moment=null;
			for(Evenement e:e1){
				if(e.uneDateEvenement.getHeure()==heureActuelle && e.uneDateEvenement.getJour()==jourActuel && e.uneDateEvenement.getSemaine()==semaineActuelle){
					if(moment.proba > r.nextDouble()){
					moment=e;
					}
				}
					
				
			}
			if(moment==null){
				System.out.println("\n Il n'y a pas eu d'évenement à cette heure ci!");
			}else{
				
				System.out.println(moment.toString());
				System.out.println("Energie:"+Joueur.getBarreEnergie());
				System.out.println("Popularité:"+Joueur.getBarrePopularite());
				System.out.println("Résultats:"+Joueur.getBarreResultats());
				
				System.out.println("Faites votre choix : (entrez un chiffre)");
				String str = sc.nextLine();
				while( str == "1" || str == "2" || str == "3"){
					if(str == "1"){
						moment.consequenceChoix1();
					}
					else if(str == "2"){
						moment.consequenceChoix2();
					}
					else {
						moment.consequenceChoix3();
					}
					while(str != "1" || str != "2" || str != "3"){
						System.out.println("Mettez un chiffre entre 1 et 3");
						str = sc.nextLine();
					}
					sc.nextLine();
				}
				
			}
			//Vérifie la fin
			Joueur.BarreHorsLimites();
		
			
		}while(Fins.getFinactive() == -1);
		Fins.finDuJeu();
	}
	

}
