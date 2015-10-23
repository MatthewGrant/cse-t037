
package code;

import java.util.List;
import java.util.Scanner;

import code.Deck;
public class GameManager {

private Deck deck; //Currently in Board class should/can we move
private BaseTile curTile = null;
private Board board;

private List<Player> players;
private int turnNumber;
private Player curPlayer;
private boolean isGameOver;


public List<Player> getPlayers() {
	return players;
}


public void setPlayers(List<Player> players) {
	this.players = players;
}


public Deck getDeck() {
	return deck;
}



public void setDeck(Deck deck) {
	this.deck = deck;
}



public int getTurnNumber() {
	return turnNumber;
}



public void setTurnNumber(int turnNumber) {
	this.turnNumber = turnNumber;
}



public Player getCurPlayer() {
	return curPlayer;
}



public void setCurPlayer(Player curPlayer) {
	this.curPlayer = curPlayer;
}



public Board getBoard() {
	return board;
}



public BaseTile getCurTile() {
	return curTile;
}


public void setGameOver(boolean g) {
    isGameOver = g;
  }

public boolean isGameOver() {
	if(deck.isEmpty()){
		isGameOver = true;
	}
	return isGameOver;
}



public static void main(String[] args){
	//enter player names

	new Board();//so we can see the baord
	
	System.out.println("The player order is ");
	for (int i=0; i<args.length; i++) {
		System.out.println("player " + (i+1) + " is " +args[i]);
		
		
	//print player order
		}
	}


}
