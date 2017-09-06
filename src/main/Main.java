
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import minijeu.TapAXSecondes;
import minijeu.TapTap;
import verifSaisie.EntierPositifNonVide;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//TapTap.main(sc);
		Random r = new Random();
		boolean premierTour=true;
		int jourActuel;
		int semaineActuelle;
		int heureActuelle;
		int nbrHeures;
		double scoreEnergie=0;
		double scorePopularite=0;
		double scoreResultats=0;
		boolean relancerJeux=true;
		

		GenerationEvenements ge=new GenerationEvenements();

		List<Evenement> e1 = ge.getEvenements();
		
		
		
		while(relancerJeux){
			 jourActuel=1;
			 semaineActuelle=1;
			 heureActuelle=1;
			 nbrHeures=0;
			
			Joueur.setBarreEnergie(new Barre(NomBarre.ENERGIE));
			Joueur.setBarrePopularite(new Barre(NomBarre.POPULARITE));
			Joueur.setBarreResultats(new Barre(NomBarre.RESULTATS));
			Fins.setFinactive(-1);

		System.out.println("IUT - SIMULATOR 2017 \n");
		
		System.out.println("Voici ton Agenda, mémorise le pour prévoir ce qui est sûr de se passer:");
		System.out.println(Agenda.afficherEvenement(e1));

		do{
			//Mise A jour de date / heure
			heureActuelle++;
			if(heureActuelle>23){
				jourActuel++;
				heureActuelle=0;
			}
			if(jourActuel==8){
				jourActuel=1;
				semaineActuelle++;
			}
			//System.out.println(new Date(semaineActuelle,jourActuel,heureActuelle).toString());
			if(!premierTour){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
			}
			Evenement moment=null;

			for(Evenement e:e1){
				if(e.getDateEvenement().getHeure()==heureActuelle && e.getDateEvenement().getJour()==jourActuel && e.getDateEvenement().getSemaine()==semaineActuelle){

					moment=e;

				}


			}
			if(moment!=null){
				premierTour=false;
				Double rdm=r.nextDouble();
				// Debug : System.out.println("L'evenement "+moment.toString()+" proba:"+moment.proba+" Random: "+rdm);
				if(moment.getProba() > rdm){
					System.out.println(new Date(semaineActuelle,jourActuel,heureActuelle).toString());
					System.out.println(moment.toString());
					System.out.println("Energie:"+Joueur.getBarreEnergie());
					System.out.println("Popularité:"+Joueur.getBarrePopularite());
					System.out.println("Résultats:"+Joueur.getBarreResultats());


					String str="";
					do{
						System.out.println("Faites votre choix : (entrez un chiffre)");
						str = sc.nextLine();
					}while(!EntierPositifNonVide.entre(str, 1, moment.getNbChoix()));
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
			}else{
				//MINIJEU SI PAS D'EVENEMENT
				Double val=r.nextDouble();
				if(val<0.015){
					System.out.println();
					System.out.println("Energie:"+Joueur.getBarreEnergie());
					System.out.println("Popularité:"+Joueur.getBarrePopularite());
					System.out.println("Résultats:"+Joueur.getBarreResultats());
					System.out.println();
					if(TapAXSecondes.main(sc)==1){
						Joueur.setBarreEnergie(new Barre(NomBarre.ENERGIE));
					}else{
						Joueur.getBarreEnergie().setValeur(Joueur.getBarreEnergie().getValeur()-15);
					}
				}else if(val<0.03){
					System.out.println();
					System.out.println("Energie:"+Joueur.getBarreEnergie());
					System.out.println("Popularité:"+Joueur.getBarrePopularite());
					System.out.println("Résultats:"+Joueur.getBarreResultats());
					System.out.println();
					if(TapTap.main(sc)>40){
						Joueur.setBarrePopularite(new Barre(NomBarre.POPULARITE));
					}else{
						Joueur.getBarrePopularite().setValeur(Joueur.getBarrePopularite().getValeur()-15);
					}

				}
			}
			//Vérifie la fin
			Joueur.BarreHorsLimites();
			nbrHeures++;
			//if((Joueur.getBarreEnergie().getValeur()+Joueur.getBarrePopularite().getValeur()+Joueur.getBarreResultats().getValeur())>150) score=((Joueur.getBarreEnergie().getValeur())-50+(Joueur.getBarrePopularite().getValeur())-50+(Joueur.getBarreResultats().getValeur())-50);
			if((Joueur.getBarreEnergie().getValeur()>50)){
				scoreEnergie=(Joueur.getBarreEnergie().getValeur())-50;
			}
			else if((Joueur.getBarreEnergie().getValeur()<=50)){
				scoreEnergie=50-(Joueur.getBarreEnergie().getValeur());
			}
			if((Joueur.getBarrePopularite().getValeur()>50)){
				scorePopularite=(Joueur.getBarrePopularite().getValeur())-50;
			}
			else if((Joueur.getBarrePopularite().getValeur()<=50)){
				scorePopularite=50-(Joueur.getBarrePopularite().getValeur());
			}
			if((Joueur.getBarreResultats().getValeur()>50)){
				scoreResultats=(Joueur.getBarreResultats().getValeur())-50;
			}
			else if((Joueur.getBarreResultats().getValeur()<=50)){
				scoreResultats=50-(Joueur.getBarreResultats().getValeur());
			}
			//else if((Joueur.getBarreEnergie().getValeur()+Joueur.getBarrePopularite().getValeur()+Joueur.getBarreResultats().getValeur())<150) score=(50-(Joueur.getBarreEnergie().getValeur())+50-(Joueur.getBarrePopularite().getValeur())+50-(Joueur.getBarreResultats().getValeur()));
			if (jourActuel == 7 && semaineActuelle == 2 && heureActuelle == 23) {
				Fins.setFinactive(1);

			}
			
		}while(Fins.getFinactive() == -1);
		double score= scoreEnergie+scorePopularite+scoreResultats;
		System.out.println("Energie:"+Joueur.getBarreEnergie());
		System.out.println("Popularité:"+Joueur.getBarrePopularite());
		System.out.println("Résultats:"+Joueur.getBarreResultats()+ "\n");
		System.out.println("\n" + Fins.finDuJeu() + "\n");
		System.out.println("Tu as survecu " + nbrHeures + " heures avec un score de " + score);
		System.out.println("Tu as obtenu un score de " + scoreEnergie + " en Energie ");
		System.out.println("Tu as obtenu un score de " + scorePopularite + " en Popularite ");
		System.out.println("Tu as obtenu un score de " + scoreResultats + " en Resultats ");
		System.out.println("Tu veux rejouer à notre super jeux ? ");
		System.out.println(" taper 1)OUI ou 2)NON");
		Scanner lectureClavier = new Scanner(System.in);
		char rejouer;
		rejouer=lectureClavier.nextLine().charAt(0);
		if(rejouer=='1'){
			relancerJeux=true;
			
		}
		else{
			System.out.println("Bye !!!");
			relancerJeux=false;
		}
	}
	}


}
