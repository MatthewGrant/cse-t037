package code;

//this is wair you can see the board 
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class View implements Runnable {
	
	private JFrame _window;
	private JPanel _Top;//the top part of the frame
	private JPanel _Bottom;// the bottom part of the frame
	private Board _board;
	private BufferedImage _pic;//the picert that will plased on the image
	private JButton _Left;
	private JButton _Center;
	private JButton _Right;
	
	
	/**
	 * the view for the board so you can see what you are playing 
	 * @param m
	 */
	public View(Board m) {
		_board = m;
		run();
	}
	
	
	/**
	 * this updates the view when a new tile is plased on the board
	 * this also places the first tile
	 */
	public void updateView(){
		
		_Top.removeAll();
		JButton[][] buttons = new JButton[3][3];
		for(int i =0; i<buttons.length  ; i++){// get the size of the coulems
			for (int j =0; j<buttons[0].length ; j++){//get the size of the rows
				buttons[i][j]= new JButton();
				Point p;
				int x = (_board.get_left()+j);
				int y = ( _board.get_lower()+i);
				p = new Point(x,y);
				
				buttons[i][j].addActionListener(new ButtonListener(p,this));
				_Top.add(buttons[i][j]);
				
				BaseTile temp = _board.ifTileIsThere(p);
				if( temp!= null ){
					Point loc = temp.getPoint();
					ImageIcon ico = new ImageIcon(_pic.getSubimage(loc.x*81, loc.y*81, 81, 81));
					buttons[i][j].setIcon(ico);
					
				}
				
				 			
			}
			//puting stuff on the lower half of the board
			//updateButton(_Left,1,0);
			//updateButton(_Center,1,1);
			//updateButton(_Right,1,2);
			
			_Left.setText("Rotate Tile Left");
			BaseTile temp = _board.nextTile();
			_Center.setIcon(new ImageIcon(_pic.getSubimage(temp.getPoint().x*81, temp.getPoint().y*81, 81, 81)));
			_Right.setText("Rotate Tile Right");
			
			
			//put  buttons on the lower half of the board 	to rotate the tiles
			//have the players name print out on the bottom part of the board
		}
		_window.pack();
	}

	//private void updateButton(JButton b, int row, int col) {
		// TODO Auto-generated method stub
		
	//}


	/**
	 * @param p is a point for the tails relaated to the image
	 */
	public void PlaceTile(Point p){
		_board.place(p, _board.nextTile());
		
	}
	/**
	 * so i can put the buttions on the bottom part of the frame
	 * @param p the place on the jfraam
	 * @return the button on the jframe
	 */
	private JButton createButton(JPanel p) {
		JButton b = new JButton();
		
		p.add(b);
		return b;
	}
	
/**
 * when the game start this stuff will run
 * it allows up to have the baord and other things 
 */
@Override
	public void run() {
		_window = new JFrame("Carcassonne");
		_window.setLayout(new GridLayout(2,1));
		
		_Top= new JPanel();
		_Top.setLayout(new GridLayout(3,3));
		
		_Bottom= new JPanel();
		_Bottom.setLayout(new GridLayout(1,3));//sets the numnber of rows and columes
		
		_Left = createButton(_Bottom);
		_Center = createButton(_Bottom);
		_Right = createButton(_Bottom);
		//_model.addObserver(this);
	
		_window.setFocusable(true);
		
		_window.add(_Top);
		_window.add(_Bottom);
		_window.pack();
		_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_window.setVisible(true);
		try {
			_pic = ImageIO.read(new File("resources/spritesheet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(_pic);
		updateView();
}




}
