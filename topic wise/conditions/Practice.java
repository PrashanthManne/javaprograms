package learnif;

import java.util.Scanner;

public class Practice {
	int n1=0;
	int n2=1;
	int n3=0;
	
	void fibonacci(int count)
	{
		if(count>0)
		{
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.print("  " + n3);
			fibonacci (count - 1);
		}
		
	}

	public static void main(String[] args) {
/*	int sum ;
	int remainder ;
	Scanner s = new Scanner (System.in);
	System.out.println("enter any value  of n =" );
	int n = s.nextInt();
	int temp =n ;
	sum = 0;121%10=====1: sum ==0 ;
	while (n>0)  sum =sum*10 + remainder=====sum = 1
	             n=n/10====121/10=12
	             while (n>0) 
	{
	remainder = n%10 ;
	sum = (sum*10) + remainder  ;
	n = n/10 ;// for every  repeatation the number of digits will be reduced 
	System.out.println("the sum of sum is =" +sum);
		
	}
	if (sum == temp )
	{
		System.out.println("then the given number is palindrome ");
	}else 
	{
		System.out.println("the given number is  not a  palindrome ");
	}*/
	/*Scanner s = new Scanner(System.in);
	String original = s.nextLine();
	String reverse = "";// initially reverse value is null 
	int length = original.length();
	for (int i = length-1 ;i>=0;i--)// using for loop for every iteration reverse variable stores one letter in the process 
	{																//1 iteration the value of last value it stores as last value i.e is m 
		reverse = reverse+original.charAt(i);
		System.out.println(reverse);
		
	}
	if(original.equals(reverse))
	{
	System.out.println("it is a palimdrone");
	}
	else
	{
			System.out.println("it is not a  palimdrone");
	}*/
	/*int i ;
	int fact = 1;
	for (i=1;i<=5;i++)
	{
	fact = fact * i;
	}
	System.out.println(fact);
	
	
		Scanner s = new Scanner (System.in);
		System.out.println("please any name that you want to be check");
		
	String original =s.nextLine(); whether the given string is palindrome are not 
	String reverse  = ""; we can see the string datatypes for reverse and original  
	int length = original.length();and one is for length i ..e int datatype is used 
	for (int i = length-1;i>=0;i--) {in the for loop 
	reverse string is equal or not so for that
	the value of jade will be that you can't change in the regular basics
	 
	
		
	reverse = reverse + original.charAt(i);
	reverse = reverse + original.charAt (i);
	System.out.println("the value of i is "+reverse);
	}
	if (original.equals(reverse))
	{
		System.out.println("the given letter  is palindrome");
	}else 
	{
		System.out.println("the given letter is not a palindrome ");
	}
	*/
	
	
	
	
	
	}
}
















