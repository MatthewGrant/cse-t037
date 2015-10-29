package code;

import java.awt.Point;

public class Meeple {
	private final Player player;
	private Point _point;//the point on the tile at which the meeple will be placed

	
	public Meeple(Player player){
		this.player = player;
	}
	
	/**
	 * so we can place meeples on the tiles
	 * @param p the point on the tile that we can place
	 */
	public void place(Point p) 
	{
		_point=p;// point on the tile
	}
	
	@Override
	public String toString() {
		return "Meeple owned by Player:" + player.getName() ;
	}
	
	
	public Player getPlayer(){
		return player;
	}

}
