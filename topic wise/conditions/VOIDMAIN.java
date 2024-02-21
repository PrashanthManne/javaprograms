package learnif;

import java.util.Scanner;

public class VOIDMAIN {
	int a;// class variable
	// instance method
	Scanner s = new Scanner(System.in);

	int add(int a, int b) {
		// body of an method

		int c = a + b;
		return c;//if any return datatypes  are avaliable then we  
	}

	int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	double div() {
		double a = 25;
		double b = 3;
		double c = a / b;
		return c;
	}

	double mul() {
		int a = 10;
		int b = 5;
		int c = a * b;

		return c;
	}

	double mod() {
		double a = 25;
		double b = 10;
		double c = a % b;
		return c;
	}

	public static void main(String[] args) {
		// program starts with the main method
		VOIDMAIN v = new VOIDMAIN();// object of an given class
		int a = 10;
		int b=30;
		
		int add = v.add(a, b);
		System.out.println("the value of add is " + add);
		int sub = v.sub(b, a);
		System.out.println("the value of subtraction is " + sub);
		double mul = v.mul();
		System.out.println("the value of multiplication is " + mul);
		double div = v.div();
		System.out.println("the value of division is " + div);
		double mod = v.mod();
		System.out.println("the value of modulus is " + mod);

	}

}
