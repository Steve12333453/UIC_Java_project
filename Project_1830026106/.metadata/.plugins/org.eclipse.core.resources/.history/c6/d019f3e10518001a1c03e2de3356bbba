import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewSimple extends View implements ModelListener {
	private JLabel label;

	public ViewSimple(FinanceOffice m, Controller c) {
		super(m, c);
		// TODO Auto-generated constructor stub
		label=new JLabel();

		this.setSize(200, 200);
		this.setLocation(200, 200);
		this.update();
		this.add(label);
		this.setVisible(true);
		m.addListener(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		label.setText("total debt: " + m.totalDebt());
	}
}
