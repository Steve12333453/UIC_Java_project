
public class Employee extends Person {

	public Employee(String name, int salary) throws NegativeSalaryException {
		super(name, -salary);
		// TODO Auto-generated constructor stub
		if (salary < 0) {
			throw new NegativeSalaryException("An employee cannot have a negative salary");
		}
	}

	/**
	 * decreases the current salary of the employee by the amount of money given as
	 * argument to the method
	 */
	@Override
	public void pay(int amount) throws NegativeSalaryException {
		// TODO Auto-generated method stub
		int overpay = amount + this.getDebt();
		if (overpay > 0) {
			throw new NegativeSalaryException("An employee cannot be overpaid by " + overpay + " yuans!");
		} else {
			this.setDebt(amount + this.getDebt());
		}
	}

	// the overload method of Employee
	public Employee(String name, int salary, int flag) {
		super(name, -salary);
	}

	// the overload method of pay
	public void pay(int amount, int flag) {
		int overpay = amount + this.getDebt();
		this.setDebt(overpay);
	}

	public static void testEmployee() {
		try {
			Employee e = new Employee("Steve", 10000);
			System.out.println(e.getName() == "Steve");
			System.out.println(e.getDebt() == -10000);
			e.pay(1000);
			System.out.println(e.getDebt() == -9000);
			e.pay(10000);
		} catch (NegativeSalaryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage().equalsIgnoreCase("An employee cannot be overpaid by 1000 yuans!"));
		}
		try {
			Employee e2 = new Employee("Kirin", -1000);
		} catch (NegativeSalaryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage().equalsIgnoreCase("An employee cannot have a negative salary"));
		}

	}
}
