package code;


import java.util.HashMap;
import java.awt.Point;


public class Board {
	private HashMap<Point, BaseTile> _board;
	private Deck _deck;
	
	public Board() {
		// pointsOnBoard();
		_board = new HashMap<Point, BaseTile>();
		_deck = new Deck();
		
		_board.put(new Point(0,0),new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		
	}

}
