/**
 *  @author Jesus Canez 
 *  @id	    CSE-360-85141
 *  assignment2
 */ 

package cse360assign2;


import java.lang.String;

/**
 * The AddingMachine  Class contains a constructor and various
 * methods that perform various mathematical
 * calculations in addition there is a clear method  
 *
 */

public class AddingMachine {
	private int	total;
	private String computations = "0";
	
	/**
	 * constructor sets the initial value of the local 
	 * variable total to zero
	 */
	
	public AddingMachine()
	{
		total = 0; 	// not needed - included for clarity
	}
	
	/**
	 * getTotal returns the current value of the local
	 * variable total
	 * 
	 * @return the current value of total
	 */
	
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * the add method takes in a value and adds it to
	 * the current value of total
	 * 
	 * @param value an integer to be added to total
	 */
	
	public void add (int value)
	{
		total = total + value;
		computations = computations + " + " + Integer.toString(value);
	}
	
	/**
	 * the subtract method takes in a value and subtracts
	 * it from the local total variable 
	 * 
	 * @param value   an integer to be subtracted from total
	 */
	
	public void subtract (int value)
	{
		total = total - value;
		computations = computations + " - " + Integer.toString(value);
	}
	
	/**
	 * toString method that currently returns an
	 * empty string 
	 *  
	 * @return returns a string 
	 */
	
	
	public String toString ()
	{
		return computations;
	}
	
	/**
	 * the clear method resets the 
	 * computations String and set the 
	 * total value back to zero
	 */
	
	public void clear ()
	{
		total = 0;
		computations = "0";
	}
}
