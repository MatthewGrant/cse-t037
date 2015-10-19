package code;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	private ArrayList<BaseTile> _deck ;
	
	
	public Deck(){
		
		_deck = new ArrayList<BaseTile>(); //there are 72 because the stater tile is not inclued
		
		//road on the bottom. church in the center//two tile in game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Center(Feature.MONASTERY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY)));
		
		// all side field but there is a church in the center//four tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY)));
		
		//all sides city with a shield// one tile in game 
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
                new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
                new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
                new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//road on the top and bottom and a city on the right // four tiles in the game
		//this is the starting tile so i will only have three of them
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//city on the top and fields on the rest of the sides //five tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		//city on left and right with a shield//two tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
				
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//city on top and bottom //one tile in the game 
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		//city on the left and right but not though the center//three tiles in the game 
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//city on the bottom and right side but not though center// two tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//city on the top and road on the bottom and right //three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		//road on top and left and city on the right//three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//road on the top bottom and left and city on the right//three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//city top and left and it has a sheild. field on the bottom and right//two tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		//city top and left field on the bottom and right//three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
				
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
				new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
				new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		//city top and left road on the bottom and right it also has a sheild//two tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		//city top and left road on the bottom and right//three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
				
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		//city on top left and right it has a sheild field on the bottom // one tile in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//city on the top left and right and field on the bottom//three tile in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//city on top left and right with a shield and a road on the bottom//two tile in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
		
		//city on top left and right and a road on the bottom//one tile in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY)));
				
		//road on top and bottom//8 tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		//road on bottom and left//9 tile in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));	
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));	
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));	
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));	
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD)));
		
		//road on bottom left and right //four tile in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
		
		//road on the top bottom left and right //one tile in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD)));
	
	Collections.shuffle(_deck);//it is mixing up the deck 
	}
	
	
	/**
	 * tell us how many tiles are in the deck
	 * @return the size of the deck
	 */
	public int getTilesRemaning(){
		return _deck.size();
	}
	
	/**
	 *this removes a tile from the deck  
	 * @return the tile you just took out of th edeck
	 */
	public BaseTile getNextTile(){
		if(getTilesRemaning() > 0){
			return _deck.remove(0);
		}
		return null; 
	}
	/**
	 * @return
	 */
	public BaseTile nextTile(){
		return _deck.get(0);
	}
	
	
	

}
