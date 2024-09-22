package variables;

public class ChowdhuryFamily {
	
	static String lastName="Chowdhury";
	String firstName;

	public static void main(String[] args) {
		
		ChowdhuryFamily cf= new ChowdhuryFamily();
		cf.rumki();
		cf.alo();
		cf.moppy();
	}
	
	public void rumki() {
		firstName="Rumki";
		System.out.println(firstName);
		System.out.println(firstName+" "+lastName);
		double chekingAc=3000.99;
		System.out.println(firstName+" "+lastName+ " has "+chekingAc);
		
		
	}
	
	public void alo() {
		firstName="Alo";
		System.out.println(firstName);
		System.out.println(firstName+" "+lastName);
		double chekingAc=2000.99;
		System.out.println(firstName+" "+lastName+ " has "+chekingAc);
	}
	
   public void moppy() {
	   firstName="Moppy";
	   lastName="Shaikh";
		System.out.println(firstName);
		System.out.println(firstName+" "+lastName);
		double chekingAc=300.99;
		System.out.println(firstName+" "+lastName+ " has "+chekingAc);
		
	}

}
