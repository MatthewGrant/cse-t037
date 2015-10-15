package code;


import java.util.HashMap;
import java.awt.Point;


public class Board {
	private HashMap<Point, BaseTile> _board;
	private Deck _deck;
	
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
	 * @param point place wiar the tile can be placed at 
	 * @param basetile the tile 
	 * @return true if it was placed and false if it was not
	 */
	public boolean place (Point point, BaseTile basetile){
		if (canBePlaced(point,basetile)){
			_board.put(point, basetile);
			return true;
		}
		return false;
	}
	
	
	 
	/**
	 * this is to drawa tile from the deck
	 * @return the tile that you have just draw
	 */
	public BaseTile draw(){
		return _deck.getNextTile();
	}
	
	
	
}
