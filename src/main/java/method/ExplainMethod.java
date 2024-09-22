package method;

public class ExplainMethod {
	/*
	 *   main is a special method
	 *   main method is the starting point of execution
	 *   main method always static and void
	 *   normally do not write logic in the main method
	 */

	/*
	 * there are two types of method
	 *    void method
	 *    return type method
	 */
	
	/*
	 *    void method
	 *  return is final-- no further action can be don on it
	 */
	
	String firstName;
	static String lastName="Chowdhury";
	
	public static void main(String[] args) {
		ExplainMethod em= new ExplainMethod();
		em.fullName();
		
		
		// return method
		em.fullNameCalculation();
		System.out.println(em.fullNameCalculation().toUpperCase());
		System.out.println(em.fullNameCalculation().equalsIgnoreCase("Alo Chowdhury"));
		
	}

	public void fullName() {
		firstName="Alo";
		String fullName=firstName+" "+lastName;
		System.out.println(fullName);
	}
	
	public String fullNameCalculation() {
		firstName="Alo";
		String fullName=firstName+" "+lastName;
		System.out.println(fullName);
		return fullName;
	}
	
}
