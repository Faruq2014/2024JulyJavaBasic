package variables;

public class LocalVariable {
	
	/*
	 * life of the local variable is inside the method
	 * you must initialize the value of a local variable
	 * only final access modifier is allow for local variable
	 */

	public static void main(String[] args) {
		LocalVariable lv = new LocalVariable();
		lv.bankAccount();
	}
	
	
	public void bankAccount() {
		final double chckingAccount=5000.99;
		int deposited=2000;
		
		System.out.println(chckingAccount);
	}
	
	
	public void creditAccount() {
		float tShirt=45.99f;
		double soccerShoes=90.50;
	}

}
