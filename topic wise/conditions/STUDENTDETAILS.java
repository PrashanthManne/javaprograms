package learnif;
import java.util.Scanner;

public class STUDENTDETAILS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
System.out.println("enter the hindi marks");
		int h = s.nextInt();
		System.out.println("enter the english marks");
		int e = s.nextInt();
		System.out.println("enter the telugu marks");
		int t = s.nextInt();	
		System.out.println("enter the maths  marks");
		int m = s.nextInt();
		System.out.println("enter the science marks");
		int sc = s.nextInt();
		System.out.println("enter the social marks");
		int so = s.nextInt();
		int tmarks = h + e + t + m + sc + so ;
		
		System.out.println("hindi marks"+h);
		System.out.println("english marks"+e);
		System.out.println("telugu "+t);
		System.out.println("maths" +m);
		System.out.println("science marks"+sc);
		System.out.println("social marks" +so);
		System.out.println("total marks" + tmarks);
		System.out.println(tmarks/6);
		if(h>=35 && e>= 35 && t >= 35 && m >= 35 && sc >= 35 && so >= 35)
		{
			System.out.println("passed in all subjects");
		}else 
			System.out.println("failed in any one or more  subjects");
	
		
	}

}
