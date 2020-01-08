import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewGetDebt extends View<ControllerGetDebt> {
	private JTextField t;// the text field where the user can type text

	public ViewGetDebt(FinanceOffice m, ControllerGetDebt c) {
		super(m, c);
		// TODO Auto-generated constructor stub
		t = new JTextField("Type a payer name here: ");
		this.setTitle("View Debt");
		Button b = new Button("Tell me the debt");
		this.setLayout(new GridLayout(2, 1));
		this.setSize(400, 300);
		this.setLocation(300, 300);
		// read the name of the payer that was typed in the text field
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s1 = t.getText();// the text used to store the payers's name
				String s2 = c.getDebt(s1);// the text used to get the debt
				JOptionPane.showMessageDialog(null, s2);
			}
		});
		this.add(t);
		this.add(b);
		this.setVisible(true);
	}

	// The update method of the ViewGetDebt class does nothing, because the
	// ViewGetDebt class does not graphically display any data from the finance
	// office (the model).
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
