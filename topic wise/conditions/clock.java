package learnif;

import java.util.Scanner;

public class clock {

	public static void main(String[] args) {
		/*
		 * for (int hour = 0 ;hour <1 ; hour++) { System.out.println(hour+"hour"); for
		 * (int m = 1 ; m <= 59 ; m ++) { System.out.println(hour + " hour  : " + m +
		 * " minutes"); for (int s = 1 ; s <= 59 ; s ++) { System.out.println(hour +
		 * " hour : " + m + " minutes" + " : " + s + " seconds"); } }
		 * System.out.println(hour + " "); }
		 * 
		 * 
		 * Scanner s = new Scanner (System.in);
		 * 
		 * int n=1;
		 * 
		 * while (n>0) {
		 * System.out.println("enter any table number that you need to generate "); n =
		 * s.nextInt(); if(n>0) { for (int i = 1 ; i <= 20 ;i++) { int j = n*i;
		 * System.out.println(n+"*"+i+"="+j); } }else {
		 * System.out.println("you are enter the negative number it stops the execution"
		 * ); } }
		 */
		/*
		 * int [] num = new int [5]; String [] names = new String [5]; names [0]
		 * ="prashanth"; names [2] = "not my name "; for (int i = 0 ; i <= names.length
		 * - 1;i++) { System.out.println(names[i]); }
		 * 
		 * 
		 * int n ;
		 * 
		 * Scanner s = new Scanner (System.in); double rand = Math.random(); rand = rand
		 * * 10000; System.out.println("random number is " + rand); rand = (int)rand ;
		 * System.out.println("pin number is " + rand); double pin ;
		 * System.out.println("enter the pin "); pin = s.nextDouble(); while (pin ==
		 * rand)
		 * 
		 * if (rand == pin) { System.out.println("your pin is valid"); }else {
		 * System.out.println("your pin is invalid");
		 * System.out.println("last chance for you do you know the roll number "); int
		 * rollno = s.nextInt(); if(rollno==428) {
		 * System.out.println("your password is "+rand); } else { System.out.
		 * println("pin is invalid daily limit is completed please check after the 24 hours  "
		 * ); } }
		 * 
		 * 
		 * 
		 * // to check the two strings are equal are not String name = "apple"; String
		 * name2 = "ball"; if (name.equals(name2)) {
		 * System.out.println("both are equal"); } else {
		 * System.out.println("both are not equal "); } System.out.println(name +
		 * name2); System.out.println("a" + "b"); System.out.println((char)('a' + 'b'));
		 * int a = (char)195 ; System.out.println(a); System.out.println(1 + 225);
		 * String letters = ""; for (int i =0 ; i <26; i++) { char ch = (int)(66) ;
		 * System.out.println(ch); } if (name.compareTo(name2)> 0) {
		 * System.out.println(name+ "greater than" + name2); }else if
		 * (name.compareTo(name2)<0) { System.out.println(name +"lesser than " + name2);
		 * }else { System.out.println("both are equal"); } String str = "a" ; for (int i
		 * = 0 ; i <25; i++) { char j = (char)('b' + i);
		 * 
		 * str = str + j ;
		 * 
		 * } System.out.print(str); System.out.println(name.concat(name2));
		 * 
		 * 
		 * 
		 * 
		 * /*String name3 = "apple"; char name4 = name3.charAt(3);
		 * System.out.println("exact location of the character " + name4); int name5 =
		 * name3.length(); System.out.println("size of the string   " + name5); String
		 * name6 = name3.toUpperCase();
		 * System.out.println("Upper case letters  of the string " + name6); String
		 * name7 = name3.toLowerCase();
		 * System.out.println("lower case letters  of the string " + name7);
		 * 
		 * 
		 * 
		 * 
		 * String fname = "manne prashanth"; String sname = "prashanth";
		 * System.out.println(fname.concat(sname)); System.out.println(fname+sname); int
		 * a = sname.indexOf('n'); System.out.println(a ); char ch = sname.charAt(2);
		 * System.out.println(ch ); System.out.println(fname.split(" "));
		 * 
		 * 
		 * Scanner s = new Scanner (System.in); String name = s.next(); String reverse =
		 * ""; int length = name.length(); name.toLowerCase(); for (int i
		 * =name.length()-1;i>=0;i--) { reverse = reverse + name.charAt(i); }
		 * System.out.println(reverse); if (name.equals(reverse)) {
		 * System.out.println("this is a palindrome "); } else
		 * System.out.println("this is not a palindrome ");
		 */
		Scanner s = new Scanner(System.in);
		int attempt = 0 ;
		
		
		double rand = Math.random();
		rand = (int) (rand * 10000);
		while (attempt < 3)
		{
		System.out.println("otp number " + rand);
		double pin;
		System.out.println("enter the pin number");
		pin = s.nextDouble();
		
		{
			
		if (pin == rand) {
			System.out.println("your pin is valid");
		}else
		{
			System.out.println("your pin is  invalid ");
			System.out.println("try again  ");
			attempt = attempt + 1 ;
			if(attempt > 2)
			{
				System.out.println("your card is blocked for 24 hours");
			}
		}

	}
	}
	}
}
