
public class FacultyMember extends Employee{
	public FacultyMember(String name,int salary) throws NegativeSalaryException {
		super(name,salary);
	}
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		int overpay= amount + this.getDebt();
		this.setDebt(overpay);
	}
	public static void testFacultyMember() {
		FacultyMember fm;
		try {
			fm = new FacultyMember("Leon", 10000);
			fm.pay(12000);
			System.out.println(fm.getDebt() == 2000);
		} catch (NegativeSalaryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
