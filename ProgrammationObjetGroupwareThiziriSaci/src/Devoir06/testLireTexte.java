package Devoir06;
import java.io.IOException;

public class testLireTexte {
	
	public static void main(String[] args) throws FichierVide, IOException {
		LireTexte text = new LireTexte("textTest.txt");
		text.Ouvrir();
		text.readWord();
		text.Fermer();
	}
}