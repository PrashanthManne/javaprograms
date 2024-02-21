package learnif;

public class Methodinmethod {

	void m1 ()
	{
		System.out.println("m1 calling ");
		m2();
		m2();
	}
	
	void m2 ()
	{
	
		System.out.println("m2 calling ");
	}
	
	public static void main(String[] args) {
		
		Methodinmethod m = new Methodinmethod ();
		m.m1();
		
	}
}
