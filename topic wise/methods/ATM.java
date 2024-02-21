package learnif;
import java.util.*;

public class ATM {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("please enter the card");
		boolean atm = s.nextBoolean();
		System.out.println("pin number ");
		int pin = s.nextInt();
		switch(pin) {
		case 1234 : System.out.println("choose your options given below");
		{

			System.out.println("1.withdraw amount");
			System.out.println("2.check balance");
			System.out.println("3.pin generation");
			System.out.println("4.deposit amount");
			System.out.println("5.choose language");
			System.out.println("choose your options");
		    }
		break;
		default : System.out.println("your enter the incorrect pin");
	}

}
}