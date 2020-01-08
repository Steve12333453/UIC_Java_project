
public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				FinanceOffice m = new FinanceOffice("UIC FO");
				// The controller knows about the model; the model does not know about the
				// controller
				Controller c=new Controller(m);
				ViewSimple v = new ViewSimple(m, c);
			}
		});

	}

}
