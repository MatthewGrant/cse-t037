package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Edge;
import code.Feature;

public class TestEdge {

	@Test
	public void equalsFeature(){
		 assertTrue(Feature.ROAD.equals(Feature.ROAD));
		 assertFalse(Feature.ROAD.equals(Feature.CITY));
	}
	
	
	@Test
	public void equalsTest() {
	    Edge fff = new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD);
	    Edge frf = new Edge(Feature.FIELD,Feature.ROAD,Feature.FIELD);
	    Edge ccc = new Edge(Feature.CITY,Feature.CITY,Feature.CITY);
	    Edge frf2 = new Edge(Feature.FIELD,Feature.ROAD,Feature.FIELD);
	    assertTrue(!frf.equals(fff));
	    assertTrue(!fff.equals(ccc));
	    assertTrue(!ccc.equals(frf2));
	    assertTrue(frf.equals(frf2));
	   
	  }
	
}