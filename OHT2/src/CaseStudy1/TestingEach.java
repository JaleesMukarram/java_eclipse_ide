package CaseStudy1;

public class TestingEach {

	public static void main(String[] args) {
//		SalariadEmployees emp = new SalariadEmployees();
//		emp.setBaseSalary(23432.34);
//		System.out.println(emp.earning());

//		HourlyEmplyees emp = new HourlyEmplyees();
//		emp.setHoursWorked(41);
//		emp.setPayPerHour(20000);
//		System.out.println(emp.earning());

//		CommissionEmployee emp = new CommissionEmployee();
//		emp.setSaleAmount(100);
//		emp.setPayPercent(10);
//		System.out.println(emp.earning());

		Employee[] array = new Employee[4];
		array[0] = new SalariadEmployees(10000);
		array[1] = new HourlyEmplyees(51, 100);
		array[2] = new CommissionEmployee(1000, 10);
		array[3] = new BaseSalariedComisionEmployee(1000, 10, 100);

		for (Employee e : array) {

			if (e instanceof BaseSalariedComisionEmployee) {
				BaseSalariedComisionEmployee z = (BaseSalariedComisionEmployee) e;
				System.out.println("I am " + e.getClass().getSimpleName() + " with the pay of: " + e.earning());
				double oldBaseSalary = z.getBaseSalary();
				double newBaseSalary = oldBaseSalary + (0.10 * oldBaseSalary);
				z.setBaseSalary(newBaseSalary);
				System.out.println("I am " + e.getClass().getSimpleName() + " with the pay of: " + e.earning());
				Employee g = (Employee) z;
				z.getBaseSalary();

			} else {
				// System.out.println("I am " + e.getClass().getSimpleName() + " with the pay
				// of: " + e.earning());
			}

		}

	}

}
