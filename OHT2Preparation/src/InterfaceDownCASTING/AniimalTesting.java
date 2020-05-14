package InterfaceDownCASTING;

public class AniimalTesting {
	public static void main(String args[]) {

		Animal tiger1 = new Tiger();
		Carnivors tiger2 = new Tiger();
		Tiger cr = (Tiger) tiger1;
		cr.TigerID();

//		Animal e1 = new Elephant();
//		Carnivors e2 = new Elephant();

	}

}
