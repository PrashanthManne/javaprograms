package learnif;
import java.util.Scanner;

public class AREA {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the value of length");
	int length = sc.nextInt();
	System.out.println("the value of length = "+length);
	System.out.println("enter the value of breadth");
	int breadth = sc.nextInt();
	System.out.println("the value of breadth= "+breadth);
	int area = length * breadth;
	System.out.println("the area of the rectangle " + area );
	System.out.println("please enter the value of units ");
	int unit = sc.nextInt();
	System.out.println("the number of the units is ="+ unit );
   System.out.println("please enter the name of the candidate ");
	String name = sc.next();
	System.out.println("your name is  " + name );
	
	System.out.println("please enter the years of working  ");
	int year = sc.nextInt();
   System.out.println("the years of working "+ year );
   System.out.println("please enter the salary of previous year is ");
   int salary = sc.nextInt();
   if(year > 5)
   {
	   salary= salary * 105/100;
	   System.out.println("the salary of this year is increment by 5 percent " + salary);
   }
   else 
   {
	   System.out.println("then the salary is same as the previous = " + salary);
   }
	
	
}

}


