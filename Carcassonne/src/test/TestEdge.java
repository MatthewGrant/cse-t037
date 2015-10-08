package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Edge;
import code.Feature;

public class TestEdge {

	@Test
	public void equalsTest() {
	    Edge ee = new Edge(Feature.FIELD, Feature.FIELD, Feature.FIELD);
	    Edge ero = new Edge(Feature.FIELD,Feature.ROAD,Feature.FIELD);
	    Edge eri = new Edge(Feature.CITY,Feature.CITY,Feature.CITY);
	    Edge ee2 = new Edge(Feature.FIELD,Feature.ROAD,Feature.FIELD);
	    assertTrue(!ee.equals(ero));
	    assertTrue(!ee.equals(eri));
	    assertTrue(!ero.equals(eri));
	    assertTrue(ero.equals(ee2));
	   
	  }
	
}