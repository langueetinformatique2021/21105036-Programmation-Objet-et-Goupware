package Devoir03;

/**
 * création de la classe Metal
 * création d'une nouvelle instance de la classe Metal
 * @param nomAlliage   nom du métal
 * @param Dureté_de_Mohs son degré de dureté selon l'échelle de Mohs
 */
public abstract class Metal {
	protected String nomAlliage;
	private int Dureté_de_Mohs= 0;

	public Metal(String nom, int dureté) {
		nomAlliage = nom;
		Dureté_de_Mohs = dureté;
	}

	public void afficherAttributs() {               //Méthode 1 : afficher les attributs du métal
		System.out.println("Le métal " + nomAlliage + " a un degré de dureté de " + Dureté_de_Mohs + " selon l'échelle de Mohs.");
	}
	public abstract void Brillance();
}