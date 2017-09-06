package main;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Evenement> evenements = new ArrayList<Evenement>();

	public String afficherEvenement(List<Evenement> list) {
		evenements = list;
		String res = "";
		for (Evenement e: evenements) {
			if ( e.proba == 1) {
				if ( e.getUneDateEvenement().getJour() == 1 && e.getUneDateEvenement().getSemaine() == 1 ) {
					res = res + "Lundi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 2 && e.getUneDateEvenement().getSemaine() == 1 ) {
					res = res + "Mardi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 3 && e.getUneDateEvenement().getSemaine() == 1 ) {
					res = res + "Mercredi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 4 && e.getUneDateEvenement().getSemaine() == 1 ) {
					res = res + "Jeudi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 5 && e.getUneDateEvenement().getSemaine() == 1 ) {
					res = res + "Vendredi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 6 && e.getUneDateEvenement().getSemaine() == 1 ) {
					res = res + "Samedi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 7 && e.getUneDateEvenement().getSemaine() == 1 ) {
					res = res + "Dimanche : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 1 && e.getUneDateEvenement().getSemaine() == 2 ) {
					res = res + "Lundi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 2 && e.getUneDateEvenement().getSemaine() == 2 ) {
					res = res + "Mardi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 3 && e.getUneDateEvenement().getSemaine() == 2 ) {
					res = res + "Mercredi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 4 && e.getUneDateEvenement().getSemaine() == 2 ) {
					res = res + "Jeudi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 5 && e.getUneDateEvenement().getSemaine() == 2 ) {
					res = res + "Vendredi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 6 && e.getUneDateEvenement().getSemaine() == 2 ) {
					res = res + "Samedi : " + e.toString2();
				}
				else if ( e.getUneDateEvenement().getJour() == 7 && e.getUneDateEvenement().getSemaine() == 2 ) {
					res = res + "Lundi : " + e.toString2();
				}
			}
		}
		return res;
	}

}
