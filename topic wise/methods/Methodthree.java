package learnif;

public class Methodthree {
	void add(int a , int b)
	{
	System.out.println("the sum of two numbers " + (a+b));	
	}
	void add(int a , int b , int c)
	{
	System.out.println("the sum of three numbers " + (a+b+c));	
	}
	void circle(int rad , double pi )
	{
	System.out.println("Area of the circle " + (pi*(rad*rad)));	
	}
	void rect(int len , int bre)
	{
	System.out.println("Area of rectangle " + (len * bre));	
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodthree t = new Methodthree();
		t.add(10,12);
		t.add(10,12,18);
		t.circle(3,3.14);
		t.rect(25, 20);

	}

}
