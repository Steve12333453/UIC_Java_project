
public class Student extends Person {

	public Student(String name, int debt) {
		super(name, debt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		this.setDebt(this.getDebt() - amount);
	}

	public static void testStudent() {
		Student s = new Student("Kirin", 80000);
		System.out.println(s.getName() == "Kirin");
		System.out.println(s.getDebt() == 80000);
		s.pay(80000);
		System.out.println(s.getDebt() ==0);
		s.pay(80000);
		System.out.println(s.getDebt()==-80000);
	}

}
