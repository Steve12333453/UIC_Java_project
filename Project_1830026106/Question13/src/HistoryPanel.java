import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class HistoryPanel extends JPanel {
	private FinanceOffice m;

	public HistoryPanel(FinanceOffice m) {
		this.m = m;
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		ArrayList<Integer> history = m.getHistory();
		int min = HistoryMin(history);
		int range = historyRange(history);
		int maxX = getWidth() - 1;
		int maxY = getHeight() - 1;
		int zero = maxY + min * maxY / range;
		// Draw a blue line between the point (0, zero) and the point (maxX, zero)
		g.drawLine(0, zero, maxX, zero);
		repaint();
		int preX = 10 * 0;
		int preY = zero - history.get(0) * maxY / range;

		g.setColor(Color.red);
		if (1 == history.size()) {
			g.drawRect(preX, preY, 1, 1);
		} else {
			for (int i = 1; i < history.size(); i++) {
				Integer debt = history.get(i);
				int nowX = 10 * i;
				int nowY = zero - debt * maxY / range;

				g.drawLine(preX, preY, nowX, nowY);
				preX = nowX;
				preY = nowY;
			}
		}
	}

	/**
	 * Get the maximum value of the history data
	 * 
	 * @param integers
	 * @return max
	 */
	private int HistoryMax(ArrayList<Integer> integers) {
		int max = integers.get(0);// Assume that the arraylist contains at least one number.
		// Use an enhanced for loop to compare the sizes of the integers in the set in
		// turn.
		for (Integer integer : integers) {
			if (integer > max) {
				max = integer;
			}
		}
		return max;
	}

	/**
	 * Get the minimum value of the history data
	 * 
	 * @param integers
	 * @return min
	 */
	private int HistoryMin(ArrayList<Integer> integers) {
		int min = integers.get(0);
		for (Integer integer : integers) {
			if (integer < min) {
				min = integer;
			}
		}
		return min;
	}
	/**
	 *  returns as result the difference between the max and min of the integers in the arraylist
	 * @param integers
	 * @return difference
	 */
	private int historyRange(ArrayList<Integer> integers) {
		int max=HistoryMax(integers);
		int min=HistoryMin(integers);
		int difference=max-min;
		//returns as result 200 if the difference between the man and min of the integers in the arraylist is strictly less than 200. 
		if(difference<200) {
			return 200;
		}else {
			return difference;
		}
	}

}
