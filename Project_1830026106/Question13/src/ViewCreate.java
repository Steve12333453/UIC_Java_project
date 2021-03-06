import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCreate extends View<ControllerCreate> {

	private JTextField t1;
	private JTextField t2;
	private JComboBox<String> cb;

	public ViewCreate(FinanceOffice m, ControllerCreate c) {
		super(m, c);

		this.setTitle("View Create");
		this.setSize(400, 400);
		int height = this.getHeight() / 4;

		t1 = new JTextField("Type a payer name here");
		t1.setPreferredSize(new Dimension(this.getWidth(), height));

		t2 = new JTextField("Type an amount of money here");
		t2.setPreferredSize(new Dimension(this.getWidth(), height));
		// The combo box offers three menu options.
		cb = new JComboBox<>(new String[] { "Student", "Employee", "Faculty Member" });
		cb.setPreferredSize(new Dimension(this.getWidth(), height));

		JButton button = new JButton("Pay");
		button.setPreferredSize(new Dimension(this.getWidth(), height));

		this.setLayout(new GridLayout(4, 1));// use a grid layout manager to position the four components
		this.add(t1);
		this.add(t2);
		this.add(cb);
		this.add(button);

		button.addActionListener(e -> {
			String payerName = t1.getText();
			String amountText = t2.getText();
			int type = cb.getSelectedIndex();

			String result = c.create(payerName, amountText, type);
			if (!result.isEmpty()) {
				JOptionPane.showMessageDialog(this, result, "Message", JOptionPane.INFORMATION_MESSAGE);
			}

		});

		this.setVisible(true);
	}

	@Override
	public void update() {

	}
}
