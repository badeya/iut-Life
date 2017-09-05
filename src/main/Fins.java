package main;

public class Fins {
	
	private static double finactive = -1;

	public static double getFinactive() {
		return finactive;
	}

	public static void setFinactive(double finactive) {
		Fins.finactive = finactive;
	}

	public static String finDuJeu() {
		if (finactive == 1) {
			return "Bravo ! Tu as survécu à deux semaines, bonne chance pour les 34 restantes !";
		}
		else if (finactive == 2) {
			return "Tu es épuisé et tu fais un malaise en plein DS. Ton père te récupère à l'hosto. L'année est finie pour toi, RIP";
		}
		else if (finactive == 3) {
			return "Tu es trop énergique, on te diagnostique une hyperactivité, on t'envoie en centre spécialisé, RIP";
		}
		else if (finactive == 4) {
			return "Tu tombes dans l'oubli, RIP";
		}
		else if (finactive == 5) {
			return "Tout le monde te jalouse, tu te fais poignarder tard le soir sur le parking de l'IUT, RIP";
		}
		else if (finactive == 6) {
			return "T'as réussi à foirer ton année en deux semaines, nouveau record, RIP";
		}
		else {
			return "Tu es beaucoup trop chaud, Mr Secq t'envoie en école d'ingé, RIP";
		}
	}
}

