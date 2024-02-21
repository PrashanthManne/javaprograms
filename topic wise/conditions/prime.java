package learnif;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		int k = 0;
		while (k<5)
		{
		System.out.println("enter the any number ");
		int n = s.nextInt();
		int  flag = 0;
		if (n==0 && n==1)
		{
			System.out.println("the given number is not prime ");
		}
		else {
		for(int i = 2 ; i <n ; i++)
		{
			if(n%i==0)
			{
				System.out.println("the given is not  prime number ");
			flag = 1;
			break;
			
			} 			
		}
		if(flag==0)
		{
			System.out.println("it is a prime number ");
		}
	}
		k=k+1;
	} 
	}
}
