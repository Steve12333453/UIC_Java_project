/**
 * Payer interface for people who pay money for the finance office
 * 
 * @author Steve
 *
 */
public interface Payer {

	public String getName();

	public int getDebt();

	public void pay(int amount) throws NegativeSalaryException;
}
