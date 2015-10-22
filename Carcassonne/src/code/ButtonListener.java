package code;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
	private Point _point;
	private View _view;
	public ButtonListener (Point p , View v){
		_point = p;
		_view = v;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		_view.PlaceTile(_point);
		_view.updateView();
		System.out.println(_point);
		
	}

}
