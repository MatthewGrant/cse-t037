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
	
	/**  
	   * feature what feature is contained
	   */
	public TileFeature(Feature feature1, Feature feature2,Feature feature3) {
	    this.section1 = feature1;
	    this.section2 = feature2;
	    this.section3 = feature3;
	    this.center = null;
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
	
	
	
	
	
	
}