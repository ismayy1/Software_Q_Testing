/**
 * 
 */
package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import classes.Person;
import classes.PersonFake;
import classes.SlowTestClass;

public class TestPersonCalcAvgCosts {

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
	
//	CORRECT
	
	@Category(SlowTestClass.class)
	@Test //SLOW
	public void testConformance() throws Exception {
		// Correct format / is there a valid
		int[] costs = {20, 30, 10, 70, 95, 100};		
		Person person = new Person();
		person.setCostReceipts(costs);
		double result = person.calcAvgCosts();
		double expected = 54.16; //54.(6)
		assertEquals(expected, result, 0.2);
	}
	
	@Test //Test simple
	public void testOrdering() throws Exception {
		int[] costs = {100, 70, 20, 10, 95, 30};		
		PersonFake person = new PersonFake();
		person.setCostReceipts(costs);
		double result = person.calcAvgCosts();
		double expected = 54.16; //54.(6)
		assertEquals(expected, result, 0.2); //checking the results		
	}
	
	@Test
	public void testRangeForResult() throws Exception {
//		result
		int[] costs = {100, 70, 20, 10, 95, 30};		
		Person person = new Person();
		person.setCostReceipts(costs);
		double result = person.calcAvgCosts();
		double expected = 54.16; //54.(6)
//		assertEquals(expected >= 0 && result <= 200); //checking the results	
	}
	
	@Test(expected = Exception.class)
	public void testRangeInput() throws Exception {
//		result
		int[] costs = {100, -70, 20, 10, 95, 30};		
		Person person = new Person();
		person.setCostReceipts(costs);
		double result = person.calcAvgCosts();
//		double expected = 54.16; //54.(6)
//		assertEquals(expected >= 0 && result <= 200); //checking the results	
	}
	
	@Test //not expecting error
	public void testRangeInput2() throws Exception {
//		result
		int[] costs = {100, -70, 20, 10, 95, 30};		
		Person person = new Person();
		person.setCostReceipts(costs);	
		try {
			person.calcAvgCosts();
			fail("range input test not throwing exception");
		} catch (Exception e) {
//			e.printStackTrace();
			assertTrue(true);
		}
	}
	
	@Category(SlowTestClass.class)
	@Test (expected = Exception.class) //SLOW
	public void testExistance() throws Exception {
		int[] costs = {};
		Person person = new Person();
		person.setCostReceipts(costs);
		person.calcAvgCosts(); // expect an error
	}
	
	@Category(SlowTestClass.class)
	@Test //SLOW
	public void testCardinality() throws Exception {
//		1 val
		int[] costs = {90};
		Person person = new Person();
		person.setCostReceipts(costs);
		person.calcAvgCosts(); // not expecting an error, because we have only one value
		assertEquals(1, person.getCostReceipts().length);
	}

}
