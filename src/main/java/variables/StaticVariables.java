package variables;

public class StaticVariables {
	
	/*
	 * it is a class level variable	 
	 * declaration is must but initialization is not
	 *  static must be in the declaration
	 * who ever need, they initialize the value.
	 * all the access modifier is allow
	 * static variable is ready to use all the time
	 */
	static String lastName="Chowdhury";
	String firstName;

	public static void main(String[] args) {
		

	}
	
	public void rumki() {
		firstName="Rumki";
		System.out.println(firstName);
		System.out.println(firstName+" "+lastName);
		
	}
	
	public void alo() {
		firstName="Alo";
		System.out.println(firstName);
		System.out.println(firstName+" "+lastName);
	}
	
   public void moppy() {
	   firstName="Moppy";
	   lastName="Shaikh";
		System.out.println(firstName);
		System.out.println(firstName+" "+lastName);
		
	}

}
