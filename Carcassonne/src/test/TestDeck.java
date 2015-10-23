package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Deck;


public class TestDeck {

	/**
	 * Test for checking number of elements in deck
	 * and that getNextTile removes one element from the 
	 * deck ArrayList.
	 */
	@Test
	public void tilesRemaingTest() {
	    
		Deck deck = new Deck();
		assertEquals(71,deck.getTilesRemaning());
		deck.getNextTile();
		assertEquals(70,deck.getTilesRemaning());
	  }
	
	@Test
	public void isEmptyTest() {
		Deck deck = new Deck();
		for (int i = 71; i>0; i-- ){
		deck.getNextTile();
		}
		assertEquals(true,deck.isEmpty());
	  }
	
	

}
