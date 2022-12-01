package atelier09;

import java.io.PrintWriter;
import java.io.File;
import util.Keyboard;
import java.io.IOException;
public class MonPremierFichierTexte {
	public static void main (String [] args) {
		String nom;
		try {
			File fichier= new File("nom.txt");
			PrintWriter pr = new PrintWriter(fichier);
			pr.print("Thiziri");
			pr.println("Sylvie");
			pr.println("Clément");
			System.out.println("Fin écriture");
		}
		catch (IOException e) {e.printStackTrace();
		}
	}
}
