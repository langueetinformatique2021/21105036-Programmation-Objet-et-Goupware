package atelier07;

public class Cercle extends FigureGeometrique implements Comparable {
	private double surface;
	private double perimetre;
	private double rayonCercle;              //on initialise la variable r du rayon du  cercle
	//le cercle se définit par sa couleur comme tout autre fugure geométrique et son rayon
	public Cercle (String co, double rayon) {                         
		super(co);
		this.rayonCercle= rayon; 
	}	
	@Override
	public float perimetre() {
		double perimetre= 2*Math.PI*this.rayonCercle;
		return  (float) perimetre;
	}
	public float getPerimetre() {
		return this.perimetre();
	}
	
	@Override
	public float surface() {
		surface= Math.PI*Math.pow(this.rayonCercle, 2);
		return (float) surface;
	}
	
	public float getSurface() {
		return this.surface();
	}
	public void afficherAttributs(float surface, float perimetre) {
		this.surface = surface;
		this.perimetre= perimetre;
		System.out.println("Attributs du cercle: "+ surface + perimetre);
	}
	//Implémentation de la méthode compareTo selon le périmètre des cercles
	@Override
	public int compareTo(Cercle OtherCercle) {
		int res;
		if (this.compareTo(OtherCercle)==0) {
			res=0;
			System.out.println("Les deux cercles sont de périmètres égaux");
		}
		if (this.compareTo(OtherCercle)>0) {
			res=1;
			System.out.println("Le 1e cercle est plus grand que le 2e");
		}
		else {
			res=-1;
			System.out.println("Le 2e cercle est plus grand que le 1e");
		}
		return res;
		}
}