package uebung6;

import static org.junit.Assert.*;

import org.junit.Test;

public class Uebung6Test {

	@Test
	public void testMethod1Euler() {
		double test1 = Euler.eulerZahlBerechnung(20, 1);
		double test2 = Euler.eulerZahlBerechnung(1000, 1);
		double test3 = Euler.eulerZahlBerechnung(20, 0);
		
		assertEquals(2.71828,test1,0.00001);
		assertEquals(Double.POSITIVE_INFINITY,test2,0.00001);
		assertEquals(1.0,test3,0.00001);
	}
	
	@Test
	public void testMethod2Quersumme() {
		assertEquals(24,Quersumme.quersumme(12342354));
		assertEquals(12,Quersumme.quersumme(3333));
		assertEquals(81,Quersumme.quersumme(999999999));
	}

}
