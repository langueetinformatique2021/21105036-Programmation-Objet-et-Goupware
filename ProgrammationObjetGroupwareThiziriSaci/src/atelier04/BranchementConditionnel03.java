package atelier04;

//médiane des variables p1, p2 et p3
public class BranchementConditionnel03 {
		public static void main(String[] args) {
			int p1=10, p2=9, p3=-1, p4=4;
			if (p3>p2) {
				if (p2>p1)
					p4=p2;
				else {    //p2<P1   et p2<p3
					if (p1>p3)
						p4=p3;
					else 
						p4=p1;
				}
			}
			else      //p2>p3
				if (p3>p1)
					p4=p3;
				else { //p1>p3 et p2>p3
					if (p1>p2)
						p4=p2;
					else 
						p4=p1;
				}
		System.out.println(p4);
		}
}
