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
		
		String res="\t [";
		//Couleur
		/*
		if(this.nom==NomBarre.ENERGIE){
			res+="\m";
		}else if(this.nom==NomBarre.POPULARITE){
			res+="\33[34m";
		}else{
			res+="\33[36m";
		}
		*/
		int valaffiche=(int) valeur;
		if(valeur>100)valaffiche=100;
		for(int i=0;i<valaffiche/5;i++){
		res+="=";
		}
		for(int i=(valaffiche/5);i<20;i++){
		res+=" ";	
		}
		res+="]";
		res+="\t \t \t"+valeur+" %";
		
		
		res+=(char)0;
		
		return res;
		
		
		
	}

	public double getValeur() {
		return valeur;
	}

	public String getNom() {
		if(this.nom==NomBarre.ENERGIE){
			return "Energie";
			
		}else if(this.nom==NomBarre.POPULARITE){
			return "Popularité";
		}else{
			return "Resultat";
		}
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	
	
	
}
