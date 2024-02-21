package learnif;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class squareroot {

	public static void main(String[] args) {
		/*
		 * System.out.println("please enter any name "); String name1 = s.nextLine();
		 * System.out.println("please enter any name "); String name2 = s.nextLine(); if
		 * (name1.compareTo(name2) > 0) {
		 * System.out.println(name1+"is greater than "+name2); }else if
		 * (name2.compareTo(name1) > 0) {
		 * System.out.println(name2+"is greater than "+name1); a }else
		 * System.out.println("both names are equal length");
		 * 
		 

		System.out.println("principle amount ");
		double principle;
		
		principle = s.nextDouble();
		System.out.println("rate of intrest ");
		double rate;
		rate = s.nextDouble();
		double month, year;
		double si,tamount ;
		int choose;
		System.out.println("1.select months ");
		System.out.println("2.select years ");
		choose = s.nextInt();
		switch (choose) {
		case 1:
			System.out.println(" please enter the numbers of months ");
			month = s.nextDouble();
			si = (principle * rate * month) / 100;
			System.out.println("simple intrest " + si);
			tamount = principle + si;
			System.out.println("total amount " + tamount);
			break;
		case 2:
			System.out.println(" please enter the numbers of years ");
			year = s.nextDouble();
			si = (principle * rate * year * 12) / 100;
			System.out.println("simple intrest " + si);
			tamount = principle + si;
			System.out.println("total amount " + tamount);
			break;

	
		default : System.out.println("choose the correct options");
			}
	
		
		double year, month ;
		System.out.println("enter the number of years completed  ");
		year = s.nextDouble();
		System.out.println("enter the number of extra months as completed ");
		month = s.nextDouble();
		//double month;
		//System.out.println("enter the number of months ");
		//month = s.nextInt();
		//year = 12 * month;
		//System.out.println("the year is converted into months "+ year);
		  double months = year *   12 ;
		 double tmonths = month + months ;
		System.out.println("the year is converted into months "+ tmonths );
swapping 		
int x = 5 ;// 5 is assign to x 

int y = 20 ; // 20 is assign to y 
x = x+y;    // x is sum of x and y then x = 5 +20 =25 ;
y = x-y;  // y is difference of y = 25 - 20 =5 i e  x value is shifted to  y 
x = x - y ; // the x s the difference of x and y ==> x = 25  
System.out.println("y is = " +y + "     x is  = " + x);


	
	LocalDate date = LocalDate.now();
	System.out.println("today date is " + date );
	LocalDateTime today = LocalDateTime.now();
	DateTimeFormatter dtoday = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	String formattedDate = today.format(dtoday);
	System.out.println(dtoday);
	*/
}
}
