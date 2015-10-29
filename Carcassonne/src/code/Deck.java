package code;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	private ArrayList<BaseTile> _deck ;
	
	//all the tiles that can be placed in the game and what features on the sides and what is a t the center
	public Deck(){
		
		_deck = new ArrayList<BaseTile>(); //there are 72 because the stater tile is not inclued
		
		// please note the comments thay tell you what that card should have on it if it is wrong you can esaly change it 
		
		//road on the bottom. church in the center//two tile in game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), //top
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),//bottom
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),//left
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),//right
		        new Center(Feature.MONASTERY),new Point(0,0)));///this one has a center feature because of the monastery the other don't need it unless there is something there
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY),new Point(0,0)));
		
		// all side field but there is a church in the center//four tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY),new Point (1,0)));//it is like a grid of point realed to the img's on the spread sheet so that each tile will get the correct img
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY),new Point (1,0)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY),new Point (1,0)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
                new Center(Feature.MONASTERY),new Point (1,0)));
		
		//all sides city with a shield// one tile in game 
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
                new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
                new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
                new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (2,0)));
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//road on the top and bottom and a city on the right // four tiles in the game
		//this is the starting tile so i will only have three of them
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (3,0)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (3,0)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (3,0)));
		
		//city on the top and fields on the rest of the sides //five tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (4,0)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (4,0)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (4,0)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (4,0)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (4,0)));
		
		//city on left and right with a shield//two tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (0,1)));
				
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (0,1)));
		
		//city on top and bottom //one tile in the game 
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,1)));
		
		//city on the left and right but not though the center//three tiles in the game 
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (2,1)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (2,1)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (2,1)));
		
		
		//city on the bottom and right side but not though center// two tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (3,1)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (3,1)));
		
		//city on the top and road on the bottom and right //three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (4,1)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (4,1)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (4,1)));
		
		//road on top and left and city on the right//three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (0,2)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (0,2)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (0,2)));
		
		//road on the top bottom and left and city on the right//three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (1,2)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (1,2)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (1,2)));
		
		//city top and left and it has a sheild. field on the bottom and right//two tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (2,2)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (2,2)));
		
		//city top and left field on the bottom and right//three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (3,2)));
				
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
				new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
				new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (3,2)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (3,2)));
		
		//city top and left, road on the bottom and right it also has a sheild//two tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (4,2)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (4,2)));
		
		
		
		//city top and left road on the bottom and right//three tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (0,3)));
				
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (0,3)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (0,3)));
		
		//city on top left and right it has a sheild field on the bottom // one tile in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (1,3)));
		
		//city on the top left and right and field on the bottom//three tile in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (2,3)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (2,3)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (2,3)));
		
		//city on top left and right with a shield and a road on the bottom//two tile in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (3,3)));
		
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (3,3)));
		
		//city on top left and right and a road on the bottom//one tile in the game
		_deck.add(new BaseTile(new Edge(Feature.CITY, Feature.CITY, Feature.CITY), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),
		        new Edge(Feature.CITY, Feature.CITY, Feature.CITY),new Point (4,3)));
				
		//road on top and bottom//8 tiles in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (0,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (0,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (0,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (0,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (0,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (0,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (0,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (0,4)));
		
		//road on bottom and left//9 tile in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,4)));	
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,4)));	
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,4)));	
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,4)));	
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),new Point (1,4)));
		
		//road on bottom left and right //four tile in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (2,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (2,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (2,4)));
		
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (2,4)));
		
		//road on the top bottom left and right //one tile in the game
		_deck.add(new BaseTile(new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), 
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),
		        new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),new Point (3,4)));
	
	Collections.shuffle(_deck);//it is mixing up the cards in the deck 
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
		if(isEmpty()){
			return null;
		}
		return _deck.remove(0);
	}
	/**
	 * to get the next tile in teh deck
	 * @return the next tile in the deck
	 */
	public BaseTile nextTile(){
		return _deck.get(0);
	}

	/**
	 * tells us if theire are no more tiles in the deck
	 * @return if the are no more tiles in the deck
	 */
	public boolean isEmpty() {
		return _deck.isEmpty();
	}
	
	
	

}
