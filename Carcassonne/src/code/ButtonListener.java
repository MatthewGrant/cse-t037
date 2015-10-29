package code;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
	private Point _point;
	private View _view;
	/**
	 * to see if you have clicked on that button aka you are trying to place a tile thire 
	 * @param p the point on the baord whair you clicked
	 * @param v 
	 */
	public ButtonListener (Point p , View v){
		_point = p;
		_view = v;
		
	}

	//this is what notify the button that someone has clicked 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		_view.PlaceTile(_point);
		_view.updateView();
		System.out.println(_point);
		
	}

}
