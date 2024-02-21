package learnif;

import java.util.Scanner;

public class bustickets {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
		/*int tickets = 60;
		int count = 0 ;
		while (tickets >0)
		{
			System.out.println("the no of tickets are available "+tickets);
			System.out.println("please enter how many sits do u want ");
			count =s.nextInt();
			tickets = tickets - count;
			if(tickets < count) {
				System.out.println("tickets are not available asa much as you choosen ");
			}
			}
*/
	System.out.println(" enter any value for the number ");
	int number = s.nextInt();
	int r;
	int sum = 0 ;
	int temp = number ;
	while(number >0)
	{										// 12345
											//12345/10  r= 5
													//0 * 10 + 5 =5
		r  = number % 10 ;    
		sum = (sum * 10 )+ r ;
		number = number/10 ;
		
		System.out.println(sum);
	}
	if (sum==temp) {
		System.out.println("the given number is the palindrome ");
		}
	else 
	{
		System.out.println("the given number is not a  palindrome ");
	}
	
	}

}
