package Devoir03;

public class Charrue extends Bronze{
	public Charrue(String type) {
		super("Charrue");
	}
	private String nomProduit;              //on initialise la variable qui porte le nom du produit métalique
	public Charrue() { 
		super("Charrue");
	}

	public void afficherProduitMetal(String nomProduit) {
		this.nomProduit = "Charrue";
		System.out.println(this.nomProduit+ " est produite avec du métal");
	}

	public void AfficherDomaine() {
		String Domaine= "Agriculture";
			System.out.println(this.nomProduit+" est utilisé en " + Domaine);
	}

}