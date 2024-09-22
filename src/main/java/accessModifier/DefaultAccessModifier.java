package accessModifier;

public class DefaultAccessModifier {
	/*
	 * default access modifier
	 *     from it's own class
	 *     from same package possible 
	 */

	public static void main(String[] args) {
		DefaultAccessModifier dam = new DefaultAccessModifier();
		dam.tutionFee();

	}
	
  void tutionFee() {
		System.out.println("I am a default access modifier");
	}

}
