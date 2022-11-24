package atelier06;

public class chat extends felin implements Domesticable{
	public chat(String type) {
		super(type);
	}
	private String nom;
	
	public chat() { 
		super("chats");
	}

	@Override
	public void domestiquer(String nom) {
		domestique = true;
		this.nom = nom;

	}

	@Override
	public String nom() {
		return this.nom;
	}
	
	public void crie() {
		if (domestique == false) super.crie();
		else 
			System.out.println("Je miaule et je m'appelle "  + this.nom());
	}

}