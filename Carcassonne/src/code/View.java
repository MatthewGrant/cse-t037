package code;

//this is wair you can see the board 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;


public class View implements Runnable {
	
	private JFrame _window;
	private JPanel _Top;//the top part of the frame
	private JPanel _Bottom;// the bottom part of the frame
	private JLabel _PlayerNames;//this is a panel that has the current player name in it 
	private JLabel _tileRemaining; //Tiles left in deck
	private JPanel _BottomTwo; //below the rotate
	private JPanel _MeepleWindow;//opens new window on meeple yes button click
	private Board _board;
	private BufferedImage _pic;//the picert that will plased on the image
	private JButton _Left;//the left button on the botton part of the screen
	private JButton _Center;//this button has the tile you are about to place on it
	private JButton _Right;//for roating the tile right
	private JButton _LeftMeeple; //this is the button we will eventually use for meeples
	private JButton _RightY; //this will be the button to chose yes
	private JButton _RightN;//the button for no
	private JButton _Where;//where to place the meeple
	private JButton _City; //the button for placing meeple in city
	private JButton _Road; //the button for placing meeple in road
	private JButton _Field;//the button for placing meeple in field
	private JFrame _MeepleFrame;//new meeple Jframe
	private ArrayList<Player> _name;//the name of the play
	
	//Place these on bottom Pane for players to see
	// need to create in view,link to methods and update after action 
	private JPanel _Header; 
	private JLabel  _playerTurn; 
	
	//for the diffrent colors we can play of the meeples
	
	/**
	 * the view for the board so you can see what you are playing 
	 * @param m
	 */
	public View(Board m,ArrayList<Player> p) {
		_name= p;
		_board = m;
		run();
	}
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
	public void meeplewindow(){
		_MeepleWindow=new JPanel();
		_MeepleWindow.setPreferredSize(new Dimension(800, 650));
		_MeepleWindow.setVisible(true);
		
		
		
		
	}
	
	/**
	 * this updates the view when a new tile is plased on the board
	 * this also places the first tile
	 */
	@SuppressWarnings("serial")
	public void updateView(){
		
		_Top.removeAll();
		//increaes the board size using the bounds in the Baord class
		JButton[][] buttons = new JButton[(Math.abs(_board.get_lower()) + _board.get_upper())+1][(Math.abs(_board.get_left()) + _board.get_right())+1];
		_Top.setLayout(new GridLayout(buttons.length,buttons[0].length));
		for(int i =0; i<buttons.length  ; i++){// get the size of the coulems
			for (int j =0; j<buttons[0].length ; j++){//get the size of the rows
				
				
				Point p;
				int x = (_board.get_left()+j);
				int y = ( _board.get_lower()+i);
				p = new Point(x,y);
				BaseTile temp = _board.ifTileIsThere(p);
				if(temp ==null){
					buttons[i][j]= new JButton();
				}
				else if(temp.hasMeeple()){
					buttons[i][j]= new JButton(){
						//drawin ghte meeple on the board
						@Override
						public void paintComponent(Graphics g){
							int x = 0;
							int y = 0;
							int mloc = temp.getMeeple().get_loc();
							
							if (mloc == 2){
								x= 30;
								y=0;
							}
							if(mloc == 3 ){
								x= 60;
								y =0;
							}
							if(mloc == 4 ){
								x= 0;
								y =30;
							}
							if(mloc == 5 ){
								x= 30;
								y =30;
								
							}
							if(mloc == 6 ){
								x= 60;
								y =30;
							}
							if(mloc == 7 ){
								x= 0;
								y =60;
							}
							if(mloc == 8 ){
								x= 30;
								y =60;
							}
							if(mloc == 9 ){
								x= 60;
								y =60;
							}
							super.paintComponent(g);
							g.setColor(temp.getMeeple().get_color());
							g.fillOval(x+16, y+4, 21, 21);//meeple offset
						}
					};
				}
				else{
					buttons[i][j]= new JButton();
				}
				
				//Set button boarder to empty
				//if we put this back in we have to change the bounder size and grid size so that the scrool pane will be on the bottom agian
				//Border emptyBorder = BorderFactory.createEmptyBorder();
				//buttons[i][j].setBorder(emptyBorder);
				
				
				buttons[i][j].addActionListener(new ButtonListener(p,this));
				_Top.add(buttons[i][j]);
				
				
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
			
			//put buttons on the lower half of the board to rotate the tiles
		}
		
		//have the players name print out on the bottom part of the board
		_PlayerNames.setText("Current Player: " +_name.get(_board.getCurrentPlayerid()).getName());
		_PlayerNames.setFont(new Font("Serif", Font.PLAIN, 20));
		
		// Tiles left in bag
		_tileRemaining.setText("Tiles Remaining: "+ _board.getTilesRemaning()) ;
		_tileRemaining.setFont(new Font("Serif", Font.PLAIN, 20));
	
		
		_window.pack();
	}

	public JFrame getFrame(){
		return _window; 
	}
	
	/**
	 * @param p is a point for the tiles relaated to the image
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
		_window.setPreferredSize(new Dimension(800, 800));
		// 2 rows by 1 column
		_window.setLayout(new BorderLayout(15,15));
		
		//Top JPanel within Jframe
		_Top= new JPanel();
		_Top.setBackground(Color.LIGHT_GRAY);
	
		//Initial to 3 by 7  grid  could be any size we want
		//this give us a scrool pane on the bottom to start and when you place a tile it will give you a scrool pane on the side 
		//could have it so it gives us a scroll pane on the side to start 
		_Top.setLayout(new GridLayout(3,8));
		
		
		//Create bottom half of Frame (temp Jpanel) 
		JPanel tempPanel1 = new JPanel();
		tempPanel1.setLayout(new GridLayout(1,1));//(
		
		//Holds LEFT,RIGHT AND CURRENT TILE
		_Bottom = new JPanel(); 
		_Bottom.setLayout(new GridLayout(1,3));
		
		
		//Current players name will show up as text not a button
		_PlayerNames = new JLabel();
		_PlayerNames.setHorizontalAlignment(SwingConstants.CENTER);
		_PlayerNames.setVerticalAlignment(SwingConstants.CENTER);
		tempPanel1.add(_Bottom);
		
		// Tiles Remaning 
		_tileRemaining = new JLabel();
		_tileRemaining.setHorizontalAlignment(SwingConstants.CENTER);
		_tileRemaining.setVerticalAlignment(SwingConstants.CENTER);
		
		
		
		
		//Header Jpanel (Holds player name, tiles remaning, 
		_Header = new JPanel();
		_Header.setLayout(new GridLayout(1,2));
		_Header.add(_PlayerNames);
		_Header.add(_tileRemaining);
				
		
		// Top half of window is a scroll view 
		JScrollPane _scroll = new JScrollPane(_Top);
		
		// Create Left rotate button with method to rotate tile on click 
		_Left = createButton(_Bottom);
		_Left.setText("Rotate Left");
		_Left.addActionListener(new ActionListener(){
			//add another button to determine if the player wants to place a meeple
			
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
		
		//player order stuff should go here
		for(Player x: _name)
		{
			System.out.println(x.getName());
			
		}
		
		_window.setFocusable(true);
		_window.add(_Header, BorderLayout.NORTH);
		_window.add(_scroll, BorderLayout.CENTER);
		_window.add(tempPanel1,BorderLayout.SOUTH);
		
		_window.pack();
		_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_window.setVisible(true);
		try {
			_pic = ImageIO.read(new File("resources/spritesheet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateView();
}

}
