package atelier04;

//minimum des variables p1, p2, p3dans p4
public class BranchementConditionnel02 {
	public static void main(String[] args) {
		int p1=10, p2=9, p3=-1, p4=4;
		if (p1>p2) {
			if (p3>p2)
				p4=p2;
			else
				p4=p3;
		}
		else {    
			if (p3>p1)
				p4=p1;
			else
				p4=p3;
		}
		System.out.println(p4);
	}
}
