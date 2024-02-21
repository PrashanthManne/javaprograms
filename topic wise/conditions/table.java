package learnif;

import java.util.Scanner;

public class table { 
	Scanner s = new Scanner (System.in);
	
	int table()
	{
	int tables=1;
	System.out.println("please enter the table number");
		int tablenumber=s.nextInt();
		for (int i = 1 ; i <= 20; i ++)
		{
		tables  = tablenumber * i ;
			System.out.println(tablenumber+"*"+i+ "=" + tables);
		}
	
	return tables;
	}

		public static void main(String[] args) {
		table t = new table();
	int tab = t.table();
		
		}

}
