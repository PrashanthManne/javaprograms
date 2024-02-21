package learnif;

import java.util.Scanner;

public class Palindrome {
	

public void checkPalindrome(String original) {
		
		String reverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
		if (original.equals(reverse)) {
			System.out.println("this is a palindrome ");
		} else
			System.out.println("this is not a palindrome ");
	}

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
Palindrome p = new Palidrome();
		System.out.println("enter any name");
		String original = s.next();
		p.checkPalindrome(original);

	}

}
