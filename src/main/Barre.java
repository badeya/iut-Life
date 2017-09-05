package main;

public class Barre {
	private double valeur;
	private final NomBarre nom;
	
	public Barre(NomBarre nom) {
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

	public double getValeur() {
		return valeur;
	}

	public String getNom() {
		return nom;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	
	
	
}
