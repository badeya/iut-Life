package main;

import java.util.Random;

public class Evenement {
	Random r = new Random();
	String event; 
	String choix1,choix2,choix3;
	int proba; 
	
	public Evenement(String nom, String choix1, String choix2, String choix3, int proba){
		event=nom;
		this.choix1=choix1;
		this.choix2=choix2;
		this.choix3=choix3;
		this.proba = r.nextInt(2);
	}
	
	public Evenement(String nom, String choix1, String choix2, String choix3){
		event=nom;
		this.choix1=choix1;
		this.choix2=choix2;
		this.choix3=choix3;
	}
	
	
}