package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Deck;
import code.Edge;
import code.Feature;


public class TestDeck {

	/**
	 * Test for checking number of elements in deck
	 * and that getNextTile removes one element from the 
	 * deck ArrayList.
	 */
	@Test
	public void deckTest() {
	    
		Deck deck = new Deck();
		assertEquals(71,deck.getTilesRemaning());
		deck.getNextTile();
		assertEquals(70,deck.getTilesRemaning());
	  }
	

}
