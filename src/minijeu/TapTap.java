package minijeu;

import java.util.Scanner;

public class TapTap {
	
	Scanner sc=new Scanner(System.in);
	
	public static int main(Scanner sc) {
		System.out.println(" +++++++++ MINIJEU ++++++++ ");
		
		long fin=5000000000;
		
		int cpt=0;
		
		System.out.println("vous avez" + fin + " secondes pour appuyer le plus de fois sur la touche entree");
		System.out.println("appuyez quand vous etes pret");
		
		long depart=System.nanoTime();
		do{
			sc.nextLine();
			cpt++;
				
			
		}while(System.nanoTime()<depart+fin);
		
		
		return cpt;
		


	}
}


