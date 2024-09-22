package accessModifier;

public class PrivateAccessModifier {
	/*
	 * access only same class
	 */

	public static void main(String[] args) {
		PrivateAccessModifier pam = new PrivateAccessModifier();
		pam.money();

	}
	
	private void money() {
		System.out.println("I am private method");
	}

}
