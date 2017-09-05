package minijeu;

import java.util.Random;
import java.util.Scanner;

public class TapAXSecondes {

	public static int main(String[] args) {
		System.out.println(" +++++++++ MINIJEU ++++++++ ");
		Scanner sc=new Scanner(System.in);
		System.out.println();
		Random r=new Random();
		int time=r.nextInt(3)+2;
		System.out.println("Il vous faut taper sur entrée 2 fois d'affilée à "+time+" secondes d'intervalle!");
		System.out.println("Appuyez dès que vous êtes pret!");
		sc.nextLine();
		long depart=System.nanoTime();
		sc.nextLine();
		long fin=System.nanoTime();
		long diff=fin-depart;
		sc.close();
		if(diff>1000000000){
			System.out.println("Echec, différence de:"+diff/1000000000.0);
			return 0;
		}
		System.out.println("Réussite! Différence de:"+diff/1000000000.0);
		return 1;

	}
	

}
