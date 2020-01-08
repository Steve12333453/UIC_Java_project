import javax.swing.JFrame;

public abstract class View<T extends Controller> extends JFrame implements ModelListener {
	protected FinanceOffice m;
	protected T c;

	// In the constructor of the view class, the view registers itself with the
	// model
	public View(FinanceOffice m, T c) {
		this.m = m;
		this.c = c;
		m.addListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public abstract void update();// the update method of the View class is abstract
}
