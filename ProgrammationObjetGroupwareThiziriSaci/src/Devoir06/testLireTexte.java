package Devoir06;
import java.io.IOException;

public class testLireTexte {
	
	public static void main(String[] args) throws FichierVide, IOException {

		LireTexte lt = new LireTexte("/21105036-Programmation-Objet-et-Goupware/textTest.txt");
		
		lt.Ouvrir();
		lt.readWord();
		//System.out.println();

	}
	
}