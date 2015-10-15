package code;

//this is wair you can see the board 
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Veiw {
	
	private JFrame _window;
	private JPanel _panel;
	private Model _model;
	
	private JButton _b1;
	private JButton _b2;
	private JButton _b3;
	private JButton _b4;
	
	private JButton _b5;
	private JButton _b6;
	private JButton _b7;
	private JButton _b8;
	
	private JButton _b9;
	
	/**
	 * the view for the board so you can see what you are playing 
	 * @param m
	 */
	public view(Board m) {//Wrong i know working on it
		_board = m;
	}
	
	
	/**
	 * this updates the view when a new tile is plased on the board
	 */
	public void updataView(){
		//needs to be in a 3 by 3 square to star off
		//Setting the location of the buttons
		updateButton(_b1,0,0);
		updateButton(_b2,0,1);
		updateButton(_b3,0,2);
		updateButton(_b4,1,0);
				
		updateButton(_b5,1,1);// center tile
		updateButton(_b6,1,2);
		updateButton(_b7,2,0);
		updateButton(_b8,2,1);
				
		updateButton(_b9,2,2);
		//increass the number of button i have if the tile is next to a borded this is in the 
		
		for(int i =0;i<updataButton[0].lenght;i++){
			for(int j = 0; j<updataButton[0].lenght; j++){
				
			}
				
		}
	
		_window.pack();
	}
	
	/**
	 * @param b
	 * @param row the number of row that are on the board 
	 * @param col the number of columns that are on the board 
	 */
	public void updateButton(JButton b, int row, int col) {
		b.setText(""+_model.get(row,col));
	
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public JButton createButton(JPanel p) {
		JButton b = new JButton();
	
		p.add(b);
		return b;
}
/**
 * when the game start this stuff will run
 */
@Override
	public void run() {
		_window = new JFrame("Carcassonne");
	
		_panel = new JPanel();
	
		_panel.setLayout(new GridLayout(9,9));
	
		//_model.addObserver(this);
	
		_window.setFocusable(true);
		
		_window.add(_panel);
		_window.pack();
		_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_window.setVisible(true);
}

}
