package learnif;

import java.util.Scanner;

public class PayBill {
	
	void bill(int quantity ,double price  )
	{
		int gst = 10;
		System.out.println("enter the quantity value "+quantity);
		System.out.println("the price value each quantiy  "+price);
		double tbill = quantity * price ;
		System.out.println("total bill .....before gst " + tbill);
		double tgst = (quantity *price)/gst;
		System.out.println("total gst ...... "+tgst);
		double tbillwithgst = tbill + tgst ;
		System.out.println("total bill including gst ...... "+tbillwithgst);
		
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the quantity value ");
		int q = s.nextInt();
	
		System.out.println("enter the price of the product ");
		int p = s.nextInt();
		

		PayBill B = new PayBill();
		B.bill(p,q);
		
		
		
		
	}

}
