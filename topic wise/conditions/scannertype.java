package learnif;
import java.util.Scanner;
public class scannertype {

	public static void main(String[] args) {
		Scanner  s = new Scanner (System.in);
		System.out.println("what type of food u prefered ");
		String ftype = s.next();
		System.out.println("food type is =  " + ftype);
		System.out.println("what order of food u prefered ");
		String forder = s.next();	
		System.out.println("food type is =  " + forder);
		System.out.println("how much quantity you prefered ");
		int fcount = s.nextInt();  
		System.out.println("food type is =  " + fcount);


	}

}
