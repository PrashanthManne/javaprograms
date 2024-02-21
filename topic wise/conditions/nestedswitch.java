package learnif;

public class nestedswitch {

	public static void main(String[] args) {
		String ftype = "king";
		String forder = "fish";
		switch (ftype) {
		case "veg":
			System.out.println("your order the item  "+ ftype );
			switch (forder) {
			case "curdrice":
				System.out.println("curdrice is ready now " + forder);
				break;
			case "jirarice":
				System.out.println(" order is ready " + forder);
				break;
			case "lemonrice":
				System.out.println("order is ready " + forder);
				break;
			case "vegbir":
				System.out.println("order is ready " + forder);
				break;
			default:
				System.out.println("your order the item is not available");
			}
			break;
		case "nonveg":
			System.out.println("your order the item  "+ ftype );
			switch (forder) {
			case "cbir":
				System.out.println("chicken biryani is ready" + forder);
				break;
			case "mbir":
				System.out.println("order is ready" + forder);
				break;
			case "fish":
				System.out.println("order is ready" + forder);
				break;
			case "seaitems":
				System.out.println("order is ready" + forder);
				break;
			default:
				System.out.println("your order the item is not available");
			}
			break;
			default : System.out.println("not intrested to purchase anything"); 
		
		}

	}
}
