package code;

//this is wair you can see the board 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;


public class View implements Runnable {
	
	private JFrame _window;
	private JPanel _Top;//the top part of the frame
	private JPanel _Bottom;// the bottom part of the frame
	private Board _board;
	private BufferedImage _pic;//the picert that will plased on the image
	private JButton _Left;//the left button on the botton part of the screen
	private JButton _Center;//this button has the tile you are about to place on it
	private JButton _Right;//for roating the tile right
	
	//Place these on bottom Pane for players to see
	// need to create in view,link to methods and update after action 
	private JPanel _Header; 
	private JTextPane  _playerTurn; 
	private JTextPane  _TilesRemaning; 
	
	/**
	 * the view for the board so you can see what you are playing 
	 * @param m
	 */
	public View(Board m) {
		_board = m;
		run();
	}
	
	  
	/**
	 * Code to Rotate image
	 * @param img the pic that will be rotates
	 * @param rotate 
	 * @return the finly rotated image
	 */
	public BufferedImage rotateImage(BufferedImage img, int rotate){
		BufferedImage temp = new BufferedImage(81,81,img.getType());
		Graphics2D g = (Graphics2D) temp.getGraphics();
		AffineTransform xform = new AffineTransform();
		xform.translate(81/2.0, 81/2.0);
		xform.rotate((Math.PI/2.0)*rotate);
		xform.translate(-81/2.0, -81/2.0);
		g.drawImage(img, xform, null);
		g.dispose();
		return temp;
		
	}
	
	/**
	 * this updates the view when a new tile is plased on the board
	 * this also places the first tile
	 */
	public void updateView(){
		
		_Top.removeAll();
		//increaes the board size using the bounds in the Baord class
		JButton[][] buttons = new JButton[(Math.abs(_board.get_lower()) + _board.get_upper())+1][(Math.abs(_board.get_left()) + _board.get_right())+1];
		_Top.setLayout(new GridLayout(buttons.length,buttons[0].length));
		for(int i =0; i<buttons.length  ; i++){// get the size of the coulems
			for (int j =0; j<buttons[0].length ; j++){//get the size of the rows
				buttons[i][j]= new JButton();
				
				//Set button boarder to empty
				//if we put this back in we have to change the bounder size and grid size so that the scrool pane will be on the bottom agian
				//Border emptyBorder = BorderFactory.createEmptyBorder();
				//buttons[i][j].setBorder(emptyBorder);
				Point p;
				int x = (_board.get_left()+j);
				int y = ( _board.get_lower()+i);
				p = new Point(x,y);
				
				buttons[i][j].addActionListener(new ButtonListener(p,this));
				_Top.add(buttons[i][j]);
				
				BaseTile temp = _board.ifTileIsThere(p);
				if( temp!= null ){
					Point loc = temp.getPoint();
					
					// Adds image to buttons on board 
					BufferedImage tempImage=rotateImage(_pic.getSubimage(loc.x*81, loc.y*81, 81, 81),temp.getRotation());
					ImageIcon ico = new ImageIcon(tempImage);
					buttons[i][j].setIcon(ico);
				}
			}
		
			BaseTile temp = _board.nextTile();
			
			//Sets Center button with tile icon (file --> buffered Image --> ImageIcon)
			BufferedImage tempImage=rotateImage(_pic.getSubimage(temp.getPoint().x*81, temp.getPoint().y*81, 81, 81),temp.getRotation());
			ImageIcon ico = new ImageIcon(tempImage);
			_Center.setIcon(ico);
			
			//put  buttons on the lower half of the board 	to rotate the tiles
			//have the players name print out on the bottom part of the board
		}
		_window.pack();
	}

	
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
		//Jframe
		_window = new JFrame("Carcassonne");
		//set JFrame to dimensions
		_window.setPreferredSize(new Dimension(800, 650));
		// 2 rows by 1 column
		_window.setLayout(new GridLayout(2,1));
		
		//Top JPanel within Jframe
		_Top= new JPanel();
		_Top.setBackground(Color.LIGHT_GRAY);
	
		//Initial to 3 by 7  grid  could be any size we want
		//this give us a scrool pane on the bottom to start and when you place a tile it will give you a scrool pane on the side 
		//could have it so it gives us a scroll pane on the side to start 
		_Top.setLayout(new GridLayout(3,8));
		
		//NEED TO Scale contents of JPanel so the Frame doesn't grow off the screen
		//Create bottom Jpanel 
		_Bottom= new JPanel();
		
		_Bottom.setPreferredSize(new Dimension(100,650));
		
		JScrollPane _scroll = new JScrollPane(_Top);
		
		// Create Left rotate button with method to rotate tile on click 
		_Left = createButton(_Bottom);
		_Left.setText("Rotate Left");
		_Left.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// Calls baseTiles rotate method on nextTile with button is pressed
				_board.nextTile().RotateLeft();
				updateView();
			}
		});
		
		//create center button 
		_Center = createButton(_Bottom);
		
		// create right rotate button with method to rotate tile on click
		_Right = createButton(_Bottom);
		_Right.setText("Rotate Right");
		_Right.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				_board.nextTile().RotateRight();
				updateView();
			}
		});
		
		_window.setFocusable(true);
		_window.add(_scroll, BorderLayout.CENTER);
		_window.add(_Bottom, BorderLayout.SOUTH);
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
