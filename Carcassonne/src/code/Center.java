package code;


public class Center extends TileFeature{

	
	
	/**
	 *  Center is an object that keeps track of the center element of the tile
	 * @param centerFeature what is in the center (road, field ,....)
	 */
	
	public Center(Feature centerFeature) {
		super(centerFeature);
	}
	
	
	// need an equals method to compare centers 
	//this is the equals method we used in the board class under the can be placed method
	  @Override
	  public boolean equals(Object obj) {
	    if (this == obj) {
	      return true;
	    }
	    if (obj == null) {
	      return false;
	    }
	    if (!(obj instanceof Center)) {
	      return false;
	    }
		return false;
	  }
	   
}
