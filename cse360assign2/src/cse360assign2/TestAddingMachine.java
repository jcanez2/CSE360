/**
 * @author Jesus Canez
 * @id	    CSE-360-85141
 *  assignment2
 */

package cse360assign2;

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
}
