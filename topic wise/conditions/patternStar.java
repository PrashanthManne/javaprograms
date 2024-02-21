package learnif;

import java.util.Scanner;

public abstract class patternStar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		/*int n;
		System.out.println("enter the size of the pattern ");
		n = s.nextInt();
		for(int m = 1;m<=n;m++)
		{
			for (int k =n;k>=m;k--)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i <= n; i++) {
			
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	String name = "prashanth";
	String name2 = "maths";
	int count = name.length();
	int count1 = name2.length();
	int sum =count + count1 ;
	System.out.println("length of the two strings " + sum);
	
		int vcount = 0;
		int ccount = 0;
			
		String name = "Prashanth is a good boy";
	int name1 = name.length();
	for (int i = 0 ; i <= name.length()-1;i++)
	{
		if (name.charAt(i)== 'a' || name.charAt(i)=='e' ||name.charAt(i)=='i' ||name.charAt(i)=='o' ||name.charAt(i)=='u' ||
				name.charAt(i)== 'A' || name.charAt(i)=='E' ||name.charAt(i)=='I' ||name.charAt(i)=='O' ||name.charAt(i)=='U')
		{
			vcount = vcount + 1 ;
			
		}else if ((name.charAt(i)>='a' && name.charAt(i)<='z')  || (name.charAt(i)>='A'&& name.charAt(i)<='Z'))
		{
			ccount = ccount + 1;
			}
		
	}
	System.out.println("vowel letters are   =" + vcount );
	System.out.println("consonant letters are =" + ccount);
	System.out.println("total letters and symbols =" + name1);
	
	String name = "SlokaM";
	String name2 = "Slokam";
	if (name.compareTo(name2)>0)
	{
		System.out.println("name is greater then name2");
	}else if(name.compareTo(name2)<0)
	{
		System.out.println("name is smaller than name2");
	}
	else 
	{
		System.out.println("both the strings are equal ");
	}
	String uppercase = name.toUpperCase();
	String lowercase = name.toLowerCase();
	int lengthstr = name.length();
	char ch = name.charAt(4);
	System.out.println(ch);
	//for (int i = 0 ; i <=name.length()-1;i++)
	//{
	//char ch = name.charAt(i);
	//System.out.println(i+"letter = " + ch);
	//}
	//System.out.println("capital letters for the given name is =  " + uppercase );
	//System.out.println("small alphabets letters for the given name is =   " + lowercase );
	//System.out.println("the length of the string is " + lengthstr);
	 
	
	
	String name = "ram";
	System.out.println("please the correct name ");
	String name1 ;
	name1 = s.nextLine();
	if (name.equals(name1))
	{
		System.out.println("name is correct ");
	}
	else
	{
		System.out.println("name is invalid");
	}
	
	*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value for the n ");
		int n = sc.nextInt();
		for (int i = 1 ; i <=n;i++)
		{
			for(int j =i ; j <= n ;j++)
			{
				System.out.print(" ");
			}
			for (int j = 1;j<i;j++)
			{
				System.out.print("*");
			}
			for(int j =1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			

		}
	}
}
