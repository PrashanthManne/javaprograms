package learnif;

import java.util.Scanner;

public class Incanddec {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the country name ");
		String country = s.next();
		System.out.println("your country name is  " + country);
		System.out.println("your name  is ");
		String name = s.next();
		System.out.println("your name is  " + name);
		System.out.println("your play type is ");
		String type = s.next();
		System.out.println("your play type is " + type);

		switch (country) {
		case "india":
			System.out.println("you are selected from india ");
			switch (name) {
			case "virat":
				System.out.println("you are selected from india who  is run machine  ");
				break;
			case "rohit":
				System.out.println("you are selected from india who is hit man");
				break;
			case "gill":
				System.out.println("you are selected from india who is opener  ");
				break;
			case "siraj":
				System.out.println("you are selected from india who is bowler  ");
				break;
			default:
				System.out.println("you are choosen different option from india ");
			}
			break;
		case "aus":
			System.out.println("you are selected from australia ");
			switch (name) {
			case "warner":
				System.out.println("you are selected from australia  who  is run machine  ");
				break;
			case "maxwell":
				System.out.println("you are selected from australia  who is hit man");
				break;
			case "marsh":
				System.out.println("you are selected from australia  who is opener  ");
				break;
			case "stack":
				System.out.println("you are selected from australia who is bowler  ");
				break;
			default:
				System.out.println("you are choosen different option from australia ");
			}
			break;
		case "southafrica":
			System.out.println("you are selected from SA ");
			switch (name) {
			case "ABD":
				System.out.println("you are selected from SA who  is run machine  ");
				break;
			case "klaseen":
				System.out.println("you are selected from SA who is hit man");
				break;
			case "smith":
				System.out.println("you are selected from SA who is opener  ");
				break;
			case "styen":
				System.out.println("you are selected from SA who is bowler  ");
				break;
			default:
				System.out.println("you are choosen different option from SA ");
			}
		}

	}

}
