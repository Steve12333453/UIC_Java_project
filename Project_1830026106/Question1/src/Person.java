
public abstract class Person implements Payer {
	// member attributes
	private String name;
	private int debt;

	/**
	 * constructor
	 * 
	 * @param name
	 * @param debt
	 */
	public Person(String name, int debt) {
		this.name = name;
		this.debt = debt;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getDebt() {
		// TODO Auto-generated method stub
		return this.debt;
	}

	@Override
	abstract public void pay(int amount);

	/**
	 * 
	 * @param debt: the debt to be set
	 */
	protected void setDebt(int debt) {
		this.debt = debt;
	}

	public static void testPerson() {

	}
}
