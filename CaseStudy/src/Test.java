
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComissionEmployee c = new ComissionEmployee("Jalees","Mukarram",12345);
		c.setComissionRate(0.3);
		c.setGrossSaleAmount(100000);
		//System.out.println(c.toString());
		
		BiasedEmployee b = new BiasedEmployee("Mamnoon","Hussnain",123455);
		b.setBaseSalary(100000);
		b.setComissionRate(.3);
		b.setGrossSaleAmount(100000);
		System.out.println(b.toString());
		
		
		
		
		

	}

}
