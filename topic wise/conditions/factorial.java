package learnif;

import java.util.Scanner;

public class factorial {
	int Factorial () {
		Scanner s = new Scanner (System.in);
		int factorial=1 ;
		System.out.println("which number do you want to find the for the factorial");
		int n = s.nextInt() ;	
		for (int i = 1;i <=n;i++ )
		{
			factorial= factorial*i;
		}
		System.out.println("factorial of given number " + n +"  is  " +factorial );
		
	
	return factorial ;
	}

	public static void main(String[] args) {
		
		factorial f = new factorial();
	int fact =	f.Factorial();
	System.out.println("factorial of number "+ fact);
		

	}

}
