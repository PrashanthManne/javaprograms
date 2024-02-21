package learnif;

import java.util.Scanner;

public class Atmamout {
	double  balance = 5000;
	void withdraw (double wdwamount)
	{
		if (balance >=wdwamount)
		{
		System.out.println("your withdral trans successful ");
		balance = balance - wdwamount;
		System.out.println("the total balance "+balance);
		}else 
		{
			System.out.println("balance is insufficient please check the balance ");
		}
		
	}
	void deposit  (double damount)
	{
		System.out.println("your deposit is successful  of "+damount);
		balance = balance  + damount;
		System.out.println("the amount after the deposit will be " + balance );
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("please enter the withdral amount ");
		double w = s.nextDouble();
		System.out.println("enter the deposit  amount ");
		double d = s.nextDouble();
		Atmamout a = new Atmamout ();
		a.withdraw(w);
		a.deposit(d);
		
				
	}
	}

