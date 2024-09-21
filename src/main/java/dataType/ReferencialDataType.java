package dataType;

public class ReferencialDataType {

	public static void main(String[] args) {
		ReferencialDataType rdt= new ReferencialDataType();
		rdt.fullName();
		rdt.concatenation();

	}
	
	public void fullName() {
		/*
		 *  when you declare String data type
		 *  JVC does not know the length of the data
		 *  as a results it is put unlimited space
		 */
	String	firstName="Alo";
	
	/*
	String is the data type
	 firstName is the variable name
	 = is a operator
	  " " this is called String or double quotation
	  you must have " " for String data type
	    Alo= is the value of a variable/firstName
	
	  ; is end of the line
	  */
	
	String lastName="Chowdhury";
	
	String fullName=firstName+lastName; 
	// only addition is allow for string data type
	System.out.println(fullName);
	}
	
	public void concatenation() {
		//Concatenation is manually add some String
		String	firstName="Alo";
		System.out.println("my first Name is "+firstName );
		String lastName="Chowdhury";
		System.out.println("my last Name is "+lastName );
		String fullName=firstName+" "+ lastName;
		System.out.println(" my full name is "+fullName);
		
	}

}
