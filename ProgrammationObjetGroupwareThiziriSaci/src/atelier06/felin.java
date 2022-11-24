package atelier06;

public class felin extends animal{
	protected boolean domestique=false;
	public felin(String type) {
		//appel du constructeur de la super class animal
		super(type,4);       
	}
	public void présente() {
		//appel de la méthode de la super class animal
		super.présente(); 
		String Etat=(domestique)? "domestique":"sauvage";
		System.out.println("je suis vraiment un animal"+ Etat);
		}
	public void crie() { 
		String crie="rugir";
		System.out.println("Son cri est "+ crie);
		}
	}