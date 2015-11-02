
package code;

import java.util.List;
import java.util.Scanner;

import code.Deck;
public class GameManager {

private Deck deck; //Currently created in Board class should/can we move?
private BaseTile curTile = null;
private Board board; 

private static List<Player> players;
private int turnNumber;
private Player curPlayer;
private boolean isGameOver;


/**
 * tells us how the player are and what order thay will go in
 * @param args
 */
public static void main(String[] args){
	//enter player names

	new Board();//so we can see the baord
	
	System.out.println("The player order is ");//print out the play order
	for (int i=0; i<args.length; i++) {
		String playerName = args[i];
		
		// add each player to player list 
		
		Player player  = new Player(playerName);
		players.add(player);
		
		//print player order
		System.out.println("player " + (i+1) + " is " +args[i]);//prints outs the players names
		System.out.println();
		
	
		}
	}


// the getters and setters
/**
 * @return the player
 */
public List<Player> getPlayers() {
	return players;
}


/**
 * sets the players in the game
 * @param players
 */
public void setPlayers(List<Player> players) {
	this.players = players;
}

public void newPlayer(Player player) {
    if (players.size() < 5) {
      players.add(player);
    }
  }

/**
 * gets the deck 
 * @return the deck
 */
public Deck getDeck() {
	return deck;
}



/**
 * setst the deck
 * @param deck of cards in the game
 */
public void setDeck(Deck deck) {
	this.deck = deck;
}



/**
 * tells us hows turn it is 
 * @return the players trun
 */
public int getTurnNumber() {
	return turnNumber;
}



/**
 * keepes track of the players truen number
 * @param turnNumber the trun you are on
 */
public void setTurnNumber(int turnNumber) {
	this.turnNumber = turnNumber;
}



/**
 * hows trun it is 
 * @return the curplayer of for that turn
 */
public Player getCurPlayer() {
	return curPlayer;
}

/** 
 * setst the player order
 * @param curPlayer
 */
public void setCurPlayer(Player curPlayer) {
	this.curPlayer = curPlayer;
}

/**
 * will tells us the next player
 * @return the curent players name
 */
public Player nextPlayer(){
	curPlayer = players.get(turnNumber % players.size());
	turnNumber++;
	return curPlayer;
}

/**
 * gets the board so the player can play
 * @return board
 */
public Board getBoard() {
	return board;
}



/**
 * gets the tiles that you can play
 * @return curtile
 */
public BaseTile getCurTile() {
	return curTile;
}


/**
 * tells us that the game is over// ao nobody can place any tiles or thire are no more tiles to place
 * @param g 
 */
public void setGameOver(boolean g) {
    isGameOver = g;
  }

/**
 * when the deck is empty then the game is over
 * @return if the deck is empty then it returns true
 */
public boolean isGameOver() {
	if(deck.isEmpty()){
		isGameOver = true;
	}
	return isGameOver;
}







}
