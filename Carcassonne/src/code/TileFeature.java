package code;

/**
 *  feature that resides on a tile.
 *
 */
public abstract class TileFeature {
	protected final Feature section1;
	protected final Feature section2;
	protected final Feature section3;
	protected final Feature center;
	
	// This area needs work 
	protected boolean canPlaceMeeple;
	protected boolean touchesMeeple;
	protected Meeple meepleSec1;
	protected Meeple meepleSec2;
	protected Meeple meepleSec3;
	protected Meeple meepleCent;
	
	/**  
	   * feature what feature is contained
	   */
	public TileFeature(Feature feature1, Feature feature2,Feature feature3) {
	    this.section1 = feature1;
	    this.section2 = feature2;
	    this.section3 = feature3;
	    this.center = null;
	 
	    
	    //How to add meeple to a single feature
	    this.meepleCent = null;
	    this.meepleSec1 = null;
	    this.meepleSec2  = null;
	    this.meepleSec3  = null;
	}
	
	/**
	 *  overloaded constructor method just for center features
	 * @param centerFeature
	 */
	public TileFeature(Feature centerFeature){
		this.center = centerFeature;
		this.section1 = null;
		this.section2 = null;
		this.section3 = null;
		
		 //How to add meeple to a single feature?
	    this.meepleCent = null;
	
	}

	public Feature getSection1() {
		return section1;
	}

	public Feature getSection2() {
		return section2;
	}

	public Feature getSection3() {
		return section3;
	}
	
	public Feature getCenter(){
		return center; 
	}
	
	// One? method to see if feature has a meeple on it
	public boolean hasMeepleSection1() {
	    if (meepleSec1 == null) {
	      return false;
	    }
	    return true;
	  }
	
	public boolean hasMeepleSection2() {
	    if (meepleSec2 == null) {
	      return false;
	    }
	    return true;
	  }
	
	public boolean hasMeepleSection3() {
	    if (meepleSec3 == null) {
	      return false;
	    }
	    return true;
	  }
	
	
	//set meeple on feature
	
	
	// remove meeple from feature 
	
	
	
	
	
	
}