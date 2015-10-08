package test;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import code.BaseTile;
import code.Board;
import code.Edge;
import code.Feature;

public class TestBoard {

	// Board creation with test tiles 
	Board board = new Board();
	BaseTile testTile1 = new BaseTile(
		new Edge(Feature.CITY, Feature.CITY, Feature.CITY),//Top edge
		new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), //Bottom edge
		new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),//Left Edge
		new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD));//Right Edge
	
	BaseTile testTile2 = new BaseTile(
			new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD),//Top edge
			new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), //Bottom edge
			new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),//Left Edge
			new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD));//Right Edge
				
	// Test canBePlaced Method 
	@Test
	public void canBePlacedTest1() {
		boolean expected = false;
		boolean actual = board.canBePlaced(new Point(0,0),testTile1);
		assertEquals(expected,actual);	
	}
	@Test
	public void canBePlacedTest2() {
		boolean expected = false;
		boolean actual = board.canBePlaced(new Point(1,0),testTile1);
		assertEquals(expected,actual);	
	}
	@Test
	public void canBePlacedTest3() {
		boolean expected = true;
		boolean actual = board.canBePlaced(new Point(-1,0),testTile2);
		assertEquals(expected,actual);	
	}
	
/* --------------------------------------------------------   */
	
	// Tests for placeTile method 
		@Test
		public void placeTileTest1() {
			boolean actual = board.place((new Point(-1,0)), testTile2);
			boolean expected = true;
			assertEquals(expected,actual);
		}
		
		@Test
		public void placeTileTest2() {
			testTile1.RotateLeft();
			boolean actual = board.place((new Point(0,-1)), testTile1);
			boolean expected = true;
			assertEquals(expected,actual);
		}
	
/* --------------------------------------------------------   */
		
	// Tests for adjacent tile test method
	@Test
	public void adjacentTileTest1() {
		
		BaseTile[] expected = {null,null,testTile1,testTile2};
		BaseTile[] actual = board.adjacentTile(new Point(0,0));
		
		boolean compare = true;
		for(int i = 0; i < actual.length;i++){
			if( actual[i] != expected[i]){
				compare = false;
			}
		}
		assertTrue("fail",compare);
		
	}
	
	
	
	
}
