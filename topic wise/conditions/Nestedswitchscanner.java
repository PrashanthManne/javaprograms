package learnif;
import java.util.Scanner;

public class Nestedswitchscanner {

	public static void main(String[] args) {
		
	Scanner s = new Scanner (System.in);
	System.out.println("please enter into the restarent");
	System.out.println("choose your order");
	String foodtype = s.next();
	System.out.println("your ordered item is now picked " + foodtype);
	System.out.println("choose the item from your order ");
	String foodorder = s.next();
	System.out.println("your ordered item is now picked " + foodorder);
	System.out.println("what quantity do you need sir");
	int itemscount = s.nextInt();
	System.out.println("your order the quantity required  " + itemscount);
	
	switch (foodtype) {
	case "veg" : System.out.println("you are choosen the veg item");
	  		switch (foodorder) 
	  		{
	  		case "curdrice" : System.out.println("your ordered item is now picked " + foodorder);
	  		break ;
	  		case "jirarice" : System.out.println("your ordered item is now picked " + foodorder);
	  		break ;
	  		case "panner " : System.out.println("your ordered item is now picked " + foodorder);
	  		break ;
	  		case "dalrice" : System.out.println("your ordered item is now picked " + foodorder);
	  		break ; 
	  		default : System.out.println("your ordered item is not available and please change your order ");
	  		}
	  		break ;
	  		
	  		
        case "nonveg" : System.out.println("you are choosen the nonveg item");
		switch (foodorder) 
		{
		case "chicken" : System.out.println("your ordered item is now picked " + foodorder);
		break ;
		case "mutton" : System.out.println("your ordered item is now picked " + foodorder);
		break ;
		case "friedrice " : System.out.println("your ordered item is now picked " + foodorder);
		break ;
		case "fishfried" : System.out.println("your ordered item is now picked " + foodorder);
		break ; 
		default : System.out.println("your ordered item is not available and please change your order ");
		}
		break ;
	case "drinks" : System.out.println("you are choosen the cooldrinks ");
		switch (foodorder) 
		{
		case "maaza" : System.out.println("your ordered item is now picked " + foodorder);
		break ;
		case "sprite" : System.out.println("your ordered item is now picked " + foodorder);
		break ;
		case "thumsup " : System.out.println("your ordered item is now picked " + foodorder);
		break ;
		case "pulpi" : System.out.println("your ordered item is now picked " + foodorder);
		break ; 
		default : System.out.println("your ordered item is not available and please change your order ");
		}
		
		break ;
	
	default :System.out.println("you are choosen the different item");
	}
	{
		
	}
}

}
