package learnif;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double hour;
		double mins;
		double secs;
		double days;
		System.out.println("1.choose you are convertion from hour");
		System.out.println("2.choose you are convertion from minute");
		System.out.println("3.choose you are convertion from second");
		int choose;
		System.out.println("choose you are options");
		choose = s.nextInt();
		switch (choose) {
		case 1: {
			System.out.println("hours conversions");
			System.out.println("1.hours to mins ");
			System.out.println("2.hours to secs");
			System.out.println("3.hours to days");
			choose = s.nextInt();
			switch (choose)

			{
			case 1: {
				System.out.println("enter the value in hours ");
				hour = s.nextDouble();
				mins = hour * 60;
				System.out.println(hour + "  hours is equals to  " + mins + "  mins");
			}
				break;
			case 2: {
				System.out.println("enter the value in hours ");
				hour = s.nextDouble();
				secs = hour * 60 * 60;
				System.out.println(hour + "  hours is equals to  " + secs + "  secs");
			}
				break;
			case 3: {
				System.out.println("enter the value in hours ");
				hour = s.nextDouble();
				days = hour / 24;
				System.out.println(hour + "  hours is equals to  " + days + "  days");
			}
			}
				break;
			
		}
		case 2:
			System.out.println("mins conversions");
			System.out.println("1. mins to hours ");
			System.out.println("2.mins to secs");
			System.out.println("3.mins to days");
			choose = s.nextInt();
			switch (choose)

			{
			case 1: {
				System.out.println("enter the value in minutes ");
				mins = s.nextDouble();
				hour = mins / 60;
				System.out.println(mins + "  mins is equals to  " + hour + "  hours");
			}
				break;
			case 2: {
				System.out.println("enter the value in minutes ");
				mins = s.nextDouble();
				secs = mins * 60;
				System.out.println(mins + "  mins is equals to  " + secs + "  secs");
			}
				break;
			case 3: {
				System.out.println("enter the value in minutes ");
				mins = s.nextDouble();
				days = mins / (24 * 60);
				System.out.println(mins + "  mins is equals to  " + days + "  days");
			}
			}
				break;
			

		}

	}

}
