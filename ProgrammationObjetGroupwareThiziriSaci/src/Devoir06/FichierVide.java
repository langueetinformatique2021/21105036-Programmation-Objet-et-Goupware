package Devoir06;

public class FichierVide extends Exception {

	//Création de la classe FichierVide dérivée de la super-classe Eception
	 
	private static final long serialVersionUID = 1L;

	public FichierVide() {
		super("Fichier vide, fermeture !");
	}
}
