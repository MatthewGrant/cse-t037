package code;


public class Meeple {
	private final Player player;

	
	public Meeple(Player player){
		this.player = player;
	}
	
	@Override
	public String toString() {
		return "Meeple owned by Player:" + player.getName() ;
	}
	
	
	public Player getPlayer(){
		return player;
	}

}
