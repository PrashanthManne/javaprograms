package learnif;
import java.util.Scanner;

public class LOOPS { 
	

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the row value ");
		int row = s.nextInt();
		
		/*for (int i = 1;i<=row;i++)
		{
			for (int j = 1;j<=i;j++)     // to generate right angle pattern using stars
			{
				
				System.out.print(" * ");
			}
			System.out.println(" ");			
		}
		*/
		int i,j;
	for (i = 1;i <=row ;i++)	// i = 1 and 1<=5 true 
	{													
		for (j = 2*(row - i);j>=1;j--) // j=10; ""
		{
			System.out.print(" ");
		}	
		for (j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		
		System.out.println( " ");
	}
	}

}
