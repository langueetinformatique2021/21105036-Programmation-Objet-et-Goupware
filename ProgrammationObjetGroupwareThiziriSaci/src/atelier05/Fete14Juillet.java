package atelier05;

/** calcul du nombre de jours avant le 14 juillet 2023
 * 
 * @author isha
 *
 */

public class Fete14Juillet {

	public static void main(String[] args) {
		Date today = new Date(20, 10, 2022);     
		Date fete14 = new Date(14, 7, 2023);

		int nJours = 0;
		while (today.CompareTo(fete14)==true) {     //on compare la date d'aujourd'hui à celle du 14 juillet
				today.Incrementer();                //trouver la date du lendemain 
				nJours++;                           //On ajoute 1 au nbr de jours 
		}      
		                                      
		System.out.println(nJours);
	}

}
