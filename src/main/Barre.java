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
			res+=(char)27+ "[33";
		}else if(this.nom==NomBarre.POPULARITE){
			res+=(char)27+ "[34";
		}else{
			res+=(char)27+ "[36";
		}
		*/
		int valaffiche=(int) valeur;
		if(valeur>100)valaffiche=100; 
		if(valeur<0)valaffiche=0;
		for(int i=0;i<100;i=i+5){
			if(valaffiche>i){
				res+='=';
			}else{
				res+=' ';
			}
		}
		/*
		for(int i=1;i<valaffiche/5;i++){
		res+="=";
		}
		for(int i=(valaffiche/5)+1;i<19;i++){
		res+=" ";	
		}
		*/
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
