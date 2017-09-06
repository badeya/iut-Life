package main;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private static List<Evenement> evenements = new ArrayList<Evenement>();

	public static String afficherEvenement(List<Evenement> list) {
		evenements = list;
		String res = "";

		for(int i=1;i<8;i++){
			if(i==1)res+="Lundi : ";
			if(i==2)res+="Mardi : ";
			if(i==3)res+="Mercredi : ";
			if(i==4)res+="Jeudi : ";
			if(i==5)res+="Vendredi : ";
			if(i==6)res+="Samedi : ";
			if(i==7)res+="Dimanche : ";
			for (Evenement e: evenements) {
				if ( e.proba == 1) {
					if(e.getUneDateEvenement().getJour()==i){
						if ( e.getUneDateEvenement().getSemaine() == 1 ) {
							res+=e.toString2() + "\n";
						}
						else if (  e.getUneDateEvenement().getSemaine() == 1 ) {
							res+=e.toString2()+ "\n";
						}
						else if ( e.getUneDateEvenement().getSemaine() == 1 ) {
							res += e.toString2()+ "\n";
						}
						else if (e.getUneDateEvenement().getSemaine() == 1 ) {
							res += e.toString2()+ "\n";
						}
						else if ( e.getUneDateEvenement().getSemaine() == 1 ) {
							res += e.toString2()+ "\n";
						}
						else if (e.getUneDateEvenement().getSemaine() == 1 ) {
							res += e.toString2()+ "\n";
						}
						else if (e.getUneDateEvenement().getSemaine() == 1 ) {
							res += e.toString2()+ "\n";
						}
						else if (e.getUneDateEvenement().getSemaine() == 2 ) {
							res += e.toString2()+ "\n";
						}
						else if (e.getUneDateEvenement().getSemaine() == 2 ) {
							res += e.toString2()+ "\n";
						}
						else if (e.getUneDateEvenement().getSemaine() == 2 ) {
							res += e.toString2()+ "\n";
						}
						else if (e.getUneDateEvenement().getSemaine() == 2 ) {
							res += e.toString2()+ "\n";
						}
						else if (e.getUneDateEvenement().getSemaine() == 2 ) {
							res += e.toString2()+ "\n";
						}
						else if (e.getUneDateEvenement().getSemaine() == 2 ) {
							res += e.toString2()+ "\n";
						}
						else if ( e.getUneDateEvenement().getSemaine() == 2 ) {
							res += e.toString2()+ "\n";
						}
					}
				}
			}
		}
		return res;
	}

}
