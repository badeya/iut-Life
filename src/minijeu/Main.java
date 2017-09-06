package minijeu;

import java.util.Random;
import java.util.Scanner;

import main.Barre;
import main.Joueur;
import main.NomBarre;

public class Main {
	public void run(Scanner sc){
		Random r=new Random();
		Double val=r.nextDouble();
		if(val<0.015){
			Joueur.affichageBarres();
			System.out.println();
			if(TapAXSecondes.main(sc)==1){
				Joueur.setBarreEnergie(new Barre(NomBarre.ENERGIE));
			}else{
				Joueur.getBarreEnergie().setValeur(Joueur.getBarreEnergie().getValeur()-15);
			}
		}else if(val<0.03){
			Joueur.affichageBarres();
			System.out.println();
			if(TapTap.main(sc)>40){
				Joueur.setBarrePopularite(new Barre(NomBarre.POPULARITE));
			}else{
				Joueur.getBarrePopularite().setValeur(Joueur.getBarrePopularite().getValeur()-15);
			}

		}
	}
}
