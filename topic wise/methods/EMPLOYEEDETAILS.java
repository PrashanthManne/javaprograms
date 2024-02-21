package learnif;

import java.util.Scanner;

public class EMPLOYEEDETAILS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner (System.in);
		System.out.println("enter the id num ");
		int eid = s.nextInt();
		System.out.println("enter the name  ");
		String name = s.next();
		System.out.println("enter the salary  ");
		double sal = s.nextDouble();
		System.out.println("enter the desgnination ");
		String edesg = s.next();
		System.out.println("enter the marriage status ");
		boolean mrgstatus = s.nextBoolean();
		
		System.out.println(" the id num " + eid);
		System.out.println(" the name  " + name);
		System.out.println(" the salary  " + sal);
		System.out.println(" the desgnination " + edesg);
		System.out.println(" the marriage status " + mrgstatus);
	}

}
