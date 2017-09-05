package main;

import java.util.Random;

public class Evenement {
	Random r = new Random();
	String event; 
	String choix1,choix2,choix3;
	double valeurPopChoix1, valeurPopChoix2, valeurPopChoix3; 
	double valeurEneChoix1, valeurEneChoix2, valeurEneChoix3;
	double valeurResChoix1, valeurResChoix2, valeurResChoix3;
	int proba; 
	
	public Evenement(String nom, String choix1, String choix2, String choix3, 	double valeurPopChoix1, double valeurPopChoix2, double valeurPopChoix3,double valeurEneChoix1, double valeurEneChoix2, double valeurEneChoix3,double valeurResChoix1, double valeurResChoix2, double valeurResChoix3, int proba){
		event=nom;
		this.choix1=choix1;
		this.choix2=choix2;
		this.choix3=choix3;
		this.valeurEneChoix1=valeurEneChoix1;
		this.valeurEneChoix2=valeurEneChoix2;
		this.valeurEneChoix3=valeurEneChoix3;
		this.valeurPopChoix1=valeurPopChoix1;
		this.valeurPopChoix2=valeurPopChoix2;
		this.valeurPopChoix3=valeurPopChoix3;
		this.valeurResChoix1=valeurResChoix1;
		this.valeurResChoix2=valeurResChoix2;
		this.valeurResChoix3=valeurResChoix3;
		
		if(proba <=1 && proba >= 0)
		this.proba = proba;
	}
	
	public Evenement(String nom, String choix1, String choix2, String choix3, 	double valeurPopChoix1, double valeurPopChoix2, double valeurPopChoix3,double valeurEneChoix1, double valeurEneChoix2, double valeurEneChoix3,double valeurResChoix1, double valeurResChoix2, double valeurResChoix3){
		event=nom;
		this.choix1=choix1;
		this.choix2=choix2;
		this.choix3=choix3;
		this.valeurEneChoix1=valeurEneChoix1;
		this.valeurEneChoix2=valeurEneChoix2;
		this.valeurEneChoix3=valeurEneChoix3;
		this.valeurPopChoix1=valeurPopChoix1;
		this.valeurPopChoix2=valeurPopChoix2;
		this.valeurPopChoix3=valeurPopChoix3;
		this.valeurResChoix1=valeurResChoix1;
		this.valeurResChoix2=valeurResChoix2;
		this.valeurResChoix3=valeurResChoix3;
	}
	
	public void consequenceChoix1(){
		System.out.println("Vous avez choisi "+ this.choix1);
		Main.getBarreEnergie().setValeur(Main.getBarreEnergie().getValeur()+valeurEneChoix1);
		Main.getBarrePopularite().setValeur(Main.getBarrePopularite().getValeur()+valeurPopChoix1);
		Main.getBarreResultats().setValeur(Main.getBarreResultats().getValeur()+valeurResChoix1);
		
		
	}
	
	public void consequenceChoix2(){
		System.out.println("Vous avez choisi "+ this.choix2);
		Main.getBarreEnergie().setValeur(Main.getBarreEnergie().getValeur()+valeurEneChoix2);
		Main.getBarrePopularite().setValeur(Main.getBarrePopularite().getValeur()+valeurPopChoix2);
		Main.getBarreResultats().setValeur(Main.getBarreResultats().getValeur()+valeurResChoix2);
		
		
	}
	
	public void consequenceChoix3(){
		System.out.println("Vous avez choisi "+ this.choix3);
		Main.getBarreEnergie().setValeur(Main.getBarreEnergie().getValeur()+valeurEneChoix3);
		Main.getBarrePopularite().setValeur(Main.getBarrePopularite().getValeur()+valeurPopChoix3);
		Main.getBarreResultats().setValeur(Main.getBarreResultats().getValeur()+valeurResChoix3);
		
		
	}
	
}