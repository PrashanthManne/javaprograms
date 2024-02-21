package learnif;

public class methodtypes {
	int a ;
	int b;
	void add ()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(" additon of two numbers  " +(a + b));
	}

	void sub ()
	{
		System.out.println(" value of a = " +a +" values of b =" + b );
		System.out.println("subtraction of two numbers " + (a - b));
	}
	void mul ()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("multiplication of two  numbers " + (a * b));
	}
	void div ()
	{
		try
		{
		System.out.println(" value of a = " +a +" values of b =" + b );
		System.out.println(" division  of two  numbers " + (a / b));
	}catch(Exception e	 )
			{
				System.out.println(e);
			}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodtypes m = new methodtypes();
		m.a = 10 ;
		m.b = 20;
		m.add();
		m.a = 44;
		m.b = 40;
		m.sub();
		m.a = 20;
		m.b= 5 ;
		m.mul();
		m.sub();
		m.mul();
		m.div();
		m.sub();
				
		
	}

}
