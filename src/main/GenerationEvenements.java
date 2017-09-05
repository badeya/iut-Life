package main;

import java.util.ArrayList;
import java.util.List;

public class GenerationEvenements {
	
	private List<Evenement> evenements = new ArrayList<Evenement>();
	
	public GenerationEvenements() {
		
	Evenement ev1 = new Evenement("Premier Amphi de l'annee","J'y vais !","J'y vais pas","J'arrive en retard",0,15,30,-10,10,0,20,-20,0,new Date(1,1,13));
	Evenement ev2 = new Evenement("Soiree de reprise !","J'y vais !","J'y vais pas",30,-25,-15,15,-15,0,new Date(1,1,20));
	Evenement ev3 = new Evenement("Pause Midi","Sandwich ?","Box de pâtes ?",0,0,10,20,0,-5,new Date(1,2,12));
	Evenement ev4 = new Evenement("Sport de la semaine","J'y vais","J'y vais pas",5,0,-30,25,10,15,new Date(1,2,17));
	Evenement ev5 = new Evenement("Deuxième Amphi de l'annee","J'y vais !","J'y vais pas","J'arrive en retard",0,15,30,-10,10,0,20,-20,0,new Date(1,1,13));
	Evenement ev6 = new Evenement("Premier DS de l'annee","Je révise à fond","Je révise moyen","Le talent !",-5,5,15,-30,-15,15,60,35,-50,new Date(1,4,14));
	Evenement ev7 = new Evenement("Pause midi ! Kiosque ou RU ?","Kiosque","RU",0,0,-5,-10,-15,20,new Date(1,5,12));
	Evenement ev8 = new Evenement("Troisième amphi ! Interro Surprise !","Ouf j'y étais","Merde, j'ai seche",0,10,0,10,20,-40,new Date(1,6,9));
	Evenement ev9 = new Evenement("Pause Midi ! Sandwich oublie","Je taxe un pote","Tant pis",0,0,5,-5,0,-5,new Date(1,6,12));
	Evenement ev10 = new Evenement("Soiree de ouf mec","Je me défonce comme jaja","Soyons raisonnable",0,70,-100,-30,0,-10,new Date(1,7,18));
	
	evenements.add(ev1);
	evenements.add(ev2);
	evenements.add(ev3);
	evenements.add(ev4);
	evenements.add(ev5);
	evenements.add(ev6);
	evenements.add(ev7);
	evenements.add(ev8);
	evenements.add(ev9);
	evenements.add(ev10);
	
	}
	
}
