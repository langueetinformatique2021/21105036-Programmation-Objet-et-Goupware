package Devoir02;

import Devoir02.Etudiant;

public class PromotionEtudiants {
	/**
	 * Une promotion d'étudiants a comme attributs en commun : l'année universitaire, la spécialité et le cycle
	 * Création des attributs
	 */
	private int AnneeUniversitaire;
	private String Specialite;
	private String Cycle;
	/**
	 * Déclaration de la classe
	 */
	public PromotionEtudiants( int AnneeUniversitaire, String Specialite, String Cycle){
		this.AnneeUniversitaire= AnneeUniversitaire;
		this.Specialite= Specialite;
		this.Cycle= Cycle;
	} 
	public int getAnneeUniversitaire() {
		return AnneeUniversitaire;
	}
	public String getCycle() {
		return Cycle;
	}
	public String getSpecialite() {
		return Specialite;
	}
	/**
	 * On va comparer les variables : Année Universitaire, cycle et spécialité entre les étudiants
	 * Si les attributs de l'étudiant suivant correspondent aux attributs du premier étudiant ajouté, 
	 * on l'ajoute à la liste promotion et ainsi de suite
	 */
	public void CreerPromotion(AnneeUniversitaire,Cycle, Specialite, AnneeUniversitaire.Etudiant,Cycle.Etudiant,Specialite.Etudiant ){                 
		var Promotion=[];
		if AnneeUniversitaire== AnneeUniversitaire.Etudiant{
			if Cycle==Cycle.Etudiant{
				if Specialite== Specialite.Etudiant{
					Promotion.push(RowEtudiant.Etudiant);
							}
				return Promotion
				}
			}
		}
	System.out.println(Promotion);                      

}