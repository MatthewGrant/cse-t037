package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.BaseTile;
import code.Edge;
import code.Feature;

public class TestBaseTile {

	//Create tile to test 
	private BaseTile tile = new BaseTile(
	new Edge(Feature.CITY, Feature.CITY, Feature.CITY),//Top edge
	new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD), //Bottom edge
	new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD),//Left Edge
	new Edge(Feature.FIELD, Feature.ROAD, Feature.FIELD));//Right Edge
	
	@Test
	public void methodsTest() {
		
		//Test all the get methods
		assertTrue(new Edge(Feature.CITY,Feature.CITY,Feature.CITY).equals(tile.getTop()));
		assertTrue(new Edge(Feature.FIELD,Feature.ROAD,Feature.FIELD ).equals(tile.getBottom()));
		assertTrue(new Edge(Feature.FIELD,Feature.FIELD,Feature.FIELD ).equals(tile.getLeft()));
		assertFalse(new Edge(Feature.FIELD,Feature.FIELD,Feature.FIELD ).equals(tile.getRight()));
	
		// test Rotate right method
		tile.RotateRight();
		assertTrue(new Edge(Feature.FIELD,Feature.FIELD,Feature.FIELD).equals(tile.getTop()));
		assertTrue(new Edge(Feature.FIELD,Feature.ROAD,Feature.FIELD).equals(tile.getBottom()));
		assertTrue(new Edge(Feature.FIELD,Feature.ROAD,Feature.FIELD).equals(tile.getLeft()));
		assertTrue(new Edge(Feature.CITY,Feature.CITY,Feature.CITY).equals(tile.getRight()));
		 
		// test Rotate left method
		tile.RotateLeft();
		assertTrue(new Edge(Feature.CITY,Feature.CITY,Feature.CITY).equals(tile.getTop()));
		assertTrue(new Edge(Feature.FIELD,Feature.ROAD,Feature.FIELD ).equals(tile.getBottom()));
		assertTrue(new Edge(Feature.FIELD,Feature.FIELD,Feature.FIELD ).equals(tile.getLeft()));
		assertFalse(new Edge(Feature.FIELD,Feature.FIELD,Feature.FIELD ).equals(tile.getRight()));
	
		
	}

}
