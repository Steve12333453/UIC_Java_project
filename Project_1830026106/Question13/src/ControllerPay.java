
public class ControllerPay extends Controller {

	public ControllerPay(FinanceOffice m) {
		super(m);
		// TODO Auto-generated constructor stub
	}
	
	public String pay(String name,String amount) {
		int money=Integer.parseInt(amount);//transforms the amount of money from a string to a integer
		try {
			m.pay(name, money);
			return "";//If no exception occurs then the pay method of the controller returns the empty string. 
		} catch (NegativeSalaryException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		} catch (UnknownPayerException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}catch(NumberFormatException e) {
			return e.getMessage();
		}
	}
}
