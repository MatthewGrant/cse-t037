package code;


import java.util.HashMap;
import java.awt.Point;


public class Board {
	private HashMap<Point, BaseTile> _board;
	private Deck _deck;
	//these are the bounds for my board
	private int _upper = 1;
	private int _lower = -1;
	private int _right = 1;
	private int _left = -1;
	
	/**
	 * creating a board that is inf and putting the first tile on the board 
	 */
	public Board() {
		
		_board = new HashMap<Point, BaseTile>();
		_deck = new Deck();
		
		//the origin of the board is 0,0 and that is wair i am putting the tile
		_board.put(new Point(0,0),new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		
	}
	
	/**
	 * looks to see if thire is a tile next the orginal tile
	 * @param point the point at which the tile is at
	 * @return the tiles 
	 */
	public BaseTile[] adjacentTile(Point point){
		
		BaseTile[] tiles = new BaseTile[4];
		
		//cheek to see if something is above it
		tiles[0]=_board.get(new Point(point.x,point.y+1) );//top
		tiles[1]=_board.get(new Point(point.x+1,point.y) );//right
		tiles[2]=_board.get(new Point(point.x,point.y-1) );//bottom		
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
				
				//cheek to see if the side match up
				//this might be wrong
				if(adjacentTiles[0] != null){
					
					if(adjacentTiles[0].getBottom()==(basetile.getTop())){
						end = true;
						
					}
					else{
						return false;
					}
				}
				if(adjacentTiles[1] != null){
					
					if(adjacentTiles[1].getLeft()==(basetile.getRight())){//changed from .euqles to ==
						end = true;
						
					}
					else{
						return false;
					}
				}
				if(adjacentTiles[2] != null){
					
					if(adjacentTiles[2].getTop()==(basetile.getBottom())){
						end = true;
						
					}
					else{
						return false;
					}
				}
				if(adjacentTiles[3] != null){
					
					if(adjacentTiles[3].getRight()==(basetile.getLeft())){
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
			_board.put(point, basetile);
			if(_upper < point.y+1 ){
				_upper = point.y+1;
			}
			if(_lower > point.y-1 ){
				_lower = point.y-1;
			}
			if(_left < point.x-1 ){
				_left = point.x-1;
			}
			if(_right < point.x+1 ){
				_right = point.x+1;
			}
			//if (View =null){
				
			//}
			return true;
		}
		return false;
	}
	
	
	 
	/**
	 * this is to draw a tile from the deck
	 * @return the tile that you have just draw
	 */
	public BaseTile draw(){
		return _deck.getNextTile();
	}
	
	//the geter for the boarned of the board
	/**
	 * @return the upper baornded
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
