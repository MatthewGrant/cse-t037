package code;

import java.awt.Color;
import java.awt.Point;

public class Meeple {
	private final Player player;
	private int _loc;//the point on the tile at which the meeple will be placed
	private Color _color;
	//need to some how change the color of the meeple for the differnt players
	public Meeple(Player player, Color c){
		this.player = player;
		_color = c;
	}
	
	/**
	 * so we can place meeples on the tiles
	 * @param p the point on the tile that we can place
	 */
	public void place(int l) 
	{
		_loc=l;// point on the tile
	}
	
	@Override
	public String toString() {
		return "Meeple owned by Player:" + player.getName() ;
	}
	
	
	public Player getPlayer(){
		return player;
	}
	
	public int get_loc(){
		return _loc;
	}
	
	public Color get_color(){
		return _color;
	}
}
