package learnif;

import java.util.Scanner;

public class PRACTICETEST {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("choose the order item do you want");
		System.out.println("1.veg item");
		System.out.println("2.nonveg item");
		System.out.println(" the order item do you want");
		String foodtype = s.next();

		switch (foodtype) {
		case "1":
			System.out.println("your are veg item lists");
			System.out.println("1.panner ");
			System.out.println("2.curd rice");
			System.out.println("3.jira rice");
			System.out.println("choose anything according to first letter of your order ");
			String foodorder = s.next();
			
			switch (foodorder) {
			case "p":
				System.out.println("your order   panner  is ready ");
				break;
			case "c":
				System.out.println("your order curd rice is ready ");
				break;
			case "j":
				System.out.println("your order jirarice  is ready ");
				break;
			default:
				System.out.println("your order item is not available");
			}
			
			break;
		case "2":
			System.out.println("your are non veg item lists");
			System.out.println("1.chicken biryani  ");
			System.out.println("2.mutton biryani");
			System.out.println("3.french fries");
			System.out.println("choose anything according to first letter of your order ");
			String food = s.next();
			int count2 = s.nextInt();
			switch (food) {
			case "c":
				System.out.println("your order  chicken biryani  is ready ");
				System.out.println(" ");
				break;
			case "m":
				System.out.println("your order mutton biryani is ready ");
				break;
			case "f":
				System.out.println("your order french fries  is ready ");
				break;
			default:
				System.out.println("your order item is not available");
			}
			break;

		}

	}

}
