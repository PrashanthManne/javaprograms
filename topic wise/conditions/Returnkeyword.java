package learnif;

import java.util.Scanner;

public class Returnkeyword {
	void   add ( int a , double  b) {
		
		double  c  = a+b;
		System.out.println("the sum of c "+c);
	}

	public static void main(String[] args) {
		Returnkeyword r = new Returnkeyword();
		Scanner s = new Scanner(System.in);
		r.add(4,5);
		
	
	}

}
