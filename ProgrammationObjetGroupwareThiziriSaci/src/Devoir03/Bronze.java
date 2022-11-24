package Devoir03;


public class Bronze extends Metal{
	public Bronze(String type) {
		//appel du constructeur de la super class animal
		super("Bronze",3);       
	}
	public void afficherAttributs() {
		//appel de la méthode de la super class Metal
		super.afficherAttributs(); 
		}
	@Override
	public void Brillance() {
		Boolean Brillance=false; 
		System.out.println("Brillance: "+ Brillance);

	}
	}
	