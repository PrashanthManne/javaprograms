package learnif;
import java .util.Scanner;
public class Calculator {
	
	Scanner sc = new Scanner (System.in);
	
	void add ()// return type is void method does not provides any return values 
	{			// add method name and it should be related to the type  of operation to be performed with in body 
		// Scanner is a  java class present in java.util.Scanner ;
											// Scanner takes the input from console							
		int a = sc.nextInt();				//int  type declaration with sc.nextInt (); 
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		double add = a+b+c;         
		System.out.println("the value of add " + add);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		Calculator c = new Calculator ();
		
			c.add();
			Scanner sc = new Scanner (System.in);
			int n=sc.nextInt();
			for (int i = 1;i<=n;i++)
			{
				System.out.println("*");
				for (int j=1;j<i;j++)
				{
					System.out.print("*");
				}
			}
	}

}
