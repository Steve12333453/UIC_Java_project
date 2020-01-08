
public class FacultyMember extends Employee {
	public FacultyMember(String name, int salary) throws NegativeSalaryException{
		super(name,salary);
	}

	public void pay(int amount) {
		super.pay(amount, 1);
	}

	public static void testFacultyMember() throws NegativeSalaryException {
		FacultyMember f = new FacultyMember("Steve", 10000);
		System.out.println(f.getName() == "Steve");
		System.out.println(f.getDebt() == -10000);
		f.pay(1000);
		System.out.println(f.getDebt() == -9000);
		f.pay(10000);
		System.out.println(f.getDebt() == 1000);
	}
}
