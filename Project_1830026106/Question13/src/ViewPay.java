import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewPay extends View<ControllerPay> {
	private JTextField t1;
	private JTextField t2;

	public ViewPay(FinanceOffice m, ControllerPay c) {
		super(m, c);
		// TODO Auto-generated constructor stub
		this.setTitle("View Pay");
		this.setSize(400, 300);
		t1 = new JTextField("Type a payer name here");
		t2 = new JTextField("Type an amount of money here");
		Button b = new Button("Pay");
		this.setLayout(new GridLayout(3, 1));
		this.setLocation(600, 600);
		this.add(t1);
		this.add(t2);
		this.add(b);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String payerName = t1.getText();// the first text field get the name of the payer
				String amountText = t2.getText();// the second text field get the amount of money
				String result = c.pay(payerName, amountText);
				// . If the string returned by the pay method of the controller is different
				// from the empty string "" then this string must be displayed back to the user
				// using a message dialog
				if (!result.isEmpty()) {
					JOptionPane.showMessageDialog(null, result, "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		this.setVisible(true);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
