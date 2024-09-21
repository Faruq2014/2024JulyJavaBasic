package dataType;

public class PrimitiveDataType {
/*
 * there are two types of number 
 *    full number
 *        byte--8bits
 *        short--16bits
 *        integer--32bits
 *        long--64bits
 *    decimal number
 *         float--32bits
 *         double--64bits
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// double // means blocking a single code
		
		/*
		 * this is how you block
		 * multiple lines of code
		 */
		
		
		System.out.println("Hello Java");
		
		
		PrimitiveDataType pdt= new PrimitiveDataType ();
		pdt.fullNumberCalculations();
		pdt.decimalNumberCalculations();

	}

	public void fullNumberCalculations() {
		
	  long	soccerBall=30;
	  //short is the data type
	  // soccerBall is the variable name
	  //= is a operator
	  //30= is the value of a variable/soccerBall
	  //; is end of the line
	  
	 int  jersey=65;
	 
	long  spentTotal=soccerBall + jersey;
	//if you have mix and match data type them took super/bigger data 
	// type for calculations
	
	System.out.println(spentTotal);
	 
	}
	
public void decimalNumberCalculations() {
	
	double savingAC=5678.50;
	float BAcreditCard=499.99999f;
	double balance=savingAC-BAcreditCard;
	System.out.println(balance);
}

public void characterDataType() {
	char firstAlpahbet='A';
	System.out.println(firstAlpahbet);
}




}
