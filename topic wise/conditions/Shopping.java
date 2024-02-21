package learnif;

import java.util.Scanner;

public class Shopping {
	int vat = 10;// instance variable whose value is constant through out the program

	void pricedis(double bill, double dis) // class method 2 
	{
		double tvat = (bill * 10) / 100;
		System.out.println("the total vat for your purchased " + tvat);
		double discount = (bill / 100) * dis;
		System.out.println("we provide the discount  for your purchased is = " + discount + " i.e of " + dis
				+ "   percent discount ");
		double tbill = bill + tvat - discount;
		System.out.println("the total bill including vat and discount  for your purchased " + tbill);

	}

	void billamount(int quantity, double price) //class method 1 
	{
		System.out.println("the quantity you purchased   " + quantity);
		System.out.println("the priced items  you purchased   " + price);
		double bill = quantity * price;
		System.out.println("the bill without vat and discount " + bill);
		if (bill > 0 && bill <= 1000) {
			pricedis(bill, 5);// method 1 is calling the method 2 to perform the operations 
		} else if (bill > 1000 && bill <= 5000) {
			pricedis(bill, 10);
		} else if (bill > 5000 && bill <= 15000) {
			pricedis(bill, 15);

		} else if (bill > 15000 && bill <= 25000) {
			pricedis(bill, 20);
		} else {
			pricedis(bill, 25);
		}

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the quantity you purchased  ");
		int a = s.nextInt();
		System.out.println("enter the products price  ");
		int b = s.nextInt();

		Shopping sp = new Shopping();
		sp.billamount(a, b);
	}

}
