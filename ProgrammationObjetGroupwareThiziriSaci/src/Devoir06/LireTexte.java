package Devoir06;
import java.io.*;
import java.util.*;
public class LireTexte {
	/** Lecture des mots d'un fichier-texte
	* @author montacie
	*/
	private String NomFichier;
	private BufferedReader entrée;
	private String ligne;
	private StringTokenizer tok;
	/** Création d'une nouvelle instance de LireTexte
	* @param ft nom du fichier texte
	 * @throws FileNotFoundException 
	*/
	public LireTexte(String ft) throws FileNotFoundException {
		FileReader fr = new FileReader(NomFichier);      //nom du fichier
		BufferedReader entrée = new BufferedReader(fr);  //lecture du fichier 
	} 
	/** Ouverture d'un fichier texte,
	* Lecture de la première ligne,
	* Teste si le fichier est vide
	* @throws IOException Erreur à l'ouverture
	* @throws FichierVide Fichier vide
	*/
	protected void Ouvrir() throws IOException, FichierVide {
		ligne = entrée.readLine();                             
		if (ligne != null) {
			tok = new StringTokenizer(ligne);
			}
		else {
			throw new FichierVide(); 
			} 
		}
	/** Fermeture du fichier
	* @throws IOException Erreur à la fermeture
	*/
	protected void Fermer() throws IOException {
		entrée.close();
	}
	/** Lecture mot à mot du fichier
	* @return prochain mot
	* @throws IOException Erreur de lecture
	*/
	public String readWord () throws IOException {
	     if (tok.hasMoreTokens()) {
	         System.out.println(tok.nextToken());
	     }
	     else {
	    	 throw new IOException();
	     }
		return "Lecture";
	}
}