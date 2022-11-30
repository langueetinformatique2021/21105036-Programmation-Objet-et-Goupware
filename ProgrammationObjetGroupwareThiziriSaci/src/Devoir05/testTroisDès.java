package Devoir05;

public class testTroisDès {
	public static void main(String[] args) {
		Aleat chiffre = new Aleat(6);
		TroisDes Des = new TroisDes(chiffre.get(), chiffre.get(), chiffre.get());
		System.out.println(Des);
	}
}
