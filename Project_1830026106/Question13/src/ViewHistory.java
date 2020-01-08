import java.awt.BorderLayout;

public class ViewHistory extends View<ControllerHistory>{

	public ViewHistory(FinanceOffice m, ControllerHistory c) {
		super(m, c);
		// TODO Auto-generated constructor stub
		this.setTitle("View History");
		this.setSize(400, 300);
		HistoryPanel hp=new HistoryPanel(m);
		this.setLayout(new BorderLayout());
		this.add(hp,BorderLayout.CENTER);
		this.setVisible(true);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		repaint();
	}

}
