package learnif;
import java.util.Scanner;
public class TEST123 {	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int  a = s.nextInt();
	
	int b = s.nextInt();
	int peri = 2*(a+b);
	int area = a*b;
	System.out.println(peri);
	System.out.println(area);
	if (peri>area)
	{
		System.out.println("perimeter  is greater than area");
	}
	else if(area>peri)
	{
		System.out.println("area is greater than perimeter");
	}
	else 
	{
		System.out.println("then the value of perimeter  is equal is area ");
	}
	}

}
