package verifSaisie;

public class EntierPositifNonVide {

	public static boolean verifie(String s){
		if(s.length()==0 || s.equals("")){
			return false;
		}else{
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)>'9'||s.charAt(i)<'0'){
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * 
	 * @param s
	 * @param min minimum inclu du chiffre en question
	 * @param max
	 * @return Vrai si inclu, faux sinon ou si non entier
	 */
	public static boolean entre(String s,int min,int max){
		if(verifie(s)){
			if(Integer.valueOf(s)<=max && Integer.valueOf(s)>=min){
				return true;
			}
		}
		return false;
	}
}
