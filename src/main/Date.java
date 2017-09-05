package main;

public class Date {
	private String semaine;
	private String jour;
	private String heure;
	
	public Date(String semaine, String jour, String heure){
		this.semaine=semaine;
		this.jour=jour;
		this.heure=heure;
	}	
	
	public String getSemaine() {
		return semaine;
	}


	public String getJour() {
		return jour;
	}

	public String getHeure() {
		return heure;
	}


	public String toString(){
		return "semaine:"+this.semaine+"jour:"+this.jour+"heure:"+this.heure;
	}

}
