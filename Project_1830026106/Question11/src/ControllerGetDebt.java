
public class ControllerGetDebt extends Controller {

	public ControllerGetDebt(FinanceOffice m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	public String getDebt(String name) {
		try {
			return String.valueOf(m.getDebt(name));// transforms the integer result of the getDebt method of the finance
													// office into a string and returns that string as result (to the
													// view).
		} catch (UnknownPayerException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	}
}
