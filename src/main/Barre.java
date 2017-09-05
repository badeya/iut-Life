package main;

public class Barre {
	double valeur;
	String nom;
	
	public Barre(String nom) {
		super();
		this.nom = nom;
		valeur=50;
	}
	
	public String toString(){
		
		String res="[";
		for(int i=0;i<valeur/5;i++){
		res+="=";
		}
		res+="\t \t \t"+valeur+" %";
		
		
		return res;
		
		
		
	}
	
	
	
}
