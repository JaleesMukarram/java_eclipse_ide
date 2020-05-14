package fwefwe;

public class Main implements I1,I2{
	public void w1() {
		System.out.println("Jalees");
		
	}
	
	public static void main(String args[]) {
		I1 i  = new Main();
		I1 i1  = new Main();
		i.w1();
		i1.w1();

		
	}

}
