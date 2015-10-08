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
	 * 
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
	 * 
	 */
	public void RotateLeft(){
		Edge temp = this.top;
		this.top = this.right;
		this.right = this.bottom;
		this.bottom =this.left;
		this.left = temp;
		
	}
	
	/**
	 * 
	 */
	public void RotateRight(){
		//the oppeset of rotate left
		Edge temp = this.top;
		this.top = this.left;
		this.left = this.bottom;
		this.bottom = this.right;
		this.left = temp;
		
		
	}
	
	
	
	
	
	
	
//this is the getters
	/**
	 * @return the top edge
	 */
	public Edge getTop() {
		return top;
	}

	/**
	 * @return
	 */
	public Edge getBottom() {
		return bottom;
	}

	/**
	 * @return
	 */
	public Edge getLeft() {
		return left;
	}

	/**
	 * @return
	 */
	public Edge getRight() {
		return right;
	}
	
}





