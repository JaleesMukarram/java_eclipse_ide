package Inheritance;

public class TestInheritance {
	public static void main(String [] fr) {
		Student std_obj1 = new Student("Jalees Mukarram",243768,3.54,"BESE-9A");
		Student std_obj2 = new Student("Hassaan Ali",231422,3.34,"BESE-9A");
		Student std_obj3 = new Student("Mamnoon ul Hussnain",257059,3.74,"BESE-9A");
		
		Alumni alm1 = new Alumni("Waqas Zaka",345321,3.33,"BESE-6A",230423.23,"Code For Pakistan");
		Alumni alm2 = new Alumni("Zainab Fatima",275133,3.67,"BESE-6A",2100223.23,"Code For Pakistan");

        System.out.println("Introducing 1st student:\n"+std_obj1.toString());
        //System.out.println("Introducing 2nd student:\n"+std_obj2.toString());
        //System.out.println("Introducing 3rd student:\n"+std_obj3.toString());
        
        System.out.println("Introducing 1st Alumni:\n"+alm1.toString());



	}



	}


