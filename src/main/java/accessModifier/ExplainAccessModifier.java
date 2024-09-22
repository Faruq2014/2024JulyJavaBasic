package accessModifier;

public class ExplainAccessModifier {
	/*how many access modifier
	 *    public==access from any where
	 *    
	 *    protected== same class== yes
	 *                same package== yes
	 *                different package=yes with inheritance
	 *                 
	 *      default== same class==yes
	 *                same package=yes
	 *                Different package=no
	 *                
	 *    private== only same class
	 * 
	 */

	public static void main(String[] args) {
		PublicAccessModifier pam = new PublicAccessModifier();
		//pam.fullName();
		
		DefaultAccessModifier dam = new DefaultAccessModifier();
		dam.tutionFee();
		PrivateAccessModifier pam1 = new PrivateAccessModifier();
		//pam1.money();
		ProtectedAccessModifier pam3= new ProtectedAccessModifier();
		pam3.javaClassAccess();
		

	}

}
