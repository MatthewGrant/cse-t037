package code;


import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Point;


public class Board {
	private HashMap<Point, BaseTile> _board;
	private Deck _deck; 
	//these are the bounds for my board
	private int _upper = 2;//was 1
	private int _lower = -2;//was-1
	private int _right = 3;//to change these number will increase the starting board size so that we can have a scrool pane on the bottom part of the barod
	private int _left = -3;//both of the 3 could be changed to 1 and the game would still work
	//these are for rottaiong though player order
	private int _t=0; //this is for the counting whos player trun it is
	private int _last;//this is the number coraspinding to the last player in the game
	//these are stuff for the meeples
	private ArrayList<Player> _name;
	private View _view;
	private Color[] _color = {Color.BLUE, Color.GREEN,Color.YELLOW,Color.RED,Color.BLACK};
	/**
	 * this creatates the names 
	 * creates the boar this is also a overloaded constuctor
	 * @param p is the player name
	 */
	public Board(ArrayList<Player> p) {
		
		_board = new HashMap<Point, BaseTile>();
		_deck = new Deck(); //MOVE TO GAME MANAGER? 
		_name = p;
		
		//the origin of the board is 0,0 and that is wair i am putting the tile
		_board.put(new Point(0,0),new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		_view =new View(this,p); 
		
		_last = p.size();//to get the last player in the game //used for finding whos truns it is 
	}
	/**
	 * creating a board that is inf and putting the first tile on the board 
	 */
	public Board() {
		
		_board = new HashMap<Point, BaseTile>();
		_deck = new Deck(); //MOVE TO GAME MANAGER? 
		
		//the origin of the board is 0,0 and that is wair i am putting the tile
		_board.put(new Point(0,0),new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		_view = new View(this);//this is so we can run our game 
		
		
	}
	/**
	 * looks to see if thire is a tile next the orginal tile
	 * @param point the point at which the tile is at
	 * @return the tiles 
	 */
	public BaseTile[] adjacentTile(Point point){
		
		BaseTile[] tiles = new BaseTile[4];
		
		//cheek to see if something is above it
		tiles[0]=_board.get(new Point(point.x,point.y-1) );//top
		tiles[1]=_board.get(new Point(point.x+1,point.y) );//right
		tiles[2]=_board.get(new Point(point.x,point.y+1) );//bottom		
		tiles[3]=_board.get(new Point(point.x-1,point.y) );//left
		
		return tiles;
	}
	
	
	/**
	 * checks to see if the tile you are trying to be placed can be placed
	 * @param point the place wiar the tile is being placed at 
	 * @param basetile the tile
	 * @return false if the tiles can't be place
	 */
	public boolean canBePlaced (Point point, BaseTile basetile){
		if (!_board.containsKey(point)){//cheeks to see if thire is a tiles at this point 
			BaseTile[] adjacentTiles= adjacentTile(point);
			boolean check1 = false;
			boolean end=false;
			for(int i = 0; i < adjacentTiles.length; i++){
				if (adjacentTiles[i] != null){
					check1 = true;
				}
				
			}
			if(check1){
				
				//cheek to see if the side match up so you can place the tile
			
				if(adjacentTiles[0] != null){
					
					if(adjacentTiles[0].getBottom().equals(basetile.getTop())){
						end = true;
						
					}
					else{
						return false;
					}
				}
				if(adjacentTiles[1] != null){
					if(adjacentTiles[1].getLeft().equals(basetile.getRight())){
						end = true;
						
					}
					else{
						return false;
					}
				}
				if(adjacentTiles[2] != null){
					
					if(adjacentTiles[2].getTop().equals(basetile.getBottom())){
						end = true;
						
					}
					else{
						return false;
					}
				}
				if(adjacentTiles[3] != null){
					
					if(adjacentTiles[3].getRight().equals(basetile.getLeft())){
						end = true;
						
					}
					else{
						return false;
					}
				}
			}
			return end;
		}
		return false;
		
	}
	/**
	 * if your tiles pass the methods above then place the tile
	 * this also check to see if a tile is place at the egde of the baord and to see if the board need to be increased
	 * @param point place wiar the tile can be placed at 
	 * @param basetile the tile 
	 * @return true if it was placed and false if it was not
	 */
	
	public boolean place (Point point, BaseTile basetile){
		
		if (canBePlaced(point,basetile)){
			//check to see if the tile is placed at the boarded
			
			draw();
			_board.put(point, basetile);
			if(_upper < point.y+1 ){
				_upper = point.y+1;
			}
			if(_lower > point.y-1 ){
				_lower = point.y-1;
			}
			if(_left > point.x-1 ){
				_left = point.x-1;
			}
			if(_right < point.x+1 ){
				_right = point.x+1;
			}
			_view.updateView();
			
			//stuff for placing meeples
			
			String[] option = {"Dont Place","NorthWest","North","NorthEast","West","Center","East","SouthWest","South","SouthEast"};//this is the opction we have for placing the meeple
			int bottemInput = JOptionPane.showOptionDialog(_view.getFrame(), "Would you like to place a Meeple and if so where", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, this);
			if (bottemInput != 0){
				//this is the place medion for the meeple
				MPlace(new Meeple(_name.get(_t),_color[_t]), bottemInput, point);
			}
			PlayerRotation();
			return true;
		}
		return false;
	}
	/**
	 * @param p the point on the baord
	 * @return whats at that point on the board
	 */
	public BaseTile ifTileIsThere(Point p){
		
		return _board.get(p);//this is the place on the board
		
	}
	
	/**
	 * gets the next tile in the deck
	 * @return the next tile in the deck 
	 */
	public BaseTile nextTile(){
		return _deck.nextTile();
		
	}
	
	/**
	 * this lets us place a meeple on the tile
	 * @param m meeples
	 * @param l location
	 * @param p point
	 * @return if it is true meeple was placed
	 */
	public boolean MPlace(Meeple m, int l, Point p){
		BaseTile temp = ifTileIsThere(p); 
		if (temp == null){
			return false;
		}
		if(_name.get(_t).getNumMeeples()>0){
			temp.setMeeple(m, l);
			_name.get(_t).setNumMeeples(_name.get(_t).getNumMeeples()-1); 
		}
		else{
			return false;
			
		}
		return true;	 
	}
	
	
	
	/**
	 * this is to draw a tile from the deck
	 * @return the tile that you have just draw
	 */
	public BaseTile draw(){
		return _deck.getNextTile();
	}
	
	/**
	 * finds whos trun it is 
	 * @return the currents player turn
	 */
	public void PlayerRotation(){ 
		_t++;
		if(_t == _last){
			_t = 0;
		}
		
	}
	/**
	 * to get the currrent players name
	 * @return the player name of who trun it is 
	 */
	public int getCurrentPlayerid(){
		return _t;//the current player
	}
	
	
	
	/**
	 * @return the upper baornded this is when so we can increase the boaed in the view class 
	 */
	public int get_upper() {
		return _upper;
	}

	/**
	 * @return the lower boarned
	 */
	public int get_lower() {
		return _lower;
	}

	/**
	 * @return the right boarned
	 */
	public int get_right() {
		return _right;
	}

	/**
	 * @return the left boarned 
	 */
	public int get_left() {
		return _left;
	}
	
	
	
}
