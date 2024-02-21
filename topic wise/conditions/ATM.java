package learnif;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pin;
		int attempt = 0;
		while(attempt <=3)
		{
		double rand = Math.random();
		rand = (int)(rand * 10000);
		System.out.println("pin number is "+rand);
		double amount = 6000;
		System.out.println("1.balance enquiry ");
		System.out.println("2.balance withdraw ");
		System.out.println("3.balance deposit  ");
		System.out.println("4.exit ");
		System.out.println("choose the option you want");
		
		int choose ;
		choose = sc.nextInt();    
		switch (choose) {
		case 1: {
			System.out.println("you are chosen balance enquiry");
			System.out.println("enter the pin number ");
			pin = sc.nextInt();
			if (pin == rand) {
				System.out.println("your bank balance " + amount);
				System.out.println("please collect your card");
			} else {
				System.out.println("your pin is invalid ");
				
				attempt = attempt + 1;
				if (attempt <3)
				{
					System.out.println("try again");	
				}else 
				{
					System.out.println("your card is blocked ");
				}
			}
		}
			break;
		case 2: {
			System.out.println("enter the pin number ");
			pin = sc.nextInt();
			if (pin == rand) {
				System.out.println("enter the valid withdral  amount ");
				double wdw = sc.nextInt();
				if (amount > wdw) {
					System.out.println("initial amount " + amount );
					amount = amount - wdw ;
					System.out.println("enter the valid withdral  amount ");
					System.out.println("your remaining amount  " + amount);
					System.out.println("your transaction is successful");
					System.out.println("please collect your card");
				} else {
					System.out.println(
							"the withdral amount you choosen much more than the amount present in your bank account");
				}

			} else {
				System.out.println("your pin is invalid ");
				attempt = attempt + 1;
				if (attempt <3)
				{
					System.out.println("try again");	
				}else 
				{
					System.out.println("your card is blocked ");
				}
		
			}
		}
			break;
		case 3: {
			System.out.println("enter the pin number ");
			pin = sc.nextInt();
			if (pin == rand) {
				System.out.println("enter the amount do you want to be added  ");
				double deposit = sc.nextInt();
				System.out.println("initial amount " + amount );
				amount = amount + deposit ;
				System.out.println("amount deposited  " + deposit );
				System.out.println("the total amount present in your amount " + amount);
				System.out.println("your transaction is successful ");
				System.out.println("please collect your card");
			} else {
				System.out.println("your pin is invalid ");
				attempt = attempt + 1;
				if (attempt <3)
				{
					System.out.println("try again");	
				}else 
				{
					System.out.println("your card is blocked ");
				}
			}
		}
			break;
		default:
			System.out.println("please collect your card ");

		}
		}
		attempt = attempt + 1;
		}
	}

