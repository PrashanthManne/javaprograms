package learnif;

import java.util.Scanner;

public class Busroute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("1.secunderabad ");
		System.out.println("2.koti ");
		System.out.println("3.uppal ");
		System.out.println("4.lb nagar ");
		System.out.println("5.medchal  ");
		System.out.println("6.mahidhipatnam ");
		System.out.println("7.dilsuknagar ");
		System.out.println("8.ecil");
		System.out.println("choose your current  location ");

		int choose = s.nextInt();
		System.out.println("1.secunderabad ");
		System.out.println("2.koti ");
		System.out.println("3.uppal ");
		System.out.println("4.lb nagar ");
		System.out.println("5.medchal  ");
		System.out.println("6.mahidhipatnam ");
		System.out.println("7.dilsuknagar ");
		System.out.println("8.ecil");
		System.out.println("your mention the destination ");
		String dest = s.next();
		switch (choose) {
		case 1:
			System.out.println("you are current location is secunderabad ");
			{
				switch(dest) {
				
				case "2":
					System.out.println("you are destination is koti");
					System.out.println("bus numbers are available from that route  1 ,40 ,86, 7z  ");
					break;
				case "3":
					System.out.println("you are destination is uppal ");
					System.out.println("bus numbers are available from that route  18 ,280 ,488, 18c  ");
					break;
				case "4":
					System.out.println("you are destination is lb nagar");
					System.out.println("bus numbers are available from that route  90l,290,279 ");
					break;
				case "5":
					System.out.println("you are destination is medchal ");
					System.out.println("bus numbers are available from that route 229 , 589 ");
					break;
				case "6":
					System.out.println("you are destination is mehidipatnam");
					System.out.println("bus numbers are available from that route  5k ,49m ,5c,5k/188 ");
					break;
				case "7":
					System.out.println("you are destination is dilsuknagar ");
					System.out.println("bus numbers are available from that route  1 ,40 ,86, 7z  ");
					break;
				case "8" :
					System.out.println("you are destination is ECIL");
					System.out.println("bus numbers are available from that route  24,25 ,281");
					break;
				}
				break;
			}
		case 2:
			System.out.println("you are current location is koti");
			break;
		case 3:
			System.out.println("you are current location is uppal ");
			break;
		case 4:
			System.out.println("you are current location is lb nagar");
			break;
		case 5:
			System.out.println("you are current location is medchal ");
			break;
		case 6:
			System.out.println("you are current location is mehidipatnam");
			break;
		case 7:
			System.out.println("you are current location is dilsuknagar ");
			break;
		case 8:
			System.out.println("you are current location is ECIL");
			break;

		}

	}

}
