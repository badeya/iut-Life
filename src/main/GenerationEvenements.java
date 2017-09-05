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
	Evenement ev5 = new Evenement("Deuxième Amphi de l'annee","J'y vais !","J'y vais pas","J'arrive en retard",0,15,30,-10,10,0,20,-20,0,new Date(1,3,13));
	Evenement ev6 = new Evenement("Premier DS de l'annee","Je révise à fond","Je révise moyen","Le talent !",-5,5,15,-30,-15,15,60,35,-50,new Date(1,4,14));
	Evenement ev7 = new Evenement("Pause midi ! Kiosque ou RU ?","Kio1sque","RU",0,0,-5,-10,-15,20,new Date(1,5,12));
	Evenement ev8 = new Evenement("Troisième amphi ! Interro Surprise !","Ouf j'y étais","Merde, j'ai seche",0,10,0,10,20,-40,new Date(1,6,9));
	Evenement ev9 = new Evenement("Pause Midi ! Sandwich oublie","Je taxe un pote","Tant pis",0,0,5,-5,0,-5,new Date(1,6,12));
	Evenement ev10 = new Evenement("Soiree de ouf mec","Je me défonce comme jaja","Soyons raisonnable",0,70,-100,-30,0,-10,new Date(1,7,18));

	Evenement evAlea1 = new Evenement("TP d'Algo mon PC crache","Je vais voir le technicien","Tant pis pas de TP","Je le ferais plus tard",0,15,10,-20,15,-10,0,-10,-5,0.1,new Date(2,1,13));
	Evenement evAlea2 = new Evenement("Panne electrique dans l'IUT","J'attends ","Je rentre chez moi","Je scanne les cours de mon copain",-10,35,10,-35,20,-14,25,-20,-5,0.5,new Date(1,5,14));
	Evenement evAlea3 = new Evenement("Le prof a 1h00 de retard","J'attends ","je rentre chez moi","Je scanne les cours de mon copain",-10,35,10,-35,20,-14,25,-20,-5,0.3,new Date(2,2,13));
	Evenement evAlea4 = new Evenement("Le RU est fermé","Je vais à Auchan m'acheter un sandwich et j'arrive en retard en cours ","Je ne mange pas","Je mange un reste de biscuit retrouvé dans mon sac",20,-10,-30,-30,-15,-5,0,5,5,0.2,new Date(1,3,12));
	Evenement evAlea5 = new Evenement("Pain au chocolat ou chocolatine ?","Pain chocolat","Chocolatine ","Je prefere les croissants",20,-20,25,0,0,0,0,0,0,0.6,new Date(1,4,10));
	Evenement evAlea6 = new Evenement("Panne de reveil","Je cours pour être à l'heure","je reste dans mon lit, osef de PPP",20,30,-20,20,20,-30,0.2,new Date(1,2,8));
	Evenement evAlea7 = new Evenement("Mon pote m'appelle pour boire un verre","Ca finit à 5h00 du mat et me fais arreter par les flics","J'y vais mais je bois de la grenadine ",40,10,-40,0,-25,-10,0.2,new Date(1,4,20));
	Evenement evAlea8 = new Evenement("Tempête de neige","Je viens en traineau","Le metro doit être en panne je reste chez moi ",20,10,-15,0,20,-20,0.2,new Date(1,2,8));
	Evenement evAlea9 = new Evenement("J'ai cassé ma clef dans ma serrure","Je reste chez moi","Je previens l'iut ",10,-10,20,10,-10,-10,0.2,new Date(1,5,8));
	Evenement evAlea10 = new Evenement("Mon pote me propose d'aller au cinema","Je dois reviser mon systeme","Regarder le film ",-20,20,-10,20,30,-20,0.2,new Date(1,5,8));
	Evenement evAlea11 = new Evenement("J'ai fait trop de bruit en amphi, Mr Beaufils me vire du cours","Je retourne m'excuser","Je rentre chez moi","Je pars voir des potes dans un bar",-15,15,25,-10,-15,-15,10,-10,-15,0.8,new Date(1,5,16));
	Evenement evAlea12 = new Evenement("Ce weekend c'était le wei, j'ai la gueule de bois mais j'ai DS de BDD", "Je rebois un coup : on combat le mal par le mal", "Je révise et je vais au ds",30,-20,-10,-15,-20,20,0.6,new Date(2,1,8));
	Evenement evAlea13 = new Evenement("Mr Place te dit que tu peux prendre une pause, mais Mr Beaufils te regarde, que fais tu?","Trop risqué je reste en TP","Je sors quand même",-10,15,-20,15,15,-10,0.3,new Date(2,4,10));
	Evenement evAlea14 = new Evenement("Tout le monde parle en amphi mais Mr Carle t'as remarqué","Je soutiens le regard","Je baisse les yeux",50,-10,15,20,-10,10,0.5,new Date(2,4,15));
	Evenement evAlea15 = new Evenement("Le BDE organise un petit déjeuner","Tu squattes avec le bde et tu ne vas pas en amphi","Tu prends un café et tu vas en amphi tout seul",15,-20,10,-15,-15,20,0.7,new Date(2,5,9));
	Evenement evAlea16 = new Evenement("Tu dois écrire un programme en langage C","Tu fais un énorme programme avec pleins de pointeurs","C'est quoi un pointeur ? ","Tu fais un programme bidon",-5,10,0,-20,0,-5,15,-20,5,0.9, new Date(1,5,14));
	
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
	evenements.add(evAlea1);
	evenements.add(evAlea2);
	evenements.add(evAlea3);
	evenements.add(evAlea4);
	evenements.add(evAlea5);
	evenements.add(evAlea6);
	evenements.add(evAlea7);
	evenements.add(evAlea8);
	evenements.add(evAlea9);
	evenements.add(evAlea10);
	evenements.add(evAlea11);
	evenements.add(evAlea12);
	evenements.add(evAlea13);
	evenements.add(evAlea14);
	evenements.add(evAlea15);
	evenements.add(evAlea16);
	
	
	Evenement ev11 = new Evenement("Amphi analyse","J'y vais !","J'y vais pas",0,10,-10,10,10,-10,new Date(2,1,8));
	Evenement ev12 = new Evenement("Interro surprise","J'avais relu","Oups!",0,0,0,0,10,-10,new Date(2,2,8));
	Evenement ev13 = new Evenement("Pause Midi, Lan en salle tp","Je me depeche de manger pour aller jouer a Urbanterror!","Je me depeche de manger pour bosser",10,-10,0,0,-10,10,new Date(2,2,12));
	Evenement ev14 = new Evenement("Grasse mat'?","Oui","Non",0,0,10,-10,-10,10,new Date(2,3,6));
	Evenement ev15 = new Evenement("DS d'algo","J'ai pas révisé je triche","J'ai pas révisé j'y vais au talent",0,0,0,0,-100,-25,new Date(2,3,13));
	Evenement ev16 = new Evenement("Pause Midi","Sandwich ?","Box de pâtes ?",0,0,10,20,0,-5,new Date(2,4,12));
	Evenement ev17 = new Evenement("Soiréé étudiante","Je sors","Je sors pas",20,-20,-20,20,-15,20,new Date(2,4,20));
	Evenement ev18 = new Evenement("Amphi sysème avec Mr Beaufils","Je discute avec mon voisin","J'ecoute sagement",0,0,0,0,-100,30,new Date(2,5,10));
	Evenement ev19 = new Evenement("Révisions","Je revise seul","Je revise avec un pote","Je revise pas",0,0,0,-10,-5,10,20,-10,-10,new Date(2,6,10));
	Evenement ev20 = new Evenement("Mon pote me propose une aprem fifa","J'y vais","J'y vais pas",-10,10,0,0,0,-10,new Date(2,7,14));

	
	evenements.add(ev11);
	evenements.add(ev12);
	evenements.add(ev13);
	evenements.add(ev14);
	evenements.add(ev15);
	evenements.add(ev16);
	evenements.add(ev17);
	evenements.add(ev18);
	evenements.add(ev19);
	evenements.add(ev20);
	}

	public List<Evenement> getEvenements() {
		return evenements;
	}
	
}
