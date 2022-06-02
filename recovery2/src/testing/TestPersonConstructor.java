package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.Person;

public class TestPersonConstructor {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(true);
	}
	

//	CORRECT
	@Test
	public void testConformance() throws Exception {
		assertTrue(true);
	}
	
	@Test
	public void testOrdering() throws Exception {
		assertTrue(true);	
	}
	
	@Test
	public void testRangeForResult() throws Exception {
		assertTrue(true);
	}
	
	@Test
	public void testRangeInput() throws Exception {
		assertTrue(true);
	}
	
	@Test //not expecting error
	public void testRangeInput2() throws Exception {
		assertTrue(true);
	}
	
	@Test
	public void testExistance() throws Exception {
		assertTrue(true);
	}
	
	@Test
	public void testCardinality() throws Exception {
		assertTrue(true);
	}

}
