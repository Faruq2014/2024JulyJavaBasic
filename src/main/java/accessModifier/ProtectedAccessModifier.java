package accessModifier;

public class ProtectedAccessModifier {

	public static void main(String[] args) {
		
		ProtectedAccessModifier pam3= new ProtectedAccessModifier();
		pam3.javaClassAccess();
		
	}
 protected static void javaClassAccess() {
	 System.out.println("I am protected method");
 }
 
}
