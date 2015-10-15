package code;

public class Player {
	  private final int id;
	  private final String name;
	  //private int score;
	  private int numMeeples;
	  private static final int MAXMEEPLES = 7;

	  /**
	   * Constructor for player.
	   * @param id the players id
	   * @param name the players name
	   */
	  public Player(int id, String name) {
	    this.id = id;
	    this.name = name;
	    this.numMeeples = MAXMEEPLES;
	  }

	  /**
	   * getter for id.
	   * @return id
	   */
	  public int getId() {
	    return id;
	  }

	  /**
	   * getter for name.
	   * @return name
	   */
	  public String getName() {
	    return name;
	  }
	 

	  /**
	   * getter for numMeeples.
	   * @return numMeeples
	   */
	  public int getNumMeeples() {
	    return numMeeples;
	  }
	  	 

	  /**
	   * setter for numMeeples.
	   * @param numMeeples what to set numMeeples to.
	   */
	  public void setNumMeeples(int numMeeples) {
	    this.numMeeples = numMeeples;
	  }

	  
	  // add methods for placeMeeple, takeMeeples

	  @Override
	  public boolean equals(Object obj) {
	    if (this == obj) {
	      return true;
	    }
	    if (obj == null) {
	      return false;
	    }
	    if (!(obj instanceof Player)) {
	      return false;
	    }
	    Player other = (Player) obj;
	    if (id != other.id) {
	      return false;
	    }
	    return true;
	  }

	
	}
