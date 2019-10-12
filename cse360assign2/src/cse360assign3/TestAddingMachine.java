/**
 * @author Jesus Canez
 * @id	    CSE-360-85141
 *  assignment2
 */

package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * The TestAddingMachine class contains the various
 * methods that will test the various aspects of the
 * AddingMachine class 
 */

class TestAddingMachine {

/**
 * This method test to see that after you perform 
 * a number of mathematical calculations that total will
 * hold a correct positive number.	
 */
	
	@Test
	void testIntValue() {
	
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		int testTotal = myCalculator.getTotal();
		
		assertEquals(7,testTotal);
		
	}

/**
 * This method test to see that after you perform 
 * a number of mathematical calculations that total will
 * hold a correct negative number.	
 */
	
	@Test
	void testIntValue2() {
	
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.subtract(4);
		
		int testTotal = myCalculator.getTotal();
		
		assertEquals(-2,testTotal);
		
	}

/**
 * This method test to see that after you perform 
 * a number of mathematical calculations and then
 * use the clear method that total will hold the correct
 * value of zero 
 */
	
	@Test
	void testIntValue3() {
	
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		myCalculator.clear();
		
		int testTotal = myCalculator.getTotal();
		
		assertEquals(0,testTotal);
		
	}
	
	
/**
 * This method test to see that after you perform 
 * a number of mathematical calculations that 
 * toString method will return the correctly formated string 
 */
	
	@Test
	void testIntValue4() {
	
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		String testComputations = myCalculator.toString();
		
		assertEquals("0 + 4 - 2 + 5", testComputations);
		
	}

/**
 * This method test to see that after you perform 
 * a number of mathematical calculations and then clear 
 * that you will revert back to the default String in calculations
 * "0 " 
 */
	
	@Test
	void testIntValue5() {
	
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		myCalculator.clear();
		
		String testZero = myCalculator.toString();
		
		assertEquals("0", testZero);
		
	}
	
	
/**
 * This method test to see that after you perform 
 * a number of mathematical calculations and then does mult
 * to test the mult method 
 */
	
	@Test
	void testmultmethod() {
	
		Calculator myCalculator = new Calculator();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		myCalculator.mult(8);
		
		String testZero = myCalculator.toString();
		
		assertEquals("0 + 4 - 2 + 5 * 8", testZero);
		
		int testTotal = myCalculator.getTotal();
		
		assertEquals(56,testTotal);
	}
	
/**
 * This method test to see that after you perform 
 * a number of mathematical calculations and performs
 * the div method and checks for correct output 
 */
	
	@Test
	void testdivMethod() {
	
		Calculator myCalculator = new Calculator();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(6);
		myCalculator.div(8);
		
		String testZero = myCalculator.toString();
		
		assertEquals("0 + 4 - 2 + 6 / 8", testZero);
		
		int testTotal = myCalculator.getTotal();
		
		assertEquals(1,testTotal);
	}

/**
 * This method test to see that after you perform 
 * a number of mathematical calculations and then does the
 * power method and checks for correct output 
 */
	
	@Test
	void testpowerMethod() {
		Calculator myCalculator = new Calculator();

		myCalculator.add(4);

		myCalculator.subtract(2);

		myCalculator.add(6);

		myCalculator.power(2);
		
		String testZero = myCalculator.toString();
		
		assertEquals("0 + 4 - 2 + 6 ^ 2", testZero);
		
		int testTotal = myCalculator.getTotal();
		
		assertEquals(64,testTotal);
	}
		
/**
 * This method test to see that after you perform 
 * a number of mathematical calculations and then does the
 * div method with 0 as the value and checks for correct output 
 */
	
	@Test
	void testdivZero() {
		Calculator myCalculator = new Calculator();

		myCalculator.add(4);

		myCalculator.subtract(2);

		myCalculator.add(6);

		myCalculator.div(0);
		
		String testZero = myCalculator.toString();
		
		assertEquals("0 + 4 - 2 + 6 / 0", testZero);
		
		int testTotal = myCalculator.getTotal();
		
		assertEquals(0,testTotal);
	}

/**
 * This method test to see that after you perform 
 * a number of mathematical calculations and then does the
 * power method with a negative value and checks for correct output 
 */
	
	@Test
	void testPowerNeg() {
		Calculator myCalculator = new Calculator();

		myCalculator.add(4);

		myCalculator.subtract(2);

		myCalculator.add(6);

		myCalculator.power(-2);
		
		String testNeg = myCalculator.toString();
		
		assertEquals("0 + 4 - 2 + 6 ^ -2", testNeg);
		
		int testTotal = myCalculator.getTotal();
		
		assertEquals(0,testTotal);
	}

	
}
