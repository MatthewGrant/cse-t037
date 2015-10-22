package code;

public class Player {
	  public final int id;
	  public static int nextID=1;
	  private final String name;
	  //private int score;
	  private int numMeeples;
	  private static final int MAXMEEPLES = 7;

	  /**
	   * Constructor for a player.
	   * @param id the players id
	   * @param name the players name
	   */
	  public Player(String name) {
	    this.id = nextID;
	    nextID++;
	    this.name = name;
	    this.numMeeples = MAXMEEPLES;
	  }


	/**
	   * get id.
	   * @return id
	   */
	  public int getId() {
	    return id;
	  }

	  /**
	   * get name.
	   * @return name
	   */
	  public String getName() {
	    return name;
	  }
	 

	  /**
	   * get numMeeples.
	   * @return numMeeples
	   */
	  public int getNumMeeples() {
	    return numMeeples;
	  }
	  	 

	  /**
	   * set numMeeples.
	   * @param numMeeples what to set numMeeples to.
	   */
	  public void setNumMeeples(int numMeeples) {
	    this.numMeeples = numMeeples;
	  }

	  
	  // add methods for placeMeeple, count takeMeeples 

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
