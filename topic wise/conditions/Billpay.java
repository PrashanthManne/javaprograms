package learnif;

import java.util.Scanner;

public class Billpay {
	int vat = 10;

	void bill(int quantity, double price) {
		System.out.println(" the value of the quantity " + quantity);
		System.out.println(" the value of the price  " + price);
		double tvat = (quantity * price) / vat;
		System.out.println(" total vat for all the prices  " + tvat);
		double tbill = (quantity * price) + tvat;
		System.out.println(" total bill .........        " + tbill);
		double discount ;
		if (tbill < 5000) {
			discount = (tbill * 5 / 100);
			System.out.println(" we provide for you 5 percent discount on your purchase");
			System.out.println(" total discount ...." + discount);
			System.out.println("total bill after gst = " +(tbill-discount));
		} else if (tbill > 5000 && tbill <= 10000) {
			discount = (tbill * 10 / 100);
			System.out.println(" we provide for you 10 percent discount on your purchase");
			System.out.println(" total discount ...." + discount);
			System.out.println("total bill after gst = " +(tbill-discount));
		} else {
			discount = (tbill * 15 / 100);
			System.out.println(" we provide for you max discount on your purchase i.e  15 percent ");
			System.out.println(" total discount ...." + discount);
			System.out.println("total bill after gst = " +(tbill-discount));
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of the quantity ");
		int q = s.nextInt();

		System.out.println("enter the value of the price  ");
		int p = s.nextInt();
		Billpay b = new Billpay();
		b.bill(q, p);
	}

}
