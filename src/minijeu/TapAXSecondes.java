package minijeu;

import java.util.Random;
import java.util.Scanner;

public class TapAXSecondes {

	public static int main(Scanner sc) {
		System.out.println();
		Random r=new Random();
		long time=((long)r.nextInt(3)+2)*1000000000;
		System.out.println("Vous êtes en DS et vous devez rendre votre copie dans "+time/1000000000+" secondes");
		System.out.println("Il vous faut taper sur entrée 2 fois d'affilée à "+time/1000000000+" secondes d'intervalle!");
		System.out.println("Si tu réussi, Tu réinitialise ta barre d'energie!");
		System.out.println("Appuyez dès que vous êtes pret!");
		sc.nextLine();
		long depart=System.nanoTime();
		sc.nextLine();
		long fin=System.nanoTime();
		long diff=fin-depart;
		if(diff<0){
			diff=diff*-1;
		}
		
		if(diff>time+200000000){
			System.out.println("Tu as rendu ta copie en retard, temps:"+diff/1000000000.0);
			return 0;
		}else if(diff<time-200000000){
			System.out.println("Tu as rendu ta copie en retard, temps:"+diff/1000000000.0);
			return 0;
		}
		System.out.println("Bravo tu l'as rendu à l'heure! Temps:"+diff/1000000000.0);
		return 1;

	}
	

}
