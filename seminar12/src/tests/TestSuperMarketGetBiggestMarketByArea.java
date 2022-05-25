package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.ETypeMarket;
import classes.Market;
import classes.SuperMarket;
import exceptions.ExceptionMarket;

public class TestSuperMarketGetBiggestMarketByArea {
	
	static Market m1;
	static Market m2;
	static Market m3;
	static Market m4;
	static Market m5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("SetupBeforeClass");
		
		m1 = new Market("MageImage", 20, ETypeMarket.BEAUTY);
		m2 = new Market("Douglas", 25, ETypeMarket.BEAUTY);
		m3 = new Market("MageImage", 20, ETypeMarket.BEAUTY);
		m4 = new Market("MageImage", 20, ETypeMarket.BEAUTY);
		m5 = new Market("MageImage", 20, ETypeMarket.BEAUTY);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("TearDownClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("SetUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TearDown");
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	// Right BICEP
	@Test
	public void testRight() {
		System.out.println("TestRight");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);
		listM.add(m4);
		listM.add(m5);
		
		
		SuperMarket sm = new SuperMarket("MAll Buc", listM);
		try {
			
			Market result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			
			String expected = "MegaImage";
			
			if(result.getName().equals(expected)) {
				assertTrue(true);
			} else {
				assertTrue(false);
			}
			
//			assertEquals(expected, result.getName());
			
		} catch (ExceptionMarket e) {
			e.printStackTrace();
			fail("I'm not expecting to fail - not good!");
		}
	}
	
	@Test 
	public void testBoundary() {
		System.out.println("TestRight");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);

		SuperMarket sm = new SuperMarket("Mall Bucharest", listM);

		Market result;
		try {
			
			result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);

			assertEquals("MegaImage", result.getName());
			
		} catch (ExceptionMarket e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("NOT OK!");
		}
	}
	
	@Test
	public void testException() {
		ArrayList<Market> listM = new ArrayList<Market>();
		SuperMarket sm = new SuperMarket("Mall Vitan", listM);
		try {
			
			sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			//?
			fail("NOT OK!");
			
		} catch (ExceptionMarket e) {
			e.printStackTrace();
			
			//?			
			assertTrue("it's working", true);
//			assertEquals(10.2, 10.3, 0.5);
		}
	}
	
	@Test
	public void testPerformance() throws ExceptionMarket {
		System.out.println("TestPerformance");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);
		listM.add(m4);
		listM.add(m5);
		
		double startTime = System.currentTimeMillis();
		SuperMarket sm = new SuperMarket("MAll Buc", listM);
		sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		double stopTime = System.currentTimeMillis();
		
		assertTrue("it's fast!", stopTime - startTime < 5);
	}
	
	public Market getLargestMarket(ArrayList<Market> list, ETypeMarket marketType) {
		
		Market m = null;
		
		//?
		//sort the list by Area(TYPE
		
		return m;
	}
	
	@Test
	public void testCrossCheck() throws ExceptionMarket {
		System.out.println("TestCrossCheck");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);
		listM.add(m4);
		listM.add(m5);		
		SuperMarket sm = new SuperMarket("MAll Buc", listM);
		
		Market expected = getLargestMarket(listM, ETypeMarket.BEAUTY);
		Market actualResult = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		assertEquals(expected, actualResult);
		
	}
	
	@Test 
	public void testInversion() throws ExceptionMarket {
		System.out.println("TestInversion");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);
		listM.add(m4);
		listM.add(m5);		
		SuperMarket sm = new SuperMarket("MAll Buc", listM);
		
		Market result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		for(int i = 0; i < listM.size(); i++) {
			if(result.getName().equals(listM.get(i))) {
				//maxArea
				//->save position
			}
		}
		
		// -> check if the position is between [0, listM.size()]
	}

}
