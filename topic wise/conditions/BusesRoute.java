package learnif;

import java.util.Scanner;
public class BusesRoute {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int choice;
		int price;
		System.out.println("check the bus routes  are available ");
		System.out.println("pick one from the given data which is related to your route  ");
		System.out.println("1.rajahmundry");
		System.out.println("2.eluru");
		System.out.println("3.Chintalapadu");
		choice = s.nextInt();
		if(choice ==1)
		{
		System.out.println("1.rajahmundry");
		System.out.println("check whether the buses are available are not ");
		System.out.println("1.available ");
		System.out.println("2.not ");
		choice = s.nextInt();
		
			if(choice==1) {
				System.out.println("buses are available to your route  ");
				System.out.println("choose the number of seats do you want ");
				choice = s.nextInt();
				if(choice > 0)
				{
				price = choice*800;
			
				System.out.println("total price " +price );
				}else 
				{
					System.out.println("you are not choosed any tickets ");
				}			}
		else
		{
			System.out.println("the buses are not available to this route ");
		}
		}
		else if(choice ==2)
		{
			System.out.println("2.eluru");	
		System.out.println("check whether the buses are available are not ");
		System.out.println("1.available ");
		System.out.println("2.not ");
		choice = s.nextInt();
		
			if(choice==1) {
				System.out.println("buses are available to your route  ");
				System.out.println("choose the number of seats do you want ");
				choice = s.nextInt();
				if(choice > 0)
				{
				price = choice*400;
			
				System.out.println("total price " +price );
				}else 
				{
					System.out.println("you are not choosed any tickets ");
				}
			
		}else
		{
			System.out.println("the buses are not available to this route ");
		}
		}
		else if(choice ==3)
		{
		System.out.println("3.Chintalapadu");
		System.out.println("check whether the buses are available are not ");
		System.out.println("1.available ");
		System.out.println("2.not ");
		choice = s.nextInt();
		
			if(choice==1) {
				System.out.println("buses are available to your route  ");
				System.out.println("choose the number of seats do you want ");
				choice = s.nextInt();
				if(choice > 0)
				{
				price = choice*500;
			
				System.out.println("total price " +price );
				}else 
				{
					System.out.println("you are not choosed any tickets ");
				}
			}
		else
		{
			System.out.println("the buses are not available to this route ");
		}

			}
		}
	}

