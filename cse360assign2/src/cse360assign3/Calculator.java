package cse360assign3;

public class Calculator extends AddingMachine {
	
	/**
	 * the mult method takes in a value and multiplies it with
	 * the current value of total
	 * 
	 * @param value an integer to be multiplied with total
	 */
	
	public void mult (int value)
	{
		total = total * value;
		computations = computations + " * " + Integer.toString(value);
	}
	
	/**
	 * the divide method takes in a value and divides the current value of total
	 * 
	 * @param value an integer to be a divisor of total
	 */
	
	public void div  (int value)
	{
		if(value == 0) {
			total = 0;
			computations = computations + " / " + Integer.toString(value);
		}
		else {
		total = total / value;
		computations = computations + " / " + Integer.toString(value);
		}
	}
	
	/**
	 * the power method takes in a value and raised total to the power 
	 * 
	 * @param value an integer to be used as an exponent to raise total to. 
	 */
	
	public void power (int value)
	{
		if(value < 0) {
			total = 0;
			computations = computations + " ^ " + Integer.toString(value);
		}
		else {
		total = (int) Math.pow(total,value);
		computations = computations + " ^ " + Integer.toString(value);
		}
	}


}
