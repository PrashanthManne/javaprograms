package learnif;

public class nested_if {

	public static void main(String[] args) {
		boolean atm = true;
		double bal = 5000;
		double wtd = 2235;
		int pin = 1234;
		if (atm) {
			System.out.println("please enter the pin");
			if (pin == 1234) {
				System.out.println("please check the bal query");
				if (bal > wtd)
				{	
					System.out.println("your transaction is successful");
					System.out.println("remaining balance  =  " + (bal - wtd));
				} else {
					System.out.println("your are not having the sufficient balance ");
					System.out.println("please check the balance before transaction ");
				}

			} else {
				System.out.println("incorrect pin ");
				System.out.println("please try again ");
			}
		} else {
			System.out.println("your are using  invalid card ");
			System.out.println("please check the card");
		}

	}
}