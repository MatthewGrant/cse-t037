package code;

import java.awt.Point;

//this is the tile

/**
 * @author DEANNA
 *
 */
public class BaseTile {
	
	Edge top = new Edge(null, null, null);
	Edge bottom = new Edge(null, null, null);
	Edge left = new Edge(null, null, null);
	Edge right = new Edge(null, null, null);
	Center center = new Center(null);
	private Point point;
		
		

	/**
	 * this is defining the outline of the tile
	 * @param Top
	 * @param Bottom
	 * @param Left
	 * @param Right
	 */
	public BaseTile(Edge Top, Edge Bottom, Edge Left,Edge Right){
		this.top = Top;
		this.bottom = Bottom;
		this.left = Left;
		this.right = Right;	
		this.point = new Point(3,0); 
		this.center = new Center(null);
	}
	
	
	/**
	 * this lets me put stuff in the center of the tile
	 * @param Top
	 * @param Bottom
	 * @param Left
	 * @param Right
	 * @param Center
	 * this is a over loaded method
	 */
	public BaseTile(Edge Top, Edge Bottom, Edge Left,Edge Right, Center Center){
		this.top = Top;
		this.bottom = Bottom;
		this.left = Left;
		this.right = Right;
		this.center = Center;	
		this.point = new Point(3,0); 
	}
	
	/**
	 * so i can add the point to the ones with the center
	 * @param Top
	 * @param Bottom
	 * @param Left
	 * @param Right
	 * @param Center
	 * @param p
	 */
	public BaseTile(Edge Top, Edge Bottom, Edge Left,Edge Right, Center Center, Point p){
		this.top = Top;
		this.bottom = Bottom;
		this.left = Left;
		this.right = Right;
		this.center = Center;
		this.point = p;
	
		
	}
	/**
	 * so i can just add the point to the tile, with out a center
	 * @param Top
	 * @param Bottom
	 * @param Left
	 * @param Right
	 * @param p
	 */
	public BaseTile(Edge Top, Edge Bottom, Edge Left,Edge Right,Point p){
		this.top = Top;
		this.bottom = Bottom;
		this.left = Left;
		this.right = Right;	
		this.point = p; 
		this.center = new Center(null);
		
	}
	
	/**
	 * this is to rotate the tile to the left so that you can line up another edge with the first tile
	 */
	public void RotateLeft(){
		Edge temp = this.top;
		this.top = this.right;
		this.right = this.bottom;
		this.bottom =this.left;
		this.left = temp;
		
	}
	
	
	
	/**
	 * this rotates the tiles to the right to that you can line up anther edge with the first tile
	 */
	public void RotateRight(){
		Edge temp = this.top;
		this.top = this.left;
		this.left = this.bottom;
		this.bottom = this.right;
		this.right = temp;
			
	}
	
	
	
	//this is the getters
	/**
	 * @return the top edge of the tile
	 */
	public Edge getTop() {
		return top;
	}

	/**
	 * @return the bottom edge of the tile
	 */
	public Edge getBottom() {
		return bottom;
	}

	/**
	 * @return the left edge of the tile
	 */
	public Edge getLeft() {
		return left;
	}

	/**
	 * @return the right edge of the tile
	 */
	public Edge getRight() {
		return right;
	}
	
	/**
	 * @return the center of the tile
	 */
	public Center getCentert() {
		return center;
	}
	/**
	 * @return the paoint at wich the image for the tile is locatioed
	 */
	public Point getPoint() {
		return point;
	}
	
}
	



