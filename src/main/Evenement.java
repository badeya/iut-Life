package main;



public class Evenement {
	private String event;
	private String choix1, choix2, choix3;
	private double valeurPopChoix1, valeurPopChoix2, valeurPopChoix3;
	private double valeurEneChoix1, valeurEneChoix2, valeurEneChoix3;
	private double valeurResChoix1, valeurResChoix2, valeurResChoix3;
	private double proba = 1.0;
	private Date uneDateEvenement;
	private int nbChoix = 0;

	public double getProba() {
		return proba;
	}

	public Date getDateEvenement() {
		return uneDateEvenement;
	}

	// Evenement aléatoire à deux choix
	public Evenement(String nom, String choix1, String choix2, double valeurPopChoix1, double valeurPopChoix2,
			double valeurEneChoix1, double valeurEneChoix2, double valeurResChoix1, double valeurResChoix2,
			double proba, Date date) {
		event = nom;
		nbChoix = 2;
		this.choix1 = choix1;
		this.choix2 = choix2;
		this.valeurEneChoix1 = valeurEneChoix1;
		this.valeurEneChoix2 = valeurEneChoix2;
		this.valeurPopChoix1 = valeurPopChoix1;
		this.valeurPopChoix2 = valeurPopChoix2;
		this.valeurResChoix1 = valeurResChoix1;
		this.valeurResChoix2 = valeurResChoix2;
		this.uneDateEvenement = date;

		if (proba <= 1 && proba >= 0) {
			this.proba = proba;
		}
	}

	// Evenement non aléatoire à deux choix
	public Evenement(String nom, String choix1, String choix2, double valeurPopChoix1, double valeurPopChoix2,
			double valeurEneChoix1, double valeurEneChoix2, double valeurResChoix1, double valeurResChoix2, Date date) {
		event = nom;
		nbChoix = 2;
		this.choix1 = choix1;
		this.choix2 = choix2;
		this.valeurEneChoix1 = valeurEneChoix1;
		this.valeurEneChoix2 = valeurEneChoix2;
		this.valeurPopChoix1 = valeurPopChoix1;
		this.valeurPopChoix2 = valeurPopChoix2;
		this.valeurResChoix1 = valeurResChoix1;
		this.valeurResChoix2 = valeurResChoix2;
		this.uneDateEvenement = date;
		proba = 1;
	}

	// Evenement aléatoire à trois choix
	public Evenement(String nom, String choix1, String choix2, String choix3, double valeurPopChoix1,
			double valeurPopChoix2, double valeurPopChoix3, double valeurEneChoix1, double valeurEneChoix2,
			double valeurEneChoix3, double valeurResChoix1, double valeurResChoix2, double valeurResChoix3,
			double proba, Date uneDateEvenement) {
		this(nom, choix1, choix2, valeurPopChoix1, valeurPopChoix2, valeurEneChoix1, valeurEneChoix2, valeurResChoix1,
				valeurResChoix2, proba, uneDateEvenement);
		nbChoix = 3;
		this.choix3 = choix3;
		this.valeurEneChoix3 = valeurEneChoix3;
		this.valeurPopChoix3 = valeurPopChoix3;
		this.valeurResChoix3 = valeurResChoix3;
		this.uneDateEvenement = uneDateEvenement;
	}

	// evenement non aléatoire à trois choix
	public Evenement(String nom, String choix1, String choix2, String choix3, double valeurPopChoix1,
			double valeurPopChoix2, double valeurPopChoix3, double valeurEneChoix1, double valeurEneChoix2,
			double valeurEneChoix3, double valeurResChoix1, double valeurResChoix2, double valeurResChoix3,
			Date uneDateEvenement) {
		this(nom, choix1, choix2, valeurPopChoix1, valeurPopChoix2, valeurEneChoix1, valeurEneChoix2, valeurResChoix1,
				valeurResChoix2, uneDateEvenement);

		nbChoix = 3;

		this.choix3 = choix3;
		this.valeurEneChoix3 = valeurEneChoix3;
		this.valeurPopChoix3 = valeurPopChoix3;
		this.valeurResChoix3 = valeurResChoix3;
		proba = 1;

	}

	public int getNbChoix() {
		return nbChoix;
	}

	public Date getUneDateEvenement() {
		return uneDateEvenement;
	}

	public void consequenceChoix1() {
		System.out.println("Vous avez choisi " + this.choix1);
		Joueur.getBarreEnergie().setValeur(Joueur.getBarreEnergie().getValeur() + valeurEneChoix1);
		Joueur.getBarrePopularite().setValeur(Joueur.getBarrePopularite().getValeur() + valeurPopChoix1);
		Joueur.getBarreResultats().setValeur(Joueur.getBarreResultats().getValeur() + valeurResChoix1);

	}

	public void consequenceChoix2() {
		System.out.println("Vous avez choisi " + this.choix2);
		Joueur.getBarreEnergie().setValeur(Joueur.getBarreEnergie().getValeur() + valeurEneChoix2);
		Joueur.getBarrePopularite().setValeur(Joueur.getBarrePopularite().getValeur() + valeurPopChoix2);
		Joueur.getBarreResultats().setValeur(Joueur.getBarreResultats().getValeur() + valeurResChoix2);

	}

	public void consequenceChoix3() {
		System.out.println("Vous avez choisi " + this.choix3);
		Joueur.getBarreEnergie().setValeur(Joueur.getBarreEnergie().getValeur() + valeurEneChoix3);
		Joueur.getBarrePopularite().setValeur(Joueur.getBarrePopularite().getValeur() + valeurPopChoix3);
		Joueur.getBarreResultats().setValeur(Joueur.getBarreResultats().getValeur() + valeurResChoix3);

	}

	public String toString() {
		String resultat;
		if (nbChoix == 3) {
			resultat = this.event + "\n" + " Choix 1: " + this.choix1 + "\n" + " Choix 2: " + this.choix2 + "\n"
					+ " Choix 3: " + this.choix3 + "\n";

		} else {
			resultat = this.event + "\n" + " Choix 1: " + this.choix1 + "\n" + " Choix 2: " + this.choix2 + "\n";
		}
		return resultat;
	}

	public String toString2() {
		return event + " à " + this.getUneDateEvenement().getHeure() + "H";
	}

}