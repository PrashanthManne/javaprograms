package learnif;

import java.util.Scanner;

public class SHOPPINGMALL {
	void bcall(int quantity, double price, double dis, double vat) {
		System.out.println("quantity of the product " + quantity);
		System.out.println("price  of the product " + price);
		System.out.println("discount provided  " + dis);
		System.out.println(" vat value of your purchased " + vat);

		double bill = quantity * price;
		double tvat = (bill / 100) * (10);
		double tdis = (bill) * (dis / 100);
		double fbill = (bill + tvat) - tdis;
		System.out.println("bill  of the product " + bill);
		System.out.println(" total discount provided  " + tdis);
		System.out.println("total  vat of your purchased " + tvat);
		System.out.println("total  bil of your purchased " + fbill);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SHOPPINGMALL m = new SHOPPINGMALL();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of quantity");
		int q = s.nextInt();
		System.out.println("enter the value of price");
		double p = s.nextDouble();

		double dis;
		double vat = 10;
		double bill = p * q;
		if (bill > 0 && bill <= 1000) {
			dis = 5;
			m.bcall(q, p, dis, vat);
		} else if (bill > 1000 && bill <= 10000) {
			dis = 10;
			m.bcall(q, p, dis, vat);
		} else if (bill > 10000 && bill <= 15000) {
			dis = 15;
			m.bcall(q, p, dis, vat);
		} else if (bill > 15000 && bill<=20000) {
			dis = 20;
			m.bcall(q, p, dis, vat);
		}
		else if (bill >20000)
		{
			dis = 25;
			m.bcall(q, p, dis, vat);
		}

	}

}
