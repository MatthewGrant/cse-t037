package code;
//this is the tile
public class BaseTile {
	
	Edge top = new Edge(null, null, null);
	Edge bottom = new Edge(null, null, null);
	Edge left = new Edge(null, null, null);
	Edge right = new Edge(null, null, null);
	
	public BaseTile(){
		
		
	}

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
		this.left = temp;
			
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
	
}

