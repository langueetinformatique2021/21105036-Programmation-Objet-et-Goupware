package Devoir02;
/**
 * @author SACI Thiziri
 */
public class Etudiant {
	//Déclaration des attributs 
	public String  Nom; 
	public String Prenom;
	public int DateNaissance;
	public int NumEtudiant;
	public String Specialite;
	public String Cycle ;
	public int MoyenneAnnuelle;
	public int AnneeUniversitaire;
	public String RowPromo;
	/**
	 * Déclaration de la classe
	 * @param: Prend les attributs déclarés comme paramètres
	 */
	public Etudiant(String Nom,String Prenom,int DateNaissance, int NumEtudiant, String Specialite, String Cycle, int MoyenneAnnuelle,int AnneeUniversitaire, String RowPromo) {
		this.Nom= Nom;
		this.Prenom= Prenom;
		this.DateNaissance= DateNaissance;
		this.NumEtudiant= NumEtudiant;
		this.Specialite= Specialite;
		this.Cycle=Cycle;
		this.MoyenneAnnuelle= MoyenneAnnuelle;
		this.AnneeUniversitaire=AnneeUniversitaire;
		this.RowPromo=RowPromo;
	}
	public String getNom() {
		return Nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public int getDateNaissance() {
		return DateNaissance;
	}
	public int getNumEtudiant() {
		return NumEtudiant;
	}
	public String getSpecialite() {
		return Specialite;
	}
	public String getCycle() {
		return Cycle;
	}
	public int getMoyenneAnnuelle() {
		return MoyenneAnnuelle;
	}
	public int AnneeUniversitaire() {
		return AnneeUniversitaire;
	}
	/**
	 *Creation d'une méthode: on crée une ligne de tableau 
	 *@param : les attributs de l'étudiant
	 *Celle-ci va etre une ligne du tableau de la promotion
	 */
	public void CreateRowPromo() {                    
		RowPromo= Nom+ Prenom+ DateNaissance+ NumEtudiant+ Specialite+ Cycle + AnneeUniversitaire+MoyenneAnnuelle;
	}
	/**
	 *Creation de la méthode d'affichage
	 */
	public void afficher(){
		System.out.println(RowPromo);                      
		System.out.println("Caractéristiques de l'étudiant"+"Nom et prénom :"+Nom+Prenom+"Date de naissance"+DateNaissance+"Numéro d'étudiant :"+NumEtudiant+"Spécialité et Cycle :"+Specialite+Cycle);
		}
}