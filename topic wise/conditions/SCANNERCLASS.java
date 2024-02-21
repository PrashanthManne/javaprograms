package learnif;
import java.util.Scanner;
public class SCANNERCLASS {

	public static void main(String[] args) {
	 	Scanner s = new Scanner (System.in);
	 	System.out.print("enter the value of n ");
	 	int n = s.nextInt();
    for (int i = 1;i<=n;i++)
    {
    	System.out.print(i);
    	for(int j=i;j<=n;j++)
    	{
    		System.out.print(j);
    	}
    }
	}
}
