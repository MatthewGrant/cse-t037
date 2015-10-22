package test;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import code.BaseTile;
import code.Board;
import code.Edge;
import code.Feature;

public class TestBoard {

//	Board board;
//	BaseTile testTile1;
//	BaseTile testTile2;
	
	// Board creation with test tiles 
	
	
	// Test canBePlaced Method 
	@Test
	public void canBePlacedfail1() {
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


		
		boolean expected = false;
		boolean actual = board.canBePlaced(new Point(0,0),testTile1);
		assertEquals(expected,actual);	
	}
	
	@Test
	public void canBePlacedfail2() {
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


		
		boolean expected = false;
		boolean actual = board.canBePlaced(new Point(1,0),testTile1);
		assertEquals(expected,actual);	
	}
	
	@Test
	public void canBePlacedfail3() {
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

		boolean expected = false;
		boolean actual = board.canBePlaced(new Point(0,1),testTile1);
		assertEquals(expected,actual);	
	}
	@Test
	public void canBePlacedfail4() {
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

		boolean expected = false;
		boolean actual = board.canBePlaced(new Point(-1,0),testTile1);
		assertEquals(expected,actual);	
	}
	
	
	@Test
	public void canBePlacedPass1() {
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

		boolean expected = true;
		boolean actual = board.canBePlaced(new Point(-1,0),testTile2);
		assertEquals(expected,actual);	
	}
	
	@Test
	public void canBePlacedPass2() {
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


		
		boolean expected = true;
		boolean actual = board.canBePlaced(new Point(0,-1),testTile2);
		assertEquals(expected,actual);	
	}
	@Test
	public void canBePlacedPass3() {
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
		
		boolean expected = true;
		boolean actual = board.canBePlaced(new Point(0,1),testTile2);
		assertEquals(expected,actual);	
	}
	
	@Test
	public void canBePlacedPass4() {
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
		
		boolean expected = true;
		boolean actual = board.canBePlaced(new Point(0,-1),testTile1);
		assertEquals(expected,actual);	
	}
	
/* --------------------------------------------------------   */
	
	// Tests for placeTile method 
		@Test
		public void placeTilePass1() {
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
			
			boolean actual = board.place((new Point(-1,0)), testTile2);
			boolean expected = true;
			assertEquals(expected,actual);
		}
		
		@Test
		public void placeTilePass2() {
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

			testTile1.RotateLeft();
			boolean actual = board.place((new Point(1,0)), testTile1);
			boolean expected = true;
			assertEquals(expected,actual);
		}
	
		@Test
		public void placeTilePass3() {
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


			
			testTile1.RotateLeft();
			boolean actual = board.place((new Point(1,0)), testTile1);
			boolean expected = true;
			assertEquals(expected,actual);
		}
/* --------------------------------------------------------   */
		
	// Tests for adjacent tile test method
	@Test
	public void adjacentTileTest1() {
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


		
		board.place((new Point(0,-1)), testTile2);
		testTile1.RotateLeft();
		board.place((new Point(0,1)), testTile1);
		
		BaseTile[] expected = {testTile2,null,testTile1,null};
		BaseTile[] actual = board.adjacentTile(new Point(0,0));
		
		boolean compare = true;
		for(int i = 0; i < actual.length;i++){
			System.out.println(actual[i]);
			if( actual[i] != expected[i]){
				compare = false;
				
			}
		}
		assertTrue("fail",compare);
		
	}
	
	
	
	
}
