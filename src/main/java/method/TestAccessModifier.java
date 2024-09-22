package method;

import accessModifier.DefaultAccessModifier;
import accessModifier.ProtectedAccessModifier;
import accessModifier.PublicAccessModifier;

public class TestAccessModifier extends ProtectedAccessModifier{

	public static void main(String[] args) {
		PublicAccessModifier pam =new PublicAccessModifier();
		pam.fullName();
		DefaultAccessModifier  dam = new DefaultAccessModifier();
		//dam.tutionFee();
		ProtectedAccessModifier pam3= new ProtectedAccessModifier();
		pam3.javaClassAccess();
		

	}

}
