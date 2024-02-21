package learnif;

import java.util.Scanner;

public class palindrome {
	Scanner s = new Scanner(System.in);

	String Palindrome() {
		System.out.println("enter any name");
		String original = s.next();
		String reverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
		if (original.equals(reverse)) {
			System.out.println("this is a palindrome ");
		} else
			System.out.println("this is not a palindrome ");

		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
