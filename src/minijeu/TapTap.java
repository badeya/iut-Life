package minijeu;

import java.util.Scanner;

public class TapTap {
	
	Scanner sc=new Scanner(System.in);
	
	public static int main(Scanner sc) {
		System.out.println(" +++++++++ MINIJEU ++++++++ ");
		
		double timefin=5000000000.0;
		
		int cpt=0;
		
		System.out.println("vous avez" + timefin + "pour appuyer 40 fois");
		System.out.println("appuyez quand vous etes pret");
		sc.nextLine();
		long depart=System.nanoTime();
		do{
			sc.nextLine();
			cpt++;
				
			
		}while(System.nanoTime()<depart+timefin);
		
		if(cpt>40){
			System.out.println("vous avez réussi à appuyer "+cpt);
		}else
			System.out.println("vous avez échoué, vous avez appuyer "+cpt);
		
		return cpt;
		


	}
}


