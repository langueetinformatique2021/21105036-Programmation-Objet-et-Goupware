package Devoir05;

public class lancerDès extends Aleat {	
	private int n;
	private String nom;
	public lancerDès(String nom, int n) {
		super(6);
		this.nom = nom;
		this.n= n;
		}
	public void afficherNomLanceur() {
		System.out.println("Nom du lanceur" + nom);
	}
	class UtilisateurE421 extends Exception {}
	public TroisDes lancer() throws UtilisateurE421{
		try {
			TroisDes tire = new TroisDes(super.get(), super.get(), super.get());
			return tire;
		}
		catch (UtilisateurE421 e){
			System.out.println(e.getMessage());
			
		}
		}
}
