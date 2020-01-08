
public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				FinanceOffice f=new FinanceOffice("UIC FO");
				try {
					Employee e=new Employee("Philippe", 1500);
					f.addPayer(e);
					ControllerGetDebt c=new ControllerGetDebt(f);
					ViewGetDebt v=new ViewGetDebt(f, c);
				} catch (NegativeSalaryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}