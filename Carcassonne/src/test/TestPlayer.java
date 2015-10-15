package test;

import static org.junit.Assert.*;

import org.junit.Test;
import code.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPlayer {

	Player player1;
	Player player2;
	Player player3;
	
	@Before 
	public void setUp(){
	    player1 = new Player("Dan");
		player2 = new Player("Matt");
		player3 = new Player("Deanna");
	}
	
//	@After
//    public void tearDown() {
//       
//    }
	
	@Test
	public void testEquals() {
		boolean expected = false;
		boolean actual = player1.equals(player2);
		assertTrue(expected == actual);
	}//End Test 

	@Test
	public void testGetNumberOfMeeples() {
		int expected = 7;
		int actual = player1.getNumMeeples();
		assertTrue(expected == actual);
	}//End Test
	
	@Test
	public void testsetNumberofMeeples() {
		int expected = 5;
		player1.setNumMeeples(5);
		int actual = player1.getNumMeeples();
		assertTrue(expected == actual);
	}//End Test
	
	@Test
	public void testGetName() {
		String expected = "Matt";
		String actual = player2.getName();
		assertTrue(expected.equals(actual));
	}//End Test
	
	@Test
	public void testGetId() {
		int expected = 2;
		int actual = player2.getId();
		assertTrue(expected == actual);
	}//End Test
	
	@Test
	public void test2GetId() {
		int expected = 1;
		int actual = player2.getId();
		assertTrue(expected != actual);
	}//End Test
	
}
