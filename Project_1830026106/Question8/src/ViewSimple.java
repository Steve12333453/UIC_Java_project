import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewSimple extends JFrame implements ModelListener{
	private FinanceOffice m;
	private ControllerSimple c;
	private JLabel label;
	
	public ViewSimple(FinanceOffice m, ControllerSimple c) {
		this.m=m;
		this.c=c;
		label=new JLabel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		label.setText("total debt: "+m.totalDebt());
	}
}
