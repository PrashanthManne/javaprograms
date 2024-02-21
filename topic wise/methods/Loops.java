package learnif;
import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int a ;
	System.out.println("enter any value");
	a=s.nextInt();
	int isprime = 1;
	for (int i = 2 ; i < (a/2);i++) //first we take the isprime value is declared to 1
		
									//using for loops initializing the i value to 2 
									//i values 2.3.4.5.6.7.8.9..........n
		                             // a input value given from the console  assumimg the a value to 11
		                              //11/2 ==5 20  
		
		
	{
		if (a%i==0)
		{
			isprime = 0;
			break;
		
		}
	}
	if (isprime ==1)
	{
		System.out.println("the given number is prime number " + a);
	}else 
	{
		System.out.println("the given number is not a prime number " + a);
	}
	
	}
	}
