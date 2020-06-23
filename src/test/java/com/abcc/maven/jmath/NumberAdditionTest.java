package com.abcc.maven.jmath;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class NumberAdditionTest {

	@Test
	public void A2N_TestCase1() {	
		//NumberAdditions TestNA;
		//TestNA = new NumberAdditions();
		long iResult = NumberAdditions.add2numbers(15, 25);
		assertEquals(iResult, 40);
	}
	
	@Test
	public void A2N_TestCase2() {
	
		//NumberAdditions TestNA;	
		//TestNA = new NumberAdditions();
		long iResult = NumberAdditions.add2numbers(30, 25);
		assertEquals(iResult, 55);
	}
	
	@Ignore
	@Test
	public void A2N_TestCase3() {
	
		//NumberAdditions TestNA;
		//TestNA = new NumberAdditions();
		long iResult = NumberAdditions.add2numbers(75, 25);
		assertEquals(iResult, 100);
	}
	
	@Ignore
	@Test
	public void A2N_TestCase4() {
	
		//NumberAdditions TestNA;
		//TestNA = new NumberAdditions();
		long iResult = NumberAdditions.add2numbers(85, 25);
		assertEquals(iResult, 100);
	}
	
	@Test
	public void A3N_TestCase1() {
	
		//NumberAdditions TestNA;		
		//TestNA = new NumberAdditions();
		long iResult = NumberAdditions.add3numbers(15, 25, 30);
		assertEquals(iResult, 70);
	}
	
	@Test
	public void A3N_TestCase2() {
	
		//NumberAdditions TestNA;		
		//TestNA = new NumberAdditions();
		long iResult1 = NumberAdditions.add3numbers(15, 25, 30);
		long iResult2 = NumberAdditions.add3numbers(30, 18, 22);
		assertEquals(iResult1, iResult2);
	}
	
	@Test
	public void A3N_TestCase3() {
	
		//NumberAdditions TestNA;	
		//TestNA = new NumberAdditions();
		long iResult = NumberAdditions.add3numbers(80, 20, 30);
		assertEquals(iResult, 130);
	}
	
	@Test
	public void A3N_TestCase4() {
	
		//NumberAdditions TestNA;		
		//TestNA = new NumberAdditions();
		long iResult = NumberAdditions.add3numbers(10, 20, 30);
		assertEquals(iResult, 60);
	}
	
	@Ignore
	@Test
	public void A3N_TestCase5() {
	
		//NumberAdditions TestNA;		
		//TestNA = new NumberAdditions();
		long iResult = NumberAdditions.add3numbers(11, 20, 30);
		assertEquals(iResult, 60);
	}
	
	//adding new float functions
	//@SuppressWarnings("deprecation")
	@Test
	public void A4N_TestCase1() {
	
		double dResult = NumberAdditions.add4numbers(50.12, 45.52, 66.74, 31.90);
		assertEquals(dResult, 194.28, 0);
	}
}
