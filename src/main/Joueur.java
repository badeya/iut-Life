package main;

public class Joueur {
	private static Barre barreEnergie=new Barre(NomBarre.ENERGIE);
	private static Barre barrePopularite=new Barre(NomBarre.POPULARITE);
	private static Barre barreResultats=new Barre(NomBarre.RESULTATS);
	public static Barre getBarreEnergie() {
		return barreEnergie;
	}
	public static Barre getBarrePopularite() {
		return barrePopularite;
	}
	public static Barre getBarreResultats() {
		return barreResultats;
	}
	public static void setBarreEnergie(Barre barreEnergie1) {
		barreEnergie = barreEnergie1;
	}
	public static void setBarrePopularite(Barre barrePopularite1) {
		barrePopularite = barrePopularite1;
	}
	public static void setBarreResultats(Barre barreResultats1) {
		barreResultats = barreResultats1;
	}
	public static void BarreHorsLimites(){
		if(getBarreEnergie().getValeur()<=0) Fins.setFinactive(2);
		if(getBarreEnergie().getValeur()>=100) Fins.setFinactive(3);
		if(getBarrePopularite().getValeur()<=0) Fins.setFinactive(4);
		if(getBarrePopularite().getValeur()>=100) Fins.setFinactive(5);
		if(getBarreResultats().getValeur()<=0) Fins.setFinactive(6);
		if(getBarreResultats().getValeur()>=100) Fins.setFinactive(7);
	}
}
